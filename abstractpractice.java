import java.io.*;
abstract class abstract1{
     abstract1()
     {
        System.out.println("abstract class Constructor-1");
     }
abstract1 (int a)
{
    System.out.println("abstract class Constructor-2");
   // System.out.println("abstract class Constructor-2 Name"+name);
    System.out.println("abstract class Constructor-2 value"+ a);
}
    abstract void A();
}
class abstract2 extends abstract1
{
     abstract2(int a,String name)
{  
   super(2);  
  System.out.println("Constructor value "+a);  
  
  System.out.println("Constructor name "+name);
   
}
    void A()
     {
          System.out.println("Abstract method 1 from class 2");
     }
}
class abstract3 extends abstract2
{
     abstract3()
     {
          super(5,"Nirmal");
      }
     void A()
     {
         super.A();

System.out.println(" Abstract method 1 from class 3");
     }
}
class abstractpractice{
public static void main(String args[])
{
   abstract3 abstractobj1=new abstract3();
    abstractobj1.A();  
}
}

------------------------------------------------------
     import Button from 'react-bootstrap/Button';
import Container from 'react-bootstrap/Container';
import Form from 'react-bootstrap/Form';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';


function NavScrollExample() {
  return (
    <Navbar expand="lg" className="bg-body-tertiary "  className="navbar1">
      <Container fluid>
        <Navbar.Brand href="#"><h1 >Library</h1></Navbar.Brand>
        <Navbar.Toggle aria-controls="navbarScroll" />
        <Navbar.Collapse id="navbarScroll">
          <Nav
            className=" margin-center my-2 mx-8 my-lg-0"
            style={{ maxHeight: '100px',}}
            navbarScroll
          >
          
            <Nav.Link href="#action1" className='navcss' >Home</Nav.Link>
            <Nav.Link href="#action2" className='navcss'>About us</Nav.Link>
       
      
            <Nav.Link href="#" className='navcss' disabled>
              
            </Nav.Link>
          </Nav>
          <Form className="d-flex">
            <Form.Control
              type="search"
              placeholder="Search"
              className="me-2"
              aria-label="Search"
            />
            <Button variant="outline-success">Search</Button>
          </Form>
        </Navbar.Collapse>
      </Container>
    </Navbar>
  );
}

export default NavScrollExample;

---------------------------------------------------------------------------------------------------------
     /* .navcss{
    margin-left:219px;
    border-radius: 10px;
    color: black;
    font-size: larger;
}
.navcss:hover{
    background-color: rgb(154, 154, 231);
    border-radius: 10px;
    color: white;
}
.bg-body-tertiary{
    background-color: rgb(29, 5, 138);
}
.navbar1{
    background-color: rgb(155, 221, 241);
    height: 60px;
    position: static;
}
/* body{
    background-color: rgb(26, 9, 102);
} */
/* img {
   
    height: 500px;
    width: 600px;
}



.container{
    
   margin-left: 10px;
   margin-top: 40px;
   display: grid;
   grid-template-columns: 1fr 1fr ;
  
   /* border: 1px solid black; */
/* }
.side1{
    padding:30px;
}
.side2{
    margin-top: 30px;
    font-size: 20px;
    padding:30px;
}  */





*{
    box-sizing: border-box;
}
#root{
    display: flex;
    align-items: center;
    justify-content: center;
    gap: 2000px;
    flex-wrap: wrap;
    min-height: 10vh;
}
.cart-container{
    background-color: rgb(20, 20, 32);
    border-radius: 10px;
    color: white;
    padding: 25px;
    
    text-align: center;
    max-width: 500px;  
}
.pro{
    color: blue;
    border-radius: 10px;
    font-weight: bolder;
     padding: 8px;
     position: relative; 
     
}
.online{
    background-color: rgb(78, 235, 161);

}
.offline{
    background: yellow;
}
.img{
    border: 4px solid white;
    border-radius: 50%;
    padding: 7px;
}
.buttons{
    display: flex;
    justify-content: center;
}    
button.primary{
    background-color:rgb(61, 61, 221);
    border-radius: 3px;
    font-weight: 800;
}
button.primary.outline{
    background-color: transparent;
}
.skill{
    background-color: blueviolet;
    text-align: left;
    padding: 15px;
}
ul{
    list-style-type: none;

}
.skill ul li{
    background-color: rgb(99, 11, 182);
    display:inline-block ;
    border-radius: 3px;
    padding: 3px;
    margin: 0 7px 7px 0;
}

}------------------------------------------------

     import React from 'react'
import Carousel from 'react-bootstrap/Carousel';
import carousel1 from '../assets/images/carousel1.jpg'
import carousel2 from '../assets/images/carousel2.jpg'
import carousel3 from '../assets/images/carousel3.jpg'
// import ExampleCarouselImage from 'components/ExampleCarouselImage';

function Layer2() {
  return (
    <div className='container' >
    <div className='side1'>

    
    <Carousel interval={1000}>
      <Carousel.Item>
        {/* <ExampleCarouselImage text="First slide" /> */}
        <img  className='carouselimg'src={carousel1} alt="" srcset="" height={560} width={900}  />
        <Carousel.Caption>
          <h3>First slide label</h3>
          <p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>
        </Carousel.Caption>
      </Carousel.Item>
      <Carousel.Item>
        {/* <ExampleCarouselImage text="Second slide" /> */}
        <img className='carouselimg' src={carousel2} ></img>
        <Carousel.Caption>
          <h3>Second slide label</h3>
          <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
        </Carousel.Caption>
      </Carousel.Item>
      <Carousel.Item>
        {/* <ExampleCarouselImage text="Third slide" /> */}
        <div className='carouselimg' >
        <img  src={carousel3} ></img>
        </div>
        <Carousel.Caption>
          <h3>Third slide label</h3>
          <p>
            Praesent commodo cursus magna, vel scelerisque nisl consectetur.
          </p>
        </Carousel.Caption>
      </Carousel.Item>
    </Carousel>
    </div>
    <div className='side2'>
      welcome Lorem ipsum dolor sit, amet consectetur adipisicing elit. Cupiditate veritatis magni dolores odit soluta perspiciatis nam unde, quisquam fugiat libero quod modi architecto! Itaque est porro laborum, esse quo ut.
    </div>
    </div>
  );
}

export default Layer2;



    
