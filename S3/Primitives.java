// Variables
// -- Without variables, we'd get the result over and over again...

// Different parts -> Type, Name, Value
// i.e., int x = 5;
// i.e., String hobby = "coding";

//  Two types of variables:
// 1) Primitive types -> for primitive values
// 2) Reference type -> for objects

// -- Primitive Types --

// A primitive is just the value.
// There are 8 types of primitives:
// byte (-128 to 127) [i.e., 34]
// short (-32768 to 32767) [i.e., 23001]
// int (-2^31 to 2^31 - 1) [i.e., 500001]
// long (-2^63 to 2^63 - 1) [i.e., 1234567890]
// float 
// double
// char (uni code// 0 to 65535)
// boolean (true or false)

public class Primitives {
	public static void main(String[] args) {
		byte b = 33;
		short s = 21000;
		int i = 55000;
		long l = 12345678901L;

		float f = 4.3f;
		double d = 4.31234567890;

		char c = 'name';
		char c1 = 43;

		boolean bl = true;
		boolean bl1 = false;
	}
}