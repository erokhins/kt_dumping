'buildTestSuite' @ [31:26] ==> public fun buildTestSuite(create: (MethodNode, Class<*>, InterpreterResult?) -> TestCase): TestSuite defined in org.jetbrains.eval4j.test[SimpleFunctionDescriptorImpl]

'TestCase' @ [33:14] ==> public constructor TestCase(p0: (String..String?)) defined in junit.framework.TestCase[JavaClassConstructorDescriptor]

'getTestName' @ [33:23] ==> public fun getTestName(methodName: String): String defined in org.jetbrains.eval4j.test[SimpleFunctionDescriptorImpl]

'methodNode' @ [33:35] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.eval4j.test.suite.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [33:46] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'!' @ [36:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isIgnored' @ [36:22] ==> private final fun isIgnored(methodNode: MethodNode): Boolean defined in org.jetbrains.eval4j.test.suite.<anonymous>.<no name provided>[SimpleFunctionDescriptorImpl]

'methodNode' @ [36:32] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.eval4j.test.suite.<anonymous>[ValueParameterDescriptorImpl]

'interpreterLoop' @ [37:33] ==> public fun interpreterLoop(m: MethodNode, initialState: Frame<Value>, eval: Eval, handler: InterpretationEventHandler = ...): InterpreterResult defined in org.jetbrains.eval4j[DeserializedSimpleFunctionDescriptor]

'methodNode' @ [38:29] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.eval4j.test.suite.<anonymous>[ValueParameterDescriptorImpl]

'initFrame' @ [39:29] ==> public fun initFrame(owner: String, m: MethodNode): Frame<Value> defined in org.jetbrains.eval4j.test[SimpleFunctionDescriptorImpl]

'ownerClass' @ [40:37] ==> value-parameter ownerClass: Class<*> defined in org.jetbrains.eval4j.test.suite.<anonymous>[ValueParameterDescriptorImpl]

'getInternalName' @ [40:48] ==> public fun Class<*>.getInternalName(): String defined in org.jetbrains.eval4j.test in file main.kt[SimpleFunctionDescriptorImpl]

'methodNode' @ [41:37] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.eval4j.test.suite.<anonymous>[ValueParameterDescriptorImpl]

'REFLECTION_EVAL' @ [43:29] ==> public object REFLECTION_EVAL : Eval defined in org.jetbrains.eval4j.test in file main.kt[FakeCallableDescriptorForObject]

'if (expected is ExceptionThrown && value is ExceptionThrown) {
                        assertEquals(expected.exception.toString(), value.exception.toString())
                    }
                    else {
                        assertEquals(expected.toString(), value.toString())
                    }' @ [46:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'expected' @ [46:25] ==> value-parameter expected: InterpreterResult? defined in org.jetbrains.eval4j.test.suite.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [46:56] ==> val value: InterpreterResult defined in org.jetbrains.eval4j.test.suite.<anonymous>.<no name provided>.runTest[LocalVariableDescriptor]

'assertEquals' @ [47:25] ==> public open fun assertEquals(p0: (String..String?), p1: (String..String?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'expected' @ [47:38] ==> value-parameter expected: InterpreterResult? defined in org.jetbrains.eval4j.test.suite.<anonymous>[ValueParameterDescriptorImpl]

'exception' @ [47:47] ==> public final val exception: ObjectValue defined in org.jetbrains.eval4j.ExceptionThrown[DeserializedPropertyDescriptor]

'toString' @ [47:57] ==> public open fun toString(): String defined in org.jetbrains.eval4j.ObjectValue[DeserializedSimpleFunctionDescriptor]

'value' @ [47:69] ==> val value: InterpreterResult defined in org.jetbrains.eval4j.test.suite.<anonymous>.<no name provided>.runTest[LocalVariableDescriptor]

'exception' @ [47:75] ==> public final val exception: ObjectValue defined in org.jetbrains.eval4j.ExceptionThrown[DeserializedPropertyDescriptor]

'toString' @ [47:85] ==> public open fun toString(): String defined in org.jetbrains.eval4j.ObjectValue[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [50:25] ==> public open fun assertEquals(p0: (String..String?), p1: (String..String?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'expected' @ [50:38] ==> value-parameter expected: InterpreterResult? defined in org.jetbrains.eval4j.test.suite.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [50:47] ==> public fun Any?.toString(): String defined in kotlin[DeserializedSimpleFunctionDescriptor]

'value' @ [50:59] ==> val value: InterpreterResult defined in org.jetbrains.eval4j.test.suite.<anonymous>.<no name provided>.runTest[LocalVariableDescriptor]

'toString' @ [50:65] ==> public abstract fun toString(): String defined in org.jetbrains.eval4j.InterpreterResult[DeserializedSimpleFunctionDescriptor]

'methodNode' @ [56:24] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.eval4j.test.suite.<anonymous>.<no name provided>.isIgnored[ValueParameterDescriptorImpl]

'visibleAnnotations' @ [56:35] ==> public final var visibleAnnotations: (MutableList<(AnnotationNode..AnnotationNode?)>..List<(AnnotationNode..AnnotationNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'any' @ [56:55] ==> public inline fun <T> Iterable<(AnnotationNode..AnnotationNode?)>.any(predicate: ((AnnotationNode..AnnotationNode?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.AnnotationNode..org.jetbrains.org.objectweb.asm.tree.AnnotationNode?)

'it' @ [57:42] ==> value-parameter it: (AnnotationNode..AnnotationNode?) defined in org.jetbrains.eval4j.test.suite.<anonymous>.<no name provided>.isIgnored.<anonymous>[ValueParameterDescriptorImpl]

'desc' @ [57:45] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.AnnotationNode[JavaPropertyDescriptor]

'annotationDesc' @ [58:21] ==> val annotationDesc: (String..String?) defined in org.jetbrains.eval4j.test.suite.<anonymous>.<no name provided>.isIgnored.<anonymous>[LocalVariableDescriptor]

'==' @ [59:25] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'getType' @ [59:30] ==> public open fun getType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'annotationDesc' @ [59:38] ==> val annotationDesc: (String..String?) defined in org.jetbrains.eval4j.test.suite.<anonymous>.<no name provided>.isIgnored.<anonymous>[LocalVariableDescriptor]

'getType' @ [59:62] ==> public open fun getType(p0: (Class<*>..Class<*>?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'IgnoreInReflectionTests' @ [59:70] ==> public constructor IgnoreInReflectionTests() defined in org.jetbrains.eval4j.test.IgnoreInReflectionTests[JavaClassConstructorDescriptor]

'java' @ [59:101] ==> public val <T> KClass<IgnoreInReflectionTests>.java: Class<IgnoreInReflectionTests> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> IgnoreInReflectionTests

'getType' @ [65:47] ==> public open fun getType(p0: (Class<*>..Class<*>?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'this' @ [65:55] ==> <this> defined in org.jetbrains.eval4j.test.getInternalName[ReceiverParameterDescriptorImpl]

'internalName' @ [65:61] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'Frame' @ [71:19] ==> public constructor Frame<V : (Value..Value?)>(p0: Int, p1: Int) defined in org.jetbrains.org.objectweb.asm.tree.analysis.Frame[JavaClassConstructorDescriptor]
Inferred types:
    <V : (Value..Value?)> -> Value

'm' @ [71:32] ==> value-parameter m: MethodNode defined in org.jetbrains.eval4j.test.initFrame[ValueParameterDescriptorImpl]

'maxLocals' @ [71:34] ==> public final var maxLocals: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'm' @ [71:45] ==> value-parameter m: MethodNode defined in org.jetbrains.eval4j.test.initFrame[ValueParameterDescriptorImpl]

'maxStack' @ [71:47] ==> public final var maxStack: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'current' @ [72:5] ==> val current: Frame<Value> defined in org.jetbrains.eval4j.test.initFrame[LocalVariableDescriptor]

'setReturn' @ [72:13] ==> public open fun setReturn(p0: (Value..Value?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.analysis.Frame[JavaMethodDescriptor]

'makeNotInitializedValue' @ [72:23] ==> public fun makeNotInitializedValue(t: Type): Value? defined in org.jetbrains.eval4j[DeserializedSimpleFunctionDescriptor]

'getReturnType' @ [72:52] ==> public open fun getReturnType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'm' @ [72:66] ==> value-parameter m: MethodNode defined in org.jetbrains.eval4j.test.initFrame[ValueParameterDescriptorImpl]

'desc' @ [72:68] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'==' @ [75:9] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'm' @ [75:10] ==> value-parameter m: MethodNode defined in org.jetbrains.eval4j.test.initFrame[ValueParameterDescriptorImpl]

'access' @ [75:12] ==> public final var access: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'ACC_STATIC' @ [75:23] ==> public const final val ACC_STATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'getObjectType' @ [76:26] ==> public open fun getObjectType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'owner' @ [76:40] ==> value-parameter owner: String defined in org.jetbrains.eval4j.test.initFrame[ValueParameterDescriptorImpl]

'REFLECTION_EVAL' @ [77:27] ==> public object REFLECTION_EVAL : Eval defined in org.jetbrains.eval4j.test in file main.kt[FakeCallableDescriptorForObject]

'newInstance' @ [77:43] ==> public open fun newInstance(classType: Type): Value defined in org.jetbrains.eval4j.test.REFLECTION_EVAL[SimpleFunctionDescriptorImpl]

'ctype' @ [77:55] ==> val ctype: (Type..Type?) defined in org.jetbrains.eval4j.test.initFrame[LocalVariableDescriptor]

'REFLECTION_EVAL' @ [78:25] ==> public object REFLECTION_EVAL : Eval defined in org.jetbrains.eval4j.test in file main.kt[FakeCallableDescriptorForObject]

'invokeMethod' @ [78:41] ==> public open fun invokeMethod(instance: Value, methodDesc: MethodDescription, arguments: List<Value>, invokespecial: Boolean): Value defined in org.jetbrains.eval4j.test.REFLECTION_EVAL[SimpleFunctionDescriptorImpl]

'newInstance' @ [78:54] ==> val newInstance: Value defined in org.jetbrains.eval4j.test.initFrame[LocalVariableDescriptor]

'MethodDescription' @ [78:67] ==> public constructor MethodDescription(ownerInternalName: String, name: String, desc: String, isStatic: Boolean) defined in org.jetbrains.eval4j.MethodDescription[DeserializedClassConstructorDescriptor]

'owner' @ [78:85] ==> value-parameter owner: String defined in org.jetbrains.eval4j.test.initFrame[ValueParameterDescriptorImpl]

'listOf' @ [78:117] ==> @InlineOnly public inline fun <T> listOf(): List<Value> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Value

'current' @ [79:9] ==> val current: Frame<Value> defined in org.jetbrains.eval4j.test.initFrame[LocalVariableDescriptor]

'setLocal' @ [79:17] ==> public open fun setLocal(p0: Int, p1: (Value..Value?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.analysis.Frame[JavaMethodDescriptor]

'local' @ [79:26] ==> var local: Int defined in org.jetbrains.eval4j.test.initFrame[LocalVariableDescriptor]

'thisValue' @ [79:35] ==> val thisValue: Value defined in org.jetbrains.eval4j.test.initFrame[LocalVariableDescriptor]

'getArgumentTypes' @ [82:21] ==> public open fun getArgumentTypes(p0: (String..String?)): (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'm' @ [82:38] ==> value-parameter m: MethodNode defined in org.jetbrains.eval4j.test.initFrame[ValueParameterDescriptorImpl]

'desc' @ [82:40] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'..' @ [83:15] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'args' @ [83:18] ==> val args: (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in org.jetbrains.eval4j.test.initFrame[LocalVariableDescriptor]

'size' @ [83:23] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'current' @ [84:9] ==> val current: Frame<Value> defined in org.jetbrains.eval4j.test.initFrame[LocalVariableDescriptor]

'setLocal' @ [84:17] ==> public open fun setLocal(p0: Int, p1: (Value..Value?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.analysis.Frame[JavaMethodDescriptor]

'local' @ [84:26] ==> var local: Int defined in org.jetbrains.eval4j.test.initFrame[LocalVariableDescriptor]

'makeNotInitializedValue' @ [84:35] ==> public fun makeNotInitializedValue(t: Type): Value? defined in org.jetbrains.eval4j[DeserializedSimpleFunctionDescriptor]

'args' @ [84:59] ==> val args: (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in org.jetbrains.eval4j.test.initFrame[LocalVariableDescriptor]

'i' @ [84:64] ==> val i: Int defined in org.jetbrains.eval4j.test.initFrame[LocalVariableDescriptor]

'args' @ [85:13] ==> val args: (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in org.jetbrains.eval4j.test.initFrame[LocalVariableDescriptor]

'i' @ [85:18] ==> val i: Int defined in org.jetbrains.eval4j.test.initFrame[LocalVariableDescriptor]

'size' @ [85:21] ==> public final val Type.size: Int[MyPropertyDescriptor]

'current' @ [86:13] ==> val current: Frame<Value> defined in org.jetbrains.eval4j.test.initFrame[LocalVariableDescriptor]

'setLocal' @ [86:21] ==> public open fun setLocal(p0: Int, p1: (Value..Value?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.analysis.Frame[JavaMethodDescriptor]

'local' @ [86:30] ==> var local: Int defined in org.jetbrains.eval4j.test.initFrame[LocalVariableDescriptor]

'NOT_A_VALUE' @ [86:39] ==> public object NOT_A_VALUE : Value defined in org.jetbrains.eval4j[FakeCallableDescriptorForObject]

'local' @ [90:12] ==> var local: Int defined in org.jetbrains.eval4j.test.initFrame[LocalVariableDescriptor]

'm' @ [90:20] ==> value-parameter m: MethodNode defined in org.jetbrains.eval4j.test.initFrame[ValueParameterDescriptorImpl]

'maxLocals' @ [90:22] ==> public final var maxLocals: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'current' @ [91:9] ==> val current: Frame<Value> defined in org.jetbrains.eval4j.test.initFrame[LocalVariableDescriptor]

'setLocal' @ [91:17] ==> public open fun setLocal(p0: Int, p1: (Value..Value?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.analysis.Frame[JavaMethodDescriptor]

'local' @ [91:26] ==> var local: Int defined in org.jetbrains.eval4j.test.initFrame[LocalVariableDescriptor]

'NOT_A_VALUE' @ [91:35] ==> public object NOT_A_VALUE : Value defined in org.jetbrains.eval4j[FakeCallableDescriptorForObject]

'current' @ [94:12] ==> val current: Frame<Value> defined in org.jetbrains.eval4j.test.initFrame[LocalVariableDescriptor]

'when (expectedType.sort) {
        Type.VOID -> VOID_VALUE
        Type.BOOLEAN -> boolean(obj as Boolean)
        Type.BYTE -> byte(obj as Byte)
        Type.SHORT -> short(obj as Short)
        Type.CHAR -> char(obj as Char)
        Type.INT -> int(obj as Int)
        Type.LONG -> long(obj as Long)
        Type.DOUBLE -> double(obj as Double)
        Type.FLOAT -> float(obj as Float)
        Type.OBJECT -> if (obj == null) NULL_VALUE else ObjectValue(obj, expectedType)
        else -> throw UnsupportedOperationException("Unsupported result type: $expectedType")
    }' @ [98:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Value, entry1: Value, entry2: Value, entry3: Value, entry4: Value, entry5: Value, entry6: Value, entry7: Value, entry8: Value, entry9: Value, entry10: Value): Value[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Value

'expectedType' @ [98:18] ==> value-parameter expectedType: Type defined in org.jetbrains.eval4j.test.objectToValue[ValueParameterDescriptorImpl]

'sort' @ [98:31] ==> public final val Type.sort: Int[MyPropertyDescriptor]

'VOID' @ [99:14] ==> public const final val VOID: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'VOID_VALUE' @ [99:22] ==> public object VOID_VALUE : Value defined in org.jetbrains.eval4j[FakeCallableDescriptorForObject]

'BOOLEAN' @ [100:14] ==> public const final val BOOLEAN: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'boolean' @ [100:25] ==> public fun boolean(v: Boolean): IntValue defined in org.jetbrains.eval4j[DeserializedSimpleFunctionDescriptor]

'obj' @ [100:33] ==> value-parameter obj: Any? defined in org.jetbrains.eval4j.test.objectToValue[ValueParameterDescriptorImpl]

'BYTE' @ [101:14] ==> public const final val BYTE: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'byte' @ [101:22] ==> public fun byte(v: Byte): IntValue defined in org.jetbrains.eval4j[DeserializedSimpleFunctionDescriptor]

'obj' @ [101:27] ==> value-parameter obj: Any? defined in org.jetbrains.eval4j.test.objectToValue[ValueParameterDescriptorImpl]

'SHORT' @ [102:14] ==> public const final val SHORT: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'short' @ [102:23] ==> public fun short(v: Short): IntValue defined in org.jetbrains.eval4j[DeserializedSimpleFunctionDescriptor]

'obj' @ [102:29] ==> value-parameter obj: Any? defined in org.jetbrains.eval4j.test.objectToValue[ValueParameterDescriptorImpl]

'CHAR' @ [103:14] ==> public const final val CHAR: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'char' @ [103:22] ==> public fun char(v: Char): IntValue defined in org.jetbrains.eval4j[DeserializedSimpleFunctionDescriptor]

'obj' @ [103:27] ==> value-parameter obj: Any? defined in org.jetbrains.eval4j.test.objectToValue[ValueParameterDescriptorImpl]

'INT' @ [104:14] ==> public const final val INT: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'int' @ [104:21] ==> public fun int(v: Int): IntValue defined in org.jetbrains.eval4j[DeserializedSimpleFunctionDescriptor]

'obj' @ [104:25] ==> value-parameter obj: Any? defined in org.jetbrains.eval4j.test.objectToValue[ValueParameterDescriptorImpl]

'LONG' @ [105:14] ==> public const final val LONG: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'long' @ [105:22] ==> public fun long(v: Long): LongValue defined in org.jetbrains.eval4j[DeserializedSimpleFunctionDescriptor]

'obj' @ [105:27] ==> value-parameter obj: Any? defined in org.jetbrains.eval4j.test.objectToValue[ValueParameterDescriptorImpl]

'DOUBLE' @ [106:14] ==> public const final val DOUBLE: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'double' @ [106:24] ==> public fun double(v: Double): DoubleValue defined in org.jetbrains.eval4j[DeserializedSimpleFunctionDescriptor]

'obj' @ [106:31] ==> value-parameter obj: Any? defined in org.jetbrains.eval4j.test.objectToValue[ValueParameterDescriptorImpl]

'FLOAT' @ [107:14] ==> public const final val FLOAT: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'float' @ [107:23] ==> public fun float(v: Float): FloatValue defined in org.jetbrains.eval4j[DeserializedSimpleFunctionDescriptor]

'obj' @ [107:29] ==> value-parameter obj: Any? defined in org.jetbrains.eval4j.test.objectToValue[ValueParameterDescriptorImpl]

'OBJECT' @ [108:14] ==> public const final val OBJECT: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'if (obj == null) NULL_VALUE else ObjectValue(obj, expectedType)' @ [108:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ObjectValue, elseBranch: ObjectValue): ObjectValue[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ObjectValue

'obj' @ [108:28] ==> value-parameter obj: Any? defined in org.jetbrains.eval4j.test.objectToValue[ValueParameterDescriptorImpl]

'NULL_VALUE' @ [108:41] ==> public val NULL_VALUE: ObjectValue defined in org.jetbrains.eval4j[DeserializedPropertyDescriptor]

'ObjectValue' @ [108:57] ==> public constructor ObjectValue(value: Any?, asmType: Type) defined in org.jetbrains.eval4j.ObjectValue[DeserializedClassConstructorDescriptor]

'obj' @ [108:69] ==> value-parameter obj: Any? defined in org.jetbrains.eval4j.test.objectToValue[ValueParameterDescriptorImpl]

'expectedType' @ [108:74] ==> value-parameter expectedType: Type defined in org.jetbrains.eval4j.test.objectToValue[ValueParameterDescriptorImpl]

'UnsupportedOperationException' @ [109:23] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'expectedType' @ [109:80] ==> value-parameter expectedType: Type defined in org.jetbrains.eval4j.test.objectToValue[ValueParameterDescriptorImpl]

'ReflectionLookup' @ [115:18] ==> public constructor ReflectionLookup(classLoader: ClassLoader) defined in org.jetbrains.eval4j.test.ReflectionLookup[ClassConstructorDescriptorImpl]

'ReflectionLookup' @ [115:35] ==> public constructor ReflectionLookup(classLoader: ClassLoader) defined in org.jetbrains.eval4j.test.ReflectionLookup[ClassConstructorDescriptorImpl]

'java' @ [115:59] ==> public val <T> KClass<ReflectionLookup>.java: Class<ReflectionLookup> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ReflectionLookup

'classLoader' @ [115:64] ==> public final val <T : (Any..Any?)> Class<ReflectionLookup>.classLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ReflectionLookup

'ObjectValue' @ [118:16] ==> public constructor ObjectValue(value: Any?, asmType: Type) defined in org.jetbrains.eval4j.ObjectValue[DeserializedClassConstructorDescriptor]

'findClass' @ [118:28] ==> public final fun findClass(asmType: Type): Class<Any> defined in org.jetbrains.eval4j.test.REFLECTION_EVAL[SimpleFunctionDescriptorImpl]

'classType' @ [118:38] ==> value-parameter classType: Type defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.loadClass[ValueParameterDescriptorImpl]

'getType' @ [118:55] ==> public open fun getType(p0: (Class<*>..Class<*>?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'Class' @ [118:63] ==> private constructor Class<T : (Any..Any?)>(p0: (ClassLoader..ClassLoader?)) defined in java.lang.Class[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'java' @ [118:76] ==> public val <T> KClass<Class<*>>.java: Class<Class<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Class<*>

'ObjectValue' @ [121:51] ==> public constructor ObjectValue(value: Any?, asmType: Type) defined in org.jetbrains.eval4j.ObjectValue[DeserializedClassConstructorDescriptor]

'str' @ [121:63] ==> value-parameter str: String defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.loadString[ValueParameterDescriptorImpl]

'getType' @ [121:73] ==> public open fun getType(p0: (Class<*>..Class<*>?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'String' @ [121:81] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'java' @ [121:95] ==> public val <T> KClass<String>.java: Class<String> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> String

'NewObjectValue' @ [124:16] ==> public constructor NewObjectValue(asmType: Type) defined in org.jetbrains.eval4j.NewObjectValue[DeserializedClassConstructorDescriptor]

'classType' @ [124:31] ==> value-parameter classType: Type defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.newInstance[ValueParameterDescriptorImpl]

'findClass' @ [128:22] ==> public final fun findClass(asmType: Type): Class<Any> defined in org.jetbrains.eval4j.test.REFLECTION_EVAL[SimpleFunctionDescriptorImpl]

'targetType' @ [128:32] ==> value-parameter targetType: Type defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.isInstanceOf[ValueParameterDescriptorImpl]

'_class' @ [129:16] ==> val _class: Class<Any> defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.isInstanceOf[LocalVariableDescriptor]

'isInstance' @ [129:23] ==> public open fun isInstance(p0: (Any..Any?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'value' @ [129:34] ==> value-parameter value: Value defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.isInstanceOf[ValueParameterDescriptorImpl]

'obj' @ [129:40] ==> public fun Value.obj(expectedType: Type = ...): Any? defined in org.jetbrains.eval4j[DeserializedSimpleFunctionDescriptor]

'Suppress' @ [132:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'ObjectValue' @ [134:16] ==> public constructor ObjectValue(value: Any?, asmType: Type) defined in org.jetbrains.eval4j.ObjectValue[DeserializedClassConstructorDescriptor]

'newInstance' @ [134:35] ==> public open fun newInstance(p0: (Class<*>..Class<*>?), p1: Int): (Any..Any?) defined in java.lang.reflect.Array[JavaMethodDescriptor]

'findClass' @ [134:47] ==> public final fun findClass(asmType: Type): Class<Any> defined in org.jetbrains.eval4j.test.REFLECTION_EVAL[SimpleFunctionDescriptorImpl]

'arrayType' @ [134:57] ==> value-parameter arrayType: Type defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.newArray[ValueParameterDescriptorImpl]

'componentType' @ [134:68] ==> public final val <T : (Any..Any?)> Class<Any>.componentType: (Class<*>..Class<*>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'size' @ [134:97] ==> value-parameter size: Int defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.newArray[ValueParameterDescriptorImpl]

'arrayType' @ [134:104] ==> value-parameter arrayType: Type defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.newArray[ValueParameterDescriptorImpl]

'ObjectValue' @ [138:16] ==> public constructor ObjectValue(value: Any?, asmType: Type) defined in org.jetbrains.eval4j.ObjectValue[DeserializedClassConstructorDescriptor]

'newMultiArray' @ [138:40] ==> public open fun newMultiArray(elementType: (Class<*>..Class<*>?), vararg dimensions: (Int..Int?)): (Any..Any?) defined in org.jetbrains.eval4j.test.ArrayHelper[JavaMethodDescriptor]

'findClass' @ [138:54] ==> public final fun findClass(asmType: Type): Class<Any> defined in org.jetbrains.eval4j.test.REFLECTION_EVAL[SimpleFunctionDescriptorImpl]

'arrayType' @ [138:64] ==> value-parameter arrayType: Type defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.newMultiDimensionalArray[ValueParameterDescriptorImpl]

'elementType' @ [138:74] ==> public final val Type.elementType: (Type..Type?)[MyPropertyDescriptor]

'dimensionSizes' @ [138:89] ==> value-parameter dimensionSizes: List<Int> defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.newMultiDimensionalArray[ValueParameterDescriptorImpl]

'toTypedArray' @ [138:104] ==> public inline fun <reified T> Collection<Int>.toTypedArray(): Array<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> Int

'arrayType' @ [138:121] ==> value-parameter arrayType: Type defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.newMultiDimensionalArray[ValueParameterDescriptorImpl]

'int' @ [142:16] ==> public fun int(v: Int): IntValue defined in org.jetbrains.eval4j[DeserializedSimpleFunctionDescriptor]

'getLength' @ [142:27] ==> public open fun getLength(p0: (Any..Any?)): Int defined in java.lang.reflect.Array[JavaMethodDescriptor]

'array' @ [142:37] ==> value-parameter array: Value defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.getArrayLength[ValueParameterDescriptorImpl]

'obj' @ [142:43] ==> public fun Value.obj(expectedType: Type = ...): Any? defined in org.jetbrains.eval4j[DeserializedSimpleFunctionDescriptor]

'checkNull' @ [142:49] ==> public fun <T : Any> Any?.checkNull(): Any defined in org.jetbrains.eval4j[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Any

'array' @ [146:23] ==> value-parameter array: Value defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.getArrayElement[ValueParameterDescriptorImpl]

'asmType' @ [146:29] ==> public abstract val asmType: Type defined in org.jetbrains.eval4j.Value[DeserializedPropertyDescriptor]

'if (asmType.dimensions == 1) asmType.elementType else Type.getType(asmType.descriptor.substring(1))' @ [147:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Type..Type?), elseBranch: (Type..Type?)): (Type..Type?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (org.jetbrains.org.objectweb.asm.Type..org.jetbrains.org.objectweb.asm.Type?)

'asmType' @ [147:31] ==> val asmType: Type defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.getArrayElement[LocalVariableDescriptor]

'dimensions' @ [147:39] ==> public final val Type.dimensions: Int[MyPropertyDescriptor]

'asmType' @ [147:56] ==> val asmType: Type defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.getArrayElement[LocalVariableDescriptor]

'elementType' @ [147:64] ==> public final val Type.elementType: (Type..Type?)[MyPropertyDescriptor]

'getType' @ [147:86] ==> public open fun getType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'asmType' @ [147:94] ==> val asmType: Type defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.getArrayElement[LocalVariableDescriptor]

'descriptor' @ [147:102] ==> public final val Type.descriptor: (String..String?)[MyPropertyDescriptor]

'substring' @ [147:113] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'array' @ [148:19] ==> value-parameter array: Value defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.getArrayElement[ValueParameterDescriptorImpl]

'obj' @ [148:25] ==> public fun Value.obj(expectedType: Type = ...): Any? defined in org.jetbrains.eval4j[DeserializedSimpleFunctionDescriptor]

'checkNull' @ [148:31] ==> public fun <T : Any> Any?.checkNull(): Any defined in org.jetbrains.eval4j[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Any

'index' @ [149:19] ==> value-parameter index: Value defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.getArrayElement[ValueParameterDescriptorImpl]

'int' @ [149:25] ==> public val Value.int: Int defined in org.jetbrains.eval4j[DeserializedPropertyDescriptor]

'mayThrow' @ [150:16] ==> public final fun <T> mayThrow(f: () -> AbstractValue<out Any?>): AbstractValue<out Any?> defined in org.jetbrains.eval4j.test.REFLECTION_EVAL[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> AbstractValue<out Any?>

'when (elementType.sort) {
                Type.BOOLEAN -> boolean(JArray.getBoolean(arr, ind))
                Type.BYTE -> byte(JArray.getByte(arr, ind))
                Type.SHORT -> short(JArray.getShort(arr, ind))
                Type.CHAR -> char(JArray.getChar(arr, ind))
                Type.INT -> int(JArray.getInt(arr, ind))
                Type.LONG -> long(JArray.getLong(arr, ind))
                Type.FLOAT -> float(JArray.getFloat(arr, ind))
                Type.DOUBLE -> double(JArray.getDouble(arr, ind))
                Type.OBJECT,
                Type.ARRAY -> {
                    val value = JArray.get(arr, ind)
                    if (value == null) NULL_VALUE else ObjectValue(value, Type.getType(value::class.java))
                }
                else -> throw UnsupportedOperationException("Unsupported array element type: $elementType")
            }' @ [151:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: AbstractValue<out Any?>, entry1: AbstractValue<out Any?>, entry2: AbstractValue<out Any?>, entry3: AbstractValue<out Any?>, entry4: AbstractValue<out Any?>, entry5: AbstractValue<out Any?>, entry6: AbstractValue<out Any?>, entry7: AbstractValue<out Any?>, entry8: AbstractValue<out Any?>, entry9: AbstractValue<out Any?>): AbstractValue<out Any?>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> AbstractValue<out Any?>

'elementType' @ [151:19] ==> val elementType: (Type..Type?) defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.getArrayElement[LocalVariableDescriptor]

'sort' @ [151:31] ==> public final val Type.sort: Int[MyPropertyDescriptor]

'BOOLEAN' @ [152:22] ==> public const final val BOOLEAN: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'boolean' @ [152:33] ==> public fun boolean(v: Boolean): IntValue defined in org.jetbrains.eval4j[DeserializedSimpleFunctionDescriptor]

'getBoolean' @ [152:48] ==> public open fun getBoolean(p0: (Any..Any?), p1: Int): Boolean defined in java.lang.reflect.Array[JavaMethodDescriptor]

'arr' @ [152:59] ==> val arr: Any defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.getArrayElement[LocalVariableDescriptor]

'ind' @ [152:64] ==> val ind: Int defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.getArrayElement[LocalVariableDescriptor]

'BYTE' @ [153:22] ==> public const final val BYTE: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'byte' @ [153:30] ==> public fun byte(v: Byte): IntValue defined in org.jetbrains.eval4j[DeserializedSimpleFunctionDescriptor]

'getByte' @ [153:42] ==> public open fun getByte(p0: (Any..Any?), p1: Int): Byte defined in java.lang.reflect.Array[JavaMethodDescriptor]

'arr' @ [153:50] ==> val arr: Any defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.getArrayElement[LocalVariableDescriptor]

'ind' @ [153:55] ==> val ind: Int defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.getArrayElement[LocalVariableDescriptor]

'SHORT' @ [154:22] ==> public const final val SHORT: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'short' @ [154:31] ==> public fun short(v: Short): IntValue defined in org.jetbrains.eval4j[DeserializedSimpleFunctionDescriptor]

'getShort' @ [154:44] ==> public open fun getShort(p0: (Any..Any?), p1: Int): Short defined in java.lang.reflect.Array[JavaMethodDescriptor]

'arr' @ [154:53] ==> val arr: Any defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.getArrayElement[LocalVariableDescriptor]

'ind' @ [154:58] ==> val ind: Int defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.getArrayElement[LocalVariableDescriptor]

'CHAR' @ [155:22] ==> public const final val CHAR: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'char' @ [155:30] ==> public fun char(v: Char): IntValue defined in org.jetbrains.eval4j[DeserializedSimpleFunctionDescriptor]

'getChar' @ [155:42] ==> public open fun getChar(p0: (Any..Any?), p1: Int): Char defined in java.lang.reflect.Array[JavaMethodDescriptor]

'arr' @ [155:50] ==> val arr: Any defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.getArrayElement[LocalVariableDescriptor]

'ind' @ [155:55] ==> val ind: Int defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.getArrayElement[LocalVariableDescriptor]

'INT' @ [156:22] ==> public const final val INT: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'int' @ [156:29] ==> public fun int(v: Int): IntValue defined in org.jetbrains.eval4j[DeserializedSimpleFunctionDescriptor]

'getInt' @ [156:40] ==> public open fun getInt(p0: (Any..Any?), p1: Int): Int defined in java.lang.reflect.Array[JavaMethodDescriptor]

'arr' @ [156:47] ==> val arr: Any defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.getArrayElement[LocalVariableDescriptor]

'ind' @ [156:52] ==> val ind: Int defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.getArrayElement[LocalVariableDescriptor]

'LONG' @ [157:22] ==> public const final val LONG: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'long' @ [157:30] ==> public fun long(v: Long): LongValue defined in org.jetbrains.eval4j[DeserializedSimpleFunctionDescriptor]

'getLong' @ [157:42] ==> public open fun getLong(p0: (Any..Any?), p1: Int): Long defined in java.lang.reflect.Array[JavaMethodDescriptor]

'arr' @ [157:50] ==> val arr: Any defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.getArrayElement[LocalVariableDescriptor]

'ind' @ [157:55] ==> val ind: Int defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.getArrayElement[LocalVariableDescriptor]

'FLOAT' @ [158:22] ==> public const final val FLOAT: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'float' @ [158:31] ==> public fun float(v: Float): FloatValue defined in org.jetbrains.eval4j[DeserializedSimpleFunctionDescriptor]

'getFloat' @ [158:44] ==> public open fun getFloat(p0: (Any..Any?), p1: Int): Float defined in java.lang.reflect.Array[JavaMethodDescriptor]

'arr' @ [158:53] ==> val arr: Any defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.getArrayElement[LocalVariableDescriptor]

'ind' @ [158:58] ==> val ind: Int defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.getArrayElement[LocalVariableDescriptor]

'DOUBLE' @ [159:22] ==> public const final val DOUBLE: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'double' @ [159:32] ==> public fun double(v: Double): DoubleValue defined in org.jetbrains.eval4j[DeserializedSimpleFunctionDescriptor]

'getDouble' @ [159:46] ==> public open fun getDouble(p0: (Any..Any?), p1: Int): Double defined in java.lang.reflect.Array[JavaMethodDescriptor]

'arr' @ [159:56] ==> val arr: Any defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.getArrayElement[LocalVariableDescriptor]

'ind' @ [159:61] ==> val ind: Int defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.getArrayElement[LocalVariableDescriptor]

'OBJECT' @ [160:22] ==> public const final val OBJECT: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'ARRAY' @ [161:22] ==> public const final val ARRAY: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'get' @ [162:40] ==> public open fun get(p0: (Any..Any?), p1: Int): (Any..Any?) defined in java.lang.reflect.Array[JavaMethodDescriptor]

'arr' @ [162:44] ==> val arr: Any defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.getArrayElement[LocalVariableDescriptor]

'ind' @ [162:49] ==> val ind: Int defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.getArrayElement[LocalVariableDescriptor]

'if (value == null) NULL_VALUE else ObjectValue(value, Type.getType(value::class.java))' @ [163:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ObjectValue, elseBranch: ObjectValue): ObjectValue[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ObjectValue

'value' @ [163:25] ==> val value: (Any..Any?) defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.getArrayElement.<anonymous>[LocalVariableDescriptor]

'NULL_VALUE' @ [163:40] ==> public val NULL_VALUE: ObjectValue defined in org.jetbrains.eval4j[DeserializedPropertyDescriptor]

'ObjectValue' @ [163:56] ==> public constructor ObjectValue(value: Any?, asmType: Type) defined in org.jetbrains.eval4j.ObjectValue[DeserializedClassConstructorDescriptor]

'value' @ [163:68] ==> val value: (Any..Any?) defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.getArrayElement.<anonymous>[LocalVariableDescriptor]

'getType' @ [163:80] ==> public open fun getType(p0: (Class<*>..Class<*>?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'value' @ [163:88] ==> val value: (Any..Any?) defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.getArrayElement.<anonymous>[LocalVariableDescriptor]

'java' @ [163:101] ==> public val <T> KClass<out Any>.java: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Any

'UnsupportedOperationException' @ [165:31] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'elementType' @ [165:95] ==> val elementType: (Type..Type?) defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.getArrayElement[LocalVariableDescriptor]

'array' @ [171:19] ==> value-parameter array: Value defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setArrayElement[ValueParameterDescriptorImpl]

'obj' @ [171:25] ==> public fun Value.obj(expectedType: Type = ...): Any? defined in org.jetbrains.eval4j[DeserializedSimpleFunctionDescriptor]

'checkNull' @ [171:31] ==> public fun <T : Any> Any?.checkNull(): Any defined in org.jetbrains.eval4j[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Any

'index' @ [172:19] ==> value-parameter index: Value defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setArrayElement[ValueParameterDescriptorImpl]

'int' @ [172:25] ==> public val Value.int: Int defined in org.jetbrains.eval4j[DeserializedPropertyDescriptor]

'array' @ [173:13] ==> value-parameter array: Value defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setArrayElement[ValueParameterDescriptorImpl]

'asmType' @ [173:19] ==> public abstract val asmType: Type defined in org.jetbrains.eval4j.Value[DeserializedPropertyDescriptor]

'dimensions' @ [173:27] ==> public final val Type.dimensions: Int[MyPropertyDescriptor]

'set' @ [174:20] ==> public open fun set(p0: (Any..Any?), p1: Int, p2: (Any..Any?)): Unit defined in java.lang.reflect.Array[JavaMethodDescriptor]

'arr' @ [174:24] ==> val arr: Any defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setArrayElement[LocalVariableDescriptor]

'ind' @ [174:29] ==> val ind: Int defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setArrayElement[LocalVariableDescriptor]

'newValue' @ [174:34] ==> value-parameter newValue: Value defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setArrayElement[ValueParameterDescriptorImpl]

'obj' @ [174:43] ==> public fun Value.obj(expectedType: Type = ...): Any? defined in org.jetbrains.eval4j[DeserializedSimpleFunctionDescriptor]

'array' @ [177:27] ==> value-parameter array: Value defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setArrayElement[ValueParameterDescriptorImpl]

'asmType' @ [177:33] ==> public abstract val asmType: Type defined in org.jetbrains.eval4j.Value[DeserializedPropertyDescriptor]

'elementType' @ [177:41] ==> public final val Type.elementType: (Type..Type?)[MyPropertyDescriptor]

'mayThrow' @ [178:9] ==> public final fun <T> mayThrow(f: () -> Unit): Unit defined in org.jetbrains.eval4j.test.REFLECTION_EVAL[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Unit

'when (elementType.sort) {
                Type.BOOLEAN -> JArray.setBoolean(arr, ind, newValue.boolean)
                Type.BYTE -> JArray.setByte(arr, ind, newValue.int.toByte())
                Type.SHORT -> JArray.setShort(arr, ind, newValue.int.toShort())
                Type.CHAR -> JArray.setChar(arr, ind, newValue.int.toChar())
                Type.INT -> JArray.setInt(arr, ind, newValue.int)
                Type.LONG -> JArray.setLong(arr, ind, newValue.long)
                Type.FLOAT -> JArray.setFloat(arr, ind, newValue.float)
                Type.DOUBLE -> JArray.setDouble(arr, ind, newValue.double)
                Type.OBJECT,
                Type.ARRAY -> {
                    JArray.set(arr, ind, newValue.obj())
                }
                else -> throw UnsupportedOperationException("Unsupported array element type: $elementType")
            }' @ [179:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit, entry4: Unit, entry5: Unit, entry6: Unit, entry7: Unit, entry8: Unit, entry9: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'elementType' @ [179:19] ==> val elementType: (Type..Type?) defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setArrayElement[LocalVariableDescriptor]

'sort' @ [179:31] ==> public final val Type.sort: Int[MyPropertyDescriptor]

'BOOLEAN' @ [180:22] ==> public const final val BOOLEAN: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'setBoolean' @ [180:40] ==> public open fun setBoolean(p0: (Any..Any?), p1: Int, p2: Boolean): Unit defined in java.lang.reflect.Array[JavaMethodDescriptor]

'arr' @ [180:51] ==> val arr: Any defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setArrayElement[LocalVariableDescriptor]

'ind' @ [180:56] ==> val ind: Int defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setArrayElement[LocalVariableDescriptor]

'newValue' @ [180:61] ==> value-parameter newValue: Value defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setArrayElement[ValueParameterDescriptorImpl]

'boolean' @ [180:70] ==> public val Value.boolean: Boolean defined in org.jetbrains.eval4j[DeserializedPropertyDescriptor]

'BYTE' @ [181:22] ==> public const final val BYTE: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'setByte' @ [181:37] ==> public open fun setByte(p0: (Any..Any?), p1: Int, p2: Byte): Unit defined in java.lang.reflect.Array[JavaMethodDescriptor]

'arr' @ [181:45] ==> val arr: Any defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setArrayElement[LocalVariableDescriptor]

'ind' @ [181:50] ==> val ind: Int defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setArrayElement[LocalVariableDescriptor]

'newValue' @ [181:55] ==> value-parameter newValue: Value defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setArrayElement[ValueParameterDescriptorImpl]

'int' @ [181:64] ==> public val Value.int: Int defined in org.jetbrains.eval4j[DeserializedPropertyDescriptor]

'toByte' @ [181:68] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'SHORT' @ [182:22] ==> public const final val SHORT: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'setShort' @ [182:38] ==> public open fun setShort(p0: (Any..Any?), p1: Int, p2: Short): Unit defined in java.lang.reflect.Array[JavaMethodDescriptor]

'arr' @ [182:47] ==> val arr: Any defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setArrayElement[LocalVariableDescriptor]

'ind' @ [182:52] ==> val ind: Int defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setArrayElement[LocalVariableDescriptor]

'newValue' @ [182:57] ==> value-parameter newValue: Value defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setArrayElement[ValueParameterDescriptorImpl]

'int' @ [182:66] ==> public val Value.int: Int defined in org.jetbrains.eval4j[DeserializedPropertyDescriptor]

'toShort' @ [182:70] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'CHAR' @ [183:22] ==> public const final val CHAR: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'setChar' @ [183:37] ==> public open fun setChar(p0: (Any..Any?), p1: Int, p2: Char): Unit defined in java.lang.reflect.Array[JavaMethodDescriptor]

'arr' @ [183:45] ==> val arr: Any defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setArrayElement[LocalVariableDescriptor]

'ind' @ [183:50] ==> val ind: Int defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setArrayElement[LocalVariableDescriptor]

'newValue' @ [183:55] ==> value-parameter newValue: Value defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setArrayElement[ValueParameterDescriptorImpl]

'int' @ [183:64] ==> public val Value.int: Int defined in org.jetbrains.eval4j[DeserializedPropertyDescriptor]

'toChar' @ [183:68] ==> public open fun toChar(): Char defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'INT' @ [184:22] ==> public const final val INT: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'setInt' @ [184:36] ==> public open fun setInt(p0: (Any..Any?), p1: Int, p2: Int): Unit defined in java.lang.reflect.Array[JavaMethodDescriptor]

'arr' @ [184:43] ==> val arr: Any defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setArrayElement[LocalVariableDescriptor]

'ind' @ [184:48] ==> val ind: Int defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setArrayElement[LocalVariableDescriptor]

'newValue' @ [184:53] ==> value-parameter newValue: Value defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setArrayElement[ValueParameterDescriptorImpl]

'int' @ [184:62] ==> public val Value.int: Int defined in org.jetbrains.eval4j[DeserializedPropertyDescriptor]

'LONG' @ [185:22] ==> public const final val LONG: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'setLong' @ [185:37] ==> public open fun setLong(p0: (Any..Any?), p1: Int, p2: Long): Unit defined in java.lang.reflect.Array[JavaMethodDescriptor]

'arr' @ [185:45] ==> val arr: Any defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setArrayElement[LocalVariableDescriptor]

'ind' @ [185:50] ==> val ind: Int defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setArrayElement[LocalVariableDescriptor]

'newValue' @ [185:55] ==> value-parameter newValue: Value defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setArrayElement[ValueParameterDescriptorImpl]

'long' @ [185:64] ==> public val Value.long: Long defined in org.jetbrains.eval4j[DeserializedPropertyDescriptor]

'FLOAT' @ [186:22] ==> public const final val FLOAT: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'setFloat' @ [186:38] ==> public open fun setFloat(p0: (Any..Any?), p1: Int, p2: Float): Unit defined in java.lang.reflect.Array[JavaMethodDescriptor]

'arr' @ [186:47] ==> val arr: Any defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setArrayElement[LocalVariableDescriptor]

'ind' @ [186:52] ==> val ind: Int defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setArrayElement[LocalVariableDescriptor]

'newValue' @ [186:57] ==> value-parameter newValue: Value defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setArrayElement[ValueParameterDescriptorImpl]

'float' @ [186:66] ==> public val Value.float: Float defined in org.jetbrains.eval4j[DeserializedPropertyDescriptor]

'DOUBLE' @ [187:22] ==> public const final val DOUBLE: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'setDouble' @ [187:39] ==> public open fun setDouble(p0: (Any..Any?), p1: Int, p2: Double): Unit defined in java.lang.reflect.Array[JavaMethodDescriptor]

'arr' @ [187:49] ==> val arr: Any defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setArrayElement[LocalVariableDescriptor]

'ind' @ [187:54] ==> val ind: Int defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setArrayElement[LocalVariableDescriptor]

'newValue' @ [187:59] ==> value-parameter newValue: Value defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setArrayElement[ValueParameterDescriptorImpl]

'double' @ [187:68] ==> public val Value.double: Double defined in org.jetbrains.eval4j[DeserializedPropertyDescriptor]

'OBJECT' @ [188:22] ==> public const final val OBJECT: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'ARRAY' @ [189:22] ==> public const final val ARRAY: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'set' @ [190:28] ==> public open fun set(p0: (Any..Any?), p1: Int, p2: (Any..Any?)): Unit defined in java.lang.reflect.Array[JavaMethodDescriptor]

'arr' @ [190:32] ==> val arr: Any defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setArrayElement[LocalVariableDescriptor]

'ind' @ [190:37] ==> val ind: Int defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setArrayElement[LocalVariableDescriptor]

'newValue' @ [190:42] ==> value-parameter newValue: Value defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setArrayElement[ValueParameterDescriptorImpl]

'obj' @ [190:51] ==> public fun Value.obj(expectedType: Type = ...): Any? defined in org.jetbrains.eval4j[DeserializedSimpleFunctionDescriptor]

'UnsupportedOperationException' @ [192:31] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'elementType' @ [192:95] ==> val elementType: (Type..Type?) defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setArrayElement[LocalVariableDescriptor]

'invoke' @ [200:24] ==> public abstract operator fun invoke(): T defined in kotlin.Function0[FunctionInvokeDescriptor]

'ite' @ [203:27] ==> val ite: InvocationTargetException defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.mayThrow[LocalVariableDescriptor]

'cause' @ [203:31] ==> public open val cause: Throwable? defined in java.lang.reflect.InvocationTargetException[JavaPropertyDescriptor]

'ite' @ [203:40] ==> val ite: InvocationTargetException defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.mayThrow[LocalVariableDescriptor]

'ThrownFromEvaluatedCodeException' @ [207:19] ==> public constructor ThrownFromEvaluatedCodeException(exception: ObjectValue) defined in org.jetbrains.eval4j.ThrownFromEvaluatedCodeException[DeserializedClassConstructorDescriptor]

'ObjectValue' @ [207:52] ==> public constructor ObjectValue(value: Any?, asmType: Type) defined in org.jetbrains.eval4j.ObjectValue[DeserializedClassConstructorDescriptor]

'e' @ [207:64] ==> val e: Throwable defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.mayThrow[LocalVariableDescriptor]

'getType' @ [207:72] ==> public open fun getType(p0: (Class<*>..Class<*>?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'e' @ [207:80] ==> val e: Throwable defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.mayThrow[LocalVariableDescriptor]

'java' @ [207:89] ==> public val <T> KClass<out Throwable>.java: Class<out Throwable> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Throwable

'findStaticField' @ [212:21] ==> public final fun findStaticField(fieldDesc: FieldDescription): Field defined in org.jetbrains.eval4j.test.REFLECTION_EVAL[SimpleFunctionDescriptorImpl]

'fieldDesc' @ [212:37] ==> value-parameter fieldDesc: FieldDescription defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.getStaticField[ValueParameterDescriptorImpl]

'mayThrow' @ [214:22] ==> public final fun <T> mayThrow(f: () -> (Any..Any?)): (Any..Any?) defined in org.jetbrains.eval4j.test.REFLECTION_EVAL[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> (kotlin.Any..kotlin.Any?)

'field' @ [214:32] ==> val field: Field defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.getStaticField[LocalVariableDescriptor]

'get' @ [214:38] ==> @CallerSensitive public open operator fun get(p0: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Field[JavaMethodDescriptor]

'objectToValue' @ [215:16] ==> public fun objectToValue(obj: Any?, expectedType: Type): Value defined in org.jetbrains.eval4j.test in file main.kt[SimpleFunctionDescriptorImpl]

'result' @ [215:30] ==> val result: (Any..Any?) defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.getStaticField[LocalVariableDescriptor]

'fieldDesc' @ [215:38] ==> value-parameter fieldDesc: FieldDescription defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.getStaticField[ValueParameterDescriptorImpl]

'fieldType' @ [215:48] ==> public val FieldDescription.fieldType: Type defined in org.jetbrains.eval4j[DeserializedPropertyDescriptor]

'findStaticField' @ [219:21] ==> public final fun findStaticField(fieldDesc: FieldDescription): Field defined in org.jetbrains.eval4j.test.REFLECTION_EVAL[SimpleFunctionDescriptorImpl]

'fieldDesc' @ [219:37] ==> value-parameter fieldDesc: FieldDescription defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setStaticField[ValueParameterDescriptorImpl]

'newValue' @ [220:19] ==> value-parameter newValue: Value defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setStaticField[ValueParameterDescriptorImpl]

'obj' @ [220:28] ==> public fun Value.obj(expectedType: Type = ...): Any? defined in org.jetbrains.eval4j[DeserializedSimpleFunctionDescriptor]

'fieldDesc' @ [220:32] ==> value-parameter fieldDesc: FieldDescription defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setStaticField[ValueParameterDescriptorImpl]

'fieldType' @ [220:42] ==> public val FieldDescription.fieldType: Type defined in org.jetbrains.eval4j[DeserializedPropertyDescriptor]

'mayThrow' @ [221:9] ==> public final fun <T> mayThrow(f: () -> Unit): Unit defined in org.jetbrains.eval4j.test.REFLECTION_EVAL[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Unit

'field' @ [221:19] ==> val field: Field defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setStaticField[LocalVariableDescriptor]

'set' @ [221:25] ==> @CallerSensitive public open operator fun set(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in java.lang.reflect.Field[JavaMethodDescriptor]

'obj' @ [221:35] ==> val obj: Any? defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setStaticField[LocalVariableDescriptor]

'assertTrue' @ [225:9] ==> public open fun assertTrue(p0: Boolean): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'fieldDesc' @ [225:20] ==> value-parameter fieldDesc: FieldDescription defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.findStaticField[ValueParameterDescriptorImpl]

'isStatic' @ [225:30] ==> public final val isStatic: Boolean defined in org.jetbrains.eval4j.FieldDescription[DeserializedPropertyDescriptor]

'findClass' @ [226:21] ==> public final fun findClass(memberDesc: MemberDescription): Class<Any> defined in org.jetbrains.eval4j.test.REFLECTION_EVAL[SimpleFunctionDescriptorImpl]

'fieldDesc' @ [226:31] ==> value-parameter fieldDesc: FieldDescription defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.findStaticField[ValueParameterDescriptorImpl]

'findField' @ [226:42] ==> @Suppress public fun Class<out Any>.findField(fieldDesc: FieldDescription): Field? defined in org.jetbrains.eval4j.test[SimpleFunctionDescriptorImpl]

'fieldDesc' @ [226:52] ==> value-parameter fieldDesc: FieldDescription defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.findStaticField[ValueParameterDescriptorImpl]

'assertNotNull' @ [227:9] ==> public open fun assertNotNull(p0: (String..String?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'fieldDesc' @ [227:42] ==> value-parameter fieldDesc: FieldDescription defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.findStaticField[ValueParameterDescriptorImpl]

'field' @ [227:54] ==> val field: Field? defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.findStaticField[LocalVariableDescriptor]

'assertTrue' @ [228:9] ==> public open fun assertTrue(p0: (String..String?), p1: Boolean): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'field' @ [228:43] ==> val field: Field? defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.findStaticField[LocalVariableDescriptor]

'!=' @ [228:51] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'field' @ [228:52] ==> val field: Field? defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.findStaticField[LocalVariableDescriptor]

'modifiers' @ [228:60] ==> public final val Field.modifiers: Int[MyPropertyDescriptor]

'STATIC' @ [228:83] ==> public const final val STATIC: Int defined in java.lang.reflect.Modifier[JavaPropertyDescriptor]

'field' @ [229:16] ==> val field: Field? defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.findStaticField[LocalVariableDescriptor]

'assertTrue' @ [233:9] ==> public open fun assertTrue(p0: Boolean): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'methodDesc' @ [233:20] ==> value-parameter methodDesc: MethodDescription defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.invokeStaticMethod[ValueParameterDescriptorImpl]

'isStatic' @ [233:31] ==> public final val isStatic: Boolean defined in org.jetbrains.eval4j.MethodDescription[DeserializedPropertyDescriptor]

'findClass' @ [234:22] ==> public final fun findClass(memberDesc: MemberDescription): Class<Any> defined in org.jetbrains.eval4j.test.REFLECTION_EVAL[SimpleFunctionDescriptorImpl]

'methodDesc' @ [234:32] ==> value-parameter methodDesc: MethodDescription defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.invokeStaticMethod[ValueParameterDescriptorImpl]

'findMethod' @ [234:44] ==> @Suppress public fun Class<out Any>.findMethod(methodDesc: MethodDescription): Method? defined in org.jetbrains.eval4j.test[SimpleFunctionDescriptorImpl]

'methodDesc' @ [234:55] ==> value-parameter methodDesc: MethodDescription defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.invokeStaticMethod[ValueParameterDescriptorImpl]

'assertNotNull' @ [235:9] ==> public open fun assertNotNull(p0: (String..String?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'methodDesc' @ [235:43] ==> value-parameter methodDesc: MethodDescription defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.invokeStaticMethod[ValueParameterDescriptorImpl]

'method' @ [235:56] ==> val method: Method? defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.invokeStaticMethod[LocalVariableDescriptor]

'mapArguments' @ [236:20] ==> private final fun mapArguments(arguments: List<Value>, expecetedTypes: List<Type>): List<Any?> defined in org.jetbrains.eval4j.test.REFLECTION_EVAL[SimpleFunctionDescriptorImpl]

'arguments' @ [236:33] ==> value-parameter arguments: List<Value> defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.invokeStaticMethod[ValueParameterDescriptorImpl]

'methodDesc' @ [236:44] ==> value-parameter methodDesc: MethodDescription defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.invokeStaticMethod[ValueParameterDescriptorImpl]

'parameterTypes' @ [236:55] ==> public val MethodDescription.parameterTypes: List<Type> defined in org.jetbrains.eval4j[DeserializedPropertyDescriptor]

'toTypedArray' @ [236:71] ==> public inline fun <reified T> Collection<Any?>.toTypedArray(): Array<Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> Any?

'mayThrow' @ [237:22] ==> public final fun <T> mayThrow(f: () -> (Any..Any?)): (Any..Any?) defined in org.jetbrains.eval4j.test.REFLECTION_EVAL[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> (kotlin.Any..kotlin.Any?)

'method' @ [237:32] ==> val method: Method? defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.invokeStaticMethod[LocalVariableDescriptor]

'invoke' @ [237:41] ==> @CallerSensitive public open operator fun invoke(p0: (Any..Any?), vararg p1: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Method[JavaMethodDescriptor]

'args' @ [237:55] ==> val args: Array<Any?> defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.invokeStaticMethod[LocalVariableDescriptor]

'objectToValue' @ [238:16] ==> public fun objectToValue(obj: Any?, expectedType: Type): Value defined in org.jetbrains.eval4j.test in file main.kt[SimpleFunctionDescriptorImpl]

'result' @ [238:30] ==> val result: (Any..Any?) defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.invokeStaticMethod[LocalVariableDescriptor]

'methodDesc' @ [238:38] ==> value-parameter methodDesc: MethodDescription defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.invokeStaticMethod[ValueParameterDescriptorImpl]

'returnType' @ [238:49] ==> public val MethodDescription.returnType: Type defined in org.jetbrains.eval4j[DeserializedPropertyDescriptor]

'findClass' @ [241:64] ==> public final fun findClass(asmType: Type): Class<Any> defined in org.jetbrains.eval4j.test.REFLECTION_EVAL[SimpleFunctionDescriptorImpl]

'getObjectType' @ [241:79] ==> public open fun getObjectType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'memberDesc' @ [241:93] ==> value-parameter memberDesc: MemberDescription defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.findClass[ValueParameterDescriptorImpl]

'ownerInternalName' @ [241:104] ==> public final val ownerInternalName: String defined in org.jetbrains.eval4j.MemberDescription[DeserializedPropertyDescriptor]

'lookup' @ [244:21] ==> public final val lookup: ReflectionLookup defined in org.jetbrains.eval4j.test.REFLECTION_EVAL[PropertyDescriptorImpl]

'findClass' @ [244:28] ==> @Suppress public final fun findClass(asmType: Type): Class<*>? defined in org.jetbrains.eval4j.test.ReflectionLookup[SimpleFunctionDescriptorImpl]

'asmType' @ [244:38] ==> value-parameter asmType: Type defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.findClass[ValueParameterDescriptorImpl]

'assertNotNull' @ [245:9] ==> public open fun assertNotNull(p0: (String..String?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'asmType' @ [245:43] ==> value-parameter asmType: Type defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.findClass[ValueParameterDescriptorImpl]

'owner' @ [245:54] ==> val owner: Class<*>? defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.findClass[LocalVariableDescriptor]

'owner' @ [246:16] ==> val owner: Class<*>? defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.findClass[LocalVariableDescriptor]

'instance' @ [250:19] ==> value-parameter instance: Value defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.getField[ValueParameterDescriptorImpl]

'obj' @ [250:28] ==> public fun Value.obj(expectedType: Type = ...): Any? defined in org.jetbrains.eval4j[DeserializedSimpleFunctionDescriptor]

'checkNull' @ [250:34] ==> public fun <T : Any> Any?.checkNull(): Any defined in org.jetbrains.eval4j[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Any

'findInstanceField' @ [251:21] ==> public final fun findInstanceField(obj: Any, fieldDesc: FieldDescription): Field defined in org.jetbrains.eval4j.test.REFLECTION_EVAL[SimpleFunctionDescriptorImpl]

'obj' @ [251:39] ==> val obj: Any defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.getField[LocalVariableDescriptor]

'fieldDesc' @ [251:44] ==> value-parameter fieldDesc: FieldDescription defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.getField[ValueParameterDescriptorImpl]

'objectToValue' @ [253:16] ==> public fun objectToValue(obj: Any?, expectedType: Type): Value defined in org.jetbrains.eval4j.test in file main.kt[SimpleFunctionDescriptorImpl]

'mayThrow' @ [253:30] ==> public final fun <T> mayThrow(f: () -> (Any..Any?)): (Any..Any?) defined in org.jetbrains.eval4j.test.REFLECTION_EVAL[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> (kotlin.Any..kotlin.Any?)

'field' @ [253:40] ==> val field: Field defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.getField[LocalVariableDescriptor]

'get' @ [253:46] ==> @CallerSensitive public open operator fun get(p0: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Field[JavaMethodDescriptor]

'obj' @ [253:50] ==> val obj: Any defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.getField[LocalVariableDescriptor]

'fieldDesc' @ [253:57] ==> value-parameter fieldDesc: FieldDescription defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.getField[ValueParameterDescriptorImpl]

'fieldType' @ [253:67] ==> public val FieldDescription.fieldType: Type defined in org.jetbrains.eval4j[DeserializedPropertyDescriptor]

'instance' @ [257:19] ==> value-parameter instance: Value defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setField[ValueParameterDescriptorImpl]

'obj' @ [257:28] ==> public fun Value.obj(expectedType: Type = ...): Any? defined in org.jetbrains.eval4j[DeserializedSimpleFunctionDescriptor]

'checkNull' @ [257:34] ==> public fun <T : Any> Any?.checkNull(): Any defined in org.jetbrains.eval4j[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Any

'findInstanceField' @ [258:21] ==> public final fun findInstanceField(obj: Any, fieldDesc: FieldDescription): Field defined in org.jetbrains.eval4j.test.REFLECTION_EVAL[SimpleFunctionDescriptorImpl]

'obj' @ [258:39] ==> val obj: Any defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setField[LocalVariableDescriptor]

'fieldDesc' @ [258:44] ==> value-parameter fieldDesc: FieldDescription defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setField[ValueParameterDescriptorImpl]

'newValue' @ [260:22] ==> value-parameter newValue: Value defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setField[ValueParameterDescriptorImpl]

'obj' @ [260:31] ==> public fun Value.obj(expectedType: Type = ...): Any? defined in org.jetbrains.eval4j[DeserializedSimpleFunctionDescriptor]

'fieldDesc' @ [260:35] ==> value-parameter fieldDesc: FieldDescription defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setField[ValueParameterDescriptorImpl]

'fieldType' @ [260:45] ==> public val FieldDescription.fieldType: Type defined in org.jetbrains.eval4j[DeserializedPropertyDescriptor]

'mayThrow' @ [261:9] ==> public final fun <T> mayThrow(f: () -> Unit): Unit defined in org.jetbrains.eval4j.test.REFLECTION_EVAL[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Unit

'field' @ [261:19] ==> val field: Field defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setField[LocalVariableDescriptor]

'set' @ [261:25] ==> @CallerSensitive public open operator fun set(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in java.lang.reflect.Field[JavaMethodDescriptor]

'obj' @ [261:29] ==> val obj: Any defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setField[LocalVariableDescriptor]

'newObj' @ [261:34] ==> val newObj: Any? defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.setField[LocalVariableDescriptor]

'obj' @ [265:22] ==> value-parameter obj: Any defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.findInstanceField[ValueParameterDescriptorImpl]

'java' @ [265:33] ==> public val <T> KClass<out Any>.java: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Any

'_class' @ [266:21] ==> val _class: Class<out Any> defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.findInstanceField[LocalVariableDescriptor]

'findField' @ [266:28] ==> @Suppress public fun Class<out Any>.findField(fieldDesc: FieldDescription): Field? defined in org.jetbrains.eval4j.test[SimpleFunctionDescriptorImpl]

'fieldDesc' @ [266:38] ==> value-parameter fieldDesc: FieldDescription defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.findInstanceField[ValueParameterDescriptorImpl]

'assertNotNull' @ [267:9] ==> public open fun assertNotNull(p0: (String..String?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'fieldDesc' @ [267:42] ==> value-parameter fieldDesc: FieldDescription defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.findInstanceField[ValueParameterDescriptorImpl]

'field' @ [267:54] ==> val field: Field? defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.findInstanceField[LocalVariableDescriptor]

'field' @ [268:16] ==> val field: Field? defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.findInstanceField[LocalVariableDescriptor]

'invokespecial' @ [272:13] ==> value-parameter invokespecial: Boolean defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.invokeMethod[ValueParameterDescriptorImpl]

'if (methodDesc.name == "<init>") {
                // Constructor call
                @Suppress("UNCHECKED_CAST")
                val _class = findClass((instance as NewObjectValue).asmType)
                val ctor = _class.findConstructor(methodDesc)
                assertNotNull("Constructor not found: $methodDesc", ctor)
                val args = mapArguments(arguments, methodDesc.parameterTypes).toTypedArray()
                val result = mayThrow {ctor!!.newInstance(*args)}
                instance.value = result
                return objectToValue(result, instance.asmType)
            }
            else {
                // TODO
                throw UnsupportedOperationException("invokespecial is not suported in reflection eval")
            }' @ [273:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'methodDesc' @ [273:17] ==> value-parameter methodDesc: MethodDescription defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.invokeMethod[ValueParameterDescriptorImpl]

'name' @ [273:28] ==> public final val name: String defined in org.jetbrains.eval4j.MethodDescription[DeserializedPropertyDescriptor]

'Suppress' @ [275:17] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'findClass' @ [276:30] ==> public final fun findClass(asmType: Type): Class<Any> defined in org.jetbrains.eval4j.test.REFLECTION_EVAL[SimpleFunctionDescriptorImpl]

'instance' @ [276:41] ==> value-parameter instance: Value defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.invokeMethod[ValueParameterDescriptorImpl]

'asmType' @ [276:69] ==> public open val asmType: Type defined in org.jetbrains.eval4j.NewObjectValue[DeserializedPropertyDescriptor]

'_class' @ [277:28] ==> val _class: Class<Any> defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.invokeMethod[LocalVariableDescriptor]

'findConstructor' @ [277:35] ==> @Suppress public fun Class<Any>.findConstructor(methodDesc: MethodDescription): Constructor<Any?>? defined in org.jetbrains.eval4j.test[SimpleFunctionDescriptorImpl]

'methodDesc' @ [277:51] ==> value-parameter methodDesc: MethodDescription defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.invokeMethod[ValueParameterDescriptorImpl]

'assertNotNull' @ [278:17] ==> public open fun assertNotNull(p0: (String..String?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'methodDesc' @ [278:56] ==> value-parameter methodDesc: MethodDescription defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.invokeMethod[ValueParameterDescriptorImpl]

'ctor' @ [278:69] ==> val ctor: Constructor<Any?>? defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.invokeMethod[LocalVariableDescriptor]

'mapArguments' @ [279:28] ==> private final fun mapArguments(arguments: List<Value>, expecetedTypes: List<Type>): List<Any?> defined in org.jetbrains.eval4j.test.REFLECTION_EVAL[SimpleFunctionDescriptorImpl]

'arguments' @ [279:41] ==> value-parameter arguments: List<Value> defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.invokeMethod[ValueParameterDescriptorImpl]

'methodDesc' @ [279:52] ==> value-parameter methodDesc: MethodDescription defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.invokeMethod[ValueParameterDescriptorImpl]

'parameterTypes' @ [279:63] ==> public val MethodDescription.parameterTypes: List<Type> defined in org.jetbrains.eval4j[DeserializedPropertyDescriptor]

'toTypedArray' @ [279:79] ==> public inline fun <reified T> Collection<Any?>.toTypedArray(): Array<Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> Any?

'mayThrow' @ [280:30] ==> public final fun <T> mayThrow(f: () -> Any?): Any? defined in org.jetbrains.eval4j.test.REFLECTION_EVAL[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Any?

'ctor' @ [280:40] ==> val ctor: Constructor<Any?>? defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.invokeMethod[LocalVariableDescriptor]

'newInstance' @ [280:47] ==> @CallerSensitive public open fun newInstance(vararg p0: (Any..Any?)): Any? defined in java.lang.reflect.Constructor[JavaMethodDescriptor]

'args' @ [280:60] ==> val args: Array<Any?> defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.invokeMethod[LocalVariableDescriptor]

'instance' @ [281:17] ==> value-parameter instance: Value defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.invokeMethod[ValueParameterDescriptorImpl]

'value' @ [281:26] ==> public open var value: Any? defined in org.jetbrains.eval4j.NewObjectValue[DeserializedPropertyDescriptor]

'result' @ [281:34] ==> val result: Any? defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.invokeMethod[LocalVariableDescriptor]

'objectToValue' @ [282:24] ==> public fun objectToValue(obj: Any?, expectedType: Type): Value defined in org.jetbrains.eval4j.test in file main.kt[SimpleFunctionDescriptorImpl]

'result' @ [282:38] ==> val result: Any? defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.invokeMethod[LocalVariableDescriptor]

'instance' @ [282:46] ==> value-parameter instance: Value defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.invokeMethod[ValueParameterDescriptorImpl]

'asmType' @ [282:55] ==> public abstract val asmType: Type defined in org.jetbrains.eval4j.Value[DeserializedPropertyDescriptor]

'UnsupportedOperationException' @ [286:23] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'instance' @ [289:19] ==> value-parameter instance: Value defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.invokeMethod[ValueParameterDescriptorImpl]

'obj' @ [289:28] ==> public fun Value.obj(expectedType: Type = ...): Any? defined in org.jetbrains.eval4j[DeserializedSimpleFunctionDescriptor]

'checkNull' @ [289:34] ==> public fun <T : Any> Any?.checkNull(): Any defined in org.jetbrains.eval4j[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Any

'obj' @ [290:22] ==> val obj: Any defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.invokeMethod[LocalVariableDescriptor]

'java' @ [290:33] ==> public val <T> KClass<out Any>.java: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Any

'findMethod' @ [290:38] ==> @Suppress public fun Class<out Any>.findMethod(methodDesc: MethodDescription): Method? defined in org.jetbrains.eval4j.test[SimpleFunctionDescriptorImpl]

'methodDesc' @ [290:49] ==> value-parameter methodDesc: MethodDescription defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.invokeMethod[ValueParameterDescriptorImpl]

'assertNotNull' @ [291:9] ==> public open fun assertNotNull(p0: (String..String?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'methodDesc' @ [291:43] ==> value-parameter methodDesc: MethodDescription defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.invokeMethod[ValueParameterDescriptorImpl]

'method' @ [291:56] ==> val method: Method? defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.invokeMethod[LocalVariableDescriptor]

'mapArguments' @ [292:20] ==> private final fun mapArguments(arguments: List<Value>, expecetedTypes: List<Type>): List<Any?> defined in org.jetbrains.eval4j.test.REFLECTION_EVAL[SimpleFunctionDescriptorImpl]

'arguments' @ [292:33] ==> value-parameter arguments: List<Value> defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.invokeMethod[ValueParameterDescriptorImpl]

'methodDesc' @ [292:44] ==> value-parameter methodDesc: MethodDescription defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.invokeMethod[ValueParameterDescriptorImpl]

'parameterTypes' @ [292:55] ==> public val MethodDescription.parameterTypes: List<Type> defined in org.jetbrains.eval4j[DeserializedPropertyDescriptor]

'toTypedArray' @ [292:71] ==> public inline fun <reified T> Collection<Any?>.toTypedArray(): Array<Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> Any?

'mayThrow' @ [293:22] ==> public final fun <T> mayThrow(f: () -> (Any..Any?)): (Any..Any?) defined in org.jetbrains.eval4j.test.REFLECTION_EVAL[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> (kotlin.Any..kotlin.Any?)

'method' @ [293:32] ==> val method: Method? defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.invokeMethod[LocalVariableDescriptor]

'invoke' @ [293:41] ==> @CallerSensitive public open operator fun invoke(p0: (Any..Any?), vararg p1: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Method[JavaMethodDescriptor]

'obj' @ [293:48] ==> val obj: Any defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.invokeMethod[LocalVariableDescriptor]

'args' @ [293:54] ==> val args: Array<Any?> defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.invokeMethod[LocalVariableDescriptor]

'objectToValue' @ [294:16] ==> public fun objectToValue(obj: Any?, expectedType: Type): Value defined in org.jetbrains.eval4j.test in file main.kt[SimpleFunctionDescriptorImpl]

'result' @ [294:30] ==> val result: (Any..Any?) defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.invokeMethod[LocalVariableDescriptor]

'methodDesc' @ [294:38] ==> value-parameter methodDesc: MethodDescription defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.invokeMethod[ValueParameterDescriptorImpl]

'returnType' @ [294:49] ==> public val MethodDescription.returnType: Type defined in org.jetbrains.eval4j[DeserializedPropertyDescriptor]

'arguments' @ [298:16] ==> value-parameter arguments: List<Value> defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.mapArguments[ValueParameterDescriptorImpl]

'zip' @ [298:26] ==> public infix fun <T, R> Iterable<Value>.zip(other: Iterable<Type>): List<Pair<Value, Type>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Value
    <R> -> Type

'expecetedTypes' @ [298:30] ==> value-parameter expecetedTypes: List<Type> defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.mapArguments[ValueParameterDescriptorImpl]

'map' @ [298:46] ==> public inline fun <T, R> Iterable<Pair<Value, Type>>.map(transform: (Pair<Value, Type>) -> Any?): List<Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<Value, Type>
    <R> -> Any?

'component1' @ [299:18] ==> public final operator fun component1(): Value defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [299:23] ==> public final operator fun component2(): Type defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'it' @ [299:39] ==> value-parameter it: Pair<Value, Type> defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.mapArguments.<anonymous>[ValueParameterDescriptorImpl]

'arg' @ [300:13] ==> val arg: Value defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.mapArguments.<anonymous>[LocalVariableDescriptor]

'obj' @ [300:17] ==> public fun Value.obj(expectedType: Type = ...): Any? defined in org.jetbrains.eval4j[DeserializedSimpleFunctionDescriptor]

'expectedType' @ [300:21] ==> val expectedType: Type defined in org.jetbrains.eval4j.test.REFLECTION_EVAL.mapArguments.<anonymous>[LocalVariableDescriptor]

'Suppress' @ [306:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'when (asmType.sort) {
            Type.BOOLEAN -> java.lang.Boolean.TYPE
            Type.BYTE -> java.lang.Byte.TYPE
            Type.SHORT -> java.lang.Short.TYPE
            Type.CHAR -> java.lang.Character.TYPE
            Type.INT -> java.lang.Integer.TYPE
            Type.LONG -> java.lang.Long.TYPE
            Type.FLOAT -> java.lang.Float.TYPE
            Type.DOUBLE -> java.lang.Double.TYPE
            Type.OBJECT -> classLoader.loadClass(asmType.internalName.replace('/', '.'))
            Type.ARRAY -> Class.forName(asmType.descriptor.replace('/', '.'))
            else -> throw UnsupportedOperationException("Unsupported type: $asmType")
        }' @ [308:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Class<*>?, entry1: Class<*>?, entry2: Class<*>?, entry3: Class<*>?, entry4: Class<*>?, entry5: Class<*>?, entry6: Class<*>?, entry7: Class<*>?, entry8: Class<*>?, entry9: Class<*>?, entry10: Class<*>?): Class<*>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Class<*>?

'asmType' @ [308:22] ==> value-parameter asmType: Type defined in org.jetbrains.eval4j.test.ReflectionLookup.findClass[ValueParameterDescriptorImpl]

'sort' @ [308:30] ==> public final val Type.sort: Int[MyPropertyDescriptor]

'BOOLEAN' @ [309:18] ==> public const final val BOOLEAN: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'TYPE' @ [309:47] ==> public final val TYPE: (Class<(Boolean..Boolean?)>..Class<(Boolean..Boolean?)>?) defined in java.lang.Boolean[JavaPropertyDescriptor]

'BYTE' @ [310:18] ==> public const final val BYTE: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'TYPE' @ [310:41] ==> public final val TYPE: (Class<(Byte..Byte?)>..Class<(Byte..Byte?)>?) defined in java.lang.Byte[JavaPropertyDescriptor]

'SHORT' @ [311:18] ==> public const final val SHORT: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'TYPE' @ [311:43] ==> public final val TYPE: (Class<(Short..Short?)>..Class<(Short..Short?)>?) defined in java.lang.Short[JavaPropertyDescriptor]

'CHAR' @ [312:18] ==> public const final val CHAR: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'TYPE' @ [312:46] ==> public final val TYPE: (Class<(Char..Char?)>..Class<(Char..Char?)>?) defined in java.lang.Character[JavaPropertyDescriptor]

'INT' @ [313:18] ==> public const final val INT: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'TYPE' @ [313:43] ==> public final val TYPE: (Class<(Int..Int?)>..Class<(Int..Int?)>?) defined in java.lang.Integer[JavaPropertyDescriptor]

'LONG' @ [314:18] ==> public const final val LONG: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'TYPE' @ [314:41] ==> public final val TYPE: (Class<(Long..Long?)>..Class<(Long..Long?)>?) defined in java.lang.Long[JavaPropertyDescriptor]

'FLOAT' @ [315:18] ==> public const final val FLOAT: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'TYPE' @ [315:43] ==> public final val TYPE: (Class<(Float..Float?)>..Class<(Float..Float?)>?) defined in java.lang.Float[JavaPropertyDescriptor]

'DOUBLE' @ [316:18] ==> public const final val DOUBLE: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'TYPE' @ [316:45] ==> public final val TYPE: (Class<(Double..Double?)>..Class<(Double..Double?)>?) defined in java.lang.Double[JavaPropertyDescriptor]

'OBJECT' @ [317:18] ==> public const final val OBJECT: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'classLoader' @ [317:28] ==> public final val classLoader: ClassLoader defined in org.jetbrains.eval4j.test.ReflectionLookup[PropertyDescriptorImpl]

'loadClass' @ [317:40] ==> public open fun loadClass(p0: (String..String?)): (Class<*>..Class<*>?) defined in java.lang.ClassLoader[JavaMethodDescriptor]

'asmType' @ [317:50] ==> value-parameter asmType: Type defined in org.jetbrains.eval4j.test.ReflectionLookup.findClass[ValueParameterDescriptorImpl]

'internalName' @ [317:58] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'replace' @ [317:71] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'ARRAY' @ [318:18] ==> public const final val ARRAY: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'forName' @ [318:33] ==> @CallerSensitive public open fun forName(p0: (String..String?)): (Class<*>..Class<*>?) defined in java.lang.Class[JavaMethodDescriptor]

'asmType' @ [318:41] ==> value-parameter asmType: Type defined in org.jetbrains.eval4j.test.ReflectionLookup.findClass[ValueParameterDescriptorImpl]

'descriptor' @ [318:49] ==> public final val Type.descriptor: (String..String?)[MyPropertyDescriptor]

'replace' @ [318:60] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'UnsupportedOperationException' @ [319:27] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'asmType' @ [319:77] ==> value-parameter asmType: Type defined in org.jetbrains.eval4j.test.ReflectionLookup.findClass[ValueParameterDescriptorImpl]

'Suppress' @ [324:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'declaredMethods' @ [326:22] ==> public final val <T : (Any..Any?)> Class<out Any>.declaredMethods: (Array<(Method..Method?)>..Array<out (Method..Method?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'methodDesc' @ [327:13] ==> value-parameter methodDesc: MethodDescription defined in org.jetbrains.eval4j.test.findMethod[ValueParameterDescriptorImpl]

'matches' @ [327:24] ==> public fun MethodDescription.matches(method: Method): Boolean defined in org.jetbrains.eval4j.test in file main.kt[SimpleFunctionDescriptorImpl]

'declared' @ [327:32] ==> val declared: (Method..Method?) defined in org.jetbrains.eval4j.test.findMethod[LocalVariableDescriptor]

'declared' @ [327:50] ==> val declared: (Method..Method?) defined in org.jetbrains.eval4j.test.findMethod[LocalVariableDescriptor]

'superclass' @ [330:27] ==> public final val <T : (Any..Any?)> Class<out Any>.superclass: (Class<in (Nothing..Nothing?)>..Class<in (Nothing..Nothing?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'findMethod' @ [330:53] ==> @Suppress public fun Class<out Any>.findMethod(methodDesc: MethodDescription): Method? defined in org.jetbrains.eval4j.test[SimpleFunctionDescriptorImpl]

'methodDesc' @ [330:64] ==> value-parameter methodDesc: MethodDescription defined in org.jetbrains.eval4j.test.findMethod[ValueParameterDescriptorImpl]

'fromSuperClass' @ [331:9] ==> val fromSuperClass: Method? defined in org.jetbrains.eval4j.test.findMethod[LocalVariableDescriptor]

'fromSuperClass' @ [331:40] ==> val fromSuperClass: Method? defined in org.jetbrains.eval4j.test.findMethod[LocalVariableDescriptor]

'interfaces' @ [333:23] ==> public final val <T : (Any..Any?)> Class<out Any>.interfaces: (Array<(Class<*>..Class<*>?)>..Array<out (Class<*>..Class<*>?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'supertype' @ [334:26] ==> val supertype: (Class<*>..Class<*>?) defined in org.jetbrains.eval4j.test.findMethod[LocalVariableDescriptor]

'findMethod' @ [334:51] ==> @Suppress public fun Class<out Any>.findMethod(methodDesc: MethodDescription): Method? defined in org.jetbrains.eval4j.test[SimpleFunctionDescriptorImpl]

'methodDesc' @ [334:62] ==> value-parameter methodDesc: MethodDescription defined in org.jetbrains.eval4j.test.findMethod[ValueParameterDescriptorImpl]

'fromSuper' @ [335:13] ==> val fromSuper: Method? defined in org.jetbrains.eval4j.test.findMethod[LocalVariableDescriptor]

'fromSuper' @ [335:39] ==> val fromSuper: Method? defined in org.jetbrains.eval4j.test.findMethod[LocalVariableDescriptor]

'Suppress' @ [341:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'declaredConstructors' @ [343:22] ==> public final val <T : (Any..Any?)> Class<Any>.declaredConstructors: (Array<(Constructor<*>..Constructor<*>?)>..Array<out (Constructor<*>..Constructor<*>?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'methodDesc' @ [344:13] ==> value-parameter methodDesc: MethodDescription defined in org.jetbrains.eval4j.test.findConstructor[ValueParameterDescriptorImpl]

'matches' @ [344:24] ==> public fun MethodDescription.matches(ctor: Constructor<*>): Boolean defined in org.jetbrains.eval4j.test in file main.kt[SimpleFunctionDescriptorImpl]

'declared' @ [344:32] ==> val declared: (Constructor<*>..Constructor<*>?) defined in org.jetbrains.eval4j.test.findConstructor[LocalVariableDescriptor]

'declared' @ [344:50] ==> val declared: (Constructor<*>..Constructor<*>?) defined in org.jetbrains.eval4j.test.findConstructor[LocalVariableDescriptor]

'ctor' @ [350:24] ==> value-parameter ctor: Constructor<*> defined in org.jetbrains.eval4j.test.matches[ValueParameterDescriptorImpl]

'parameterTypes' @ [350:29] ==> public final val <T : (Any..Any?)> Constructor<out (Any..Any?)>.parameterTypes: (Array<(Class<*>..Class<*>?)>..Array<out (Class<*>..Class<*>?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'parameterTypes' @ [351:9] ==> public val MethodDescription.parameterTypes: List<Type> defined in org.jetbrains.eval4j[DeserializedPropertyDescriptor]

'size' @ [351:24] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'methodParams' @ [351:32] ==> val methodParams: (Array<(Class<*>..Class<*>?)>..Array<out (Class<*>..Class<*>?)>) defined in org.jetbrains.eval4j.test.matches[LocalVariableDescriptor]

'size' @ [351:45] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'component1' @ [352:11] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [352:14] ==> public final operator fun component2(): Type defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'parameterTypes' @ [352:20] ==> public val MethodDescription.parameterTypes: List<Type> defined in org.jetbrains.eval4j[DeserializedPropertyDescriptor]

'withIndex' @ [352:35] ==> public fun <T> Iterable<Type>.withIndex(): Iterable<IndexedValue<Type>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type

'!' @ [353:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'p' @ [353:14] ==> val p: Type defined in org.jetbrains.eval4j.test.matches[LocalVariableDescriptor]

'matches' @ [353:16] ==> public fun Type.matches(_class: Class<*>): Boolean defined in org.jetbrains.eval4j.test in file main.kt[SimpleFunctionDescriptorImpl]

'methodParams' @ [353:24] ==> val methodParams: (Array<(Class<*>..Class<*>?)>..Array<out (Class<*>..Class<*>?)>) defined in org.jetbrains.eval4j.test.matches[LocalVariableDescriptor]

'i' @ [353:37] ==> val i: Int defined in org.jetbrains.eval4j.test.matches[LocalVariableDescriptor]

'name' @ [360:9] ==> public final val name: String defined in org.jetbrains.eval4j.MethodDescription[DeserializedPropertyDescriptor]

'method' @ [360:17] ==> value-parameter method: Method defined in org.jetbrains.eval4j.test.matches[ValueParameterDescriptorImpl]

'name' @ [360:24] ==> public final val Method.name: (String..String?)[MyPropertyDescriptor]

'method' @ [362:24] ==> value-parameter method: Method defined in org.jetbrains.eval4j.test.matches[ValueParameterDescriptorImpl]

'parameterTypes' @ [362:31] ==> public final val Method.parameterTypes: (Array<(Class<*>..Class<*>?)>..Array<out (Class<*>..Class<*>?)>?)[MyPropertyDescriptor]

'parameterTypes' @ [363:9] ==> public val MethodDescription.parameterTypes: List<Type> defined in org.jetbrains.eval4j[DeserializedPropertyDescriptor]

'size' @ [363:24] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'methodParams' @ [363:32] ==> val methodParams: (Array<(Class<*>..Class<*>?)>..Array<out (Class<*>..Class<*>?)>) defined in org.jetbrains.eval4j.test.matches[LocalVariableDescriptor]

'size' @ [363:45] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'component1' @ [364:11] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [364:14] ==> public final operator fun component2(): Type defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'parameterTypes' @ [364:20] ==> public val MethodDescription.parameterTypes: List<Type> defined in org.jetbrains.eval4j[DeserializedPropertyDescriptor]

'withIndex' @ [364:35] ==> public fun <T> Iterable<Type>.withIndex(): Iterable<IndexedValue<Type>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type

'!' @ [365:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'p' @ [365:14] ==> val p: Type defined in org.jetbrains.eval4j.test.matches[LocalVariableDescriptor]

'matches' @ [365:16] ==> public fun Type.matches(_class: Class<*>): Boolean defined in org.jetbrains.eval4j.test in file main.kt[SimpleFunctionDescriptorImpl]

'methodParams' @ [365:24] ==> val methodParams: (Array<(Class<*>..Class<*>?)>..Array<out (Class<*>..Class<*>?)>) defined in org.jetbrains.eval4j.test.matches[LocalVariableDescriptor]

'i' @ [365:37] ==> val i: Int defined in org.jetbrains.eval4j.test.matches[LocalVariableDescriptor]

'returnType' @ [368:12] ==> public val MethodDescription.returnType: Type defined in org.jetbrains.eval4j[DeserializedPropertyDescriptor]

'matches' @ [368:23] ==> public fun Type.matches(_class: Class<*>): Boolean defined in org.jetbrains.eval4j.test in file main.kt[SimpleFunctionDescriptorImpl]

'method' @ [368:31] ==> value-parameter method: Method defined in org.jetbrains.eval4j.test.matches[ValueParameterDescriptorImpl]

'returnType' @ [368:38] ==> public final val Method.returnType: (Class<*>..Class<*>?)[MyPropertyDescriptor]

'Suppress' @ [371:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'declaredFields' @ [373:22] ==> public final val <T : (Any..Any?)> Class<out Any>.declaredFields: (Array<(Field..Field?)>..Array<out (Field..Field?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'fieldDesc' @ [374:13] ==> value-parameter fieldDesc: FieldDescription defined in org.jetbrains.eval4j.test.findField[ValueParameterDescriptorImpl]

'matches' @ [374:23] ==> public fun FieldDescription.matches(field: Field): Boolean defined in org.jetbrains.eval4j.test in file main.kt[SimpleFunctionDescriptorImpl]

'declared' @ [374:31] ==> val declared: (Field..Field?) defined in org.jetbrains.eval4j.test.findField[LocalVariableDescriptor]

'declared' @ [374:49] ==> val declared: (Field..Field?) defined in org.jetbrains.eval4j.test.findField[LocalVariableDescriptor]

'superclass' @ [377:22] ==> public final val <T : (Any..Any?)> Class<out Any>.superclass: (Class<in (Nothing..Nothing?)>..Class<in (Nothing..Nothing?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'superclass' @ [378:9] ==> val superclass: (Class<in (Nothing..Nothing?)>..Class<in (Nothing..Nothing?)>?) defined in org.jetbrains.eval4j.test.findField[LocalVariableDescriptor]

'superclass' @ [379:31] ==> val superclass: (Class<in (Nothing..Nothing?)>..Class<in (Nothing..Nothing?)>?) defined in org.jetbrains.eval4j.test.findField[LocalVariableDescriptor]

'findField' @ [379:57] ==> @Suppress public fun Class<out Any>.findField(fieldDesc: FieldDescription): Field? defined in org.jetbrains.eval4j.test[SimpleFunctionDescriptorImpl]

'fieldDesc' @ [379:67] ==> value-parameter fieldDesc: FieldDescription defined in org.jetbrains.eval4j.test.findField[ValueParameterDescriptorImpl]

'fromSuperClass' @ [380:13] ==> val fromSuperClass: Field? defined in org.jetbrains.eval4j.test.findField[LocalVariableDescriptor]

'fromSuperClass' @ [380:44] ==> val fromSuperClass: Field? defined in org.jetbrains.eval4j.test.findField[LocalVariableDescriptor]

'interfaces' @ [383:23] ==> public final val <T : (Any..Any?)> Class<out Any>.interfaces: (Array<(Class<*>..Class<*>?)>..Array<out (Class<*>..Class<*>?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'supertype' @ [384:26] ==> val supertype: (Class<*>..Class<*>?) defined in org.jetbrains.eval4j.test.findField[LocalVariableDescriptor]

'findField' @ [384:51] ==> @Suppress public fun Class<out Any>.findField(fieldDesc: FieldDescription): Field? defined in org.jetbrains.eval4j.test[SimpleFunctionDescriptorImpl]

'fieldDesc' @ [384:61] ==> value-parameter fieldDesc: FieldDescription defined in org.jetbrains.eval4j.test.findField[ValueParameterDescriptorImpl]

'fromSuper' @ [385:13] ==> val fromSuper: Field? defined in org.jetbrains.eval4j.test.findField[LocalVariableDescriptor]

'fromSuper' @ [385:39] ==> val fromSuper: Field? defined in org.jetbrains.eval4j.test.findField[LocalVariableDescriptor]

'name' @ [392:9] ==> public final val name: String defined in org.jetbrains.eval4j.FieldDescription[DeserializedPropertyDescriptor]

'field' @ [392:17] ==> value-parameter field: Field defined in org.jetbrains.eval4j.test.matches[ValueParameterDescriptorImpl]

'name' @ [392:23] ==> public final val Field.name: (String..String?)[MyPropertyDescriptor]

'fieldType' @ [394:12] ==> public val FieldDescription.fieldType: Type defined in org.jetbrains.eval4j[DeserializedPropertyDescriptor]

'matches' @ [394:22] ==> public fun Type.matches(_class: Class<*>): Boolean defined in org.jetbrains.eval4j.test in file main.kt[SimpleFunctionDescriptorImpl]

'field' @ [394:30] ==> value-parameter field: Field defined in org.jetbrains.eval4j.test.matches[ValueParameterDescriptorImpl]

'type' @ [394:36] ==> public final val Field.type: (Class<*>..Class<*>?)[MyPropertyDescriptor]

'this' @ [397:47] ==> <this> defined in org.jetbrains.eval4j.test.matches[ReceiverParameterDescriptorImpl]

'getType' @ [397:60] ==> public open fun getType(p0: (Class<*>..Class<*>?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'_class' @ [397:68] ==> value-parameter _class: Class<*> defined in org.jetbrains.eval4j.test.matches[ValueParameterDescriptorImpl]

