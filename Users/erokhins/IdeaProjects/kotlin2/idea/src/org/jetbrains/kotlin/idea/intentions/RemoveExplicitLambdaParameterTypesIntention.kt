'SelfTargetingIntention<KtLambdaExpression>' @ [24:53] ==> public constructor SelfTargetingIntention<TElement : PsiElement>(elementType: Class<KtLambdaExpression>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtLambdaExpression

'KtLambdaExpression' @ [24:96] ==> public constructor KtLambdaExpression(p0: (CharSequence..CharSequence?)) defined in org.jetbrains.kotlin.psi.KtLambdaExpression[JavaClassConstructorDescriptor]

'java' @ [24:122] ==> public val <T> KClass<KtLambdaExpression>.java: Class<KtLambdaExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtLambdaExpression

'element' @ [26:13] ==> value-parameter element: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.RemoveExplicitLambdaParameterTypesIntention.isApplicableTo[ValueParameterDescriptorImpl]

'valueParameters' @ [26:21] ==> public final val KtLambdaExpression.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'none' @ [26:37] ==> public inline fun <T> Iterable<(KtParameter..KtParameter?)>.none(predicate: ((KtParameter..KtParameter?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'it' @ [26:44] ==> value-parameter it: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.intentions.RemoveExplicitLambdaParameterTypesIntention.isApplicableTo.<anonymous>[ValueParameterDescriptorImpl]

'typeReference' @ [26:47] ==> public final var KtParameter.typeReference: KtTypeReference?[MyPropertyDescriptor]

'element' @ [27:21] ==> value-parameter element: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.RemoveExplicitLambdaParameterTypesIntention.isApplicableTo[ValueParameterDescriptorImpl]

'functionLiteral' @ [27:29] ==> public final val KtLambdaExpression.functionLiteral: KtFunctionLiteral[MyPropertyDescriptor]

'arrow' @ [27:45] ==> public final val KtFunctionLiteral.arrow: PsiElement?[MyPropertyDescriptor]

'caretOffset' @ [28:16] ==> value-parameter caretOffset: Int defined in org.jetbrains.kotlin.idea.intentions.RemoveExplicitLambdaParameterTypesIntention.isApplicableTo[ValueParameterDescriptorImpl]

'arrow' @ [28:31] ==> val arrow: PsiElement defined in org.jetbrains.kotlin.idea.intentions.RemoveExplicitLambdaParameterTypesIntention.isApplicableTo[LocalVariableDescriptor]

'endOffset' @ [28:37] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'element' @ [32:32] ==> value-parameter element: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.RemoveExplicitLambdaParameterTypesIntention.applyTo[ValueParameterDescriptorImpl]

'functionLiteral' @ [32:40] ==> public final val KtLambdaExpression.functionLiteral: KtFunctionLiteral[MyPropertyDescriptor]

'valueParameterList' @ [32:56] ==> public final val KtFunctionLiteral.valueParameterList: KtParameterList?[MyPropertyDescriptor]

'oldParameterList' @ [34:31] ==> val oldParameterList: KtParameterList defined in org.jetbrains.kotlin.idea.intentions.RemoveExplicitLambdaParameterTypesIntention.applyTo[LocalVariableDescriptor]

'parameters' @ [34:48] ==> public final val KtParameterList.parameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'map' @ [34:59] ==> public inline fun <T, R> Iterable<(KtParameter..KtParameter?)>.map(transform: ((KtParameter..KtParameter?)) -> String?): List<String?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)
    <R> -> String?

'it' @ [35:13] ==> value-parameter it: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.intentions.RemoveExplicitLambdaParameterTypesIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'destructuringDeclaration' @ [35:16] ==> public final val KtParameter.destructuringDeclaration: KtDestructuringDeclaration?[MyPropertyDescriptor]

'text' @ [35:42] ==> public final val KtDestructuringDeclaration.text: (String..String?)[MyPropertyDescriptor]

'it' @ [35:50] ==> value-parameter it: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.intentions.RemoveExplicitLambdaParameterTypesIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [35:53] ==> public final val KtParameter.name: String?[MyPropertyDescriptor]

'joinToString' @ [36:11] ==> public fun <T> Iterable<String?>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String?) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?

'KtPsiFactory' @ [37:32] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [37:45] ==> value-parameter element: KtLambdaExpression defined in org.jetbrains.kotlin.idea.intentions.RemoveExplicitLambdaParameterTypesIntention.applyTo[ValueParameterDescriptorImpl]

'createLambdaParameterList' @ [37:54] ==> public final fun createLambdaParameterList(text: String): KtParameterList defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'parameterString' @ [37:80] ==> val parameterString: String defined in org.jetbrains.kotlin.idea.intentions.RemoveExplicitLambdaParameterTypesIntention.applyTo[LocalVariableDescriptor]

'oldParameterList' @ [38:9] ==> val oldParameterList: KtParameterList defined in org.jetbrains.kotlin.idea.intentions.RemoveExplicitLambdaParameterTypesIntention.applyTo[LocalVariableDescriptor]

'replace' @ [38:26] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtParameterList[JavaMethodDescriptor]

'newParameterList' @ [38:34] ==> val newParameterList: KtParameterList defined in org.jetbrains.kotlin.idea.intentions.RemoveExplicitLambdaParameterTypesIntention.applyTo[LocalVariableDescriptor]

