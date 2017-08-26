'Expression' @ [32:5] ==> public constructor Expression() defined in com.intellij.codeInsight.template.Expression[JavaClassConstructorDescriptor]

'lookupItems' @ [37:55] ==> value-parameter lookupItems: Collection<T> defined in org.jetbrains.kotlin.idea.intentions.ChooseValueExpression.<init>[ValueParameterDescriptorImpl]

'map' @ [37:67] ==> public inline fun <T, R> Iterable<T>.map(transform: (T) -> (LookupElementBuilder..LookupElementBuilder?)): List<(LookupElementBuilder..LookupElementBuilder?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T
    <R> -> (com.intellij.codeInsight.lookup.LookupElementBuilder..com.intellij.codeInsight.lookup.LookupElementBuilder?)

'create' @ [38:30] ==> public open fun create(@NotNull p0: Any, @NotNull p1: String): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'suggestion' @ [38:37] ==> value-parameter suggestion: T defined in org.jetbrains.kotlin.idea.intentions.ChooseValueExpression.lookupItems.<anonymous>[ValueParameterDescriptorImpl]

'getLookupString' @ [38:49] ==> protected abstract fun getLookupString(element: T): String defined in org.jetbrains.kotlin.idea.intentions.ChooseValueExpression[SimpleFunctionDescriptorImpl]

'suggestion' @ [38:65] ==> value-parameter suggestion: T defined in org.jetbrains.kotlin.idea.intentions.ChooseValueExpression.lookupItems.<anonymous>[ValueParameterDescriptorImpl]

'withInsertHandler' @ [38:78] ==> @Contract public final fun withInsertHandler(@Nullable p0: (((InsertionContext..InsertionContext?), (LookupElement..LookupElement?)) -> Unit)?): (LookupElementBuilder..LookupElementBuilder?) defined in com.intellij.codeInsight.lookup.LookupElementBuilder[MyFunctionDescriptor]

'getTopLevelEditor' @ [39:55] ==> @NotNull public open fun getTopLevelEditor(@NotNull p0: Editor): Editor defined in com.intellij.psi.impl.source.tree.injected.InjectedLanguageUtil[JavaMethodDescriptor]

'context' @ [39:73] ==> value-parameter context: (InsertionContext..InsertionContext?) defined in org.jetbrains.kotlin.idea.intentions.ChooseValueExpression.lookupItems.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'editor' @ [39:81] ==> public final val InsertionContext.editor: Editor[MyPropertyDescriptor]

'getTemplateState' @ [40:53] ==> @Nullable public open fun getTemplateState(@NotNull p0: Editor): TemplateState? defined in com.intellij.codeInsight.template.impl.TemplateManagerImpl[JavaMethodDescriptor]

'topLevelEditor' @ [40:70] ==> val topLevelEditor: Editor defined in org.jetbrains.kotlin.idea.intentions.ChooseValueExpression.lookupItems.<anonymous>.<anonymous>[LocalVariableDescriptor]

'templateState' @ [41:17] ==> val templateState: TemplateState? defined in org.jetbrains.kotlin.idea.intentions.ChooseValueExpression.lookupItems.<anonymous>.<anonymous>[LocalVariableDescriptor]

'templateState' @ [42:29] ==> val templateState: TemplateState? defined in org.jetbrains.kotlin.idea.intentions.ChooseValueExpression.lookupItems.<anonymous>.<anonymous>[LocalVariableDescriptor]

'currentVariableRange' @ [42:43] ==> public final val TemplateState.currentVariableRange: TextRange?[MyPropertyDescriptor]

'range' @ [43:21] ==> val range: TextRange? defined in org.jetbrains.kotlin.idea.intentions.ChooseValueExpression.lookupItems.<anonymous>.<anonymous>[LocalVariableDescriptor]

'Suppress' @ [44:21] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'topLevelEditor' @ [45:21] ==> val topLevelEditor: Editor defined in org.jetbrains.kotlin.idea.intentions.ChooseValueExpression.lookupItems.<anonymous>.<anonymous>[LocalVariableDescriptor]

'document' @ [45:36] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'replaceString' @ [45:45] ==> public abstract fun replaceString(p0: Int, p1: Int, @NotNull p2: CharSequence): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'range' @ [45:59] ==> val range: TextRange? defined in org.jetbrains.kotlin.idea.intentions.ChooseValueExpression.lookupItems.<anonymous>.<anonymous>[LocalVariableDescriptor]

'startOffset' @ [45:65] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'range' @ [45:78] ==> val range: TextRange? defined in org.jetbrains.kotlin.idea.intentions.ChooseValueExpression.lookupItems.<anonymous>.<anonymous>[LocalVariableDescriptor]

'endOffset' @ [45:84] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'getResult' @ [45:95] ==> protected abstract fun getResult(element: T): String defined in org.jetbrains.kotlin.idea.intentions.ChooseValueExpression[SimpleFunctionDescriptorImpl]

'item' @ [45:105] ==> value-parameter item: (LookupElement..LookupElement?) defined in org.jetbrains.kotlin.idea.intentions.ChooseValueExpression.lookupItems.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'`object`' @ [45:110] ==> public final val LookupElement.`object`: Any[MyPropertyDescriptor]

'toTypedArray' @ [49:7] ==> public inline fun <reified T> Collection<LookupElement>.toTypedArray(): Array<LookupElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> LookupElement

'if (lookupItems.size > 1) lookupItems else null' @ [51:69] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Array<LookupElement>?, elseBranch: Array<LookupElement>?): Array<LookupElement>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Array<LookupElement>?

'lookupItems' @ [51:73] ==> protected final val lookupItems: Array<LookupElement> defined in org.jetbrains.kotlin.idea.intentions.ChooseValueExpression[PropertyDescriptorImpl]

'size' @ [51:85] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'lookupItems' @ [51:95] ==> protected final val lookupItems: Array<LookupElement> defined in org.jetbrains.kotlin.idea.intentions.ChooseValueExpression[PropertyDescriptorImpl]

'calculateResult' @ [53:69] ==> public open fun calculateResult(context: ExpressionContext): TextResult defined in org.jetbrains.kotlin.idea.intentions.ChooseValueExpression[SimpleFunctionDescriptorImpl]

'context' @ [53:85] ==> value-parameter context: ExpressionContext defined in org.jetbrains.kotlin.idea.intentions.ChooseValueExpression.calculateQuickResult[ValueParameterDescriptorImpl]

'TextResult' @ [55:64] ==> public constructor TextResult(@NotNull p0: String) defined in com.intellij.codeInsight.template.TextResult[JavaClassConstructorDescriptor]

'getLookupString' @ [55:75] ==> protected abstract fun getLookupString(element: T): String defined in org.jetbrains.kotlin.idea.intentions.ChooseValueExpression[SimpleFunctionDescriptorImpl]

'defaultItem' @ [55:91] ==> protected final val defaultItem: T defined in org.jetbrains.kotlin.idea.intentions.ChooseValueExpression[PropertyDescriptorImpl]

'advertisementText' @ [57:41] ==> private final val advertisementText: String? defined in org.jetbrains.kotlin.idea.intentions.ChooseValueExpression[PropertyDescriptorImpl]

'suggestions' @ [62:27] ==> value-parameter suggestions: Collection<String> defined in org.jetbrains.kotlin.idea.intentions.ChooseStringExpression.<init>[ValueParameterDescriptorImpl]

'first' @ [62:39] ==> public fun <T> Iterable<String>.first(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'ChooseValueExpression<String>' @ [64:5] ==> public constructor ChooseValueExpression<T : Any>(lookupItems: Collection<String>, defaultItem: String, advertisementText: String? = ...) defined in org.jetbrains.kotlin.idea.intentions.ChooseValueExpression[ClassConstructorDescriptorImpl]
Inferred types:
    <T : Any> -> String

'suggestions' @ [64:35] ==> value-parameter suggestions: Collection<String> defined in org.jetbrains.kotlin.idea.intentions.ChooseStringExpression.<init>[ValueParameterDescriptorImpl]

'default' @ [64:48] ==> value-parameter default: String = ... defined in org.jetbrains.kotlin.idea.intentions.ChooseStringExpression.<init>[ValueParameterDescriptorImpl]

'advertisementText' @ [64:57] ==> value-parameter advertisementText: String? = ... defined in org.jetbrains.kotlin.idea.intentions.ChooseStringExpression.<init>[ValueParameterDescriptorImpl]

'element' @ [65:53] ==> value-parameter element: String defined in org.jetbrains.kotlin.idea.intentions.ChooseStringExpression.getLookupString[ValueParameterDescriptorImpl]

'element' @ [66:47] ==> value-parameter element: String defined in org.jetbrains.kotlin.idea.intentions.ChooseStringExpression.getResult[ValueParameterDescriptorImpl]

