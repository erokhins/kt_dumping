'NashornScriptEngineFactory' @ [28:9] ==> public constructor NashornScriptEngineFactory() defined in jdk.nashorn.api.scripting.NashornScriptEngineFactory[JavaClassConstructorDescriptor]

'getScriptEngine' @ [28:38] ==> public open fun getScriptEngine(vararg p0: (String..String?)): (ScriptEngine..ScriptEngine?) defined in jdk.nashorn.api.scripting.NashornScriptEngineFactory[JavaMethodDescriptor]

'eval' @ [31:5] ==> public abstract fun eval(p0: (String..String?)): (Any..Any?) defined in javax.script.ScriptEngine[JavaMethodDescriptor]

'when {
                withModuleSystem ->
                    eval(BasicBoxTest.Companion.KOTLIN_TEST_INTERNAL + ".require('" + testModuleName + "')")
                else ->
                    get(testModuleName)
            }' @ [39:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (Any..Any?), entry1: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'withModuleSystem' @ [40:17] ==> value-parameter withModuleSystem: Boolean defined in org.jetbrains.kotlin.js.test.runTestFunction[ValueParameterDescriptorImpl]

'eval' @ [41:21] ==> public abstract fun eval(p0: (String..String?)): (Any..Any?) defined in javax.script.ScriptEngine[JavaMethodDescriptor]

'BasicBoxTest' @ [41:26] ==> public companion object defined in org.jetbrains.kotlin.js.test.BasicBoxTest[FakeCallableDescriptorForObject]

'KOTLIN_TEST_INTERNAL' @ [41:49] ==> public const final val KOTLIN_TEST_INTERNAL: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'testModuleName' @ [41:87] ==> value-parameter testModuleName: String defined in org.jetbrains.kotlin.js.test.runTestFunction[ValueParameterDescriptorImpl]

'get' @ [43:21] ==> public abstract operator fun get(p0: (String..String?)): (Any..Any?) defined in javax.script.ScriptEngine[JavaMethodDescriptor]

'testModuleName' @ [43:25] ==> value-parameter testModuleName: String defined in org.jetbrains.kotlin.js.test.runTestFunction[ValueParameterDescriptorImpl]

'testModule' @ [45:5] ==> val testModule: (Any..Any?) defined in org.jetbrains.kotlin.js.test.runTestFunction[LocalVariableDescriptor]

'when {
                testPackageName === null ->
                    testModule
                testPackageName.contains(".") ->
                    testPackageName.split(".").fold(testModule) { p, part -> p[part] as ScriptObjectMirror }
                else ->
                    testModule[testPackageName]!!
            }' @ [48:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any, entry2: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'testPackageName' @ [49:17] ==> value-parameter testPackageName: String? defined in org.jetbrains.kotlin.js.test.runTestFunction[ValueParameterDescriptorImpl]

'testModule' @ [50:21] ==> val testModule: (Any..Any?) defined in org.jetbrains.kotlin.js.test.runTestFunction[LocalVariableDescriptor]

'testPackageName' @ [51:17] ==> value-parameter testPackageName: String? defined in org.jetbrains.kotlin.js.test.runTestFunction[ValueParameterDescriptorImpl]

'contains' @ [51:33] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'testPackageName' @ [52:21] ==> value-parameter testPackageName: String? defined in org.jetbrains.kotlin.js.test.runTestFunction[ValueParameterDescriptorImpl]

'split' @ [52:37] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'fold' @ [52:48] ==> public inline fun <T, R> Iterable<String>.fold(initial: ScriptObjectMirror, operation: (acc: ScriptObjectMirror, String) -> ScriptObjectMirror): ScriptObjectMirror defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> ScriptObjectMirror

'testModule' @ [52:53] ==> val testModule: (Any..Any?) defined in org.jetbrains.kotlin.js.test.runTestFunction[LocalVariableDescriptor]

'p' @ [52:78] ==> value-parameter p: ScriptObjectMirror defined in org.jetbrains.kotlin.js.test.runTestFunction.<anonymous>[ValueParameterDescriptorImpl]

'part' @ [52:80] ==> value-parameter part: String defined in org.jetbrains.kotlin.js.test.runTestFunction.<anonymous>[ValueParameterDescriptorImpl]

'testModule' @ [54:21] ==> val testModule: (Any..Any?) defined in org.jetbrains.kotlin.js.test.runTestFunction[LocalVariableDescriptor]

'testPackageName' @ [54:32] ==> value-parameter testPackageName: String? defined in org.jetbrains.kotlin.js.test.runTestFunction[ValueParameterDescriptorImpl]

'this' @ [57:13] ==> <this> defined in org.jetbrains.kotlin.js.test.runTestFunction[ReceiverParameterDescriptorImpl]

'invokeMethod' @ [57:32] ==> public abstract fun invokeMethod(p0: (Any..Any?), p1: (String..String?), vararg p2: (Any..Any?)): (Any..Any?) defined in javax.script.Invocable[JavaMethodDescriptor]

'testPackage' @ [57:45] ==> val testPackage: Any defined in org.jetbrains.kotlin.js.test.runTestFunction[LocalVariableDescriptor]

'testFunctionName' @ [57:58] ==> value-parameter testFunctionName: String defined in org.jetbrains.kotlin.js.test.runTestFunction[ValueParameterDescriptorImpl]

'eval' @ [61:5] ==> public abstract fun eval(p0: (String..String?)): (Any..Any?) defined in javax.script.ScriptEngine[JavaMethodDescriptor]

'path' @ [61:19] ==> value-parameter path: String defined in org.jetbrains.kotlin.js.test.loadFile[ValueParameterDescriptorImpl]

'replace' @ [61:24] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'eval' @ [67:24] ==> public abstract fun eval(p0: (String..String?)): (Any..Any?) defined in javax.script.ScriptEngine[JavaMethodDescriptor]

'globalObject' @ [68:18] ==> val globalObject: ScriptObjectMirror defined in org.jetbrains.kotlin.js.test.runAndRestoreContext[LocalVariableDescriptor]

'toMapWithAllMembers' @ [68:31] ==> private fun ScriptObjectMirror.toMapWithAllMembers(): Map<String, Any?> defined in org.jetbrains.kotlin.js.test in file NashornJsTestChecker.kt[SimpleFunctionDescriptorImpl]

'this' @ [71:9] ==> <this> defined in org.jetbrains.kotlin.js.test.runAndRestoreContext[ReceiverParameterDescriptorImpl]

'invoke' @ [71:14] ==> public abstract operator fun ScriptEngine.invoke(): Any? defined in kotlin.Function1[FunctionInvokeDescriptor]

'globalObject' @ [74:21] ==> val globalObject: ScriptObjectMirror defined in org.jetbrains.kotlin.js.test.runAndRestoreContext[LocalVariableDescriptor]

'toMapWithAllMembers' @ [74:34] ==> private fun ScriptObjectMirror.toMapWithAllMembers(): Map<String, Any?> defined in org.jetbrains.kotlin.js.test in file NashornJsTestChecker.kt[SimpleFunctionDescriptorImpl]

'after' @ [75:20] ==> val after: Map<String, Any?> defined in org.jetbrains.kotlin.js.test.runAndRestoreContext[LocalVariableDescriptor]

'entries' @ [75:26] ==> public abstract val entries: Set<Map.Entry<String, Any?>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'before' @ [75:36] ==> val before: Map<String, Any?> defined in org.jetbrains.kotlin.js.test.runAndRestoreContext[LocalVariableDescriptor]

'entries' @ [75:43] ==> public abstract val entries: Set<Map.Entry<String, Any?>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'diff' @ [77:9] ==> val diff: Set<Map.Entry<String, Any?>> defined in org.jetbrains.kotlin.js.test.runAndRestoreContext[LocalVariableDescriptor]

'forEach' @ [77:14] ==> @HidesMembers public inline fun <T> Iterable<Map.Entry<String, Any?>>.forEach(action: (Map.Entry<String, Any?>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Entry<String, Any?>

'globalObject' @ [78:13] ==> val globalObject: ScriptObjectMirror defined in org.jetbrains.kotlin.js.test.runAndRestoreContext[LocalVariableDescriptor]

'put' @ [78:26] ==> public open fun put(key: (String..String?), value: (Any..Any?)): Any? defined in jdk.nashorn.api.scripting.ScriptObjectMirror[JavaMethodDescriptor]

'it' @ [78:30] ==> value-parameter it: Map.Entry<String, Any?> defined in org.jetbrains.kotlin.js.test.runAndRestoreContext.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [78:33] ==> public abstract val key: String defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'before' @ [78:38] ==> val before: Map<String, Any?> defined in org.jetbrains.kotlin.js.test.runAndRestoreContext[LocalVariableDescriptor]

'it' @ [78:45] ==> value-parameter it: Map.Entry<String, Any?> defined in org.jetbrains.kotlin.js.test.runAndRestoreContext.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [78:48] ==> public abstract val key: String defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'UNDEFINED' @ [78:70] ==> public final val UNDEFINED: (Undefined..Undefined?) defined in jdk.nashorn.internal.runtime.ScriptRuntime[JavaPropertyDescriptor]

'getOwnKeys' @ [83:75] ==> public open fun getOwnKeys(p0: Boolean): (Array<(String..String?)>..Array<out (String..String?)>?) defined in jdk.nashorn.api.scripting.ScriptObjectMirror[JavaMethodDescriptor]

'associate' @ [83:92] ==> public inline fun <T, K, V> Array<out (String..String?)>.associate(transform: ((String..String?)) -> Pair<String, Any?>): Map<String, Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)
    <K> -> String
    <V> -> Any?

'it' @ [83:104] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.js.test.toMapWithAllMembers.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [83:110] ==> <this> defined in org.jetbrains.kotlin.js.test.toMapWithAllMembers[ReceiverParameterDescriptorImpl]

'it' @ [83:115] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.js.test.toMapWithAllMembers.<anonymous>[ValueParameterDescriptorImpl]

'createScriptEngineForTest' @ [89:26] ==> private final fun createScriptEngineForTest(): ScriptEngine defined in org.jetbrains.kotlin.js.test.NashornJsTestChecker[SimpleFunctionDescriptorImpl]

'run' @ [99:28] ==> private final fun run(files: List<String>, testModuleName: String, testPackageName: String?, testFunctionName: String, withModuleSystem: Boolean): Any? defined in org.jetbrains.kotlin.js.test.NashornJsTestChecker[SimpleFunctionDescriptorImpl]

'files' @ [99:32] ==> value-parameter files: List<String> defined in org.jetbrains.kotlin.js.test.NashornJsTestChecker.check[ValueParameterDescriptorImpl]

'testModuleName' @ [99:39] ==> value-parameter testModuleName: String defined in org.jetbrains.kotlin.js.test.NashornJsTestChecker.check[ValueParameterDescriptorImpl]

'testPackageName' @ [99:55] ==> value-parameter testPackageName: String? defined in org.jetbrains.kotlin.js.test.NashornJsTestChecker.check[ValueParameterDescriptorImpl]

'testFunctionName' @ [99:72] ==> value-parameter testFunctionName: String defined in org.jetbrains.kotlin.js.test.NashornJsTestChecker.check[ValueParameterDescriptorImpl]

'withModuleSystem' @ [99:90] ==> value-parameter withModuleSystem: Boolean defined in org.jetbrains.kotlin.js.test.NashornJsTestChecker.check[ValueParameterDescriptorImpl]

'assertEquals' @ [100:16] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'expectedResult' @ [100:29] ==> value-parameter expectedResult: String defined in org.jetbrains.kotlin.js.test.NashornJsTestChecker.check[ValueParameterDescriptorImpl]

'actualResult' @ [100:45] ==> val actualResult: Any? defined in org.jetbrains.kotlin.js.test.NashornJsTestChecker.check[LocalVariableDescriptor]

'run' @ [104:9] ==> public final fun run(files: List<String>): Unit defined in org.jetbrains.kotlin.js.test.NashornJsTestChecker[SimpleFunctionDescriptorImpl]

'files' @ [104:13] ==> value-parameter files: List<String> defined in org.jetbrains.kotlin.js.test.NashornJsTestChecker.checkStdout[ValueParameterDescriptorImpl]

'engine' @ [105:28] ==> private final val engine: ScriptEngine defined in org.jetbrains.kotlin.js.test.NashornJsTestChecker[PropertyDescriptorImpl]

'eval' @ [105:35] ==> public abstract fun eval(p0: (String..String?)): (Any..Any?) defined in javax.script.ScriptEngine[JavaMethodDescriptor]

'GET_KOTLIN_OUTPUT' @ [105:40] ==> private final val GET_KOTLIN_OUTPUT: String defined in org.jetbrains.kotlin.js.test.NashornJsTestChecker[PropertyDescriptorImpl]

'assertEquals' @ [106:16] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'expectedResult' @ [106:29] ==> value-parameter expectedResult: String defined in org.jetbrains.kotlin.js.test.NashornJsTestChecker.checkStdout[ValueParameterDescriptorImpl]

'actualResult' @ [106:45] ==> val actualResult: (Any..Any?) defined in org.jetbrains.kotlin.js.test.NashornJsTestChecker.checkStdout[LocalVariableDescriptor]

'run' @ [110:9] ==> private final fun run(files: List<String>, f: ScriptEngine.() -> Any?): Any? defined in org.jetbrains.kotlin.js.test.NashornJsTestChecker[SimpleFunctionDescriptorImpl]

'files' @ [110:13] ==> value-parameter files: List<String> defined in org.jetbrains.kotlin.js.test.NashornJsTestChecker.run[ValueParameterDescriptorImpl]

'run' @ [119:9] ==> private final fun run(files: List<String>, f: ScriptEngine.() -> Any?): Any? defined in org.jetbrains.kotlin.js.test.NashornJsTestChecker[SimpleFunctionDescriptorImpl]

'files' @ [119:13] ==> value-parameter files: List<String> defined in org.jetbrains.kotlin.js.test.NashornJsTestChecker.run[ValueParameterDescriptorImpl]

'runTestFunction' @ [120:9] ==> public fun ScriptEngine.runTestFunction(testModuleName: String, testPackageName: String?, testFunctionName: String, withModuleSystem: Boolean): Any? defined in org.jetbrains.kotlin.js.test in file NashornJsTestChecker.kt[SimpleFunctionDescriptorImpl]

'testModuleName' @ [120:25] ==> value-parameter testModuleName: String defined in org.jetbrains.kotlin.js.test.NashornJsTestChecker.run[ValueParameterDescriptorImpl]

'testPackageName' @ [120:41] ==> value-parameter testPackageName: String? defined in org.jetbrains.kotlin.js.test.NashornJsTestChecker.run[ValueParameterDescriptorImpl]

'testFunctionName' @ [120:58] ==> value-parameter testFunctionName: String defined in org.jetbrains.kotlin.js.test.NashornJsTestChecker.run[ValueParameterDescriptorImpl]

'withModuleSystem' @ [120:76] ==> value-parameter withModuleSystem: Boolean defined in org.jetbrains.kotlin.js.test.NashornJsTestChecker.run[ValueParameterDescriptorImpl]

'engine' @ [127:9] ==> private final val engine: ScriptEngine defined in org.jetbrains.kotlin.js.test.NashornJsTestChecker[PropertyDescriptorImpl]

'eval' @ [127:16] ==> public abstract fun eval(p0: (String..String?)): (Any..Any?) defined in javax.script.ScriptEngine[JavaMethodDescriptor]

'SETUP_KOTLIN_OUTPUT' @ [127:21] ==> public final val SETUP_KOTLIN_OUTPUT: String defined in org.jetbrains.kotlin.js.test.NashornJsTestChecker[PropertyDescriptorImpl]

'engine' @ [128:16] ==> private final val engine: ScriptEngine defined in org.jetbrains.kotlin.js.test.NashornJsTestChecker[PropertyDescriptorImpl]

'runAndRestoreContext' @ [128:23] ==> public fun ScriptEngine.runAndRestoreContext(f: ScriptEngine.() -> Any?): Any? defined in org.jetbrains.kotlin.js.test in file NashornJsTestChecker.kt[SimpleFunctionDescriptorImpl]

'files' @ [129:13] ==> value-parameter files: List<String> defined in org.jetbrains.kotlin.js.test.NashornJsTestChecker.run[ValueParameterDescriptorImpl]

'forEach' @ [129:19] ==> @HidesMembers public inline fun <T> Iterable<String>.forEach(action: (String) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'engine' @ [129:27] ==> private final val engine: ScriptEngine defined in org.jetbrains.kotlin.js.test.NashornJsTestChecker[PropertyDescriptorImpl]

'loadFile' @ [129:35] ==> public fun ScriptEngine.loadFile(path: String): Unit defined in org.jetbrains.kotlin.js.test in file NashornJsTestChecker.kt[SimpleFunctionDescriptorImpl]

'engine' @ [130:13] ==> private final val engine: ScriptEngine defined in org.jetbrains.kotlin.js.test.NashornJsTestChecker[PropertyDescriptorImpl]

'invoke' @ [130:20] ==> public abstract operator fun ScriptEngine.invoke(): Any? defined in kotlin.Function1[FunctionInvokeDescriptor]

'createScriptEngine' @ [135:22] ==> public fun createScriptEngine(): ScriptEngine defined in org.jetbrains.kotlin.js.test in file NashornJsTestChecker.kt[SimpleFunctionDescriptorImpl]

'listOf' @ [137:9] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'BasicBoxTest' @ [138:17] ==> public companion object defined in org.jetbrains.kotlin.js.test.BasicBoxTest[FakeCallableDescriptorForObject]

'TEST_DATA_DIR_PATH' @ [138:30] ==> public const final val TEST_DATA_DIR_PATH: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'BasicBoxTest' @ [139:17] ==> public companion object defined in org.jetbrains.kotlin.js.test.BasicBoxTest[FakeCallableDescriptorForObject]

'DIST_DIR_JS_PATH' @ [139:30] ==> public const final val DIST_DIR_JS_PATH: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'BasicBoxTest' @ [140:17] ==> public companion object defined in org.jetbrains.kotlin.js.test.BasicBoxTest[FakeCallableDescriptorForObject]

'DIST_DIR_JS_PATH' @ [140:30] ==> public const final val DIST_DIR_JS_PATH: String defined in org.jetbrains.kotlin.js.test.BasicBoxTest.Companion[PropertyDescriptorImpl]

'forEach' @ [141:11] ==> @HidesMembers public inline fun <T> Iterable<String>.forEach(action: (String) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'engine' @ [141:19] ==> val engine: ScriptEngine defined in org.jetbrains.kotlin.js.test.NashornJsTestChecker.createScriptEngineForTest[LocalVariableDescriptor]

'loadFile' @ [141:27] ==> public fun ScriptEngine.loadFile(path: String): Unit defined in org.jetbrains.kotlin.js.test in file NashornJsTestChecker.kt[SimpleFunctionDescriptorImpl]

'engine' @ [143:9] ==> val engine: ScriptEngine defined in org.jetbrains.kotlin.js.test.NashornJsTestChecker.createScriptEngineForTest[LocalVariableDescriptor]

'overrideAsserter' @ [143:16] ==> public fun ScriptEngine.overrideAsserter(): Unit defined in org.jetbrains.kotlin.js.test in file NashornJsTestChecker.kt[SimpleFunctionDescriptorImpl]

'engine' @ [145:16] ==> val engine: ScriptEngine defined in org.jetbrains.kotlin.js.test.NashornJsTestChecker.createScriptEngineForTest[LocalVariableDescriptor]

