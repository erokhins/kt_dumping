'SelfTargetingIntention<KtBinaryExpression>' @ [23:38] ==> public constructor SelfTargetingIntention<TElement : PsiElement>(elementType: Class<KtBinaryExpression>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtBinaryExpression

'KtBinaryExpression' @ [23:81] ==> public constructor KtBinaryExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtBinaryExpression[JavaClassConstructorDescriptor]

'java' @ [23:107] ==> public val <T> KClass<KtBinaryExpression>.java: Class<KtBinaryExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtBinaryExpression

'element' @ [25:13] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.InfixCallToOrdinaryIntention.isApplicableTo[ValueParameterDescriptorImpl]

'operationToken' @ [25:21] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'IDENTIFIER' @ [25:48] ==> public final val IDENTIFIER: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'element' @ [25:62] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.InfixCallToOrdinaryIntention.isApplicableTo[ValueParameterDescriptorImpl]

'left' @ [25:70] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'element' @ [25:86] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.InfixCallToOrdinaryIntention.isApplicableTo[ValueParameterDescriptorImpl]

'right' @ [25:94] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'element' @ [26:16] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.InfixCallToOrdinaryIntention.isApplicableTo[ValueParameterDescriptorImpl]

'operationReference' @ [26:24] ==> public final val KtBinaryExpression.operationReference: KtOperationReferenceExpression[MyPropertyDescriptor]

'textRange' @ [26:43] ==> public final val KtOperationReferenceExpression.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'containsOffset' @ [26:53] ==> public open fun containsOffset(p0: Int): Boolean defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'caretOffset' @ [26:68] ==> value-parameter caretOffset: Int defined in org.jetbrains.kotlin.idea.intentions.InfixCallToOrdinaryIntention.isApplicableTo[ValueParameterDescriptorImpl]

'convert' @ [30:9] ==> public final fun convert(element: KtBinaryExpression): KtExpression defined in org.jetbrains.kotlin.idea.intentions.InfixCallToOrdinaryIntention.Companion[SimpleFunctionDescriptorImpl]

'element' @ [30:17] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.InfixCallToOrdinaryIntention.applyTo[ValueParameterDescriptorImpl]

'safeDeparenthesize' @ [35:38] ==> @NotNull public open fun safeDeparenthesize(@NotNull p0: KtExpression): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'element' @ [35:57] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.InfixCallToOrdinaryIntention.Companion.convert[ValueParameterDescriptorImpl]

'right' @ [35:65] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'+' @ [36:27] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'when (argument) {
                is KtLambdaExpression -> " $2:'{}'"
                else -> "($2)"
            }' @ [36:37] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'argument' @ [36:43] ==> val argument: KtExpression defined in org.jetbrains.kotlin.idea.intentions.InfixCallToOrdinaryIntention.Companion.convert[LocalVariableDescriptor]

'KtPsiFactory' @ [40:31] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [40:44] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.InfixCallToOrdinaryIntention.Companion.convert[ValueParameterDescriptorImpl]

'createExpressionByPattern' @ [40:53] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'pattern' @ [40:79] ==> val pattern: String defined in org.jetbrains.kotlin.idea.intentions.InfixCallToOrdinaryIntention.Companion.convert[LocalVariableDescriptor]

'element' @ [40:88] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.InfixCallToOrdinaryIntention.Companion.convert[ValueParameterDescriptorImpl]

'left' @ [40:96] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'element' @ [40:104] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.InfixCallToOrdinaryIntention.Companion.convert[ValueParameterDescriptorImpl]

'operationReference' @ [40:112] ==> public final val KtBinaryExpression.operationReference: KtOperationReferenceExpression[MyPropertyDescriptor]

'text' @ [40:131] ==> public final val KtOperationReferenceExpression.text: (String..String?)[MyPropertyDescriptor]

'argument' @ [40:137] ==> val argument: KtExpression defined in org.jetbrains.kotlin.idea.intentions.InfixCallToOrdinaryIntention.Companion.convert[LocalVariableDescriptor]

'element' @ [41:20] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.InfixCallToOrdinaryIntention.Companion.convert[ValueParameterDescriptorImpl]

'replace' @ [41:28] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtBinaryExpression[DeserializedSimpleFunctionDescriptor]

'replacement' @ [41:36] ==> val replacement: KtExpression defined in org.jetbrains.kotlin.idea.intentions.InfixCallToOrdinaryIntention.Companion.convert[LocalVariableDescriptor]

