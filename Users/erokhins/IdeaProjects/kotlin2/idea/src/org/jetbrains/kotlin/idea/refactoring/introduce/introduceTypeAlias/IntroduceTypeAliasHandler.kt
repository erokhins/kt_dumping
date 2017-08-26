'JvmField' @ [45:9] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'KotlinIntroduceTypeAliasHandler' @ [48:24] ==> public constructor KotlinIntroduceTypeAliasHandler() defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler[ClassConstructorDescriptorImpl]

'selectElementsWithTargetSibling' @ [52:9] ==> public fun selectElementsWithTargetSibling(operationName: String, editor: Editor, file: KtFile, title: String, elementKinds: Collection<CodeInsightUtils.ElementKind>, getContainers: (elements: List<PsiElement>, commonParent: PsiElement) -> List<PsiElement>, continuation: (elements: List<PsiElement>, targetSibling: PsiElement) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce in file introduceUtil.kt[SimpleFunctionDescriptorImpl]

'REFACTORING_NAME' @ [53:17] ==> @JvmField public final val REFACTORING_NAME: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.Companion[PropertyDescriptorImpl]

'editor' @ [54:17] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.selectElements[ValueParameterDescriptorImpl]

'file' @ [55:17] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.selectElements[ValueParameterDescriptorImpl]

'listOf' @ [57:17] ==> public fun <T> listOf(vararg elements: CodeInsightUtils.ElementKind): List<CodeInsightUtils.ElementKind> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ElementKind

'TYPE_ELEMENT' @ [57:24] ==> enum entry TYPE_ELEMENT defined in org.jetbrains.kotlin.idea.codeInsight.CodeInsightUtils.ElementKind[FakeCallableDescriptorForObject]

'TYPE_CONSTRUCTOR' @ [57:38] ==> enum entry TYPE_CONSTRUCTOR defined in org.jetbrains.kotlin.idea.codeInsight.CodeInsightUtils.ElementKind[FakeCallableDescriptorForObject]

'listOf' @ [58:32] ==> public fun <T> listOf(element: (PsiFile..PsiFile?)): List<(PsiFile..PsiFile?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiFile..com.intellij.psi.PsiFile?)

'parent' @ [58:39] ==> value-parameter parent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.selectElements.<anonymous>[ValueParameterDescriptorImpl]

'containingFile' @ [58:46] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'continuation' @ [59:17] ==> value-parameter continuation: (elements: List<PsiElement>, targetSibling: PsiElement) -> Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.selectElements[ValueParameterDescriptorImpl]

'project' @ [64:25] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.runRefactoring[ValueParameterDescriptorImpl]

'executeWriteCommand' @ [64:33] ==> public fun <T> Project.executeWriteCommand(name: String, groupId: Any? = ..., command: () -> KtTypeAlias): KtTypeAlias defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeAlias

'REFACTORING_NAME' @ [64:66] ==> @JvmField public final val REFACTORING_NAME: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.Companion[PropertyDescriptorImpl]

'descriptor' @ [64:86] ==> value-parameter descriptor: IntroduceTypeAliasDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.runRefactoring[ValueParameterDescriptorImpl]

'generateTypeAlias' @ [64:97] ==> public fun IntroduceTypeAliasDescriptor.generateTypeAlias(previewOnly: Boolean = ...): KtTypeAlias defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias in file introduceTypeAliasImpl.kt[SimpleFunctionDescriptorImpl]

'findDuplicates' @ [66:34] ==> public fun findDuplicates(typeAlias: KtTypeAlias): Map<KotlinPsiRange, () -> Unit> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias in file introduceTypeAliasImpl.kt[SimpleFunctionDescriptorImpl]

'typeAlias' @ [66:49] ==> val typeAlias: KtTypeAlias defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.runRefactoring[LocalVariableDescriptor]

'duplicateReplacers' @ [67:13] ==> val duplicateReplacers: Map<KotlinPsiRange, () -> Unit> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.runRefactoring[LocalVariableDescriptor]

'isNotEmpty' @ [67:32] ==> @InlineOnly public inline fun <K, V> Map<out KotlinPsiRange, () -> Unit>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KotlinPsiRange
    <V> -> Function0<Unit>

'processDuplicates' @ [68:13] ==> public fun processDuplicates(duplicateReplacers: Map<KotlinPsiRange, () -> Unit>, project: Project, editor: Editor, scopeDescription: String = ..., usageDescription: String = ...): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file duplicateUtil.kt[SimpleFunctionDescriptorImpl]

'duplicateReplacers' @ [68:31] ==> val duplicateReplacers: Map<KotlinPsiRange, () -> Unit> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.runRefactoring[LocalVariableDescriptor]

'project' @ [68:51] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.runRefactoring[ValueParameterDescriptorImpl]

'editor' @ [68:60] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.runRefactoring[ValueParameterDescriptorImpl]

'elements' @ [79:32] ==> value-parameter elements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.doInvoke[ValueParameterDescriptorImpl]

'singleOrNull' @ [79:41] ==> public fun <T> List<PsiElement>.singleOrNull(): PsiElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'when (elementToExtract) {
            is KtSimpleNameExpression -> {
                if (!(isTypeConstructorReference(elementToExtract) || isDoubleColonReceiver(elementToExtract))) "Type reference is expected" else null
            }
            !is KtTypeElement -> "No type to refactor"
            else -> null
        }' @ [81:28] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String?, entry1: String?, entry2: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String?

'elementToExtract' @ [81:34] ==> val elementToExtract: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.doInvoke[LocalVariableDescriptor]

'if (!(isTypeConstructorReference(elementToExtract) || isDoubleColonReceiver(elementToExtract))) "Type reference is expected" else null' @ [83:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'!' @ [83:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isTypeConstructorReference' @ [83:23] ==> public fun isTypeConstructorReference(e: PsiElement): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'elementToExtract' @ [83:50] ==> val elementToExtract: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.doInvoke[LocalVariableDescriptor]

'isDoubleColonReceiver' @ [83:71] ==> public fun isDoubleColonReceiver(expression: KtExpression): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'elementToExtract' @ [83:93] ==> val elementToExtract: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.doInvoke[LocalVariableDescriptor]

'errorMessage' @ [88:13] ==> val errorMessage: String? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.doInvoke[LocalVariableDescriptor]

'showErrorHint' @ [88:42] ==> public fun showErrorHint(project: Project, editor: Editor, message: String, title: String): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce in file introduceUtil.kt[SimpleFunctionDescriptorImpl]

'project' @ [88:56] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.doInvoke[ValueParameterDescriptorImpl]

'editor' @ [88:65] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.doInvoke[ValueParameterDescriptorImpl]

'errorMessage' @ [88:73] ==> val errorMessage: String? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.doInvoke[LocalVariableDescriptor]

'REFACTORING_NAME' @ [88:87] ==> @JvmField public final val REFACTORING_NAME: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.Companion[PropertyDescriptorImpl]

'when (elementToExtract) {
            is KtTypeElement -> IntroduceTypeAliasData(elementToExtract, targetSibling)
            else -> IntroduceTypeAliasData(elementToExtract!!.getStrictParentOfType<KtTypeElement>() ?: elementToExtract as KtElement, targetSibling, true)
        }' @ [90:29] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IntroduceTypeAliasData, entry1: IntroduceTypeAliasData): IntroduceTypeAliasData[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IntroduceTypeAliasData

'elementToExtract' @ [90:35] ==> val elementToExtract: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.doInvoke[LocalVariableDescriptor]

'IntroduceTypeAliasData' @ [91:33] ==> public constructor IntroduceTypeAliasData(originalTypeElement: KtElement, targetSibling: PsiElement, extractTypeConstructor: Boolean = ...) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasData[ClassConstructorDescriptorImpl]

'elementToExtract' @ [91:56] ==> val elementToExtract: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.doInvoke[LocalVariableDescriptor]

'targetSibling' @ [91:74] ==> value-parameter targetSibling: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.doInvoke[ValueParameterDescriptorImpl]

'IntroduceTypeAliasData' @ [92:21] ==> public constructor IntroduceTypeAliasData(originalTypeElement: KtElement, targetSibling: PsiElement, extractTypeConstructor: Boolean = ...) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasData[ClassConstructorDescriptorImpl]

'elementToExtract' @ [92:44] ==> val elementToExtract: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.doInvoke[LocalVariableDescriptor]

'getStrictParentOfType' @ [92:63] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtTypeElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtTypeElement

'elementToExtract' @ [92:105] ==> val elementToExtract: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.doInvoke[LocalVariableDescriptor]

'targetSibling' @ [92:136] ==> value-parameter targetSibling: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.doInvoke[ValueParameterDescriptorImpl]

'introduceData' @ [94:30] ==> val introduceData: IntroduceTypeAliasData defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.doInvoke[LocalVariableDescriptor]

'analyze' @ [94:44] ==> public fun IntroduceTypeAliasData.analyze(): IntroduceTypeAliasAnalysisResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias in file introduceTypeAliasImpl.kt[SimpleFunctionDescriptorImpl]

'when (analysisResult) {
            is IntroduceTypeAliasAnalysisResult.Error -> {
                return showErrorHint(project, editor, analysisResult.message, REFACTORING_NAME)
            }

            is IntroduceTypeAliasAnalysisResult.Success -> {
                val originalDescriptor = analysisResult.descriptor
                if (ApplicationManager.getApplication().isUnitTestMode) {
                    val (descriptor, conflicts) = descriptorSubstitutor!!(originalDescriptor).validate()
                    project.checkConflictsInteractively(conflicts) { runRefactoring(descriptor, project, editor) }
                }
                else {
                    KotlinIntroduceTypeAliasDialog(project, originalDescriptor) { runRefactoring(it.currentDescriptor, project, editor) }.show()
                }
            }
        }' @ [95:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'analysisResult' @ [95:15] ==> val analysisResult: IntroduceTypeAliasAnalysisResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.doInvoke[LocalVariableDescriptor]

'showErrorHint' @ [97:24] ==> public fun showErrorHint(project: Project, editor: Editor, message: String, title: String): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce in file introduceUtil.kt[SimpleFunctionDescriptorImpl]

'project' @ [97:38] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.doInvoke[ValueParameterDescriptorImpl]

'editor' @ [97:47] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.doInvoke[ValueParameterDescriptorImpl]

'analysisResult' @ [97:55] ==> val analysisResult: IntroduceTypeAliasAnalysisResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.doInvoke[LocalVariableDescriptor]

'message' @ [97:70] ==> public final val message: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasAnalysisResult.Error[PropertyDescriptorImpl]

'REFACTORING_NAME' @ [97:79] ==> @JvmField public final val REFACTORING_NAME: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.Companion[PropertyDescriptorImpl]

'analysisResult' @ [101:42] ==> val analysisResult: IntroduceTypeAliasAnalysisResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.doInvoke[LocalVariableDescriptor]

'descriptor' @ [101:57] ==> public final val descriptor: IntroduceTypeAliasDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasAnalysisResult.Success[PropertyDescriptorImpl]

'if (ApplicationManager.getApplication().isUnitTestMode) {
                    val (descriptor, conflicts) = descriptorSubstitutor!!(originalDescriptor).validate()
                    project.checkConflictsInteractively(conflicts) { runRefactoring(descriptor, project, editor) }
                }
                else {
                    KotlinIntroduceTypeAliasDialog(project, originalDescriptor) { runRefactoring(it.currentDescriptor, project, editor) }.show()
                }' @ [102:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'getApplication' @ [102:40] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [102:57] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'component1' @ [103:26] ==> public final operator fun component1(): IntroduceTypeAliasDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasDescriptorWithConflicts[SimpleFunctionDescriptorImpl]

'component2' @ [103:38] ==> public final operator fun component2(): MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasDescriptorWithConflicts[SimpleFunctionDescriptorImpl]

'descriptorSubstitutor' @ [103:51] ==> value-parameter descriptorSubstitutor: ((IntroduceTypeAliasDescriptor) -> IntroduceTypeAliasDescriptor)? = ... defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.doInvoke[ValueParameterDescriptorImpl]

'originalDescriptor' @ [103:75] ==> val originalDescriptor: IntroduceTypeAliasDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.doInvoke[LocalVariableDescriptor]

'validate' @ [103:95] ==> public fun IntroduceTypeAliasDescriptor.validate(): IntroduceTypeAliasDescriptorWithConflicts defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias in file introduceTypeAliasImpl.kt[SimpleFunctionDescriptorImpl]

'project' @ [104:21] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.doInvoke[ValueParameterDescriptorImpl]

'checkConflictsInteractively' @ [104:29] ==> public fun Project.checkConflictsInteractively(conflicts: MultiMap<PsiElement, String>, onShowConflicts: () -> Unit = ..., onAccept: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'conflicts' @ [104:57] ==> val conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.doInvoke[LocalVariableDescriptor]

'runRefactoring' @ [104:70] ==> private final fun runRefactoring(descriptor: IntroduceTypeAliasDescriptor, project: Project, editor: Editor): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler[SimpleFunctionDescriptorImpl]

'descriptor' @ [104:85] ==> val descriptor: IntroduceTypeAliasDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.doInvoke[LocalVariableDescriptor]

'project' @ [104:97] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.doInvoke[ValueParameterDescriptorImpl]

'editor' @ [104:106] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.doInvoke[ValueParameterDescriptorImpl]

'KotlinIntroduceTypeAliasDialog' @ [107:21] ==> public constructor KotlinIntroduceTypeAliasDialog(@NotNull project: Project, @NotNull originalDescriptor: IntroduceTypeAliasDescriptor, @NotNull onAccept: ((KotlinIntroduceTypeAliasDialog..KotlinIntroduceTypeAliasDialog?)) -> (Unit..Unit?)) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.ui.KotlinIntroduceTypeAliasDialog[JavaClassConstructorDescriptor]

'project' @ [107:52] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.doInvoke[ValueParameterDescriptorImpl]

'originalDescriptor' @ [107:61] ==> val originalDescriptor: IntroduceTypeAliasDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.doInvoke[LocalVariableDescriptor]

'runRefactoring' @ [107:83] ==> private final fun runRefactoring(descriptor: IntroduceTypeAliasDescriptor, project: Project, editor: Editor): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler[SimpleFunctionDescriptorImpl]

'it' @ [107:98] ==> value-parameter it: (KotlinIntroduceTypeAliasDialog..KotlinIntroduceTypeAliasDialog?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.doInvoke.<anonymous>[ValueParameterDescriptorImpl]

'currentDescriptor' @ [107:101] ==> public final val KotlinIntroduceTypeAliasDialog.currentDescriptor: (IntroduceTypeAliasDescriptor..IntroduceTypeAliasDescriptor?)[MyPropertyDescriptor]

'project' @ [107:120] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.doInvoke[ValueParameterDescriptorImpl]

'editor' @ [107:129] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.doInvoke[ValueParameterDescriptorImpl]

'show' @ [107:139] ==> public open fun show(): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.ui.KotlinIntroduceTypeAliasDialog[JavaMethodDescriptor]

'file' @ [114:13] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.invoke[ValueParameterDescriptorImpl]

'if (editor.selectionModel.hasSelection()) editor.selectionModel.selectionStart else editor.caretModel.offset' @ [116:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'editor' @ [116:26] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.invoke[ValueParameterDescriptorImpl]

'selectionModel' @ [116:33] ==> public final val Editor.selectionModel: SelectionModel[MyPropertyDescriptor]

'hasSelection' @ [116:48] ==> public abstract fun hasSelection(): Boolean defined in com.intellij.openapi.editor.SelectionModel[JavaMethodDescriptor]

'editor' @ [116:64] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.invoke[ValueParameterDescriptorImpl]

'selectionModel' @ [116:71] ==> public final val Editor.selectionModel: SelectionModel[MyPropertyDescriptor]

'selectionStart' @ [116:86] ==> public final val SelectionModel.selectionStart: Int[MyPropertyDescriptor]

'editor' @ [116:106] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.invoke[ValueParameterDescriptorImpl]

'caretModel' @ [116:113] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'offset' @ [116:124] ==> public final val CaretModel.offset: Int[MyPropertyDescriptor]

'file' @ [118:29] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.invoke[ValueParameterDescriptorImpl]

'findElementAt' @ [118:34] ==> @Nullable @Contract public abstract fun findElementAt(p0: Int): PsiElement? defined in com.intellij.psi.PsiFile[JavaMethodDescriptor]

'offset' @ [118:48] ==> val offset: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.invoke[LocalVariableDescriptor]

'getNonStrictParentOfType' @ [118:57] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtSimpleNameExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtSimpleNameExpression

'refExpression' @ [119:13] ==> val refExpression: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.invoke[LocalVariableDescriptor]

'isDoubleColonReceiver' @ [119:38] ==> public fun isDoubleColonReceiver(expression: KtExpression): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'refExpression' @ [119:60] ==> val refExpression: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.invoke[LocalVariableDescriptor]

'doInvoke' @ [120:20] ==> public open fun doInvoke(project: Project, editor: Editor, elements: List<PsiElement>, targetSibling: PsiElement, descriptorSubstitutor: ((IntroduceTypeAliasDescriptor) -> IntroduceTypeAliasDescriptor)? = ...): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler[SimpleFunctionDescriptorImpl]

'project' @ [120:29] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.invoke[ValueParameterDescriptorImpl]

'editor' @ [120:38] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.invoke[ValueParameterDescriptorImpl]

'listOf' @ [120:46] ==> public fun <T> listOf(element: KtSimpleNameExpression): List<KtSimpleNameExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSimpleNameExpression

'refExpression' @ [120:53] ==> val refExpression: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.invoke[LocalVariableDescriptor]

'refExpression' @ [120:69] ==> val refExpression: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.invoke[LocalVariableDescriptor]

'getOutermostParentContainedIn' @ [120:83] ==> public tailrec fun PsiElement.getOutermostParentContainedIn(container: PsiElement): PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'file' @ [120:113] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.invoke[ValueParameterDescriptorImpl]

'selectElements' @ [123:9] ==> private final fun selectElements(editor: Editor, file: KtFile, continuation: (elements: List<PsiElement>, targetSibling: PsiElement) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler[SimpleFunctionDescriptorImpl]

'editor' @ [123:24] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.invoke[ValueParameterDescriptorImpl]

'file' @ [123:32] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.invoke[ValueParameterDescriptorImpl]

'doInvoke' @ [123:67] ==> public open fun doInvoke(project: Project, editor: Editor, elements: List<PsiElement>, targetSibling: PsiElement, descriptorSubstitutor: ((IntroduceTypeAliasDescriptor) -> IntroduceTypeAliasDescriptor)? = ...): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler[SimpleFunctionDescriptorImpl]

'project' @ [123:76] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.invoke[ValueParameterDescriptorImpl]

'editor' @ [123:85] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.invoke[ValueParameterDescriptorImpl]

'elements' @ [123:93] ==> value-parameter elements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.invoke.<anonymous>[ValueParameterDescriptorImpl]

'targetSibling' @ [123:103] ==> value-parameter targetSibling: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.invoke.<anonymous>[ValueParameterDescriptorImpl]

'AssertionError' @ [127:15] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'REFACTORING_NAME' @ [127:32] ==> @JvmField public final val REFACTORING_NAME: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.Companion[PropertyDescriptorImpl]

'AbstractIntroduceAction' @ [131:34] ==> public constructor AbstractIntroduceAction() defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractIntroduceAction[ClassConstructorDescriptorImpl]

'if (provider is KotlinRefactoringSupportProvider) KotlinIntroduceTypeAliasHandler.INSTANCE else null' @ [133:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: RefactoringActionHandler?, elseBranch: RefactoringActionHandler?): RefactoringActionHandler?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> RefactoringActionHandler?

'provider' @ [133:20] ==> value-parameter provider: RefactoringSupportProvider defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasAction.getRefactoringHandler[ValueParameterDescriptorImpl]

'INSTANCE' @ [133:98] ==> public final val INSTANCE: KotlinIntroduceTypeAliasHandler defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.Companion[PropertyDescriptorImpl]

'super' @ [137:16] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasAction[LazyClassReceiverParameterDescriptor]

'isAvailableOnElementInEditorAndFile' @ [137:22] ==> protected/*protected and package*/ open fun isAvailableOnElementInEditorAndFile(@NotNull p0: PsiElement, @NotNull p1: Editor, @NotNull p2: PsiFile, @NotNull p3: DataContext): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractIntroduceAction[JavaMethodDescriptor]

'element' @ [137:58] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasAction.isAvailableOnElementInEditorAndFile[ValueParameterDescriptorImpl]

'editor' @ [137:67] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasAction.isAvailableOnElementInEditorAndFile[ValueParameterDescriptorImpl]

'file' @ [137:75] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasAction.isAvailableOnElementInEditorAndFile[ValueParameterDescriptorImpl]

'context' @ [137:81] ==> value-parameter context: DataContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasAction.isAvailableOnElementInEditorAndFile[ValueParameterDescriptorImpl]

'?:' @ [138:17] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Boolean?, right: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Boolean

'findModuleForPsiElement' @ [138:28] ==> @Nullable public open fun findModuleForPsiElement(@NotNull p0: PsiElement): Module? defined in com.intellij.openapi.module.ModuleUtil[JavaMethodDescriptor]

'file' @ [138:52] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.IntroduceTypeAliasAction.isAvailableOnElementInEditorAndFile[ValueParameterDescriptorImpl]

'languageVersionSettings' @ [138:59] ==> public val Module.languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.idea.project[DeserializedPropertyDescriptor]

'supportsFeature' @ [138:84] ==> public open fun supportsFeature(feature: LanguageFeature): Boolean defined in org.jetbrains.kotlin.config.LanguageVersionSettings[DeserializedSimpleFunctionDescriptor]

'TypeAliases' @ [138:116] ==> enum entry TypeAliases defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

