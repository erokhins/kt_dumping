'ignoredSuite' @ [30:26] ==> public final var ignoredSuite: Boolean defined in kotlin.test.adapters.QUnitAdapter[PropertyDescriptorImpl]

'ignoredSuite' @ [31:9] ==> public final var ignoredSuite: Boolean defined in kotlin.test.adapters.QUnitAdapter[PropertyDescriptorImpl]

'ignoredSuite' @ [31:24] ==> public final var ignoredSuite: Boolean defined in kotlin.test.adapters.QUnitAdapter[PropertyDescriptorImpl]

'ignored' @ [31:40] ==> value-parameter ignored: Boolean defined in kotlin.test.adapters.QUnitAdapter.suite[ValueParameterDescriptorImpl]

'QUnit' @ [32:9] ==> internal external object QUnit defined in kotlin.test.adapters in file Externals.kt[FakeCallableDescriptorForObject]

'module' @ [32:15] ==> public final fun module(name: String, suiteFn: () -> Unit): Unit defined in kotlin.test.adapters.QUnit[SimpleFunctionDescriptorImpl]

'name' @ [32:22] ==> value-parameter name: String defined in kotlin.test.adapters.QUnitAdapter.suite[ValueParameterDescriptorImpl]

'suiteFn' @ [32:28] ==> value-parameter suiteFn: () -> Unit defined in kotlin.test.adapters.QUnitAdapter.suite[ValueParameterDescriptorImpl]

'ignoredSuite' @ [33:9] ==> public final var ignoredSuite: Boolean defined in kotlin.test.adapters.QUnitAdapter[PropertyDescriptorImpl]

'prevIgnore' @ [33:24] ==> val prevIgnore: Boolean defined in kotlin.test.adapters.QUnitAdapter.suite[LocalVariableDescriptor]

'if (ignored or ignoredSuite) {
            QUnit.skip(name, wrapTest(testFn))
        }
        else {
            QUnit.test(name, wrapTest(testFn))
        }' @ [37:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'ignored' @ [37:13] ==> value-parameter ignored: Boolean defined in kotlin.test.adapters.QUnitAdapter.test[ValueParameterDescriptorImpl]

'ignoredSuite' @ [37:24] ==> public final var ignoredSuite: Boolean defined in kotlin.test.adapters.QUnitAdapter[PropertyDescriptorImpl]

'QUnit' @ [38:13] ==> internal external object QUnit defined in kotlin.test.adapters in file Externals.kt[FakeCallableDescriptorForObject]

'skip' @ [38:19] ==> public final fun skip(name: String, testFn: (dynamic) -> Unit): Unit defined in kotlin.test.adapters.QUnit[SimpleFunctionDescriptorImpl]

'name' @ [38:24] ==> value-parameter name: String defined in kotlin.test.adapters.QUnitAdapter.test[ValueParameterDescriptorImpl]

'wrapTest' @ [38:30] ==> private final fun wrapTest(testFn: () -> Unit): (dynamic) -> Unit defined in kotlin.test.adapters.QUnitAdapter[SimpleFunctionDescriptorImpl]

'testFn' @ [38:39] ==> value-parameter testFn: () -> Unit defined in kotlin.test.adapters.QUnitAdapter.test[ValueParameterDescriptorImpl]

'QUnit' @ [41:13] ==> internal external object QUnit defined in kotlin.test.adapters in file Externals.kt[FakeCallableDescriptorForObject]

'test' @ [41:19] ==> public final fun test(name: String, testFn: (dynamic) -> Unit): Unit defined in kotlin.test.adapters.QUnit[SimpleFunctionDescriptorImpl]

'name' @ [41:24] ==> value-parameter name: String defined in kotlin.test.adapters.QUnitAdapter.test[ValueParameterDescriptorImpl]

'wrapTest' @ [41:30] ==> private final fun wrapTest(testFn: () -> Unit): (dynamic) -> Unit defined in kotlin.test.adapters.QUnitAdapter[SimpleFunctionDescriptorImpl]

'testFn' @ [41:39] ==> value-parameter testFn: () -> Unit defined in kotlin.test.adapters.QUnitAdapter.test[ValueParameterDescriptorImpl]

'assertHook' @ [47:9] ==> internal var assertHook: (AssertionResult) -> Unit defined in kotlin.test in file DefaultJsAsserter.kt[PropertyDescriptorImpl]

'assertionsHappened' @ [48:13] ==> var assertionsHappened: Boolean defined in kotlin.test.adapters.QUnitAdapter.wrapTest.<anonymous>[LocalVariableDescriptor]

'assert' @ [49:13] ==> value-parameter assert: dynamic defined in kotlin.test.adapters.QUnitAdapter.wrapTest.<anonymous>[ValueParameterDescriptorImpl]

'ok' @ [49:20] ==> public final fun ok(p0: dynamic, p1: dynamic): dynamic defined in kotlin.test.adapters.QUnitAdapter.wrapTest.<anonymous>.<anonymous>[SimpleFunctionDescriptorImpl]

'testResult' @ [49:23] ==> value-parameter testResult: AssertionResult defined in kotlin.test.adapters.QUnitAdapter.wrapTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [49:34] ==> public abstract val result: Boolean defined in kotlin.test.AssertionResult[PropertyDescriptorImpl]

'testResult' @ [49:42] ==> value-parameter testResult: AssertionResult defined in kotlin.test.adapters.QUnitAdapter.wrapTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [49:53] ==> public abstract operator fun invoke(): String? defined in kotlin.Function0[FunctionInvokeDescriptor]

'invoke' @ [51:9] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'!' @ [52:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'assertionsHappened' @ [52:14] ==> var assertionsHappened: Boolean defined in kotlin.test.adapters.QUnitAdapter.wrapTest.<anonymous>[LocalVariableDescriptor]

'assertTrue' @ [53:13] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test in file Assertions.kt[SimpleFunctionDescriptorImpl]

