package com.zipcodewilmington;

public class PersonHandler {

        private final Person[] personArray;



        public PersonHandler(Person[] personArray) {

            this.personArray = personArray;

        }



        public int whileLoop(String[] newPersonArray, String element) {
            int result = 0;
            while(true) {
                for (int counter = 0; counter < personArray.length; counter++) {
                    if (newPersonArray[counter].equalsIgnoreCase(element)) {
                        result = counter;
                    }
                }
                return result;
            }


            // create a `counter`

            // while `counter` is less than length of array

            // begin loop



            // use `counter` to identify the `current Person` in the array

            // get `string Representation` of `currentPerson`

            // append `stringRepresentation` to `result` variable



            // end loop

             }
        public int forLoop() {

            int result = 0;
            for (int one = 0; one < personArray.length; one++) {
                result = one;
            }
            return result;
        }


            // identify initial value

            // identify terminal condition

            // identify increment



            // use the above clauses to declare for-loop signature

            // begin loop

            // use `counter` to identify the `current Person` in the array

            // get `string Representation` of `currentPerson`

            // append `stringRepresentation` to `result` variable

            // end loop


        public int forEachLoop() {

            int result = 0;


            // identify array's type

            // identify array's variable-name



            // use the above discoveries to declare for-each-loop signature

            // begin loop

            // get `string Representation` of `currentPerson`

            // append `stringRepresentation` to `result` variable

            // end loop



            return result;

        }
        public Person[] getPersonArray() {

            return personArray;

        }

    }

