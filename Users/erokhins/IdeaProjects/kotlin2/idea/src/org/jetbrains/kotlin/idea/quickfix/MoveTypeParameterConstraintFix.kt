'KotlinQuickFixAction<KtTypeParameter>' @ [27:66] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtTypeParameter) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtTypeParameter

'element' @ [27:104] ==> value-parameter element: KtTypeParameter defined in org.jetbrains.kotlin.idea.quickfix.MoveTypeParameterConstraintFix.<init>[ValueParameterDescriptorImpl]

'text' @ [29:44] ==> public final val MoveTypeParameterConstraintFix.text: String[MyPropertyDescriptor]

'element' @ [32:23] ==> protected final val element: KtTypeParameter? defined in org.jetbrains.kotlin.idea.quickfix.MoveTypeParameterConstraintFix[PropertyDescriptorImpl]

'element' @ [33:33] ==> val element: KtTypeParameter defined in org.jetbrains.kotlin.idea.quickfix.MoveTypeParameterConstraintFix.invoke[LocalVariableDescriptor]

'nameAsName' @ [33:41] ==> public final val KtTypeParameter.nameAsName: Name?[MyPropertyDescriptor]

'KtPsiFactory' @ [34:26] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'file' @ [34:39] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.quickfix.MoveTypeParameterConstraintFix.invoke[ValueParameterDescriptorImpl]

'psiFactory' @ [35:29] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.MoveTypeParameterConstraintFix.invoke[LocalVariableDescriptor]

'buildDeclaration' @ [35:40] ==> public fun KtPsiFactory.buildDeclaration(build: BuilderByPattern<KtDeclaration>.() -> Unit): KtDeclaration defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'appendFixedText' @ [36:13] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtDeclaration> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'appendName' @ [37:13] ==> public final fun appendName(name: Name): BuilderByPattern<KtDeclaration> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'typeParameterName' @ [37:24] ==> val typeParameterName: Name defined in org.jetbrains.kotlin.idea.quickfix.MoveTypeParameterConstraintFix.invoke[LocalVariableDescriptor]

'appendFixedText' @ [38:13] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtDeclaration> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'appendName' @ [39:13] ==> public final fun appendName(name: Name): BuilderByPattern<KtDeclaration> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'typeParameterName' @ [39:24] ==> val typeParameterName: Name defined in org.jetbrains.kotlin.idea.quickfix.MoveTypeParameterConstraintFix.invoke[LocalVariableDescriptor]

'appendFixedText' @ [40:13] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtDeclaration> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'appendTypeReference' @ [41:13] ==> public final fun appendTypeReference(typeRef: KtTypeReference?): BuilderByPattern<KtDeclaration> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'element' @ [41:33] ==> val element: KtTypeParameter defined in org.jetbrains.kotlin.idea.quickfix.MoveTypeParameterConstraintFix.invoke[LocalVariableDescriptor]

'extendsBound' @ [41:41] ==> public final var KtTypeParameter.extendsBound: KtTypeReference?[MyPropertyDescriptor]

'templateClass' @ [43:38] ==> val templateClass: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.quickfix.MoveTypeParameterConstraintFix.invoke[LocalVariableDescriptor]

'typeConstraintList' @ [43:52] ==> public final val KtTypeParameterListOwner.typeConstraintList: KtTypeConstraintList?[MyPropertyDescriptor]

'element' @ [45:27] ==> val element: KtTypeParameter defined in org.jetbrains.kotlin.idea.quickfix.MoveTypeParameterConstraintFix.invoke[LocalVariableDescriptor]

'getStrictParentOfType' @ [45:35] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtTypeParameterListOwner? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtTypeParameterListOwner

'declaration' @ [46:30] ==> val declaration: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.quickfix.MoveTypeParameterConstraintFix.invoke[LocalVariableDescriptor]

'typeConstraintList' @ [46:42] ==> public final val KtTypeParameterListOwner.typeConstraintList: KtTypeConstraintList?[MyPropertyDescriptor]

'constraintList' @ [47:9] ==> val constraintList: KtTypeConstraintList defined in org.jetbrains.kotlin.idea.quickfix.MoveTypeParameterConstraintFix.invoke[LocalVariableDescriptor]

'addAfter' @ [47:24] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtTypeConstraintList[JavaMethodDescriptor]

'psiFactory' @ [47:33] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.MoveTypeParameterConstraintFix.invoke[LocalVariableDescriptor]

'createComma' @ [47:44] ==> public final fun createComma(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'constraintList' @ [48:9] ==> val constraintList: KtTypeConstraintList defined in org.jetbrains.kotlin.idea.quickfix.MoveTypeParameterConstraintFix.invoke[LocalVariableDescriptor]

'addAfter' @ [48:24] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtTypeConstraintList[JavaMethodDescriptor]

'templateConstraintList' @ [48:33] ==> val templateConstraintList: KtTypeConstraintList defined in org.jetbrains.kotlin.idea.quickfix.MoveTypeParameterConstraintFix.invoke[LocalVariableDescriptor]

'constraints' @ [48:56] ==> public final val KtTypeConstraintList.constraints: (MutableList<(KtTypeConstraint..KtTypeConstraint?)>..List<(KtTypeConstraint..KtTypeConstraint?)>)[MyPropertyDescriptor]

'element' @ [50:9] ==> val element: KtTypeParameter defined in org.jetbrains.kotlin.idea.quickfix.MoveTypeParameterConstraintFix.invoke[LocalVariableDescriptor]

'extendsBound' @ [50:17] ==> public final var KtTypeParameter.extendsBound: KtTypeReference?[MyPropertyDescriptor]

'delete' @ [50:31] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtTypeReference[JavaMethodDescriptor]

'element' @ [51:21] ==> val element: KtTypeParameter defined in org.jetbrains.kotlin.idea.quickfix.MoveTypeParameterConstraintFix.invoke[LocalVariableDescriptor]

'node' @ [51:29] ==> public final var KtTypeParameter.node: ASTNode[MyPropertyDescriptor]

'findChildByType' @ [51:34] ==> @Nullable public abstract fun findChildByType(p0: (IElementType..IElementType?)): ASTNode? defined in com.intellij.lang.ASTNode[JavaMethodDescriptor]

'COLON' @ [51:59] ==> public final val COLON: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'colon' @ [52:9] ==> val colon: ASTNode? defined in org.jetbrains.kotlin.idea.quickfix.MoveTypeParameterConstraintFix.invoke[LocalVariableDescriptor]

'psi' @ [52:16] ==> public final val ASTNode.psi: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'delete' @ [52:21] ==> public abstract fun delete(): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'KotlinSingleIntentionActionFactory' @ [55:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [57:33] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.MoveTypeParameterConstraintFix.Companion.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [57:44] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'MoveTypeParameterConstraintFix' @ [58:20] ==> public constructor MoveTypeParameterConstraintFix(element: KtTypeParameter) defined in org.jetbrains.kotlin.idea.quickfix.MoveTypeParameterConstraintFix[ClassConstructorDescriptorImpl]

'typeParameter' @ [58:51] ==> val typeParameter: KtTypeParameter defined in org.jetbrains.kotlin.idea.quickfix.MoveTypeParameterConstraintFix.Companion.createAction[LocalVariableDescriptor]

