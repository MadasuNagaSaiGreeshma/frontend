function Form()
{
    return(
    <div>
             <fieldset>
             <h1 align="center"> <b>Student Registration Form</b></h1>
                <label for=""><b>First name:</b></label>
                <input type="text" autofocus/><br/><br/>
                <label for=""><b>Last name:</b></label>
                <input type="text" autofocus/><br/><br/>
                <label for=""><b>Mother name:</b></label>
                <input type="text" autofocus/><br/><br/>
                <label for=""><b>Father name:</b></label>
                <input type="text" autofocus/><br/><br/>
                <label for=""><b>Age:</b></label>
                <input type="number" autofocus/><br/><br/>
                <label for=""><b>Date of birth:</b></label>
                <input type="date" autofocus/><br/><br/>
                <label for=""><b>Email Id:</b><span>*</span></label>
                <input type="mail" autofocus/><br/><br/>
                <input type="password" name="" id="" placeholder="password" autofocus/><br/><br/>
                <label for=""><b>Mobile number:</b><span>*</span></label>
                <input type="number" autofocus/><br/><br/>
                <label for=""><b>Color:</b></label>
                <input type="color"/><br/><br/>
                <label for=""><b>Address:</b></label><br/><br/>
                <textarea rows="3" cols="40"></textarea><br/><br/>
                <label for=""><b>Gender:</b></label>
                <input type="radio" name="h" autofocus/><br/><br/>
                <label for="">female:</label>
                <input type="radio" name="h" autofocus/><br/>
                <label for="">&nbsp;&nbsp;&nbsp;male:</label>
                <input type="radio" name="h"autofocus/><br/>
               <label for="">&nbsp;others:</label>
                <input type="radio" name="h"autofocus/><br/><br/>
                <label for=""><b>SSC marks:</b></label>
                <input type="percentage" autofocus/><br/><br/>
                <label for=""><b>Intermediate marks:</b></label>
                <input type="percentage" autofocus/><br/><br/>
                <button>submit</button>
                <button>reset</button>
            </fieldset>
    </div>
    );
}
export default Form;
