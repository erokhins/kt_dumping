'TestSuite' @ [37:17] ==> public constructor TestSuite() defined in junit.framework.TestSuite[JavaClassConstructorDescriptor]

'TestData' @ [39:22] ==> public constructor TestData() defined in org.jetbrains.eval4j.test.TestData[JavaClassConstructorDescriptor]

'java' @ [39:38] ==> public val <T> KClass<TestData>.java: Class<TestData> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> TestData

'ownerClass' @ [40:5] ==> val ownerClass: Class<TestData> defined in org.jetbrains.eval4j.test.buildTestSuite[LocalVariableDescriptor]

'classLoader' @ [40:16] ==> public final val <T : (Any..Any?)> Class<TestData>.classLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> TestData

'getResourceAsStream' @ [40:30] ==> public open fun getResourceAsStream(p0: (String..String?)): (InputStream..InputStream?) defined in java.lang.ClassLoader[JavaMethodDescriptor]

'ownerClass' @ [40:50] ==> val ownerClass: Class<TestData> defined in org.jetbrains.eval4j.test.buildTestSuite[LocalVariableDescriptor]

'getInternalName' @ [40:61] ==> public fun Class<*>.getInternalName(): String defined in org.jetbrains.eval4j.test in file main.kt[SimpleFunctionDescriptorImpl]

'use' @ [40:93] ==> @InlineOnly public inline fun <T : Closeable?, R> InputStream.use(block: (InputStream) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> InputStream
    <R> -> Unit

'ClassReader' @ [41:9] ==> public constructor ClassReader(p0: (InputStream..InputStream?)) defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaClassConstructorDescriptor]

'inputStream' @ [41:21] ==> value-parameter inputStream: InputStream defined in org.jetbrains.eval4j.test.buildTestSuite.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [41:34] ==> public open fun accept(p0: (ClassVisitor..ClassVisitor?), p1: Int): Unit defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaMethodDescriptor]

'ClassVisitor' @ [41:50] ==> public constructor ClassVisitor(p0: Int) defined in org.jetbrains.org.objectweb.asm.ClassVisitor[JavaClassConstructorDescriptor]

'ASM5' @ [41:63] ==> public const final val ASM5: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'MethodNode' @ [43:33] ==> public constructor MethodNode(p0: Int, p1: Int, p2: (String..String?), p3: (String..String?), p4: (String..String?), p5: (Array<(String..String?)>..Array<out (String..String?)>?)) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaClassConstructorDescriptor]

'ASM5' @ [43:44] ==> public const final val ASM5: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'access' @ [43:50] ==> value-parameter access: Int defined in org.jetbrains.eval4j.test.buildTestSuite.<anonymous>.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'name' @ [43:58] ==> value-parameter name: String defined in org.jetbrains.eval4j.test.buildTestSuite.<anonymous>.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'desc' @ [43:64] ==> value-parameter desc: String defined in org.jetbrains.eval4j.test.buildTestSuite.<anonymous>.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'signature' @ [43:70] ==> value-parameter signature: String? defined in org.jetbrains.eval4j.test.buildTestSuite.<anonymous>.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'exceptions' @ [43:81] ==> value-parameter exceptions: Array<out String>? defined in org.jetbrains.eval4j.test.buildTestSuite.<anonymous>.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'buildTestCase' @ [45:40] ==> private fun buildTestCase(ownerClass: Class<TestData>, methodNode: MethodNode, create: (MethodNode, Class<out Any?>, InterpreterResult?) -> TestCase): TestCase? defined in org.jetbrains.eval4j.test[SimpleFunctionDescriptorImpl]

'ownerClass' @ [45:54] ==> val ownerClass: Class<TestData> defined in org.jetbrains.eval4j.test.buildTestSuite[LocalVariableDescriptor]

'this' @ [45:66] ==> <this> defined in org.jetbrains.eval4j.test.buildTestSuite.<anonymous>.<no name provided>.visitMethod.<no name provided>[LazyClassReceiverParameterDescriptor]

'create' @ [45:72] ==> value-parameter create: (MethodNode, Class<*>, InterpreterResult?) -> TestCase defined in org.jetbrains.eval4j.test.buildTestSuite[ValueParameterDescriptorImpl]

'testCase' @ [46:29] ==> val testCase: TestCase? defined in org.jetbrains.eval4j.test.buildTestSuite.<anonymous>.<no name provided>.visitMethod.<no name provided>.visitEnd[LocalVariableDescriptor]

'suite' @ [47:29] ==> val suite: TestSuite defined in org.jetbrains.eval4j.test.buildTestSuite[LocalVariableDescriptor]

'addTest' @ [47:35] ==> public open fun addTest(p0: (Test..Test?)): Unit defined in junit.framework.TestSuite[JavaMethodDescriptor]

'testCase' @ [47:43] ==> val testCase: TestCase? defined in org.jetbrains.eval4j.test.buildTestSuite.<anonymous>.<no name provided>.visitMethod.<no name provided>.visitEnd[LocalVariableDescriptor]

'suite' @ [55:12] ==> val suite: TestSuite defined in org.jetbrains.eval4j.test.buildTestSuite[LocalVariableDescriptor]

'ownerClass' @ [62:20] ==> value-parameter ownerClass: Class<TestData> defined in org.jetbrains.eval4j.test.buildTestCase[ValueParameterDescriptorImpl]

'declaredMethods' @ [62:31] ==> public final val <T : (Any..Any?)> Class<TestData>.declaredMethods: (Array<(Method..Method?)>..Array<out (Method..Method?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> TestData

'method' @ [63:13] ==> val method: (Method..Method?) defined in org.jetbrains.eval4j.test.buildTestCase[LocalVariableDescriptor]

'name' @ [63:20] ==> public final val Method.name: (String..String?)[MyPropertyDescriptor]

'methodNode' @ [63:28] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.eval4j.test.buildTestCase[ValueParameterDescriptorImpl]

'name' @ [63:39] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'!=' @ [64:28] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'method' @ [64:29] ==> val method: (Method..Method?) defined in org.jetbrains.eval4j.test.buildTestCase[LocalVariableDescriptor]

'modifiers' @ [64:36] ==> public final val Method.modifiers: Int[MyPropertyDescriptor]

'STATIC' @ [64:59] ==> public const final val STATIC: Int defined in java.lang.reflect.Modifier[JavaPropertyDescriptor]

'if (method.parameterTypes!!.size > 0) {
                println("Skipping method with parameters: $method")
            }
            else if (!isStatic && !method.name!!.startsWith("test")) {
                println("Skipping instance method (should be started with 'test') : $method")
            }
            else {
                method.isAccessible = true
                try {
                    val result = method.invoke(if (isStatic) null else ownerClass.newInstance())
                    val returnType = Type.getType(method.returnType!!)
                    expected = ValueReturned(objectToValue(result, returnType))
                }
                catch (e: UnsupportedOperationException) {
                    println("Skipping $method: $e")
                }
                catch (e: Throwable) {
                    val cause = e.cause ?: e
                    expected = ExceptionThrown(objectToValue(cause, Type.getType(cause::class.java)) as ObjectValue, ExceptionThrown.ExceptionKind.FROM_EVALUATOR)
                }
            }' @ [65:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'method' @ [65:17] ==> val method: (Method..Method?) defined in org.jetbrains.eval4j.test.buildTestCase[LocalVariableDescriptor]

'parameterTypes' @ [65:24] ==> public final val Method.parameterTypes: (Array<(Class<*>..Class<*>?)>..Array<out (Class<*>..Class<*>?)>?)[MyPropertyDescriptor]

'size' @ [65:41] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'println' @ [66:17] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'method' @ [66:60] ==> val method: (Method..Method?) defined in org.jetbrains.eval4j.test.buildTestCase[LocalVariableDescriptor]

'if (!isStatic && !method.name!!.startsWith("test")) {
                println("Skipping instance method (should be started with 'test') : $method")
            }
            else {
                method.isAccessible = true
                try {
                    val result = method.invoke(if (isStatic) null else ownerClass.newInstance())
                    val returnType = Type.getType(method.returnType!!)
                    expected = ValueReturned(objectToValue(result, returnType))
                }
                catch (e: UnsupportedOperationException) {
                    println("Skipping $method: $e")
                }
                catch (e: Throwable) {
                    val cause = e.cause ?: e
                    expected = ExceptionThrown(objectToValue(cause, Type.getType(cause::class.java)) as ObjectValue, ExceptionThrown.ExceptionKind.FROM_EVALUATOR)
                }
            }' @ [68:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [68:22] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isStatic' @ [68:23] ==> val isStatic: Boolean defined in org.jetbrains.eval4j.test.buildTestCase[LocalVariableDescriptor]

'!' @ [68:35] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'method' @ [68:36] ==> val method: (Method..Method?) defined in org.jetbrains.eval4j.test.buildTestCase[LocalVariableDescriptor]

'name' @ [68:43] ==> public final val Method.name: (String..String?)[MyPropertyDescriptor]

'startsWith' @ [68:50] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'println' @ [69:17] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'method' @ [69:86] ==> val method: (Method..Method?) defined in org.jetbrains.eval4j.test.buildTestCase[LocalVariableDescriptor]

'method' @ [72:17] ==> val method: (Method..Method?) defined in org.jetbrains.eval4j.test.buildTestCase[LocalVariableDescriptor]

'isAccessible' @ [72:24] ==> public final var Method.isAccessible: Boolean[MyPropertyDescriptor]

'method' @ [74:34] ==> val method: (Method..Method?) defined in org.jetbrains.eval4j.test.buildTestCase[LocalVariableDescriptor]

'invoke' @ [74:41] ==> @CallerSensitive public open operator fun invoke(p0: (Any..Any?), vararg p1: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Method[JavaMethodDescriptor]

'if (isStatic) null else ownerClass.newInstance()' @ [74:48] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TestData?, elseBranch: TestData?): TestData?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TestData?

'isStatic' @ [74:52] ==> val isStatic: Boolean defined in org.jetbrains.eval4j.test.buildTestCase[LocalVariableDescriptor]

'ownerClass' @ [74:72] ==> value-parameter ownerClass: Class<TestData> defined in org.jetbrains.eval4j.test.buildTestCase[ValueParameterDescriptorImpl]

'newInstance' @ [74:83] ==> @CallerSensitive public open fun newInstance(): (TestData..TestData?) defined in java.lang.Class[JavaMethodDescriptor]

'getType' @ [75:43] ==> public open fun getType(p0: (Class<*>..Class<*>?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'method' @ [75:51] ==> val method: (Method..Method?) defined in org.jetbrains.eval4j.test.buildTestCase[LocalVariableDescriptor]

'returnType' @ [75:58] ==> public final val Method.returnType: (Class<*>..Class<*>?)[MyPropertyDescriptor]

'expected' @ [76:21] ==> var expected: InterpreterResult? defined in org.jetbrains.eval4j.test.buildTestCase[LocalVariableDescriptor]

'ValueReturned' @ [76:32] ==> public constructor ValueReturned(result: Value) defined in org.jetbrains.eval4j.ValueReturned[DeserializedClassConstructorDescriptor]

'objectToValue' @ [76:46] ==> public fun objectToValue(obj: Any?, expectedType: Type): Value defined in org.jetbrains.eval4j.test in file main.kt[SimpleFunctionDescriptorImpl]

'result' @ [76:60] ==> val result: (Any..Any?) defined in org.jetbrains.eval4j.test.buildTestCase[LocalVariableDescriptor]

'returnType' @ [76:68] ==> val returnType: (Type..Type?) defined in org.jetbrains.eval4j.test.buildTestCase[LocalVariableDescriptor]

'println' @ [79:21] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'method' @ [79:40] ==> val method: (Method..Method?) defined in org.jetbrains.eval4j.test.buildTestCase[LocalVariableDescriptor]

'e' @ [79:49] ==> val e: UnsupportedOperationException /* = UnsupportedOperationException */ defined in org.jetbrains.eval4j.test.buildTestCase[LocalVariableDescriptor]

'e' @ [82:33] ==> val e: Throwable defined in org.jetbrains.eval4j.test.buildTestCase[LocalVariableDescriptor]

'cause' @ [82:35] ==> public open val cause: Throwable? defined in kotlin.Throwable[DeserializedPropertyDescriptor]

'e' @ [82:44] ==> val e: Throwable defined in org.jetbrains.eval4j.test.buildTestCase[LocalVariableDescriptor]

'expected' @ [83:21] ==> var expected: InterpreterResult? defined in org.jetbrains.eval4j.test.buildTestCase[LocalVariableDescriptor]

'ExceptionThrown' @ [83:32] ==> public constructor ExceptionThrown(exception: ObjectValue, kind: ExceptionThrown.ExceptionKind) defined in org.jetbrains.eval4j.ExceptionThrown[DeserializedClassConstructorDescriptor]

'objectToValue' @ [83:48] ==> public fun objectToValue(obj: Any?, expectedType: Type): Value defined in org.jetbrains.eval4j.test in file main.kt[SimpleFunctionDescriptorImpl]

'cause' @ [83:62] ==> val cause: Throwable defined in org.jetbrains.eval4j.test.buildTestCase[LocalVariableDescriptor]

'getType' @ [83:74] ==> public open fun getType(p0: (Class<*>..Class<*>?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'cause' @ [83:82] ==> val cause: Throwable defined in org.jetbrains.eval4j.test.buildTestCase[LocalVariableDescriptor]

'java' @ [83:95] ==> public val <T> KClass<out Throwable>.java: Class<out Throwable> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Throwable

'FROM_EVALUATOR' @ [83:148] ==> enum entry FROM_EVALUATOR defined in org.jetbrains.eval4j.ExceptionThrown.ExceptionKind[FakeCallableDescriptorForObject]

'expected' @ [89:9] ==> var expected: InterpreterResult? defined in org.jetbrains.eval4j.test.buildTestCase[LocalVariableDescriptor]

'println' @ [90:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'methodNode' @ [90:38] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.eval4j.test.buildTestCase[ValueParameterDescriptorImpl]

'name' @ [90:49] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'invoke' @ [94:12] ==> public abstract operator fun invoke(p1: MethodNode, p2: Class<out Any?>, p3: InterpreterResult?): TestCase defined in kotlin.Function3[FunctionInvokeDescriptor]

'methodNode' @ [94:19] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.eval4j.test.buildTestCase[ValueParameterDescriptorImpl]

'ownerClass' @ [94:31] ==> value-parameter ownerClass: Class<TestData> defined in org.jetbrains.eval4j.test.buildTestCase[ValueParameterDescriptorImpl]

'expected' @ [94:43] ==> var expected: InterpreterResult? defined in org.jetbrains.eval4j.test.buildTestCase[LocalVariableDescriptor]

