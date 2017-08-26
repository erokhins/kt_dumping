'InteractiveExtractionHelper' @ [37:83] ==> public object InteractiveExtractionHelper : ExtractionEngineHelper defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ExtractKotlinFunctionHandler[FakeCallableDescriptorForObject]

'ExtractionEngineHelper' @ [39:42] ==> public constructor ExtractionEngineHelper(operationName: String) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngineHelper[ClassConstructorDescriptorImpl]

'EXTRACT_FUNCTION' @ [39:65] ==> public val EXTRACT_FUNCTION: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction in file ExtractKotlinFunctionHandler.kt[PropertyDescriptorImpl]

'KotlinExtractFunctionDialog' @ [46:13] ==> public constructor KotlinExtractFunctionDialog(@NotNull project: Project, @NotNull originalDescriptor: ExtractableCodeDescriptorWithConflicts, @NotNull onAccept: ((KotlinExtractFunctionDialog..KotlinExtractFunctionDialog?)) -> (Unit..Unit?)) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.KotlinExtractFunctionDialog[JavaClassConstructorDescriptor]

'descriptorWithConflicts' @ [46:41] ==> value-parameter descriptorWithConflicts: ExtractableCodeDescriptorWithConflicts defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ExtractKotlinFunctionHandler.InteractiveExtractionHelper.configureAndRun[ValueParameterDescriptorImpl]

'descriptor' @ [46:65] ==> public final val descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptorWithConflicts[PropertyDescriptorImpl]

'extractionData' @ [46:76] ==> public final val extractionData: ExtractionData defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptor[PropertyDescriptorImpl]

'project' @ [46:91] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'descriptorWithConflicts' @ [46:100] ==> value-parameter descriptorWithConflicts: ExtractableCodeDescriptorWithConflicts defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ExtractKotlinFunctionHandler.InteractiveExtractionHelper.configureAndRun[ValueParameterDescriptorImpl]

'doRefactor' @ [47:17] ==> public final fun doRefactor(config: ExtractionGeneratorConfiguration, onFinish: (ExtractionResult) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ExtractKotlinFunctionHandler.InteractiveExtractionHelper[SimpleFunctionDescriptorImpl]

'it' @ [47:28] ==> value-parameter it: (KotlinExtractFunctionDialog..KotlinExtractFunctionDialog?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ExtractKotlinFunctionHandler.InteractiveExtractionHelper.configureAndRun.<anonymous>[ValueParameterDescriptorImpl]

'currentConfiguration' @ [47:31] ==> public final val KotlinExtractFunctionDialog.currentConfiguration: ExtractionGeneratorConfiguration[MyPropertyDescriptor]

'onFinish' @ [47:53] ==> value-parameter onFinish: (ExtractionResult) -> Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ExtractKotlinFunctionHandler.InteractiveExtractionHelper.configureAndRun[ValueParameterDescriptorImpl]

'show' @ [48:15] ==> public open fun show(): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ui.KotlinExtractFunctionDialog[JavaMethodDescriptor]

'?:' @ [58:32] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: List<PsiElement>?, right: List<PsiElement>): List<PsiElement>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> List<PsiElement>

'elements' @ [58:33] ==> value-parameter elements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ExtractKotlinFunctionHandler.doInvoke[ValueParameterDescriptorImpl]

'singleOrNull' @ [58:42] ==> public fun <T> List<PsiElement>.singleOrNull(): PsiElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'statements' @ [58:81] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'elements' @ [58:95] ==> value-parameter elements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ExtractKotlinFunctionHandler.doInvoke[ValueParameterDescriptorImpl]

'ExtractionData' @ [59:30] ==> public constructor ExtractionData(originalFile: KtFile, originalRange: KotlinPsiRange, targetSibling: PsiElement, duplicateContainer: PsiElement? = ..., options: ExtractionOptions = ...) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[ClassConstructorDescriptorImpl]

'file' @ [59:45] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ExtractKotlinFunctionHandler.doInvoke[ValueParameterDescriptorImpl]

'adjustedElements' @ [59:51] ==> val adjustedElements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ExtractKotlinFunctionHandler.doInvoke[LocalVariableDescriptor]

'toRange' @ [59:68] ==> public fun List<PsiElement>.toRange(significantOnly: Boolean = ...): KotlinPsiRange defined in org.jetbrains.kotlin.idea.util.psi.patternMatching[DeserializedSimpleFunctionDescriptor]

'targetSibling' @ [59:84] ==> value-parameter targetSibling: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ExtractKotlinFunctionHandler.doInvoke[ValueParameterDescriptorImpl]

'ExtractionEngine' @ [60:9] ==> public constructor ExtractionEngine(helper: ExtractionEngineHelper) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngine[ClassConstructorDescriptorImpl]

'helper' @ [60:26] ==> private final val helper: ExtractionEngineHelper defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ExtractKotlinFunctionHandler[PropertyDescriptorImpl]

'run' @ [60:34] ==> public final fun run(editor: Editor, extractionData: ExtractionData, onFinish: (ExtractionResult) -> Unit = ...): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngine[SimpleFunctionDescriptorImpl]

'editor' @ [60:38] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ExtractKotlinFunctionHandler.doInvoke[ValueParameterDescriptorImpl]

'extractionData' @ [60:46] ==> val extractionData: ExtractionData defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ExtractKotlinFunctionHandler.doInvoke[LocalVariableDescriptor]

'processDuplicates' @ [61:13] ==> public fun processDuplicates(duplicateReplacers: Map<KotlinPsiRange, () -> Unit>, project: Project, editor: Editor, scopeDescription: String = ..., usageDescription: String = ...): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine[SimpleFunctionDescriptorImpl]

'it' @ [61:31] ==> value-parameter it: ExtractionResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ExtractKotlinFunctionHandler.doInvoke.<anonymous>[ValueParameterDescriptorImpl]

'duplicateReplacers' @ [61:34] ==> public final val duplicateReplacers: Map<KotlinPsiRange, () -> Unit> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionResult[PropertyDescriptorImpl]

'file' @ [61:54] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ExtractKotlinFunctionHandler.doInvoke[ValueParameterDescriptorImpl]

'project' @ [61:59] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'editor' @ [61:68] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ExtractKotlinFunctionHandler.doInvoke[ValueParameterDescriptorImpl]

'selectElementsWithTargetSibling' @ [66:9] ==> public fun selectElementsWithTargetSibling(operationName: String, editor: Editor, file: KtFile, title: String, elementKinds: Collection<CodeInsightUtils.ElementKind>, getContainers: (elements: List<PsiElement>, commonParent: PsiElement) -> List<PsiElement>, continuation: (elements: List<PsiElement>, targetSibling: PsiElement) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce[SimpleFunctionDescriptorImpl]

'EXTRACT_FUNCTION' @ [67:17] ==> public val EXTRACT_FUNCTION: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction in file ExtractKotlinFunctionHandler.kt[PropertyDescriptorImpl]

'editor' @ [68:17] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ExtractKotlinFunctionHandler.selectElements[ValueParameterDescriptorImpl]

'file' @ [69:17] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ExtractKotlinFunctionHandler.selectElements[ValueParameterDescriptorImpl]

'listOf' @ [71:17] ==> public fun <T> listOf(element: CodeInsightUtils.ElementKind): List<CodeInsightUtils.ElementKind> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ElementKind

'EXPRESSION' @ [71:53] ==> enum entry EXPRESSION defined in org.jetbrains.kotlin.idea.codeInsight.CodeInsightUtils.ElementKind[FakeCallableDescriptorForObject]

'parent' @ [72:39] ==> value-parameter parent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ExtractKotlinFunctionHandler.selectElements.<anonymous>[ValueParameterDescriptorImpl]

'getExtractionContainers' @ [72:46] ==> public fun PsiElement.getExtractionContainers(strict: Boolean = ..., includeAll: Boolean = ...): List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring[SimpleFunctionDescriptorImpl]

'elements' @ [72:70] ==> value-parameter elements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ExtractKotlinFunctionHandler.selectElements.<anonymous>[ValueParameterDescriptorImpl]

'size' @ [72:79] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'allContainersEnabled' @ [72:90] ==> private final val allContainersEnabled: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ExtractKotlinFunctionHandler[PropertyDescriptorImpl]

'continuation' @ [73:17] ==> value-parameter continuation: (elements: List<PsiElement>, targetSibling: PsiElement) -> Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ExtractKotlinFunctionHandler.selectElements[ValueParameterDescriptorImpl]

'file' @ [78:13] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ExtractKotlinFunctionHandler.invoke[ValueParameterDescriptorImpl]

'selectElements' @ [79:9] ==> public final fun selectElements(editor: Editor, file: KtFile, continuation: (elements: List<PsiElement>, targetSibling: PsiElement) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ExtractKotlinFunctionHandler[SimpleFunctionDescriptorImpl]

'editor' @ [79:24] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ExtractKotlinFunctionHandler.invoke[ValueParameterDescriptorImpl]

'file' @ [79:32] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ExtractKotlinFunctionHandler.invoke[ValueParameterDescriptorImpl]

'doInvoke' @ [79:67] ==> public final fun doInvoke(editor: Editor, file: KtFile, elements: List<PsiElement>, targetSibling: PsiElement): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ExtractKotlinFunctionHandler[SimpleFunctionDescriptorImpl]

'editor' @ [79:76] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ExtractKotlinFunctionHandler.invoke[ValueParameterDescriptorImpl]

'file' @ [79:84] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ExtractKotlinFunctionHandler.invoke[ValueParameterDescriptorImpl]

'elements' @ [79:90] ==> value-parameter elements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ExtractKotlinFunctionHandler.invoke.<anonymous>[ValueParameterDescriptorImpl]

'targetSibling' @ [79:100] ==> value-parameter targetSibling: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractFunction.ExtractKotlinFunctionHandler.invoke.<anonymous>[ValueParameterDescriptorImpl]

'AssertionError' @ [83:15] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'message' @ [87:56] ==> @NotNull public open fun message(@NonNls @PropertyKey key: (String..String?), vararg params: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.refactoring.KotlinRefactoringBundle[JavaMethodDescriptor]

