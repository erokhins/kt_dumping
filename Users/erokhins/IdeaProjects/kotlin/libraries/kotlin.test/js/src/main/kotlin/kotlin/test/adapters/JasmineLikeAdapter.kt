'if (ignored) {
            xdescribe(name, suiteFn)
        }
        else {
            describe(name, suiteFn)
        }' @ [27:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'ignored' @ [27:13] ==> value-parameter ignored: Boolean defined in kotlin.test.adapters.JasmineLikeAdapter.suite[ValueParameterDescriptorImpl]

'xdescribe' @ [28:13] ==> internal external fun xdescribe(name: String, fn: () -> Unit): Unit defined in kotlin.test.adapters[SimpleFunctionDescriptorImpl]

'name' @ [28:23] ==> value-parameter name: String defined in kotlin.test.adapters.JasmineLikeAdapter.suite[ValueParameterDescriptorImpl]

'suiteFn' @ [28:29] ==> value-parameter suiteFn: () -> Unit defined in kotlin.test.adapters.JasmineLikeAdapter.suite[ValueParameterDescriptorImpl]

'describe' @ [31:13] ==> internal external fun describe(name: String, fn: () -> Unit): Unit defined in kotlin.test.adapters[SimpleFunctionDescriptorImpl]

'name' @ [31:22] ==> value-parameter name: String defined in kotlin.test.adapters.JasmineLikeAdapter.suite[ValueParameterDescriptorImpl]

'suiteFn' @ [31:28] ==> value-parameter suiteFn: () -> Unit defined in kotlin.test.adapters.JasmineLikeAdapter.suite[ValueParameterDescriptorImpl]

'if (ignored) {
            xit(name, testFn)
        }
        else {
            it(name, testFn)
        }' @ [36:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'ignored' @ [36:13] ==> value-parameter ignored: Boolean defined in kotlin.test.adapters.JasmineLikeAdapter.test[ValueParameterDescriptorImpl]

'xit' @ [37:13] ==> internal external fun xit(name: String, fn: () -> Unit): Unit defined in kotlin.test.adapters[SimpleFunctionDescriptorImpl]

'name' @ [37:17] ==> value-parameter name: String defined in kotlin.test.adapters.JasmineLikeAdapter.test[ValueParameterDescriptorImpl]

'testFn' @ [37:23] ==> value-parameter testFn: () -> Unit defined in kotlin.test.adapters.JasmineLikeAdapter.test[ValueParameterDescriptorImpl]

'it' @ [40:13] ==> internal external fun it(name: String, fn: () -> Unit): Unit defined in kotlin.test.adapters[SimpleFunctionDescriptorImpl]

'name' @ [40:16] ==> value-parameter name: String defined in kotlin.test.adapters.JasmineLikeAdapter.test[ValueParameterDescriptorImpl]

'testFn' @ [40:22] ==> value-parameter testFn: () -> Unit defined in kotlin.test.adapters.JasmineLikeAdapter.test[ValueParameterDescriptorImpl]

