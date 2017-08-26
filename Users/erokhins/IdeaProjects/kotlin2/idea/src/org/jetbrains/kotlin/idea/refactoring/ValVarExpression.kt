'Expression' @ [26:26] ==> public constructor Expression() defined in com.intellij.codeInsight.template.Expression[JavaClassConstructorDescriptor]

'listOf' @ [27:40] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'map' @ [27:61] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> LookupElementBuilder): List<LookupElementBuilder> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> LookupElementBuilder

'create' @ [27:88] ==> @NotNull public open fun create(@NotNull p0: String): LookupElementBuilder defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'it' @ [27:95] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.refactoring.ValVarExpression.cachedLookupElements.<anonymous>[ValueParameterDescriptorImpl]

'toTypedArray' @ [27:101] ==> public inline fun <reified T> Collection<LookupElement>.toTypedArray(): Array<LookupElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> LookupElement

'TextResult' @ [29:74] ==> public constructor TextResult(@NotNull p0: String) defined in com.intellij.codeInsight.template.TextResult[JavaClassConstructorDescriptor]

'calculateResult' @ [31:79] ==> public open fun calculateResult(context: ExpressionContext?): Result? defined in org.jetbrains.kotlin.idea.refactoring.ValVarExpression[SimpleFunctionDescriptorImpl]

'context' @ [31:95] ==> value-parameter context: ExpressionContext? defined in org.jetbrains.kotlin.idea.refactoring.ValVarExpression.calculateQuickResult[ValueParameterDescriptorImpl]

'cachedLookupElements' @ [33:93] ==> private final val cachedLookupElements: Array<LookupElement> defined in org.jetbrains.kotlin.idea.refactoring.ValVarExpression[PropertyDescriptorImpl]

