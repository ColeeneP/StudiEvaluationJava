import logo from './logo.svg';
import './App.css';

import * as React from 'react';
import { styled, alpha } from '@mui/material/styles';
import InputBase from '@mui/material/InputBase';
import AppBar from '@mui/material/AppBar';
import Typography from '@mui/material/Typography';
import Button from '@mui/material/Button';
import IconButton from '@mui/material/IconButton';
import MenuIcon from '@mui/icons-material/Menu';
import Toolbar from '@mui/material/Toolbar';
import MenuBookIcon from '@mui/icons-material/MenuBook';
import SearchIcon from '@mui/icons-material/Search';
import AccountCircleIcon from '@mui/icons-material/AccountCircle';
import LogoutIcon from '@mui/icons-material/Logout';
import LoginIcon from '@mui/icons-material/Login';
import ShoppingCartCheckoutIcon from '@mui/icons-material/ShoppingCartCheckout';
import BottomNavigationAction from '@mui/material/BottomNavigationAction';
import BottomNavigation from '@mui/material/BottomNavigation';
import MoreVertIcon from '@mui/icons-material/MoreVert';
import Menu from '@mui/material/Menu';
import MenuItem from '@mui/material/MenuItem';
import useMediaQuery from '@mui/material/useMediaQuery';
import { useTheme } from '@mui/material/styles';
import Home from './components/Home';

const Search = styled('div')(({ theme }) => ({
  position: 'relative',
  display: 'inline-block',
  borderRadius: theme.shape.borderRadius,
  backgroundColor: alpha(theme.palette.common.white, 0.15),
  '&:hover': {
    backgroundColor: alpha(theme.palette.common.white, 0.25),
  },
  marginLeft: '15px',
  width: '45%',
  [theme.breakpoints.up('sm')]: {
    marginLeft: theme.spacing(1),
    width: 'auto',
  },
}));

const SearchIconWrapper = styled('div')(({ theme }) => ({
  padding: theme.spacing(0, 2),
  height: '100%',
  position: 'absolute',
  pointerEvents: 'none',
  display: 'flex',
  alignItems: 'center',
  justifyContent: 'center',
}));

const StyledInputBase = styled(InputBase)(({ theme }) => ({
  color: 'inherit',
  '& .MuiInputBase-input': {
    padding: theme.spacing(1, 1, 1, 0),
    // vertical padding + font size from searchIcon
    paddingLeft: `calc(1em + ${theme.spacing(4)})`,
    transition: theme.transitions.create('width'),
    width: '100%',
    [theme.breakpoints.up('sm')]: {
      width: '10ch',
      '&:focus': {
        width: '15ch',
      },
    },
  },
}));

function App() {
  const [anchorEl, setAnchorEl] = React.useState(null);
  const open = Boolean(anchorEl);
  const handleClick = (event) => {
    setAnchorEl(event.currentTarget);
  };
  const handleClose = () => {
    setAnchorEl(null);
  };

  const isMobile = useMediaQuery(useTheme().breakpoints.down('md'));


  return (
    <div className="App">
      <header className="App-header">
      <AppBar position="fixed" top='0' sx={{ display: isMobile ? 'block' : 'none'}}>
        <Toolbar>
          <Typography variant="h6" component="div" align='left'  sx={{ flexGrow: 1 }}>
            BIBLIO
            <Search>
            <SearchIconWrapper>
              <SearchIcon />
            </SearchIconWrapper>
            <StyledInputBase
              placeholder="Search…"
              inputProps={{ 'aria-label': 'search' }}
            />
          </Search>
            
          </Typography>
          <MoreVertIcon onClick={handleClick} />
            <Menu         MenuListProps={{
          'aria-labelledby': 'long-button',
        }}
        anchorEl={anchorEl}
        open={open}
        onClose={handleClose}>
              <MenuItem>
                <Button color="inherit"><ShoppingCartCheckoutIcon /></Button>
              </MenuItem>
              <MenuItem>
                <Button color="inherit"><AccountCircleIcon /></Button>
              </MenuItem>
              <MenuItem>
              <Button color="inherit"><LogoutIcon /></Button>
              </MenuItem>
            </Menu>
        </Toolbar>
      </AppBar>

      <AppBar position="fixed" top='0' sx={{ display: isMobile ? 'none' : 'block'}}>
        <Toolbar>
          <Typography variant="h6" component="div" align='left'  sx={{ flexGrow: 1 }}>
            BIBLIO
            <Search>
            <SearchIconWrapper>
              <SearchIcon />
            </SearchIconWrapper>
            <StyledInputBase
              placeholder="Search…"
              inputProps={{ 'aria-label': 'search' }}
            />
          </Search>
          </Typography>
              <Button color="inherit" title="Mes prêts"><ShoppingCartCheckoutIcon /></Button>
              <Button color="inherit" title="Mon compte"><AccountCircleIcon /></Button>
              <Button color="inherit" title="Se déconnecter"><LogoutIcon /></Button>
        </Toolbar>
      </AppBar>
      <Home />
      </header>
    </div>
  );
}

export default App;
