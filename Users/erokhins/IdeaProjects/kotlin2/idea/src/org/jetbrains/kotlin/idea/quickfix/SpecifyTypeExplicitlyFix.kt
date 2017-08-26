'PsiElementBaseIntentionAction' @ [31:34] ==> public constructor PsiElementBaseIntentionAction() defined in com.intellij.codeInsight.intention.PsiElementBaseIntentionAction[JavaClassConstructorDescriptor]

'!' @ [35:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [35:38] ==> public open fun getInstance(): (FileModificationService..FileModificationService?) defined in com.intellij.codeInsight.FileModificationService[JavaMethodDescriptor]

'preparePsiElementForWrite' @ [35:52] ==> public open fun preparePsiElementForWrite(@Nullable p0: PsiElement?): Boolean defined in com.intellij.codeInsight.FileModificationService[JavaMethodDescriptor]

'element' @ [35:78] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.SpecifyTypeExplicitlyFix.invoke[ValueParameterDescriptorImpl]

'declarationByElement' @ [37:27] ==> private final fun declarationByElement(element: PsiElement): KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.quickfix.SpecifyTypeExplicitlyFix[SimpleFunctionDescriptorImpl]

'element' @ [37:48] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.SpecifyTypeExplicitlyFix.invoke[ValueParameterDescriptorImpl]

'SpecifyTypeExplicitlyIntention' @ [38:20] ==> public companion object defined in org.jetbrains.kotlin.idea.intentions.SpecifyTypeExplicitlyIntention[FakeCallableDescriptorForObject]

'getTypeForDeclaration' @ [38:51] ==> public final fun getTypeForDeclaration(declaration: KtCallableDeclaration): KotlinType defined in org.jetbrains.kotlin.idea.intentions.SpecifyTypeExplicitlyIntention.Companion[SimpleFunctionDescriptorImpl]

'declaration' @ [38:73] ==> val declaration: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.quickfix.SpecifyTypeExplicitlyFix.invoke[LocalVariableDescriptor]

'SpecifyTypeExplicitlyIntention' @ [39:9] ==> public companion object defined in org.jetbrains.kotlin.idea.intentions.SpecifyTypeExplicitlyIntention[FakeCallableDescriptorForObject]

'addTypeAnnotation' @ [39:40] ==> public final fun addTypeAnnotation(editor: Editor?, declaration: KtCallableDeclaration, exprType: KotlinType): Unit defined in org.jetbrains.kotlin.idea.intentions.SpecifyTypeExplicitlyIntention.Companion[SimpleFunctionDescriptorImpl]

'editor' @ [39:58] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.quickfix.SpecifyTypeExplicitlyFix.invoke[ValueParameterDescriptorImpl]

'declaration' @ [39:66] ==> val declaration: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.quickfix.SpecifyTypeExplicitlyFix.invoke[LocalVariableDescriptor]

'type' @ [39:79] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.SpecifyTypeExplicitlyFix.invoke[LocalVariableDescriptor]

'declarationByElement' @ [43:27] ==> private final fun declarationByElement(element: PsiElement): KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.quickfix.SpecifyTypeExplicitlyFix[SimpleFunctionDescriptorImpl]

'element' @ [43:48] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.SpecifyTypeExplicitlyFix.isAvailable[ValueParameterDescriptorImpl]

'text' @ [44:9] ==> public final var SpecifyTypeExplicitlyFix.text: String[MyPropertyDescriptor]

'when (declaration) {
            is KtProperty -> "Specify type explicitly"
            is KtNamedFunction -> "Specify return type explicitly"
            else -> return false
        }' @ [44:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'declaration' @ [44:22] ==> val declaration: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.quickfix.SpecifyTypeExplicitlyFix.isAvailable[LocalVariableDescriptor]

'!' @ [50:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'SpecifyTypeExplicitlyIntention' @ [50:17] ==> public companion object defined in org.jetbrains.kotlin.idea.intentions.SpecifyTypeExplicitlyIntention[FakeCallableDescriptorForObject]

'getTypeForDeclaration' @ [50:48] ==> public final fun getTypeForDeclaration(declaration: KtCallableDeclaration): KotlinType defined in org.jetbrains.kotlin.idea.intentions.SpecifyTypeExplicitlyIntention.Companion[SimpleFunctionDescriptorImpl]

'declaration' @ [50:70] ==> val declaration: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.quickfix.SpecifyTypeExplicitlyFix.isAvailable[LocalVariableDescriptor]

'isError' @ [50:83] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'getParentOfType' @ [54:28] ==> @SafeVarargs @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull vararg p1: (Class<out (PsiElement..PsiElement?)>..Class<out (PsiElement..PsiElement?)>?)): PsiElement? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'element' @ [54:44] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.SpecifyTypeExplicitlyFix.declarationByElement[ValueParameterDescriptorImpl]

'java' @ [54:71] ==> public val <T> KClass<KtProperty>.java: Class<KtProperty> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtProperty

'java' @ [54:100] ==> public val <T> KClass<KtNamedFunction>.java: Class<KtNamedFunction> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtNamedFunction

