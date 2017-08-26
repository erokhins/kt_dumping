'if (js("typeof adapter === 'string'")) {
        NAME_TO_ADAPTER[adapter]?.let {
            setAdapter(it.invoke())
        }?: throw IllegalArgumentException("Unsupported test framework adapter: '$adapter'")
    }
    else {
        currentAdapter = adapter
    }' @ [32:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'js' @ [32:9] ==> public external fun js(code: String): dynamic defined in kotlin.js[DeserializedSimpleFunctionDescriptor]

'NAME_TO_ADAPTER' @ [33:9] ==> internal val NAME_TO_ADAPTER: Map<String, () -> FrameworkAdapter> defined in kotlin.test in file TestApi.kt[PropertyDescriptorImpl]

'adapter' @ [33:25] ==> value-parameter adapter: dynamic defined in kotlin.test.setAdapter[ValueParameterDescriptorImpl]

'let' @ [33:35] ==> @InlineOnly public inline fun <T, R> (() -> FrameworkAdapter).let(block: (() -> FrameworkAdapter) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function0<FrameworkAdapter>
    <R> -> Unit

'setAdapter' @ [34:13] ==> internal fun setAdapter(adapter: dynamic): Unit defined in kotlin.test in file TestApi.kt[SimpleFunctionDescriptorImpl]

'it' @ [34:24] ==> value-parameter it: () -> FrameworkAdapter defined in kotlin.test.setAdapter.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [34:27] ==> public abstract operator fun invoke(): FrameworkAdapter defined in kotlin.Function0[FunctionInvokeDescriptor]

'IllegalArgumentException' @ [35:19] ==> public constructor IllegalArgumentException(message: String? = ...) defined in kotlin.IllegalArgumentException[DeserializedClassConstructorDescriptor]

'adapter' @ [35:83] ==> value-parameter adapter: dynamic defined in kotlin.test.setAdapter[ValueParameterDescriptorImpl]

'currentAdapter' @ [38:9] ==> internal var currentAdapter: FrameworkAdapter? defined in kotlin.test in file TestApi.kt[PropertyDescriptorImpl]

'adapter' @ [38:26] ==> value-parameter adapter: dynamic defined in kotlin.test.setAdapter[ValueParameterDescriptorImpl]

'assertHook' @ [46:5] ==> internal var assertHook: (AssertionResult) -> Unit defined in kotlin.test in file DefaultJsAsserter.kt[PropertyDescriptorImpl]

'hook' @ [46:18] ==> value-parameter hook: (AssertionResult) -> Unit defined in kotlin.test.setAssertHook[ValueParameterDescriptorImpl]

'JsName' @ [62:1] ==> public constructor JsName(name: String) defined in kotlin.js.JsName[DeserializedClassConstructorDescriptor]

'adapter' @ [64:5] ==> internal fun adapter(): FrameworkAdapter defined in kotlin.test in file TestApi.kt[SimpleFunctionDescriptorImpl]

'suite' @ [64:15] ==> public abstract fun suite(name: String, ignored: Boolean, suiteFn: () -> Unit): Unit defined in kotlin.test.FrameworkAdapter[SimpleFunctionDescriptorImpl]

'name' @ [64:21] ==> value-parameter name: String defined in kotlin.test.suite[ValueParameterDescriptorImpl]

'ignored' @ [64:27] ==> value-parameter ignored: Boolean defined in kotlin.test.suite[ValueParameterDescriptorImpl]

'suiteFn' @ [64:36] ==> value-parameter suiteFn: () -> Unit defined in kotlin.test.suite[ValueParameterDescriptorImpl]

'JsName' @ [67:1] ==> public constructor JsName(name: String) defined in kotlin.js.JsName[DeserializedClassConstructorDescriptor]

'adapter' @ [69:5] ==> internal fun adapter(): FrameworkAdapter defined in kotlin.test in file TestApi.kt[SimpleFunctionDescriptorImpl]

'test' @ [69:15] ==> public abstract fun test(name: String, ignored: Boolean, testFn: () -> Unit): Unit defined in kotlin.test.FrameworkAdapter[SimpleFunctionDescriptorImpl]

'name' @ [69:20] ==> value-parameter name: String defined in kotlin.test.test[ValueParameterDescriptorImpl]

'ignored' @ [69:26] ==> value-parameter ignored: Boolean defined in kotlin.test.test[ValueParameterDescriptorImpl]

'testFn' @ [69:35] ==> value-parameter testFn: () -> Unit defined in kotlin.test.test[ValueParameterDescriptorImpl]

'currentAdapter' @ [75:18] ==> internal var currentAdapter: FrameworkAdapter? defined in kotlin.test in file TestApi.kt[PropertyDescriptorImpl]

'detectAdapter' @ [75:36] ==> internal fun detectAdapter(): FrameworkAdapter defined in kotlin.test[SimpleFunctionDescriptorImpl]

'currentAdapter' @ [76:5] ==> internal var currentAdapter: FrameworkAdapter? defined in kotlin.test in file TestApi.kt[PropertyDescriptorImpl]

'result' @ [76:22] ==> val result: FrameworkAdapter defined in kotlin.test.adapter[LocalVariableDescriptor]

'result' @ [77:12] ==> val result: FrameworkAdapter defined in kotlin.test.adapter[LocalVariableDescriptor]

'when {
    isQUnit() -> QUnitAdapter()
    isJasmine() -> JasmineLikeAdapter()
    else -> BareAdapter()
}' @ [81:32] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: FrameworkAdapter, entry1: FrameworkAdapter, entry2: FrameworkAdapter): FrameworkAdapter[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> FrameworkAdapter

'isQUnit' @ [82:5] ==> internal fun isQUnit(): Boolean defined in kotlin.test.adapters[SimpleFunctionDescriptorImpl]

'QUnitAdapter' @ [82:18] ==> public constructor QUnitAdapter() defined in kotlin.test.adapters.QUnitAdapter[ClassConstructorDescriptorImpl]

'isJasmine' @ [83:5] ==> internal fun isJasmine(): dynamic defined in kotlin.test.adapters[SimpleFunctionDescriptorImpl]

'JasmineLikeAdapter' @ [83:20] ==> public constructor JasmineLikeAdapter() defined in kotlin.test.adapters.JasmineLikeAdapter[ClassConstructorDescriptorImpl]

'BareAdapter' @ [84:13] ==> public constructor BareAdapter() defined in kotlin.test.adapters.BareAdapter[ClassConstructorDescriptorImpl]

'mapOf' @ [87:69] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, KFunction0<FrameworkAdapter>>): Map<String, KFunction0<FrameworkAdapter>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> KFunction0<FrameworkAdapter>

'to' @ [88:9] ==> public infix fun <A, B> String.to(that: KFunction0<QUnitAdapter>): Pair<String, KFunction0<QUnitAdapter>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> KFunction0<QUnitAdapter>

'to' @ [89:9] ==> public infix fun <A, B> String.to(that: KFunction0<JasmineLikeAdapter>): Pair<String, KFunction0<JasmineLikeAdapter>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> KFunction0<JasmineLikeAdapter>

'to' @ [90:9] ==> public infix fun <A, B> String.to(that: KFunction0<JasmineLikeAdapter>): Pair<String, KFunction0<JasmineLikeAdapter>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> KFunction0<JasmineLikeAdapter>

'to' @ [91:9] ==> public infix fun <A, B> String.to(that: KFunction0<JasmineLikeAdapter>): Pair<String, KFunction0<JasmineLikeAdapter>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> KFunction0<JasmineLikeAdapter>

'to' @ [92:9] ==> public infix fun <A, B> String.to(that: KFunction0<FrameworkAdapter>): Pair<String, KFunction0<FrameworkAdapter>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> KFunction0<FrameworkAdapter>

