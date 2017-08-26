'AbstractInplaceIntroducer<D, KtExpression>' @ [43:4] ==> public constructor AbstractInplaceIntroducer<V : (PsiNameIdentifierOwner..PsiNameIdentifierOwner?), E : (PsiElement..PsiElement?)>(p0: (Project..Project?), p1: (Editor..Editor?), @Nullable p2: KtExpression?, @Nullable p3: D?, p4: (Array<(KtExpression..KtExpression?)>..Array<out (KtExpression..KtExpression?)>?), p5: (String..String?), p6: (FileType..FileType?)) defined in com.intellij.refactoring.introduce.inplace.AbstractInplaceIntroducer[JavaClassConstructorDescriptor]
Inferred types:
    <V : (PsiNameIdentifierOwner..PsiNameIdentifierOwner?)> -> D
    <E : (PsiElement..PsiElement?)> -> KtExpression

'project' @ [43:47] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractKotlinInplaceIntroducer.<init>[ValueParameterDescriptorImpl]

'editor' @ [43:56] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractKotlinInplaceIntroducer.<init>[ValueParameterDescriptorImpl]

'expression' @ [43:64] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractKotlinInplaceIntroducer.<init>[ValueParameterDescriptorImpl]

'localVariable' @ [43:76] ==> value-parameter localVariable: D? defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractKotlinInplaceIntroducer.<init>[ValueParameterDescriptorImpl]

'occurrences' @ [43:91] ==> value-parameter occurrences: Array<KtExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractKotlinInplaceIntroducer.<init>[ValueParameterDescriptorImpl]

'title' @ [43:104] ==> value-parameter title: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractKotlinInplaceIntroducer.<init>[ValueParameterDescriptorImpl]

'INSTANCE' @ [43:126] ==> public final val INSTANCE: (KotlinFileType..KotlinFileType?) defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

'myWholePanel' @ [45:9] ==> protected/*protected and package*/ final val myWholePanel: (JPanel..JPanel?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractKotlinInplaceIntroducer[JavaPropertyDescriptor]

'layout' @ [45:22] ==> public final var JPanel.layout: (LayoutManager..LayoutManager?)[MyPropertyDescriptor]

'BorderLayout' @ [45:31] ==> public constructor BorderLayout() defined in java.awt.BorderLayout[JavaClassConstructorDescriptor]

'with' @ [47:9] ==> @InlineOnly public inline fun <T, R> with(receiver: (FormBuilder..FormBuilder?), block: (FormBuilder..FormBuilder?).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.util.ui.FormBuilder..com.intellij.util.ui.FormBuilder?)
    <R> -> Unit

'createFormBuilder' @ [47:26] ==> public open fun createFormBuilder(): (FormBuilder..FormBuilder?) defined in com.intellij.util.ui.FormBuilder[JavaMethodDescriptor]

'invoke' @ [48:13] ==> public abstract operator fun FormBuilder.invoke(): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'myWholePanel' @ [49:13] ==> protected/*protected and package*/ final val myWholePanel: (JPanel..JPanel?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractKotlinInplaceIntroducer[JavaPropertyDescriptor]

'add' @ [49:26] ==> public open fun add(p0: (Component..Component?), p1: (Any..Any?)): Unit defined in javax.swing.JPanel[JavaMethodDescriptor]

'panel' @ [49:30] ==> public final val FormBuilder.panel: (JPanel..JPanel?)[MyPropertyDescriptor]

'CENTER' @ [49:50] ==> public const final val CENTER: String defined in java.awt.BorderLayout[JavaPropertyDescriptor]

'myEditor' @ [54:9] ==> protected/*protected and package*/ final val myEditor: (Editor..Editor?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractKotlinInplaceIntroducer[JavaPropertyDescriptor]

'putUserData' @ [54:18] ==> public abstract fun <T : (Any..Any?)> putUserData(@NotNull p0: Key<(Boolean..Boolean?)>, @Nullable p1: Boolean?): Unit defined in com.intellij.openapi.editor.Editor[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Boolean..kotlin.Boolean?)

'INTRODUCE_RESTART' @ [54:49] ==> public final val INTRODUCE_RESTART: (Key<(Boolean..Boolean?)>..Key<(Boolean..Boolean?)>?) defined in com.intellij.refactoring.rename.inplace.InplaceRefactoring[JavaPropertyDescriptor]

'stopIntroduce' @ [56:13] ==> public open fun stopIntroduce(p0: (Editor..Editor?)): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractKotlinInplaceIntroducer[JavaMethodDescriptor]

'myEditor' @ [56:27] ==> protected/*protected and package*/ final val myEditor: (Editor..Editor?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractKotlinInplaceIntroducer[JavaPropertyDescriptor]

'myProject' @ [57:13] ==> protected/*protected and package*/ final val myProject: (Project..Project?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractKotlinInplaceIntroducer[JavaPropertyDescriptor]

'executeWriteCommand' @ [57:23] ==> public fun <T> Project.executeWriteCommand(name: String, groupId: Any? = ..., command: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'commandName' @ [57:43] ==> protected/*protected and package*/ for synthetic extension final val <D : KtNamedDeclaration> AbstractKotlinInplaceIntroducer<D>.commandName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <D : KtNamedDeclaration> -> D

'commandName' @ [57:56] ==> protected/*protected and package*/ for synthetic extension final val <D : KtNamedDeclaration> AbstractKotlinInplaceIntroducer<D>.commandName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <D : KtNamedDeclaration> -> D

'action' @ [57:69] ==> value-parameter action: () -> Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractKotlinInplaceIntroducer.runWriteCommandAndRestart[ValueParameterDescriptorImpl]

'myExprMarker' @ [59:13] ==> protected/*protected and package*/ final var myExprMarker: (RangeMarker..RangeMarker?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractKotlinInplaceIntroducer[JavaPropertyDescriptor]

'myExpr' @ [59:28] ==> protected/*protected and package*/ final var myExpr: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractKotlinInplaceIntroducer[JavaPropertyDescriptor]

'let' @ [59:36] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> (RangeMarker..RangeMarker?)): (RangeMarker..RangeMarker?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> (com.intellij.openapi.editor.RangeMarker..com.intellij.openapi.editor.RangeMarker?)

'createMarker' @ [59:42] ==> protected/*protected and package*/ open fun createMarker(p0: (PsiElement..PsiElement?)): (RangeMarker..RangeMarker?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractKotlinInplaceIntroducer[JavaMethodDescriptor]

'it' @ [59:55] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractKotlinInplaceIntroducer.runWriteCommandAndRestart.<anonymous>[ValueParameterDescriptorImpl]

'startInplaceIntroduceTemplate' @ [60:13] ==> public open fun startInplaceIntroduceTemplate(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractKotlinInplaceIntroducer[JavaMethodDescriptor]

'myEditor' @ [63:13] ==> protected/*protected and package*/ final val myEditor: (Editor..Editor?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractKotlinInplaceIntroducer[JavaPropertyDescriptor]

'putUserData' @ [63:22] ==> public abstract fun <T : (Any..Any?)> putUserData(@NotNull p0: Key<(Boolean..Boolean?)>, @Nullable p1: Boolean?): Unit defined in com.intellij.openapi.editor.Editor[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Boolean..kotlin.Boolean?)

'INTRODUCE_RESTART' @ [63:53] ==> public final val INTRODUCE_RESTART: (Key<(Boolean..Boolean?)>..Key<(Boolean..Boolean?)>?) defined in com.intellij.refactoring.rename.inplace.InplaceRefactoring[JavaPropertyDescriptor]

'inputName' @ [68:27] ==> public final val <D : KtNamedDeclaration> AbstractKotlinInplaceIntroducer<D>.inputName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <D : KtNamedDeclaration> -> D

'quoteIfNeeded' @ [68:37] ==> public fun String.quoteIfNeeded(): String defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'KotlinNameSuggester' @ [69:13] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'isIdentifier' @ [69:33] ==> public final fun isIdentifier(name: String?): Boolean defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'currentName' @ [69:46] ==> val currentName: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractKotlinInplaceIntroducer.updateVariableName[LocalVariableDescriptor]

'localVariable' @ [70:13] ==> public final val <D : KtNamedDeclaration> AbstractKotlinInplaceIntroducer<D>.localVariable: (D..D?)[MyPropertyDescriptor]
Inferred types:
    <D : KtNamedDeclaration> -> D

'setName' @ [70:27] ==> public abstract fun setName(@NotNull p0: String): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'currentName' @ [70:35] ==> val currentName: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractKotlinInplaceIntroducer.updateVariableName[LocalVariableDescriptor]

'exprText' @ [82:13] ==> value-parameter exprText: String? defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractKotlinInplaceIntroducer.restoreExpression[ValueParameterDescriptorImpl]

'!' @ [82:33] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'declaration' @ [82:34] ==> value-parameter declaration: D defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractKotlinInplaceIntroducer.restoreExpression[ValueParameterDescriptorImpl]

'isValid' @ [82:46] ==> public final val KtNamedDeclaration.isValid: Boolean[MyPropertyDescriptor]

'containingFile' @ [84:20] ==> value-parameter containingFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractKotlinInplaceIntroducer.restoreExpression[ValueParameterDescriptorImpl]

'findElementAt' @ [84:35] ==> @Nullable @Contract public abstract fun findElementAt(p0: Int): PsiElement? defined in com.intellij.psi.PsiFile[JavaMethodDescriptor]

'marker' @ [84:49] ==> value-parameter marker: RangeMarker defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractKotlinInplaceIntroducer.restoreExpression[ValueParameterDescriptorImpl]

'startOffset' @ [84:56] ==> public final val RangeMarker.startOffset: Int[MyPropertyDescriptor]

'leaf' @ [86:9] ==> val leaf: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractKotlinInplaceIntroducer.restoreExpression[LocalVariableDescriptor]

'getParentOfTypeAndBranch' @ [86:14] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtProperty.() -> PsiElement?): KtProperty? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtProperty

'nameIdentifier' @ [86:53] ==> public final val KtProperty.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'let' @ [86:71] ==> @InlineOnly public inline fun <T, R> KtProperty.let(block: (KtProperty) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtProperty
    <R> -> Nothing

'it' @ [87:20] ==> value-parameter it: KtProperty defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractKotlinInplaceIntroducer.restoreExpression.<anonymous>[ValueParameterDescriptorImpl]

'replaced' @ [87:23] ==> public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtExpression): KtExpression defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'KtPsiFactory' @ [87:32] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'myProject' @ [87:45] ==> protected/*protected and package*/ final val myProject: (Project..Project?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractKotlinInplaceIntroducer[JavaPropertyDescriptor]

'createDeclaration' @ [87:56] ==> public final fun <TDeclaration : KtDeclaration> createDeclaration(text: String): KtDeclaration defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <TDeclaration : KtDeclaration> -> KtDeclaration

'exprText' @ [87:74] ==> value-parameter exprText: String? defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractKotlinInplaceIntroducer.restoreExpression[ValueParameterDescriptorImpl]

'?:' @ [90:34] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> String

'myExpr' @ [90:35] ==> protected/*protected and package*/ final var myExpr: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractKotlinInplaceIntroducer[JavaPropertyDescriptor]

'name' @ [90:59] ==> public final val KtProperty.name: String?[MyPropertyDescriptor]

'exprText' @ [90:67] ==> value-parameter exprText: String? defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractKotlinInplaceIntroducer.restoreExpression[ValueParameterDescriptorImpl]

'leaf' @ [91:16] ==> val leaf: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractKotlinInplaceIntroducer.restoreExpression[LocalVariableDescriptor]

'getNonStrictParentOfType' @ [92:18] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtSimpleNameExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtSimpleNameExpression

'replaced' @ [93:19] ==> public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtExpression): KtExpression defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'KtPsiFactory' @ [93:28] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'myProject' @ [93:41] ==> protected/*protected and package*/ final val myProject: (Project..Project?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractKotlinInplaceIntroducer[JavaPropertyDescriptor]

'createExpression' @ [93:52] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'occurrenceExprText' @ [93:69] ==> val occurrenceExprText: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractKotlinInplaceIntroducer.restoreExpression[LocalVariableDescriptor]

'updateTitle' @ [96:49] ==> protected/*protected and package*/ open fun updateTitle(@Nullable p0: D?, p1: (String..String?)): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractKotlinInplaceIntroducer[JavaMethodDescriptor]

'declaration' @ [96:61] ==> value-parameter declaration: D? defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractKotlinInplaceIntroducer.updateTitle[ValueParameterDescriptorImpl]

