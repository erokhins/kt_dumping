'getValue' @ [31:52] ==> @SuppressWarnings public final fun getValue(instance: (Any..Any?), metadata: (Any..Any?)): (ParameterDescriptor..ParameterDescriptor?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal[JavaMethodDescriptor]

'lazySoft' @ [31:70] ==> @NotNull public open fun <T : (Any..Any?)> lazySoft(@NotNull initializer: () -> (ParameterDescriptor..ParameterDescriptor?)): ReflectProperties.LazySoftVal<(ParameterDescriptor..ParameterDescriptor?)> defined in kotlin.reflect.jvm.internal.ReflectProperties[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ParameterDescriptor

'computeDescriptor' @ [31:79] ==> value-parameter computeDescriptor: () -> ParameterDescriptor defined in kotlin.reflect.jvm.internal.KParameterImpl.<init>[ValueParameterDescriptorImpl]

'getValue' @ [33:51] ==> @SuppressWarnings public final fun getValue(instance: (Any..Any?), metadata: (Any..Any?)): (List<Annotation>..List<Annotation>?) defined in kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal[JavaMethodDescriptor]

'lazySoft' @ [33:69] ==> @NotNull public open fun <T : (Any..Any?)> lazySoft(@NotNull initializer: () -> (List<Annotation>..List<Annotation>?)): ReflectProperties.LazySoftVal<(List<Annotation>..List<Annotation>?)> defined in kotlin.reflect.jvm.internal.ReflectProperties[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> List<Annotation>

'descriptor' @ [33:80] ==> private final val descriptor: ParameterDescriptor defined in kotlin.reflect.jvm.internal.KParameterImpl[PropertyDescriptorImpl]

'computeAnnotations' @ [33:91] ==> internal fun Annotated.computeAnnotations(): List<Annotation> defined in kotlin.reflect.jvm.internal[SimpleFunctionDescriptorImpl]

'descriptor' @ [36:30] ==> private final val descriptor: ParameterDescriptor defined in kotlin.reflect.jvm.internal.KParameterImpl[PropertyDescriptorImpl]

'valueParameter' @ [37:13] ==> val valueParameter: ValueParameterDescriptor defined in kotlin.reflect.jvm.internal.KParameterImpl.<get-name>[LocalVariableDescriptor]

'containingDeclaration' @ [37:28] ==> public final val ValueParameterDescriptor.containingDeclaration: CallableDescriptor[MyPropertyDescriptor]

'hasSynthesizedParameterNames' @ [37:50] ==> public abstract fun hasSynthesizedParameterNames(): Boolean defined in org.jetbrains.kotlin.descriptors.CallableDescriptor[JavaMethodDescriptor]

'valueParameter' @ [38:20] ==> val valueParameter: ValueParameterDescriptor defined in kotlin.reflect.jvm.internal.KParameterImpl.<get-name>[LocalVariableDescriptor]

'name' @ [38:35] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'if (name.isSpecial) null else name.asString()' @ [39:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'name' @ [39:20] ==> val name: Name defined in kotlin.reflect.jvm.internal.KParameterImpl.<get-name>[LocalVariableDescriptor]

'isSpecial' @ [39:25] ==> public final val Name.isSpecial: Boolean[MyPropertyDescriptor]

'name' @ [39:46] ==> val name: Name defined in kotlin.reflect.jvm.internal.KParameterImpl.<get-name>[LocalVariableDescriptor]

'asString' @ [39:51] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'KTypeImpl' @ [43:17] ==> public constructor KTypeImpl(type: KotlinType, computeJavaType: () -> Type) defined in kotlin.reflect.jvm.internal.KTypeImpl[ClassConstructorDescriptorImpl]

'descriptor' @ [43:27] ==> private final val descriptor: ParameterDescriptor defined in kotlin.reflect.jvm.internal.KParameterImpl[PropertyDescriptorImpl]

'type' @ [43:38] ==> public final val ParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'callable' @ [43:46] ==> public final val callable: KCallableImpl<*> defined in kotlin.reflect.jvm.internal.KParameterImpl[PropertyDescriptorImpl]

'caller' @ [43:55] ==> public abstract val caller: FunctionCaller<*> defined in kotlin.reflect.jvm.internal.KCallableImpl[PropertyDescriptorImpl]

'parameterTypes' @ [43:62] ==> public final val parameterTypes: List<Type> defined in kotlin.reflect.jvm.internal.FunctionCaller[PropertyDescriptorImpl]

'index' @ [43:77] ==> public open val index: Int defined in kotlin.reflect.jvm.internal.KParameterImpl[PropertyDescriptorImpl]

'?:' @ [46:17] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Boolean?, right: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Boolean

'descriptor' @ [46:18] ==> private final val descriptor: ParameterDescriptor defined in kotlin.reflect.jvm.internal.KParameterImpl[PropertyDescriptorImpl]

'hasDefaultValue' @ [46:60] ==> public fun ValueParameterDescriptor.hasDefaultValue(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil in file DescriptorUtils.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [49:17] ==> private final val descriptor: ParameterDescriptor defined in kotlin.reflect.jvm.internal.KParameterImpl[PropertyDescriptorImpl]

'let' @ [49:28] ==> @InlineOnly public inline fun <T, R> ParameterDescriptor.let(block: (ParameterDescriptor) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ParameterDescriptor
    <R> -> Boolean

'it' @ [49:34] ==> value-parameter it: ParameterDescriptor defined in kotlin.reflect.jvm.internal.KParameterImpl.<get-isVararg>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [49:68] ==> value-parameter it: ParameterDescriptor defined in kotlin.reflect.jvm.internal.KParameterImpl.<get-isVararg>.<anonymous>[ValueParameterDescriptorImpl]

'varargElementType' @ [49:71] ==> public abstract val varargElementType: KotlinType? defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[PropertyDescriptorImpl]

'other' @ [52:13] ==> value-parameter other: Any? defined in kotlin.reflect.jvm.internal.KParameterImpl.equals[ValueParameterDescriptorImpl]

'callable' @ [52:40] ==> public final val callable: KCallableImpl<*> defined in kotlin.reflect.jvm.internal.KParameterImpl[PropertyDescriptorImpl]

'other' @ [52:52] ==> value-parameter other: Any? defined in kotlin.reflect.jvm.internal.KParameterImpl.equals[ValueParameterDescriptorImpl]

'callable' @ [52:58] ==> public final val callable: KCallableImpl<*> defined in kotlin.reflect.jvm.internal.KParameterImpl[PropertyDescriptorImpl]

'descriptor' @ [52:70] ==> private final val descriptor: ParameterDescriptor defined in kotlin.reflect.jvm.internal.KParameterImpl[PropertyDescriptorImpl]

'other' @ [52:84] ==> value-parameter other: Any? defined in kotlin.reflect.jvm.internal.KParameterImpl.equals[ValueParameterDescriptorImpl]

'descriptor' @ [52:90] ==> private final val descriptor: ParameterDescriptor defined in kotlin.reflect.jvm.internal.KParameterImpl[PropertyDescriptorImpl]

'+' @ [55:13] ==> public final operator fun plus(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'callable' @ [55:14] ==> public final val callable: KCallableImpl<*> defined in kotlin.reflect.jvm.internal.KParameterImpl[PropertyDescriptorImpl]

'hashCode' @ [55:23] ==> public open fun hashCode(): Int defined in kotlin.reflect.jvm.internal.KCallableImpl[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [55:42] ==> private final val descriptor: ParameterDescriptor defined in kotlin.reflect.jvm.internal.KParameterImpl[PropertyDescriptorImpl]

'hashCode' @ [55:53] ==> public open fun hashCode(): Int defined in org.jetbrains.kotlin.descriptors.ParameterDescriptor[DeserializedSimpleFunctionDescriptor]

'ReflectionObjectRenderer' @ [58:13] ==> internal object ReflectionObjectRenderer defined in kotlin.reflect.jvm.internal in file ReflectionObjectRenderer.kt[FakeCallableDescriptorForObject]

'renderParameter' @ [58:38] ==> public final fun renderParameter(parameter: KParameterImpl): String defined in kotlin.reflect.jvm.internal.ReflectionObjectRenderer[SimpleFunctionDescriptorImpl]

'this' @ [58:54] ==> <this> defined in kotlin.reflect.jvm.internal.KParameterImpl[LazyClassReceiverParameterDescriptor]

