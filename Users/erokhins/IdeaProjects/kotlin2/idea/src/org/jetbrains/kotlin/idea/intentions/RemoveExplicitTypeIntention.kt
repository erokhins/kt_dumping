'SelfTargetingRangeIntention<KtCallableDeclaration>' @ [28:37] ==> public constructor SelfTargetingRangeIntention<TElement : PsiElement>(elementType: Class<KtCallableDeclaration>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingRangeIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtCallableDeclaration

'java' @ [29:38] ==> public val <T> KClass<KtCallableDeclaration>.java: Class<KtCallableDeclaration> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtCallableDeclaration

'getRange' @ [34:16] ==> public final fun getRange(element: KtCallableDeclaration): TextRange? defined in org.jetbrains.kotlin.idea.intentions.RemoveExplicitTypeIntention.Companion[SimpleFunctionDescriptorImpl]

'element' @ [34:25] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.RemoveExplicitTypeIntention.applicabilityRange[ValueParameterDescriptorImpl]

'element' @ [38:9] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.RemoveExplicitTypeIntention.applyTo[ValueParameterDescriptorImpl]

'typeReference' @ [38:17] ==> public final var KtCallableDeclaration.typeReference: KtTypeReference?[MyPropertyDescriptor]

'element' @ [43:17] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.RemoveExplicitTypeIntention.Companion.getRange[ValueParameterDescriptorImpl]

'containingFile' @ [43:25] ==> public final val KtCallableDeclaration.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'element' @ [44:17] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.RemoveExplicitTypeIntention.Companion.getRange[ValueParameterDescriptorImpl]

'typeReference' @ [44:25] ==> public final var KtCallableDeclaration.typeReference: KtTypeReference?[MyPropertyDescriptor]

'element' @ [46:17] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.RemoveExplicitTypeIntention.Companion.getRange[ValueParameterDescriptorImpl]

'element' @ [46:44] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.RemoveExplicitTypeIntention.Companion.getRange[ValueParameterDescriptorImpl]

'isLoopParameter' @ [46:52] ==> public final val KtParameter.isLoopParameter: Boolean[MyPropertyDescriptor]

'element' @ [46:71] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.RemoveExplicitTypeIntention.Companion.getRange[ValueParameterDescriptorImpl]

'isSetterParameter' @ [46:79] ==> internal val KtParameter.isSetterParameter: Boolean defined in org.jetbrains.kotlin.idea.intentions in file RemoveExplicitTypeIntention.kt[PropertyDescriptorImpl]

'element' @ [47:24] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.RemoveExplicitTypeIntention.Companion.getRange[ValueParameterDescriptorImpl]

'textRange' @ [47:32] ==> public final val KtParameter.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'element' @ [50:32] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.RemoveExplicitTypeIntention.Companion.getRange[ValueParameterDescriptorImpl]

'initializer' @ [50:75] ==> public final val KtDeclarationWithInitializer.initializer: KtExpression?[MyPropertyDescriptor]

'element' @ [51:17] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.RemoveExplicitTypeIntention.Companion.getRange[ValueParameterDescriptorImpl]

'element' @ [51:43] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.RemoveExplicitTypeIntention.Companion.getRange[ValueParameterDescriptorImpl]

'element' @ [52:14] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.RemoveExplicitTypeIntention.Companion.getRange[ValueParameterDescriptorImpl]

'let' @ [52:44] ==> @InlineOnly public inline fun <T, R> KtNamedFunction.let(block: (KtNamedFunction) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedFunction
    <R> -> Unit

'it' @ [53:21] ==> value-parameter it: KtNamedFunction defined in org.jetbrains.kotlin.idea.intentions.RemoveExplicitTypeIntention.Companion.getRange.<anonymous>[ValueParameterDescriptorImpl]

'hasBlockBody' @ [53:24] ==> public open fun hasBlockBody(): Boolean defined in org.jetbrains.kotlin.psi.KtNamedFunction[JavaMethodDescriptor]

'?:' @ [53:42] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Boolean?, right: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Boolean

'element' @ [53:43] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.RemoveExplicitTypeIntention.Companion.getRange[ValueParameterDescriptorImpl]

'descriptor' @ [53:51] ==> public val KtDeclaration.descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.search.usagesSearch[DeserializedPropertyDescriptor]

'returnType' @ [53:87] ==> public final val FunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'isUnit' @ [53:99] ==> public fun KotlinType.isUnit(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'not' @ [53:109] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'when {
                initializer != null -> TextRange(element.startOffset, initializer.startOffset - 1)
                element is KtProperty && element.getter != null -> TextRange(element.startOffset, element.typeReference!!.endOffset)
                element is KtNamedFunction -> TextRange(element.startOffset, element.typeReference!!.endOffset)
                else -> null
            }' @ [56:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: TextRange?, entry1: TextRange?, entry2: TextRange?, entry3: TextRange?): TextRange?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> TextRange?

'initializer' @ [57:17] ==> val initializer: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.RemoveExplicitTypeIntention.Companion.getRange[LocalVariableDescriptor]

'TextRange' @ [57:40] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'element' @ [57:50] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.RemoveExplicitTypeIntention.Companion.getRange[ValueParameterDescriptorImpl]

'startOffset' @ [57:58] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'initializer' @ [57:71] ==> val initializer: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.RemoveExplicitTypeIntention.Companion.getRange[LocalVariableDescriptor]

'startOffset' @ [57:83] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'element' @ [58:17] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.RemoveExplicitTypeIntention.Companion.getRange[ValueParameterDescriptorImpl]

'element' @ [58:42] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.RemoveExplicitTypeIntention.Companion.getRange[ValueParameterDescriptorImpl]

'getter' @ [58:50] ==> public final val KtProperty.getter: KtPropertyAccessor?[MyPropertyDescriptor]

'TextRange' @ [58:68] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'element' @ [58:78] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.RemoveExplicitTypeIntention.Companion.getRange[ValueParameterDescriptorImpl]

'startOffset' @ [58:86] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'element' @ [58:99] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.RemoveExplicitTypeIntention.Companion.getRange[ValueParameterDescriptorImpl]

'typeReference' @ [58:107] ==> public final var KtProperty.typeReference: KtTypeReference?[MyPropertyDescriptor]

'endOffset' @ [58:123] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'element' @ [59:17] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.RemoveExplicitTypeIntention.Companion.getRange[ValueParameterDescriptorImpl]

'TextRange' @ [59:47] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'element' @ [59:57] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.RemoveExplicitTypeIntention.Companion.getRange[ValueParameterDescriptorImpl]

'startOffset' @ [59:65] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'element' @ [59:78] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.RemoveExplicitTypeIntention.Companion.getRange[ValueParameterDescriptorImpl]

'typeReference' @ [59:86] ==> public final var KtNamedFunction.typeReference: KtTypeReference?[MyPropertyDescriptor]

'endOffset' @ [59:102] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'?:' @ [66:61] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Boolean?, right: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Boolean

'parent' @ [66:62] ==> public final val KtParameter.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [66:69] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'isSetter' @ [66:101] ==> public final val KtPropertyAccessor.isSetter: Boolean[MyPropertyDescriptor]

