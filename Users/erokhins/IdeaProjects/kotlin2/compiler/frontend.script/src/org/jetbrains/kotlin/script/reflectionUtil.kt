'clazz' @ [27:16] ==> value-parameter clazz: Class<*> defined in org.jetbrains.kotlin.script.tryConstructClassFromStringArgs[ValueParameterDescriptorImpl]

'getConstructor' @ [27:22] ==> @CallerSensitive public open fun getConstructor(vararg p0: (Class<*>..Class<*>?)): (Constructor<out (Any..Any?)>..Constructor<out (Any..Any?)>?) defined in java.lang.Class[JavaMethodDescriptor]

'Array' @ [27:37] ==> public constructor Array<T>(size: Int, init: (Int) -> ???) defined in kotlin.Array[DeserializedClassConstructorDescriptor]
Inferred types:
    <T> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@11ad9d2c

'java' @ [27:58] ==> public val <T> KClass<Array<String>>.java: Class<Array<String>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Array<String>

'newInstance' @ [27:64] ==> @CallerSensitive public open fun newInstance(vararg p0: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Constructor[JavaMethodDescriptor]

'args' @ [27:76] ==> value-parameter args: List<String> defined in org.jetbrains.kotlin.script.tryConstructClassFromStringArgs[ValueParameterDescriptorImpl]

'toTypedArray' @ [27:81] ==> public inline fun <reified T> Collection<String>.toTypedArray(): Array<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'clazz' @ [30:22] ==> value-parameter clazz: Class<*> defined in org.jetbrains.kotlin.script.tryConstructClassFromStringArgs[ValueParameterDescriptorImpl]

'kotlin' @ [30:28] ==> public val <T : Any> Class<out (Any..Any?)>.kotlin: KClass<out (Any..Any?)> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Captured(*)

'constructors' @ [30:35] ==> public abstract val constructors: Collection<KFunction<(Any..Any?)>> defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'tryCreateCallableMappingFromStringArgs' @ [31:27] ==> public fun tryCreateCallableMappingFromStringArgs(callable: KCallable<*>, args: List<String>): Map<KParameter, Any?>? defined in org.jetbrains.kotlin.script in file reflectionUtil.kt[SimpleFunctionDescriptorImpl]

'ctor' @ [31:66] ==> val ctor: KFunction<(Any..Any?)> defined in org.jetbrains.kotlin.script.tryConstructClassFromStringArgs[LocalVariableDescriptor]

'args' @ [31:72] ==> value-parameter args: List<String> defined in org.jetbrains.kotlin.script.tryConstructClassFromStringArgs[ValueParameterDescriptorImpl]

'mapping' @ [32:17] ==> val mapping: Map<KParameter, Any?>? defined in org.jetbrains.kotlin.script.tryConstructClassFromStringArgs[LocalVariableDescriptor]

'ctor' @ [34:28] ==> val ctor: KFunction<(Any..Any?)> defined in org.jetbrains.kotlin.script.tryConstructClassFromStringArgs[LocalVariableDescriptor]

'callBy' @ [34:33] ==> public abstract fun callBy(args: Map<KParameter, Any?>): (Any..Any?) defined in kotlin.reflect.KFunction[DeserializedSimpleFunctionDescriptor]

'mapping' @ [34:40] ==> val mapping: Map<KParameter, Any?>? defined in org.jetbrains.kotlin.script.tryConstructClassFromStringArgs[LocalVariableDescriptor]

'tryCreateCallableMapping' @ [45:9] ==> private fun <T> tryCreateCallableMapping(callable: KCallable<*>, args: Iterator<NamedArgument<Any>>, converter: ArgsConverter<Any>): Map<KParameter, Any?>? defined in org.jetbrains.kotlin.script[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Any

'callable' @ [45:34] ==> value-parameter callable: KCallable<*> defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[ValueParameterDescriptorImpl]

'args' @ [45:44] ==> value-parameter args: List<Any?> defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[ValueParameterDescriptorImpl]

'map' @ [45:49] ==> public inline fun <T, R> Iterable<Any?>.map(transform: (Any?) -> NamedArgument<Any>): List<NamedArgument<Any>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any?
    <R> -> NamedArgument<Any>

'NamedArgument' @ [45:55] ==> public constructor NamedArgument<out T>(name: String?, value: Any?) defined in org.jetbrains.kotlin.script.NamedArgument[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> Any

'it' @ [45:75] ==> value-parameter it: Any? defined in org.jetbrains.kotlin.script.tryCreateCallableMapping.<anonymous>[ValueParameterDescriptorImpl]

'iterator' @ [45:81] ==> public abstract fun iterator(): Iterator<NamedArgument<Any>> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'AnyArgsConverter' @ [45:93] ==> public constructor AnyArgsConverter() defined in org.jetbrains.kotlin.script.AnyArgsConverter[ClassConstructorDescriptorImpl]

'tryCreateCallableMapping' @ [48:9] ==> private fun <T> tryCreateCallableMapping(callable: KCallable<*>, args: Iterator<NamedArgument<String>>, converter: ArgsConverter<String>): Map<KParameter, Any?>? defined in org.jetbrains.kotlin.script[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String

'callable' @ [48:34] ==> value-parameter callable: KCallable<*> defined in org.jetbrains.kotlin.script.tryCreateCallableMappingFromStringArgs[ValueParameterDescriptorImpl]

'args' @ [48:44] ==> value-parameter args: List<String> defined in org.jetbrains.kotlin.script.tryCreateCallableMappingFromStringArgs[ValueParameterDescriptorImpl]

'map' @ [48:49] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> NamedArgument<String>): List<NamedArgument<String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> NamedArgument<String>

'NamedArgument' @ [48:55] ==> public constructor NamedArgument<out T>(name: String?, value: String?) defined in org.jetbrains.kotlin.script.NamedArgument[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> String

'it' @ [48:75] ==> value-parameter it: String defined in org.jetbrains.kotlin.script.tryCreateCallableMappingFromStringArgs.<anonymous>[ValueParameterDescriptorImpl]

'iterator' @ [48:81] ==> public abstract fun iterator(): Iterator<NamedArgument<String>> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'StringArgsConverter' @ [48:93] ==> public constructor StringArgsConverter() defined in org.jetbrains.kotlin.script.StringArgsConverter[ClassConstructorDescriptorImpl]

'tryCreateCallableMapping' @ [51:9] ==> private fun <T> tryCreateCallableMapping(callable: KCallable<*>, args: Iterator<NamedArgument<Any>>, converter: ArgsConverter<Any>): Map<KParameter, Any?>? defined in org.jetbrains.kotlin.script[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Any

'callable' @ [51:34] ==> value-parameter callable: KCallable<*> defined in org.jetbrains.kotlin.script.tryCreateCallableMappingFromNamedArgs[ValueParameterDescriptorImpl]

'args' @ [51:44] ==> value-parameter args: List<Pair<String?, Any?>> defined in org.jetbrains.kotlin.script.tryCreateCallableMappingFromNamedArgs[ValueParameterDescriptorImpl]

'map' @ [51:49] ==> public inline fun <T, R> Iterable<Pair<String?, Any?>>.map(transform: (Pair<String?, Any?>) -> NamedArgument<Any>): List<NamedArgument<Any>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String?, Any?>
    <R> -> NamedArgument<Any>

'NamedArgument' @ [51:55] ==> public constructor NamedArgument<out T>(name: String?, value: Any?) defined in org.jetbrains.kotlin.script.NamedArgument[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> Any

'it' @ [51:69] ==> value-parameter it: Pair<String?, Any?> defined in org.jetbrains.kotlin.script.tryCreateCallableMappingFromNamedArgs.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [51:72] ==> public final val first: String? defined in kotlin.Pair[DeserializedPropertyDescriptor]

'it' @ [51:79] ==> value-parameter it: Pair<String?, Any?> defined in org.jetbrains.kotlin.script.tryCreateCallableMappingFromNamedArgs.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [51:82] ==> public final val second: Any? defined in kotlin.Pair[DeserializedPropertyDescriptor]

'iterator' @ [51:92] ==> public abstract fun iterator(): Iterator<NamedArgument<Any>> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'AnyArgsConverter' @ [51:104] ==> public constructor AnyArgsConverter() defined in org.jetbrains.kotlin.script.AnyArgsConverter[ClassConstructorDescriptorImpl]

'Result' @ [60:26] ==> private constructor Result() defined in org.jetbrains.kotlin.script.ArgsConverter.Result[ClassConstructorDescriptorImpl]

'Result' @ [61:38] ==> private constructor Result() defined in org.jetbrains.kotlin.script.ArgsConverter.Result[ClassConstructorDescriptorImpl]

'mutableMapOf' @ [71:15] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<KParameter, Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KParameter
    <V> -> Any?

'UNNAMED' @ [72:36] ==> enum entry UNNAMED defined in org.jetbrains.kotlin.script.ArgsTraversalState[FakeCallableDescriptorForObject]

'callable' @ [73:25] ==> value-parameter callable: KCallable<*> defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[ValueParameterDescriptorImpl]

'parameters' @ [73:34] ==> public abstract val parameters: List<KParameter> defined in kotlin.reflect.KCallable[DeserializedPropertyDescriptor]

'toMutableList' @ [73:45] ==> public fun <T> Collection<KParameter>.toMutableList(): MutableList<KParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KParameter

'args' @ [74:17] ==> value-parameter args: Iterator<NamedArgument<T>> defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[ValueParameterDescriptorImpl]

'iterator' @ [74:22] ==> @InlineOnly public operator inline fun <T> Iterator<NamedArgument<T>>.iterator(): Iterator<NamedArgument<T>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NamedArgument<T>

'argIt' @ [75:12] ==> val argIt: Iterator<NamedArgument<T>> defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'hasNext' @ [75:18] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'unboundParams' @ [76:13] ==> val unboundParams: MutableList<KParameter> defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'isEmpty' @ [76:27] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'argIt' @ [77:19] ==> val argIt: Iterator<NamedArgument<T>> defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'next' @ [77:25] ==> public abstract operator fun next(): NamedArgument<T> defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'when (state) {
            ArgsTraversalState.UNNAMED -> if (arg.name != null) state = ArgsTraversalState.NAMED
            ArgsTraversalState.NAMED -> if (arg.name == null) state = ArgsTraversalState.TAIL
            ArgsTraversalState.TAIL -> if (arg.name != null) throw IllegalArgumentException("Illegal mix of named and unnamed arguments")
        }' @ [78:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'state' @ [78:15] ==> var state: ArgsTraversalState defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'UNNAMED' @ [79:32] ==> enum entry UNNAMED defined in org.jetbrains.kotlin.script.ArgsTraversalState[FakeCallableDescriptorForObject]

'arg' @ [79:47] ==> val arg: NamedArgument<T> defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'name' @ [79:51] ==> public final val name: String? defined in org.jetbrains.kotlin.script.NamedArgument[PropertyDescriptorImpl]

'state' @ [79:65] ==> var state: ArgsTraversalState defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'NAMED' @ [79:92] ==> enum entry NAMED defined in org.jetbrains.kotlin.script.ArgsTraversalState[FakeCallableDescriptorForObject]

'NAMED' @ [80:32] ==> enum entry NAMED defined in org.jetbrains.kotlin.script.ArgsTraversalState[FakeCallableDescriptorForObject]

'arg' @ [80:45] ==> val arg: NamedArgument<T> defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'name' @ [80:49] ==> public final val name: String? defined in org.jetbrains.kotlin.script.NamedArgument[PropertyDescriptorImpl]

'state' @ [80:63] ==> var state: ArgsTraversalState defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'TAIL' @ [80:90] ==> enum entry TAIL defined in org.jetbrains.kotlin.script.ArgsTraversalState[FakeCallableDescriptorForObject]

'TAIL' @ [81:32] ==> enum entry TAIL defined in org.jetbrains.kotlin.script.ArgsTraversalState[FakeCallableDescriptorForObject]

'arg' @ [81:44] ==> val arg: NamedArgument<T> defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'name' @ [81:48] ==> public final val name: String? defined in org.jetbrains.kotlin.script.NamedArgument[PropertyDescriptorImpl]

'IllegalArgumentException' @ [81:68] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'when (state) {
            ArgsTraversalState.UNNAMED -> {
                val par = unboundParams.removeAt(0)
                // try single argument first
                val cvtRes = converter.tryConvertSingle(par, arg)
                if (cvtRes is ArgsConverter.Result.Success) {
                    if (cvtRes.v == null && !par.type.allowsNulls()) {
                        // if we do not allow to overload on nullability, drop this check
                        return null // failed to match: null for a non-nullable value
                    }
                    res.put(par, cvtRes.v)
                }
                else if (par.type.jvmErasure.java.isArray) {
                    // try vararg
                    val cvtVRes = converter.tryConvertVararg(par, arg, argIt)
                    if (cvtVRes is ArgsConverter.Result.Success) {
                        res.put(par, cvtVRes.v)
                    }
                    else return null // failed to match: no suitable param for unnamed arg
                }
                else return null // failed to match: no suitable param for unnamed arg
            }
            ArgsTraversalState.NAMED -> {
                assert(arg.name != null)
                val parIdx = unboundParams.indexOfFirst { it.name == arg.name }.takeIf { it >= 0 }
                             ?: return null // failed to match: no matching named parameter found
                val par = unboundParams.removeAt(parIdx)
                val cvtRes = converter.tryConvertSingle(par, arg)
                if (cvtRes is ArgsConverter.Result.Success) {
                    res.put(par, cvtRes.v)
                }
                else return null // failed to match: cannot convert arg to param's type
            }
            ArgsTraversalState.TAIL -> {
                assert(arg.name == null)
                val par = unboundParams.removeAt(unboundParams.lastIndex)
                val cvtVRes = converter.tryConvertTail(par, arg, argIt)
                if (cvtVRes is ArgsConverter.Result.Success) {
                    if (argIt.hasNext()) return null // failed to match: not all tail args are consumed
                    res.put(par, cvtVRes.v)
                }
                else return null // failed to match: no suitable param for tail arg(s)
            }
        }' @ [84:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any?, entry1: Any?, entry2: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any?

'state' @ [84:15] ==> var state: ArgsTraversalState defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'UNNAMED' @ [85:32] ==> enum entry UNNAMED defined in org.jetbrains.kotlin.script.ArgsTraversalState[FakeCallableDescriptorForObject]

'unboundParams' @ [86:27] ==> val unboundParams: MutableList<KParameter> defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'removeAt' @ [86:41] ==> public abstract fun removeAt(index: Int): KParameter defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'converter' @ [88:30] ==> value-parameter converter: ArgsConverter<T> defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[ValueParameterDescriptorImpl]

'tryConvertSingle' @ [88:40] ==> public abstract fun tryConvertSingle(parameter: KParameter, arg: NamedArgument<T>): ArgsConverter.Result defined in org.jetbrains.kotlin.script.ArgsConverter[SimpleFunctionDescriptorImpl]

'par' @ [88:57] ==> val par: KParameter defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'arg' @ [88:62] ==> val arg: NamedArgument<T> defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'if (cvtRes is ArgsConverter.Result.Success) {
                    if (cvtRes.v == null && !par.type.allowsNulls()) {
                        // if we do not allow to overload on nullability, drop this check
                        return null // failed to match: null for a non-nullable value
                    }
                    res.put(par, cvtRes.v)
                }
                else if (par.type.jvmErasure.java.isArray) {
                    // try vararg
                    val cvtVRes = converter.tryConvertVararg(par, arg, argIt)
                    if (cvtVRes is ArgsConverter.Result.Success) {
                        res.put(par, cvtVRes.v)
                    }
                    else return null // failed to match: no suitable param for unnamed arg
                }
                else return null' @ [89:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any?, elseBranch: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any?

'cvtRes' @ [89:21] ==> val cvtRes: ArgsConverter.Result defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'cvtRes' @ [90:25] ==> val cvtRes: ArgsConverter.Result defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'v' @ [90:32] ==> public final val v: Any? defined in org.jetbrains.kotlin.script.ArgsConverter.Result.Success[PropertyDescriptorImpl]

'!' @ [90:45] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'par' @ [90:46] ==> val par: KParameter defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'type' @ [90:50] ==> public abstract val type: KType defined in kotlin.reflect.KParameter[DeserializedPropertyDescriptor]

'allowsNulls' @ [90:55] ==> private fun KType.allowsNulls(): Boolean defined in org.jetbrains.kotlin.script in file reflectionUtil.kt[SimpleFunctionDescriptorImpl]

'res' @ [94:21] ==> val res: MutableMap<KParameter, Any?> defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'put' @ [94:25] ==> public abstract fun put(key: KParameter, value: Any?): Any? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'par' @ [94:29] ==> val par: KParameter defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'cvtRes' @ [94:34] ==> val cvtRes: ArgsConverter.Result defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'v' @ [94:41] ==> public final val v: Any? defined in org.jetbrains.kotlin.script.ArgsConverter.Result.Success[PropertyDescriptorImpl]

'if (par.type.jvmErasure.java.isArray) {
                    // try vararg
                    val cvtVRes = converter.tryConvertVararg(par, arg, argIt)
                    if (cvtVRes is ArgsConverter.Result.Success) {
                        res.put(par, cvtVRes.v)
                    }
                    else return null // failed to match: no suitable param for unnamed arg
                }
                else return null' @ [96:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any?, elseBranch: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any?

'par' @ [96:26] ==> val par: KParameter defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'type' @ [96:30] ==> public abstract val type: KType defined in kotlin.reflect.KParameter[DeserializedPropertyDescriptor]

'jvmErasure' @ [96:35] ==> @SinceKotlin public val KType.jvmErasure: KClass<*> defined in kotlin.reflect.jvm[DeserializedPropertyDescriptor]

'java' @ [96:46] ==> public val <T> KClass<out Any>.java: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(*)

'isArray' @ [96:51] ==> public final val <T : (Any..Any?)> Class<out Any>.isArray: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out Any)

'converter' @ [98:35] ==> value-parameter converter: ArgsConverter<T> defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[ValueParameterDescriptorImpl]

'tryConvertVararg' @ [98:45] ==> public abstract fun tryConvertVararg(parameter: KParameter, firstArg: NamedArgument<T>, restArgsIt: Iterator<NamedArgument<T>>): ArgsConverter.Result defined in org.jetbrains.kotlin.script.ArgsConverter[SimpleFunctionDescriptorImpl]

'par' @ [98:62] ==> val par: KParameter defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'arg' @ [98:67] ==> val arg: NamedArgument<T> defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'argIt' @ [98:72] ==> val argIt: Iterator<NamedArgument<T>> defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'if (cvtVRes is ArgsConverter.Result.Success) {
                        res.put(par, cvtVRes.v)
                    }
                    else return null' @ [99:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any?, elseBranch: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any?

'cvtVRes' @ [99:25] ==> val cvtVRes: ArgsConverter.Result defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'res' @ [100:25] ==> val res: MutableMap<KParameter, Any?> defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'put' @ [100:29] ==> public abstract fun put(key: KParameter, value: Any?): Any? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'par' @ [100:33] ==> val par: KParameter defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'cvtVRes' @ [100:38] ==> val cvtVRes: ArgsConverter.Result defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'v' @ [100:46] ==> public final val v: Any? defined in org.jetbrains.kotlin.script.ArgsConverter.Result.Success[PropertyDescriptorImpl]

'NAMED' @ [106:32] ==> enum entry NAMED defined in org.jetbrains.kotlin.script.ArgsTraversalState[FakeCallableDescriptorForObject]

'assert' @ [107:17] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'arg' @ [107:24] ==> val arg: NamedArgument<T> defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'name' @ [107:28] ==> public final val name: String? defined in org.jetbrains.kotlin.script.NamedArgument[PropertyDescriptorImpl]

'unboundParams' @ [108:30] ==> val unboundParams: MutableList<KParameter> defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'indexOfFirst' @ [108:44] ==> public inline fun <T> List<KParameter>.indexOfFirst(predicate: (KParameter) -> Boolean): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KParameter

'it' @ [108:59] ==> value-parameter it: KParameter defined in org.jetbrains.kotlin.script.tryCreateCallableMapping.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [108:62] ==> public abstract val name: String? defined in kotlin.reflect.KParameter[DeserializedPropertyDescriptor]

'arg' @ [108:70] ==> val arg: NamedArgument<T> defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'name' @ [108:74] ==> public final val name: String? defined in org.jetbrains.kotlin.script.NamedArgument[PropertyDescriptorImpl]

'takeIf' @ [108:81] ==> @InlineOnly @SinceKotlin public inline fun <T> Int.takeIf(predicate: (Int) -> Boolean): Int? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'it' @ [108:90] ==> value-parameter it: Int defined in org.jetbrains.kotlin.script.tryCreateCallableMapping.<anonymous>[ValueParameterDescriptorImpl]

'unboundParams' @ [110:27] ==> val unboundParams: MutableList<KParameter> defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'removeAt' @ [110:41] ==> public abstract fun removeAt(index: Int): KParameter defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'parIdx' @ [110:50] ==> val parIdx: Int defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'converter' @ [111:30] ==> value-parameter converter: ArgsConverter<T> defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[ValueParameterDescriptorImpl]

'tryConvertSingle' @ [111:40] ==> public abstract fun tryConvertSingle(parameter: KParameter, arg: NamedArgument<T>): ArgsConverter.Result defined in org.jetbrains.kotlin.script.ArgsConverter[SimpleFunctionDescriptorImpl]

'par' @ [111:57] ==> val par: KParameter defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'arg' @ [111:62] ==> val arg: NamedArgument<T> defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'if (cvtRes is ArgsConverter.Result.Success) {
                    res.put(par, cvtRes.v)
                }
                else return null' @ [112:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any?, elseBranch: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any?

'cvtRes' @ [112:21] ==> val cvtRes: ArgsConverter.Result defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'res' @ [113:21] ==> val res: MutableMap<KParameter, Any?> defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'put' @ [113:25] ==> public abstract fun put(key: KParameter, value: Any?): Any? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'par' @ [113:29] ==> val par: KParameter defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'cvtRes' @ [113:34] ==> val cvtRes: ArgsConverter.Result defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'v' @ [113:41] ==> public final val v: Any? defined in org.jetbrains.kotlin.script.ArgsConverter.Result.Success[PropertyDescriptorImpl]

'TAIL' @ [117:32] ==> enum entry TAIL defined in org.jetbrains.kotlin.script.ArgsTraversalState[FakeCallableDescriptorForObject]

'assert' @ [118:17] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'arg' @ [118:24] ==> val arg: NamedArgument<T> defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'name' @ [118:28] ==> public final val name: String? defined in org.jetbrains.kotlin.script.NamedArgument[PropertyDescriptorImpl]

'unboundParams' @ [119:27] ==> val unboundParams: MutableList<KParameter> defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'removeAt' @ [119:41] ==> public abstract fun removeAt(index: Int): KParameter defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'unboundParams' @ [119:50] ==> val unboundParams: MutableList<KParameter> defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'lastIndex' @ [119:64] ==> public val <T> List<KParameter>.lastIndex: Int defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KParameter

'converter' @ [120:31] ==> value-parameter converter: ArgsConverter<T> defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[ValueParameterDescriptorImpl]

'tryConvertTail' @ [120:41] ==> public abstract fun tryConvertTail(parameter: KParameter, firstArg: NamedArgument<T>, restArgsIt: Iterator<NamedArgument<T>>): ArgsConverter.Result defined in org.jetbrains.kotlin.script.ArgsConverter[SimpleFunctionDescriptorImpl]

'par' @ [120:56] ==> val par: KParameter defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'arg' @ [120:61] ==> val arg: NamedArgument<T> defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'argIt' @ [120:66] ==> val argIt: Iterator<NamedArgument<T>> defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'if (cvtVRes is ArgsConverter.Result.Success) {
                    if (argIt.hasNext()) return null // failed to match: not all tail args are consumed
                    res.put(par, cvtVRes.v)
                }
                else return null' @ [121:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any?, elseBranch: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any?

'cvtVRes' @ [121:21] ==> val cvtVRes: ArgsConverter.Result defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'argIt' @ [122:25] ==> val argIt: Iterator<NamedArgument<T>> defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'hasNext' @ [122:31] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'res' @ [123:21] ==> val res: MutableMap<KParameter, Any?> defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'put' @ [123:25] ==> public abstract fun put(key: KParameter, value: Any?): Any? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'par' @ [123:29] ==> val par: KParameter defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'cvtVRes' @ [123:34] ==> val cvtVRes: ArgsConverter.Result defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'v' @ [123:42] ==> public final val v: Any? defined in org.jetbrains.kotlin.script.ArgsConverter.Result.Success[PropertyDescriptorImpl]

'when {
        unboundParams.any { !it.isOptional && !it.isVararg } -> null // fail to match: non-optional params remained
        else -> res
    }' @ [129:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Map<KParameter, Any?>?, entry1: Map<KParameter, Any?>?): Map<KParameter, Any?>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Map<KParameter, Any?>?

'unboundParams' @ [130:9] ==> val unboundParams: MutableList<KParameter> defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'any' @ [130:23] ==> public inline fun <T> Iterable<KParameter>.any(predicate: (KParameter) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KParameter

'!' @ [130:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [130:30] ==> value-parameter it: KParameter defined in org.jetbrains.kotlin.script.tryCreateCallableMapping.<anonymous>[ValueParameterDescriptorImpl]

'isOptional' @ [130:33] ==> public abstract val isOptional: Boolean defined in kotlin.reflect.KParameter[DeserializedPropertyDescriptor]

'!' @ [130:47] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [130:48] ==> value-parameter it: KParameter defined in org.jetbrains.kotlin.script.tryCreateCallableMapping.<anonymous>[ValueParameterDescriptorImpl]

'isVararg' @ [130:51] ==> @SinceKotlin public abstract val isVararg: Boolean defined in kotlin.reflect.KParameter[DeserializedPropertyDescriptor]

'res' @ [131:17] ==> val res: MutableMap<KParameter, Any?> defined in org.jetbrains.kotlin.script.tryCreateCallableMapping[LocalVariableDescriptor]

'isMarkedNullable' @ [136:9] ==> public abstract val isMarkedNullable: Boolean defined in kotlin.reflect.KType[DeserializedPropertyDescriptor]

'classifier' @ [137:9] ==> @SinceKotlin public abstract val classifier: KClassifier? defined in kotlin.reflect.KType[DeserializedPropertyDescriptor]

'let' @ [137:20] ==> @InlineOnly public inline fun <T, R> KClassifier?.let(block: (KClassifier?) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KClassifier?
    <R> -> Boolean

'it' @ [137:26] ==> value-parameter it: KClassifier? defined in org.jetbrains.kotlin.script.allowsNulls.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [137:50] ==> value-parameter it: KClassifier? defined in org.jetbrains.kotlin.script.allowsNulls.<anonymous>[ValueParameterDescriptorImpl]

'upperBounds' @ [137:53] ==> public abstract val upperBounds: List<KType> defined in kotlin.reflect.KTypeParameter[DeserializedPropertyDescriptor]

'any' @ [137:65] ==> public inline fun <T> Iterable<KType>.any(predicate: (KType) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KType

'allowsNulls' @ [137:76] ==> private fun KType.allowsNulls(): Boolean defined in org.jetbrains.kotlin.script in file reflectionUtil.kt[SimpleFunctionDescriptorImpl]

'arg' @ [143:21] ==> value-parameter arg: NamedArgument<String> defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertSingle[ValueParameterDescriptorImpl]

'value' @ [143:25] ==> public final val value: String? defined in org.jetbrains.kotlin.script.NamedArgument[PropertyDescriptorImpl]

'Success' @ [143:62] ==> public constructor Success(v: Any?) defined in org.jetbrains.kotlin.script.ArgsConverter.Result.Success[ClassConstructorDescriptorImpl]

'when (parameter.type.classifier) {
            String::class -> value
            Int::class -> value.toIntOrNull()
            Long::class -> value.toLongOrNull()
            Short::class -> value.toShortOrNull()
            Byte::class -> value.toByteOrNull()
            Char::class -> value.singleOrNull()
            Float::class -> value.toFloatOrNull()
            Double::class -> value.toDoubleOrNull()
            Boolean::class -> value.toBoolean()
            else -> null
        }' @ [145:31] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any?, entry1: Any?, entry2: Any?, entry3: Any?, entry4: Any?, entry5: Any?, entry6: Any?, entry7: Any?, entry8: Any?, entry9: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any?

'parameter' @ [145:37] ==> value-parameter parameter: KParameter defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertSingle[ValueParameterDescriptorImpl]

'type' @ [145:47] ==> public abstract val type: KType defined in kotlin.reflect.KParameter[DeserializedPropertyDescriptor]

'classifier' @ [145:52] ==> @SinceKotlin public abstract val classifier: KClassifier? defined in kotlin.reflect.KType[DeserializedPropertyDescriptor]

'String' @ [146:13] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'value' @ [146:30] ==> val value: String defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertSingle[LocalVariableDescriptor]

'Int' @ [147:13] ==> public companion object defined in kotlin.Int[FakeCallableDescriptorForObject]

'value' @ [147:27] ==> val value: String defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertSingle[LocalVariableDescriptor]

'toIntOrNull' @ [147:33] ==> @SinceKotlin public fun String.toIntOrNull(): Int? defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Long' @ [148:13] ==> public companion object defined in kotlin.Long[FakeCallableDescriptorForObject]

'value' @ [148:28] ==> val value: String defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertSingle[LocalVariableDescriptor]

'toLongOrNull' @ [148:34] ==> @SinceKotlin public fun String.toLongOrNull(): Long? defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Short' @ [149:13] ==> public companion object defined in kotlin.Short[FakeCallableDescriptorForObject]

'value' @ [149:29] ==> val value: String defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertSingle[LocalVariableDescriptor]

'toShortOrNull' @ [149:35] ==> @SinceKotlin public fun String.toShortOrNull(): Short? defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Byte' @ [150:13] ==> public companion object defined in kotlin.Byte[FakeCallableDescriptorForObject]

'value' @ [150:28] ==> val value: String defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertSingle[LocalVariableDescriptor]

'toByteOrNull' @ [150:34] ==> @SinceKotlin public fun String.toByteOrNull(): Byte? defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Char' @ [151:13] ==> public companion object defined in kotlin.Char[FakeCallableDescriptorForObject]

'value' @ [151:28] ==> val value: String defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertSingle[LocalVariableDescriptor]

'singleOrNull' @ [151:34] ==> public fun CharSequence.singleOrNull(): Char? defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Float' @ [152:13] ==> public companion object defined in kotlin.Float[FakeCallableDescriptorForObject]

'value' @ [152:29] ==> val value: String defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertSingle[LocalVariableDescriptor]

'toFloatOrNull' @ [152:35] ==> @SinceKotlin public fun String.toFloatOrNull(): Float? defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Double' @ [153:13] ==> public companion object defined in kotlin.Double[FakeCallableDescriptorForObject]

'value' @ [153:30] ==> val value: String defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertSingle[LocalVariableDescriptor]

'toDoubleOrNull' @ [153:36] ==> @SinceKotlin public fun String.toDoubleOrNull(): Double? defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Boolean' @ [154:13] ==> private constructor Boolean() defined in kotlin.Boolean[DeserializedClassConstructorDescriptor]

'value' @ [154:31] ==> val value: String defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertSingle[LocalVariableDescriptor]

'toBoolean' @ [154:37] ==> @InlineOnly public inline fun String.toBoolean(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'if (primitive != null) ArgsConverter.Result.Success(primitive) else ArgsConverter.Result.Failure' @ [158:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ArgsConverter.Result, elseBranch: ArgsConverter.Result): ArgsConverter.Result[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Result

'primitive' @ [158:20] ==> val primitive: Any? defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertSingle[LocalVariableDescriptor]

'Success' @ [158:60] ==> public constructor Success(v: Any?) defined in org.jetbrains.kotlin.script.ArgsConverter.Result.Success[ClassConstructorDescriptorImpl]

'primitive' @ [158:68] ==> val primitive: Any? defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertSingle[LocalVariableDescriptor]

'Failure' @ [158:105] ==> public object Failure : ArgsConverter.Result defined in org.jetbrains.kotlin.script.ArgsConverter.Result[FakeCallableDescriptorForObject]

'when (classifier) {
                    String::class -> args.toList().toTypedArray()
                    is KClass<*> -> classifier.constructors.firstNotNullResult { ctor ->
                        try {
                            args.map { ctor.call(it) }.toList().toTypedArray()
                        }
                        catch (e: Exception) { null }
                    }
                    else -> null
                }' @ [164:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Array<out Any?>?, entry1: Array<out Any?>?, entry2: Array<out Any?>?): Array<out Any?>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Array<out Any?>?

'classifier' @ [164:23] ==> value-parameter classifier: KClassifier? defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertVararg.convertAnyArray[ValueParameterDescriptorImpl]

'String' @ [165:21] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'args' @ [165:38] ==> value-parameter args: Sequence<String?> defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertVararg.convertAnyArray[ValueParameterDescriptorImpl]

'toList' @ [165:43] ==> public fun <T> Sequence<String?>.toList(): List<String?> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?

'toTypedArray' @ [165:52] ==> public inline fun <reified T> Collection<String?>.toTypedArray(): Array<String?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String?

'classifier' @ [166:37] ==> value-parameter classifier: KClassifier? defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertVararg.convertAnyArray[ValueParameterDescriptorImpl]

'constructors' @ [166:48] ==> public abstract val constructors: Collection<KFunction<Any>> defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'firstNotNullResult' @ [166:61] ==> public inline fun <T, R : Any> Iterable<KFunction<Any>>.firstNotNullResult(transform: (KFunction<Any>) -> Array<Any>?): Array<Any>? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KFunction<Any>
    <R : Any> -> Array<Any>

'args' @ [168:29] ==> value-parameter args: Sequence<String?> defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertVararg.convertAnyArray[ValueParameterDescriptorImpl]

'map' @ [168:34] ==> public fun <T, R> Sequence<String?>.map(transform: (String?) -> Any): Sequence<Any> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?
    <R> -> Any

'ctor' @ [168:40] ==> value-parameter ctor: KFunction<Any> defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertVararg.convertAnyArray.<anonymous>[ValueParameterDescriptorImpl]

'call' @ [168:45] ==> public abstract fun call(vararg args: Any?): Any defined in kotlin.reflect.KFunction[DeserializedSimpleFunctionDescriptor]

'it' @ [168:50] ==> value-parameter it: String? defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertVararg.convertAnyArray.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toList' @ [168:56] ==> public fun <T> Sequence<Any>.toList(): List<Any> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any

'toTypedArray' @ [168:65] ==> public inline fun <reified T> Collection<Any>.toTypedArray(): Array<Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> Any

'when (type.classifier) {
                    IntArray::class -> args.map { it?.toIntOrNull() }
                    LongArray::class -> args.map { it?.toLongOrNull() }
                    ShortArray::class -> args.map { it?.toShortOrNull() }
                    ByteArray::class -> args.map { it?.toByteOrNull() }
                    CharArray::class -> args.map { it?.singleOrNull() }
                    FloatArray::class -> args.map { it?.toFloatOrNull() }
                    DoubleArray::class -> args.map { it?.toDoubleOrNull() }
                    BooleanArray::class -> args.map { it?.toBoolean() }
                    else -> null
                }' @ [176:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Sequence<Any?>?, entry1: Sequence<Any?>?, entry2: Sequence<Any?>?, entry3: Sequence<Any?>?, entry4: Sequence<Any?>?, entry5: Sequence<Any?>?, entry6: Sequence<Any?>?, entry7: Sequence<Any?>?, entry8: Sequence<Any?>?): Sequence<Any?>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Sequence<Any?>?

'type' @ [176:23] ==> value-parameter type: KType defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertVararg.convertPrimitivesArray[ValueParameterDescriptorImpl]

'classifier' @ [176:28] ==> @SinceKotlin public abstract val classifier: KClassifier? defined in kotlin.reflect.KType[DeserializedPropertyDescriptor]

'args' @ [177:40] ==> value-parameter args: Sequence<String?> defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertVararg.convertPrimitivesArray[ValueParameterDescriptorImpl]

'map' @ [177:45] ==> public fun <T, R> Sequence<String?>.map(transform: (String?) -> Int?): Sequence<Int?> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?
    <R> -> Int?

'it' @ [177:51] ==> value-parameter it: String? defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertVararg.convertPrimitivesArray.<anonymous>[ValueParameterDescriptorImpl]

'toIntOrNull' @ [177:55] ==> @SinceKotlin public fun String.toIntOrNull(): Int? defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'args' @ [178:41] ==> value-parameter args: Sequence<String?> defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertVararg.convertPrimitivesArray[ValueParameterDescriptorImpl]

'map' @ [178:46] ==> public fun <T, R> Sequence<String?>.map(transform: (String?) -> Long?): Sequence<Long?> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?
    <R> -> Long?

'it' @ [178:52] ==> value-parameter it: String? defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertVararg.convertPrimitivesArray.<anonymous>[ValueParameterDescriptorImpl]

'toLongOrNull' @ [178:56] ==> @SinceKotlin public fun String.toLongOrNull(): Long? defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'args' @ [179:42] ==> value-parameter args: Sequence<String?> defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertVararg.convertPrimitivesArray[ValueParameterDescriptorImpl]

'map' @ [179:47] ==> public fun <T, R> Sequence<String?>.map(transform: (String?) -> Short?): Sequence<Short?> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?
    <R> -> Short?

'it' @ [179:53] ==> value-parameter it: String? defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertVararg.convertPrimitivesArray.<anonymous>[ValueParameterDescriptorImpl]

'toShortOrNull' @ [179:57] ==> @SinceKotlin public fun String.toShortOrNull(): Short? defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'args' @ [180:41] ==> value-parameter args: Sequence<String?> defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertVararg.convertPrimitivesArray[ValueParameterDescriptorImpl]

'map' @ [180:46] ==> public fun <T, R> Sequence<String?>.map(transform: (String?) -> Byte?): Sequence<Byte?> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?
    <R> -> Byte?

'it' @ [180:52] ==> value-parameter it: String? defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertVararg.convertPrimitivesArray.<anonymous>[ValueParameterDescriptorImpl]

'toByteOrNull' @ [180:56] ==> @SinceKotlin public fun String.toByteOrNull(): Byte? defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'args' @ [181:41] ==> value-parameter args: Sequence<String?> defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertVararg.convertPrimitivesArray[ValueParameterDescriptorImpl]

'map' @ [181:46] ==> public fun <T, R> Sequence<String?>.map(transform: (String?) -> Char?): Sequence<Char?> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?
    <R> -> Char?

'it' @ [181:52] ==> value-parameter it: String? defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertVararg.convertPrimitivesArray.<anonymous>[ValueParameterDescriptorImpl]

'singleOrNull' @ [181:56] ==> public fun CharSequence.singleOrNull(): Char? defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'args' @ [182:42] ==> value-parameter args: Sequence<String?> defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertVararg.convertPrimitivesArray[ValueParameterDescriptorImpl]

'map' @ [182:47] ==> public fun <T, R> Sequence<String?>.map(transform: (String?) -> Float?): Sequence<Float?> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?
    <R> -> Float?

'it' @ [182:53] ==> value-parameter it: String? defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertVararg.convertPrimitivesArray.<anonymous>[ValueParameterDescriptorImpl]

'toFloatOrNull' @ [182:57] ==> @SinceKotlin public fun String.toFloatOrNull(): Float? defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'args' @ [183:43] ==> value-parameter args: Sequence<String?> defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertVararg.convertPrimitivesArray[ValueParameterDescriptorImpl]

'map' @ [183:48] ==> public fun <T, R> Sequence<String?>.map(transform: (String?) -> Double?): Sequence<Double?> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?
    <R> -> Double?

'it' @ [183:54] ==> value-parameter it: String? defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertVararg.convertPrimitivesArray.<anonymous>[ValueParameterDescriptorImpl]

'toDoubleOrNull' @ [183:58] ==> @SinceKotlin public fun String.toDoubleOrNull(): Double? defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'args' @ [184:44] ==> value-parameter args: Sequence<String?> defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertVararg.convertPrimitivesArray[ValueParameterDescriptorImpl]

'map' @ [184:49] ==> public fun <T, R> Sequence<String?>.map(transform: (String?) -> Boolean?): Sequence<Boolean?> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?
    <R> -> Boolean?

'it' @ [184:55] ==> value-parameter it: String? defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertVararg.convertPrimitivesArray.<anonymous>[ValueParameterDescriptorImpl]

'toBoolean' @ [184:59] ==> @InlineOnly public inline fun String.toBoolean(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toList' @ [186:20] ==> public fun <T> Sequence<Any?>.toList(): List<Any?> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any?

'takeUnless' @ [186:30] ==> @InlineOnly @SinceKotlin public inline fun <T> List<Any?>.takeUnless(predicate: (List<Any?>) -> Boolean): List<Any?>? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<Any?>

'in' @ [186:43] ==> public abstract fun contains(element: Any?): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'it' @ [186:51] ==> value-parameter it: List<Any?> defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertVararg.convertPrimitivesArray.<anonymous>[ValueParameterDescriptorImpl]

'toTypedArray' @ [186:57] ==> public inline fun <reified T> Collection<Any?>.toTypedArray(): Array<Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> Any?

'parameter' @ [188:29] ==> value-parameter parameter: KParameter defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertVararg[ValueParameterDescriptorImpl]

'type' @ [188:39] ==> public abstract val type: KType defined in kotlin.reflect.KParameter[DeserializedPropertyDescriptor]

'parameterType' @ [189:13] ==> val parameterType: KType defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertVararg[LocalVariableDescriptor]

'jvmErasure' @ [189:27] ==> @SinceKotlin public val KType.jvmErasure: KClass<*> defined in kotlin.reflect.jvm[DeserializedPropertyDescriptor]

'java' @ [189:38] ==> public val <T> KClass<out Any>.java: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(*)

'isArray' @ [189:43] ==> public final val <T : (Any..Any?)> Class<out Any>.isArray: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out Any)

'sequenceOf' @ [190:32] ==> public fun <T> sequenceOf(vararg elements: String?): Sequence<String?> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?

'firstArg' @ [190:43] ==> value-parameter firstArg: NamedArgument<String> defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertVararg[ValueParameterDescriptorImpl]

'value' @ [190:52] ==> public final val value: String? defined in org.jetbrains.kotlin.script.NamedArgument[PropertyDescriptorImpl]

'restArgsIt' @ [190:61] ==> value-parameter restArgsIt: Iterator<NamedArgument<String>> defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertVararg[ValueParameterDescriptorImpl]

'asSequence' @ [190:72] ==> public fun <T> Iterator<NamedArgument<String>>.asSequence(): Sequence<NamedArgument<String>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NamedArgument<String>

'map' @ [190:85] ==> public fun <T, R> Sequence<NamedArgument<String>>.map(transform: (NamedArgument<String>) -> String?): Sequence<String?> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NamedArgument<String>
    <R> -> String?

'it' @ [190:91] ==> value-parameter it: NamedArgument<String> defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertVararg.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [190:94] ==> public final val value: String? defined in org.jetbrains.kotlin.script.NamedArgument[PropertyDescriptorImpl]

'convertPrimitivesArray' @ [191:41] ==> local final fun convertPrimitivesArray(type: KType, args: Sequence<String?>): Any? defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertVararg[SimpleFunctionDescriptorImpl]

'parameterType' @ [191:64] ==> val parameterType: KType defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertVararg[LocalVariableDescriptor]

'argsSequence' @ [191:79] ==> val argsSequence: Sequence<String?> defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertVararg[LocalVariableDescriptor]

'primArrayArgCandidate' @ [192:17] ==> val primArrayArgCandidate: Any? defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertVararg[LocalVariableDescriptor]

'Success' @ [193:45] ==> public constructor Success(v: Any?) defined in org.jetbrains.kotlin.script.ArgsConverter.Result.Success[ClassConstructorDescriptorImpl]

'primArrayArgCandidate' @ [193:53] ==> val primArrayArgCandidate: Any? defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertVararg[LocalVariableDescriptor]

'parameterType' @ [194:36] ==> val parameterType: KType defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertVararg[LocalVariableDescriptor]

'arguments' @ [194:50] ==> @SinceKotlin public abstract val arguments: List<KTypeProjection> defined in kotlin.reflect.KType[DeserializedPropertyDescriptor]

'firstOrNull' @ [194:60] ==> public fun <T> List<KTypeProjection>.firstOrNull(): KTypeProjection? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KTypeProjection

'type' @ [194:75] ==> public final val type: KType? defined in kotlin.reflect.KTypeProjection[DeserializedPropertyDescriptor]

'convertAnyArray' @ [195:37] ==> local final fun convertAnyArray(classifier: KClassifier?, args: Sequence<String?>): Any? defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertVararg[SimpleFunctionDescriptorImpl]

'arrayElementType' @ [195:53] ==> val arrayElementType: KType? defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertVararg[LocalVariableDescriptor]

'classifier' @ [195:71] ==> @SinceKotlin public abstract val classifier: KClassifier? defined in kotlin.reflect.KType[DeserializedPropertyDescriptor]

'argsSequence' @ [195:83] ==> val argsSequence: Sequence<String?> defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertVararg[LocalVariableDescriptor]

'arrayArgCandidate' @ [196:17] ==> val arrayArgCandidate: Any? defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertVararg[LocalVariableDescriptor]

'Success' @ [197:45] ==> public constructor Success(v: Any?) defined in org.jetbrains.kotlin.script.ArgsConverter.Result.Success[ClassConstructorDescriptorImpl]

'arrayArgCandidate' @ [197:53] ==> val arrayArgCandidate: Any? defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertVararg[LocalVariableDescriptor]

'Failure' @ [200:37] ==> public object Failure : ArgsConverter.Result defined in org.jetbrains.kotlin.script.ArgsConverter.Result[FakeCallableDescriptorForObject]

'tryConvertVararg' @ [204:13] ==> public open fun tryConvertVararg(parameter: KParameter, firstArg: NamedArgument<String>, restArgsIt: Iterator<NamedArgument<String>>): ArgsConverter.Result defined in org.jetbrains.kotlin.script.StringArgsConverter[SimpleFunctionDescriptorImpl]

'parameter' @ [204:30] ==> value-parameter parameter: KParameter defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertTail[ValueParameterDescriptorImpl]

'firstArg' @ [204:41] ==> value-parameter firstArg: NamedArgument<String> defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertTail[ValueParameterDescriptorImpl]

'restArgsIt' @ [204:51] ==> value-parameter restArgsIt: Iterator<NamedArgument<String>> defined in org.jetbrains.kotlin.script.StringArgsConverter.tryConvertTail[ValueParameterDescriptorImpl]

'arg' @ [209:21] ==> value-parameter arg: NamedArgument<Any> defined in org.jetbrains.kotlin.script.AnyArgsConverter.tryConvertSingle[ValueParameterDescriptorImpl]

'value' @ [209:25] ==> public final val value: Any? defined in org.jetbrains.kotlin.script.NamedArgument[PropertyDescriptorImpl]

'Success' @ [209:62] ==> public constructor Success(v: Any?) defined in org.jetbrains.kotlin.script.ArgsConverter.Result.Success[ClassConstructorDescriptorImpl]

'Suppress' @ [211:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'when (type?.classifier) {
                    IntArray::class -> (arg as? Array<Int>)?.toIntArray()
                    LongArray::class -> (arg as? Array<Long>)?.toLongArray()
                    ShortArray::class -> (arg as? Array<Short>)?.toShortArray()
                    ByteArray::class -> (arg as? Array<Byte>)?.toByteArray()
                    CharArray::class -> (arg as? Array<Char>)?.toCharArray()
                    FloatArray::class -> (arg as? Array<Float>)?.toFloatArray()
                    DoubleArray::class -> (arg as? Array<Double>)?.toDoubleArray()
                    BooleanArray::class -> (arg as? Array<Boolean>)?.toBooleanArray()
                    else -> null
                }' @ [213:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any?, entry1: Any?, entry2: Any?, entry3: Any?, entry4: Any?, entry5: Any?, entry6: Any?, entry7: Any?, entry8: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any?

'type' @ [213:23] ==> value-parameter type: KType? defined in org.jetbrains.kotlin.script.AnyArgsConverter.tryConvertSingle.convertPrimitivesArray[ValueParameterDescriptorImpl]

'classifier' @ [213:29] ==> @SinceKotlin public abstract val classifier: KClassifier? defined in kotlin.reflect.KType[DeserializedPropertyDescriptor]

'arg' @ [214:41] ==> value-parameter arg: Any? defined in org.jetbrains.kotlin.script.AnyArgsConverter.tryConvertSingle.convertPrimitivesArray[ValueParameterDescriptorImpl]

'toIntArray' @ [214:62] ==> public fun Array<out Int>.toIntArray(): IntArray defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'arg' @ [215:42] ==> value-parameter arg: Any? defined in org.jetbrains.kotlin.script.AnyArgsConverter.tryConvertSingle.convertPrimitivesArray[ValueParameterDescriptorImpl]

'toLongArray' @ [215:64] ==> public fun Array<out Long>.toLongArray(): LongArray defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'arg' @ [216:43] ==> value-parameter arg: Any? defined in org.jetbrains.kotlin.script.AnyArgsConverter.tryConvertSingle.convertPrimitivesArray[ValueParameterDescriptorImpl]

'toShortArray' @ [216:66] ==> public fun Array<out Short>.toShortArray(): ShortArray defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'arg' @ [217:42] ==> value-parameter arg: Any? defined in org.jetbrains.kotlin.script.AnyArgsConverter.tryConvertSingle.convertPrimitivesArray[ValueParameterDescriptorImpl]

'toByteArray' @ [217:64] ==> public fun Array<out Byte>.toByteArray(): ByteArray defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'arg' @ [218:42] ==> value-parameter arg: Any? defined in org.jetbrains.kotlin.script.AnyArgsConverter.tryConvertSingle.convertPrimitivesArray[ValueParameterDescriptorImpl]

'toCharArray' @ [218:64] ==> public fun Array<out Char>.toCharArray(): CharArray defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'arg' @ [219:43] ==> value-parameter arg: Any? defined in org.jetbrains.kotlin.script.AnyArgsConverter.tryConvertSingle.convertPrimitivesArray[ValueParameterDescriptorImpl]

'toFloatArray' @ [219:66] ==> public fun Array<out Float>.toFloatArray(): FloatArray defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'arg' @ [220:44] ==> value-parameter arg: Any? defined in org.jetbrains.kotlin.script.AnyArgsConverter.tryConvertSingle.convertPrimitivesArray[ValueParameterDescriptorImpl]

'toDoubleArray' @ [220:68] ==> public fun Array<out Double>.toDoubleArray(): DoubleArray defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'arg' @ [221:45] ==> value-parameter arg: Any? defined in org.jetbrains.kotlin.script.AnyArgsConverter.tryConvertSingle.convertPrimitivesArray[ValueParameterDescriptorImpl]

'toBooleanArray' @ [221:70] ==> public fun Array<out Boolean>.toBooleanArray(): BooleanArray defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'value' @ [225:13] ==> val value: Any defined in org.jetbrains.kotlin.script.AnyArgsConverter.tryConvertSingle[LocalVariableDescriptor]

'isSubclassOf' @ [225:26] ==> @SinceKotlin public fun KClass<*>.isSubclassOf(base: KClass<*>): Boolean defined in kotlin.reflect.full[DeserializedSimpleFunctionDescriptor]

'parameter' @ [225:39] ==> value-parameter parameter: KParameter defined in org.jetbrains.kotlin.script.AnyArgsConverter.tryConvertSingle[ValueParameterDescriptorImpl]

'type' @ [225:49] ==> public abstract val type: KType defined in kotlin.reflect.KParameter[DeserializedPropertyDescriptor]

'jvmErasure' @ [225:54] ==> @SinceKotlin public val KType.jvmErasure: KClass<*> defined in kotlin.reflect.jvm[DeserializedPropertyDescriptor]

'Success' @ [225:95] ==> public constructor Success(v: Any?) defined in org.jetbrains.kotlin.script.ArgsConverter.Result.Success[ClassConstructorDescriptorImpl]

'value' @ [225:103] ==> val value: Any defined in org.jetbrains.kotlin.script.AnyArgsConverter.tryConvertSingle[LocalVariableDescriptor]

'convertPrimitivesArray' @ [227:16] ==> @Suppress local final fun convertPrimitivesArray(type: KType?, arg: Any?): Any? defined in org.jetbrains.kotlin.script.AnyArgsConverter.tryConvertSingle[SimpleFunctionDescriptorImpl]

'parameter' @ [227:39] ==> value-parameter parameter: KParameter defined in org.jetbrains.kotlin.script.AnyArgsConverter.tryConvertSingle[ValueParameterDescriptorImpl]

'type' @ [227:49] ==> public abstract val type: KType defined in kotlin.reflect.KParameter[DeserializedPropertyDescriptor]

'value' @ [227:55] ==> val value: Any defined in org.jetbrains.kotlin.script.AnyArgsConverter.tryConvertSingle[LocalVariableDescriptor]

'let' @ [227:63] ==> @InlineOnly public inline fun <T, R> Any.let(block: (Any) -> ArgsConverter.Result.Success): ArgsConverter.Result.Success defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any
    <R> -> Success

'Success' @ [227:90] ==> public constructor Success(v: Any?) defined in org.jetbrains.kotlin.script.ArgsConverter.Result.Success[ClassConstructorDescriptorImpl]

'it' @ [227:98] ==> value-parameter it: Any defined in org.jetbrains.kotlin.script.AnyArgsConverter.tryConvertSingle.<anonymous>[ValueParameterDescriptorImpl]

'Failure' @ [228:40] ==> public object Failure : ArgsConverter.Result defined in org.jetbrains.kotlin.script.ArgsConverter.Result[FakeCallableDescriptorForObject]

'Failure' @ [232:34] ==> public object Failure : ArgsConverter.Result defined in org.jetbrains.kotlin.script.ArgsConverter.Result[FakeCallableDescriptorForObject]

'tryConvertSingle' @ [235:13] ==> public open fun tryConvertSingle(parameter: KParameter, arg: NamedArgument<Any>): ArgsConverter.Result defined in org.jetbrains.kotlin.script.AnyArgsConverter[SimpleFunctionDescriptorImpl]

'parameter' @ [235:30] ==> value-parameter parameter: KParameter defined in org.jetbrains.kotlin.script.AnyArgsConverter.tryConvertTail[ValueParameterDescriptorImpl]

'firstArg' @ [235:41] ==> value-parameter firstArg: NamedArgument<Any> defined in org.jetbrains.kotlin.script.AnyArgsConverter.tryConvertTail[ValueParameterDescriptorImpl]

