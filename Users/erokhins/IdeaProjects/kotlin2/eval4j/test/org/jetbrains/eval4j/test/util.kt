'if (methodName.startsWith("test")) methodName else "test${methodName.capitalize()}"' @ [19:39] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'methodName' @ [19:43] ==> value-parameter methodName: String defined in org.jetbrains.eval4j.test.getTestName[ValueParameterDescriptorImpl]

'startsWith' @ [19:54] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'methodName' @ [19:74] ==> value-parameter methodName: String defined in org.jetbrains.eval4j.test.getTestName[ValueParameterDescriptorImpl]

'methodName' @ [19:97] ==> value-parameter methodName: String defined in org.jetbrains.eval4j.test.getTestName[ValueParameterDescriptorImpl]

'capitalize' @ [19:108] ==> public fun String.capitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

