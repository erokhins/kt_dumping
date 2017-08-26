'kotlin.jvm.JvmVersion' @ [17:1] ==> public constructor JvmVersion(minimum: Int = ..., maximum: Int = ...) defined in kotlin.jvm.JvmVersion[DeserializedClassConstructorDescriptor]

'OrderedIterableTests<LinkedList<String>>' @ [22:24] ==> public constructor OrderedIterableTests<T : Iterable<String>>(createFrom: (Array<out String>) -> LinkedList<String>, empty: LinkedList<String>) defined in test.collections.OrderedIterableTests[ClassConstructorDescriptorImpl]
Inferred types:
    <T : Iterable<String>> -> LinkedList<String>

'LinkedList' @ [22:68] ==> public constructor LinkedList<E : (Any..Any?)>(p0: (MutableCollection<out (String..String?)>..Collection<(String..String?)>?)) defined in java.util.LinkedList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'it' @ [22:79] ==> value-parameter it: Array<out String> defined in test.collections.LinkedListTest.<init>.<anonymous>[ValueParameterDescriptorImpl]

'asList' @ [22:82] ==> public fun <T> Array<out String>.asList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'LinkedList' @ [22:95] ==> public constructor LinkedList<E : (Any..Any?)>() defined in java.util.LinkedList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

