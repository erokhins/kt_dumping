'KotlinQuickFixAction<KtParameter>' @ [35:5] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtParameter) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtParameter

'element' @ [35:39] ==> value-parameter element: KtParameter defined in org.jetbrains.kotlin.idea.quickfix.MakeConstructorParameterPropertyFix.<init>[ValueParameterDescriptorImpl]

'if (className != null) " in class '$className'" else ""' @ [38:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'className' @ [38:30] ==> value-parameter className: String? defined in org.jetbrains.kotlin.idea.quickfix.MakeConstructorParameterPropertyFix.<init>[ValueParameterDescriptorImpl]

'className' @ [38:62] ==> value-parameter className: String? defined in org.jetbrains.kotlin.idea.quickfix.MakeConstructorParameterPropertyFix.<init>[ValueParameterDescriptorImpl]

'suffix' @ [41:52] ==> private final val suffix: String defined in org.jetbrains.kotlin.idea.quickfix.MakeConstructorParameterPropertyFix[PropertyDescriptorImpl]

'element' @ [44:23] ==> protected final val element: KtParameter? defined in org.jetbrains.kotlin.idea.quickfix.MakeConstructorParameterPropertyFix[PropertyDescriptorImpl]

'super' @ [45:16] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.MakeConstructorParameterPropertyFix[LazyClassReceiverParameterDescriptor]

'isAvailable' @ [45:22] ==> public open fun isAvailable(project: Project, editor: Editor?, file: PsiFile): Boolean defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[SimpleFunctionDescriptorImpl]

'project' @ [45:34] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.MakeConstructorParameterPropertyFix.isAvailable[ValueParameterDescriptorImpl]

'editor' @ [45:43] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.MakeConstructorParameterPropertyFix.isAvailable[ValueParameterDescriptorImpl]

'file' @ [45:51] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.MakeConstructorParameterPropertyFix.isAvailable[ValueParameterDescriptorImpl]

'!' @ [45:60] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [45:61] ==> val element: KtParameter defined in org.jetbrains.kotlin.idea.quickfix.MakeConstructorParameterPropertyFix.isAvailable[LocalVariableDescriptor]

'hasValOrVar' @ [45:69] ==> public open fun hasValOrVar(): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'element' @ [49:23] ==> protected final val element: KtParameter? defined in org.jetbrains.kotlin.idea.quickfix.MakeConstructorParameterPropertyFix[PropertyDescriptorImpl]

'element' @ [50:9] ==> val element: KtParameter defined in org.jetbrains.kotlin.idea.quickfix.MakeConstructorParameterPropertyFix.invoke[LocalVariableDescriptor]

'addBefore' @ [50:17] ==> public open fun addBefore(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'kotlinValVar' @ [50:27] ==> private final val kotlinValVar: KotlinValVar defined in org.jetbrains.kotlin.idea.quickfix.MakeConstructorParameterPropertyFix[PropertyDescriptorImpl]

'createKeyword' @ [50:40] ==> public abstract fun createKeyword(factory: KtPsiFactory): PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinValVar[SimpleFunctionDescriptorImpl]

'KtPsiFactory' @ [50:54] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [50:67] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.MakeConstructorParameterPropertyFix.invoke[ValueParameterDescriptorImpl]

'element' @ [50:80] ==> val element: KtParameter defined in org.jetbrains.kotlin.idea.quickfix.MakeConstructorParameterPropertyFix.invoke[LocalVariableDescriptor]

'firstChild' @ [50:88] ==> public final val KtParameter.firstChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'element' @ [51:9] ==> val element: KtParameter defined in org.jetbrains.kotlin.idea.quickfix.MakeConstructorParameterPropertyFix.invoke[LocalVariableDescriptor]

'addModifier' @ [51:17] ==> public open fun addModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'PRIVATE_KEYWORD' @ [51:38] ==> public final val PRIVATE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'element' @ [52:9] ==> val element: KtParameter defined in org.jetbrains.kotlin.idea.quickfix.MakeConstructorParameterPropertyFix.invoke[LocalVariableDescriptor]

'visibilityModifier' @ [52:17] ==> public fun KtDeclaration.visibilityModifier(): PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'let' @ [52:39] ==> @InlineOnly public inline fun <T, R> PsiElement.let(block: (PsiElement) -> Editor?): Editor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> Editor?

'editor' @ [53:13] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.MakeConstructorParameterPropertyFix.invoke[ValueParameterDescriptorImpl]

'apply' @ [53:21] ==> @InlineOnly public inline fun <T> Editor.apply(block: Editor.() -> Unit): Editor defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Editor

'selectionModel' @ [54:17] ==> public final val Editor.selectionModel: SelectionModel[MyPropertyDescriptor]

'setSelection' @ [54:32] ==> public abstract fun setSelection(p0: Int, p1: Int): Unit defined in com.intellij.openapi.editor.SelectionModel[JavaMethodDescriptor]

'private' @ [54:45] ==> value-parameter private: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.MakeConstructorParameterPropertyFix.invoke.<anonymous>[ValueParameterDescriptorImpl]

'startOffset' @ [54:53] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'private' @ [54:66] ==> value-parameter private: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.MakeConstructorParameterPropertyFix.invoke.<anonymous>[ValueParameterDescriptorImpl]

'endOffset' @ [54:74] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'caretModel' @ [55:17] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'moveToOffset' @ [55:28] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'private' @ [55:41] ==> value-parameter private: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.MakeConstructorParameterPropertyFix.invoke.<anonymous>[ValueParameterDescriptorImpl]

'endOffset' @ [55:49] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'KotlinIntentionActionsFactory' @ [60:32] ==> public constructor KotlinIntentionActionsFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionsFactory[DeserializedClassConstructorDescriptor]

'?:' @ [63:31] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtNameReferenceExpression?, right: KtNameReferenceExpression): KtNameReferenceExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtNameReferenceExpression

'UNRESOLVED_REFERENCE' @ [63:38] ==> public final val UNRESOLVED_REFERENCE: (DiagnosticFactory1<(KtReferenceExpression..KtReferenceExpression?), (KtReferenceExpression..KtReferenceExpression?)>..DiagnosticFactory1<(KtReferenceExpression..KtReferenceExpression?), (KtReferenceExpression..KtReferenceExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'cast' @ [63:59] ==> @NotNull public open fun cast(@NotNull p0: Diagnostic): DiagnosticWithParameters1<(KtReferenceExpression..KtReferenceExpression?), (KtReferenceExpression..KtReferenceExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'diagnostic' @ [63:64] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.MakeConstructorParameterPropertyFix.Factory.doCreateActions[ValueParameterDescriptorImpl]

'a' @ [63:76] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?)> DiagnosticWithParameters1<(KtReferenceExpression..KtReferenceExpression?), (KtReferenceExpression..KtReferenceExpression?)>.a: (KtReferenceExpression..KtReferenceExpression?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtReferenceExpression..org.jetbrains.kotlin.psi.KtReferenceExpression?)
    <A : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtReferenceExpression..org.jetbrains.kotlin.psi.KtReferenceExpression?)

'emptyList' @ [63:118] ==> public fun <T> emptyList(): List<IntentionAction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntentionAction

'if (ktReference.getAssignmentByLHS() != null) KotlinValVar.Var else KotlinValVar.Val' @ [65:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinValVar, elseBranch: KotlinValVar): KotlinValVar[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinValVar

'ktReference' @ [65:32] ==> val ktReference: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.MakeConstructorParameterPropertyFix.Factory.doCreateActions[LocalVariableDescriptor]

'getAssignmentByLHS' @ [65:44] ==> public fun KtExpression.getAssignmentByLHS(): KtBinaryExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'Var' @ [65:87] ==> enum entry Var defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinValVar[FakeCallableDescriptorForObject]

'Val' @ [65:109] ==> enum entry Val defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinValVar[FakeCallableDescriptorForObject]

'ktReference' @ [67:31] ==> val ktReference: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.MakeConstructorParameterPropertyFix.Factory.doCreateActions[LocalVariableDescriptor]

'getPrimaryConstructorParameterWithSameName' @ [67:43] ==> public fun KtNameReferenceExpression.getPrimaryConstructorParameterWithSameName(): KtParameter? defined in org.jetbrains.kotlin.idea.quickfix in file MakeConstructorParameterPropertyFix.kt[SimpleFunctionDescriptorImpl]

'emptyList' @ [67:98] ==> public fun <T> emptyList(): List<IntentionAction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntentionAction

'ktParameter' @ [68:35] ==> val ktParameter: KtParameter defined in org.jetbrains.kotlin.idea.quickfix.MakeConstructorParameterPropertyFix.Factory.doCreateActions[LocalVariableDescriptor]

'containingClass' @ [68:47] ==> public fun KtElement.containingClass(): KtClass? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'if (containingClass != ktReference.containingClass()) containingClass.nameAsSafeName.asString() else null' @ [69:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'containingClass' @ [69:33] ==> val containingClass: KtClass defined in org.jetbrains.kotlin.idea.quickfix.MakeConstructorParameterPropertyFix.Factory.doCreateActions[LocalVariableDescriptor]

'ktReference' @ [69:52] ==> val ktReference: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.MakeConstructorParameterPropertyFix.Factory.doCreateActions[LocalVariableDescriptor]

'containingClass' @ [69:64] ==> public fun KtElement.containingClass(): KtClass? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'containingClass' @ [69:83] ==> val containingClass: KtClass defined in org.jetbrains.kotlin.idea.quickfix.MakeConstructorParameterPropertyFix.Factory.doCreateActions[LocalVariableDescriptor]

'nameAsSafeName' @ [69:99] ==> public final val KtClass.nameAsSafeName: Name[MyPropertyDescriptor]

'asString' @ [69:114] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'listOf' @ [71:20] ==> public fun <T> listOf(element: MakeConstructorParameterPropertyFix): List<MakeConstructorParameterPropertyFix> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MakeConstructorParameterPropertyFix

'MakeConstructorParameterPropertyFix' @ [71:27] ==> public constructor MakeConstructorParameterPropertyFix(element: KtParameter, kotlinValVar: KotlinValVar, className: String?) defined in org.jetbrains.kotlin.idea.quickfix.MakeConstructorParameterPropertyFix[ClassConstructorDescriptorImpl]

'ktParameter' @ [71:63] ==> val ktParameter: KtParameter defined in org.jetbrains.kotlin.idea.quickfix.MakeConstructorParameterPropertyFix.Factory.doCreateActions[LocalVariableDescriptor]

'valOrVar' @ [71:76] ==> val valOrVar: KotlinValVar defined in org.jetbrains.kotlin.idea.quickfix.MakeConstructorParameterPropertyFix.Factory.doCreateActions[LocalVariableDescriptor]

'className' @ [71:86] ==> val className: String? defined in org.jetbrains.kotlin.idea.quickfix.MakeConstructorParameterPropertyFix.Factory.doCreateActions[LocalVariableDescriptor]

'nonStaticOuterClasses' @ [77:12] ==> public fun KtElement.nonStaticOuterClasses(): Sequence<KtClass> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'mapNotNull' @ [78:14] ==> public fun <T, R : Any> Sequence<KtClass>.mapNotNull(transform: (KtClass) -> KtParameter?): Sequence<KtParameter> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClass
    <R : Any> -> KtParameter

'it' @ [78:27] ==> value-parameter it: KtClass defined in org.jetbrains.kotlin.idea.quickfix.getPrimaryConstructorParameterWithSameName.<anonymous>[ValueParameterDescriptorImpl]

'primaryConstructor' @ [78:30] ==> public final val KtClass.primaryConstructor: KtPrimaryConstructor?[MyPropertyDescriptor]

'valueParameters' @ [78:50] ==> public final val KtPrimaryConstructor.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'firstOrNull' @ [78:67] ==> public inline fun <T> Iterable<(KtParameter..KtParameter?)>.firstOrNull(predicate: ((KtParameter..KtParameter?)) -> Boolean): KtParameter? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'it' @ [78:81] ==> value-parameter it: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.quickfix.getPrimaryConstructorParameterWithSameName.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [78:84] ==> public final val KtParameter.name: String?[MyPropertyDescriptor]

'getReferencedName' @ [78:92] ==> public open fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtNameReferenceExpression[DeserializedSimpleFunctionDescriptor]

'firstOrNull' @ [79:14] ==> public fun <T> Sequence<KtParameter>.firstOrNull(): KtParameter? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtParameter

