'container' @ [38:66] ==> public final val container: StorageComponentContainer defined in org.jetbrains.kotlin.container.ComponentResolveContext[PropertyDescriptorImpl]

'resolve' @ [38:76] ==> public final fun resolve(request: Type, context: ValueResolveContext): ValueDescriptor? defined in org.jetbrains.kotlin.container.StorageComponentContainer[SimpleFunctionDescriptorImpl]

'registration' @ [38:84] ==> value-parameter registration: Type defined in org.jetbrains.kotlin.container.ComponentResolveContext.resolve[ValueParameterDescriptorImpl]

'this' @ [38:98] ==> <this> defined in org.jetbrains.kotlin.container.ComponentResolveContext[LazyClassReceiverParameterDescriptor]

'parentContext' @ [38:107] ==> public final val parentContext: ValueResolveContext? defined in org.jetbrains.kotlin.container.ComponentResolveContext[PropertyDescriptorImpl]

'resolve' @ [38:122] ==> public abstract fun resolve(registration: Type): ValueDescriptor? defined in org.jetbrains.kotlin.container.ValueResolveContext[SimpleFunctionDescriptorImpl]

'registration' @ [38:130] ==> value-parameter registration: Type defined in org.jetbrains.kotlin.container.ComponentResolveContext.resolve[ValueParameterDescriptorImpl]

'requestingDescriptor' @ [40:45] ==> public final val requestingDescriptor: ValueDescriptor defined in org.jetbrains.kotlin.container.ComponentResolveContext[PropertyDescriptorImpl]

'container' @ [40:70] ==> public final val container: StorageComponentContainer defined in org.jetbrains.kotlin.container.ComponentResolveContext[PropertyDescriptorImpl]

'computeArguments' @ [47:25] ==> public fun computeArguments(argumentDescriptors: List<ValueDescriptor>): List<Any> defined in org.jetbrains.kotlin.container[SimpleFunctionDescriptorImpl]

'argumentDescriptors' @ [47:42] ==> private final val argumentDescriptors: List<ValueDescriptor> defined in org.jetbrains.kotlin.container.MethodBinding[PropertyDescriptorImpl]

'toTypedArray' @ [47:63] ==> public inline fun <reified T> Collection<Any>.toTypedArray(): Array<Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> Any

'method' @ [48:9] ==> public final val method: Method defined in org.jetbrains.kotlin.container.MethodBinding[PropertyDescriptorImpl]

'invoke' @ [48:16] ==> @CallerSensitive public open operator fun invoke(p0: (Any..Any?), vararg p1: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Method[JavaMethodDescriptor]

'instance' @ [48:23] ==> value-parameter instance: Any defined in org.jetbrains.kotlin.container.MethodBinding.invoke[ValueParameterDescriptorImpl]

'arguments' @ [48:34] ==> val arguments: Array<Any> defined in org.jetbrains.kotlin.container.MethodBinding.invoke[LocalVariableDescriptor]

'argumentDescriptors' @ [52:79] ==> value-parameter argumentDescriptors: List<ValueDescriptor> defined in org.jetbrains.kotlin.container.computeArguments[ValueParameterDescriptorImpl]

'map' @ [52:99] ==> public inline fun <T, R> Iterable<ValueDescriptor>.map(transform: (ValueDescriptor) -> Any): List<Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueDescriptor
    <R> -> Any

'it' @ [52:105] ==> value-parameter it: ValueDescriptor defined in org.jetbrains.kotlin.container.computeArguments.<anonymous>[ValueParameterDescriptorImpl]

'getValue' @ [52:108] ==> public abstract fun getValue(): Any defined in org.jetbrains.kotlin.container.ValueDescriptor[SimpleFunctionDescriptorImpl]

'getInfo' @ [55:27] ==> public fun Class<*>.getInfo(): ClassInfo defined in org.jetbrains.kotlin.container in file Cache.kt[SimpleFunctionDescriptorImpl]

'constructorInfo' @ [55:37] ==> public final val constructorInfo: ConstructorInfo? defined in org.jetbrains.kotlin.container.ClassInfo[PropertyDescriptorImpl]

'error' @ [55:56] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'this' @ [55:83] ==> <this> defined in org.jetbrains.kotlin.container.bindToConstructor[ReceiverParameterDescriptorImpl]

'getInfo' @ [55:91] ==> public fun Class<*>.getInfo(): ClassInfo defined in org.jetbrains.kotlin.container in file Cache.kt[SimpleFunctionDescriptorImpl]

'constructorInfo' @ [56:21] ==> val constructorInfo: ConstructorInfo defined in org.jetbrains.kotlin.container.bindToConstructor[LocalVariableDescriptor]

'constructor' @ [56:37] ==> public final val constructor: Constructor<*> defined in org.jetbrains.kotlin.container.ConstructorInfo[PropertyDescriptorImpl]

'ConstructorBinding' @ [57:12] ==> public constructor ConstructorBinding(constructor: Constructor<*>, argumentDescriptors: List<ValueDescriptor>) defined in org.jetbrains.kotlin.container.ConstructorBinding[ClassConstructorDescriptorImpl]

'candidate' @ [57:31] ==> val candidate: Constructor<*> defined in org.jetbrains.kotlin.container.bindToConstructor[LocalVariableDescriptor]

'candidate' @ [57:42] ==> val candidate: Constructor<*> defined in org.jetbrains.kotlin.container.bindToConstructor[LocalVariableDescriptor]

'bindArguments' @ [57:52] ==> private fun Member.bindArguments(parameters: List<Type>, context: ValueResolveContext): List<ValueDescriptor> defined in org.jetbrains.kotlin.container[SimpleFunctionDescriptorImpl]

'constructorInfo' @ [57:66] ==> val constructorInfo: ConstructorInfo defined in org.jetbrains.kotlin.container.bindToConstructor[LocalVariableDescriptor]

'parameters' @ [57:82] ==> public final val parameters: List<Type> defined in org.jetbrains.kotlin.container.ConstructorInfo[PropertyDescriptorImpl]

'context' @ [57:94] ==> value-parameter context: ValueResolveContext defined in org.jetbrains.kotlin.container.bindToConstructor[ValueParameterDescriptorImpl]

'MethodBinding' @ [61:12] ==> public constructor MethodBinding(method: Method, argumentDescriptors: List<ValueDescriptor>) defined in org.jetbrains.kotlin.container.MethodBinding[ClassConstructorDescriptorImpl]

'this' @ [61:26] ==> <this> defined in org.jetbrains.kotlin.container.bindToMethod[ReceiverParameterDescriptorImpl]

'bindArguments' @ [61:32] ==> private fun Member.bindArguments(parameters: List<Type>, context: ValueResolveContext): List<ValueDescriptor> defined in org.jetbrains.kotlin.container[SimpleFunctionDescriptorImpl]

'genericParameterTypes' @ [61:46] ==> public final val Method.genericParameterTypes: (Array<(Type..Type?)>..Array<out (Type..Type?)>?)[MyPropertyDescriptor]

'toList' @ [61:68] ==> public fun <T> Array<out (Type..Type?)>.toList(): List<(Type..Type?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Type..java.lang.reflect.Type?)

'context' @ [61:78] ==> value-parameter context: ValueResolveContext defined in org.jetbrains.kotlin.container.bindToMethod[ValueParameterDescriptorImpl]

'ArrayList' @ [65:17] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ValueDescriptor

'parameters' @ [65:44] ==> value-parameter parameters: List<Type> defined in org.jetbrains.kotlin.container.bindArguments[ValueParameterDescriptorImpl]

'size' @ [65:55] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'parameters' @ [68:23] ==> value-parameter parameters: List<Type> defined in org.jetbrains.kotlin.container.bindArguments[ValueParameterDescriptorImpl]

'context' @ [69:26] ==> value-parameter context: ValueResolveContext defined in org.jetbrains.kotlin.container.bindArguments[ValueParameterDescriptorImpl]

'resolve' @ [69:34] ==> public abstract fun resolve(registration: Type): ValueDescriptor? defined in org.jetbrains.kotlin.container.ValueResolveContext[SimpleFunctionDescriptorImpl]

'parameter' @ [69:42] ==> val parameter: Type defined in org.jetbrains.kotlin.container.bindArguments[LocalVariableDescriptor]

'if (descriptor == null) {
            if (unsatisfied == null)
                unsatisfied = ArrayList<Type>()
            unsatisfied.add(parameter)
        }
        else {
            bound.add(descriptor)
        }' @ [70:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'descriptor' @ [70:13] ==> val descriptor: ValueDescriptor? defined in org.jetbrains.kotlin.container.bindArguments[LocalVariableDescriptor]

'unsatisfied' @ [71:17] ==> var unsatisfied: MutableList<Type>? defined in org.jetbrains.kotlin.container.bindArguments[LocalVariableDescriptor]

'unsatisfied' @ [72:17] ==> var unsatisfied: MutableList<Type>? defined in org.jetbrains.kotlin.container.bindArguments[LocalVariableDescriptor]

'ArrayList' @ [72:31] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Type

'unsatisfied' @ [73:13] ==> var unsatisfied: MutableList<Type>? defined in org.jetbrains.kotlin.container.bindArguments[LocalVariableDescriptor]

'add' @ [73:25] ==> public abstract fun add(element: Type): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'parameter' @ [73:29] ==> val parameter: Type defined in org.jetbrains.kotlin.container.bindArguments[LocalVariableDescriptor]

'bound' @ [76:13] ==> val bound: ArrayList<ValueDescriptor> defined in org.jetbrains.kotlin.container.bindArguments[LocalVariableDescriptor]

'add' @ [76:19] ==> public open fun add(element: ValueDescriptor): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'descriptor' @ [76:23] ==> val descriptor: ValueDescriptor? defined in org.jetbrains.kotlin.container.bindArguments[LocalVariableDescriptor]

'unsatisfied' @ [79:9] ==> var unsatisfied: MutableList<Type>? defined in org.jetbrains.kotlin.container.bindArguments[LocalVariableDescriptor]

'UnresolvedDependenciesException' @ [80:15] ==> public constructor UnresolvedDependenciesException(message: String) defined in org.jetbrains.kotlin.container.UnresolvedDependenciesException[ClassConstructorDescriptorImpl]

'this' @ [80:67] ==> <this> defined in org.jetbrains.kotlin.container.bindArguments[ReceiverParameterDescriptorImpl]

'unsatisfied' @ [80:98] ==> var unsatisfied: MutableList<Type>? defined in org.jetbrains.kotlin.container.bindArguments[LocalVariableDescriptor]

'bound' @ [82:12] ==> val bound: ArrayList<ValueDescriptor> defined in org.jetbrains.kotlin.container.bindArguments[LocalVariableDescriptor]

'Exception' @ [85:58] ==> public final fun <init>(p0: (String..String?)): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'message' @ [85:68] ==> value-parameter message: String defined in org.jetbrains.kotlin.container.UnresolvedDependenciesException.<init>[ValueParameterDescriptorImpl]

