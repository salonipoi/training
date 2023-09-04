class OuterEventImpl implements Event {

	@Override
	public void doSomething() {
		System.out.println("Outer Event implementation");
	} // one program can have only one public class and also a public class must have
		// the class name

}

public class EventDemo implements Event {

	@Override
	public void doSomething() {
		System.out.println("Simple Event implementation");
	}

	private class InnerEventImpl implements Event {

		@Override
		public void doSomething() {
			System.out.println("Inner Event Implementation");
		}

	}

	public static class StaticEvenImpl implements Event {

		@Override
		public void doSomething() {
			System.out.println("Static Event implementation");
		}

	}

	public void oneMoreEvent() {

		class NestedEventImpl implements Event {

			@Override
			public void doSomething() {
				System.out.println("Nested Event implementaion");
			}
		}
		;

		new NestedEventImpl().doSomething();
	}

	public void oneLastEvent() {
		Event e = new Event() {

			@Override
			public void doSomething() {
				System.out.println("Anonymous Event implementation");
			}

		};
		e.doSomething();
	}

	public void pakkaLastEvent() {
		Event e = () -> System.out.println("Lambda Event implementation");
		e.doSomething();
	}

	public static void main(String[] args) {
		EventDemo ed = new EventDemo();
		ed.doSomething();

		OuterEventImpl oe = new OuterEventImpl();
		oe.doSomething();

		InnerEventImpl ee = ed.new InnerEventImpl(); // It's a class inside a class #error add ed.
		ee.doSomething();

		EventDemo.StaticEvenImpl se = new EventDemo.StaticEvenImpl();
		se.doSomething();

		ed.oneMoreEvent();
		ed.oneLastEvent();
		ed.pakkaLastEvent();
	}
}
