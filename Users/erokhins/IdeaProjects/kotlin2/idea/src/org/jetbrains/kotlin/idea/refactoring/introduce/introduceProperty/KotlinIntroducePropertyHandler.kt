'InteractiveExtractionHelper' @ [42:77] ==> public object InteractiveExtractionHelper : ExtractionEngineHelper defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler[FakeCallableDescriptorForObject]

'ExtractionEngineHelper' @ [44:42] ==> public constructor ExtractionEngineHelper(operationName: String) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngineHelper[ClassConstructorDescriptorImpl]

'INTRODUCE_PROPERTY' @ [44:65] ==> public val INTRODUCE_PROPERTY: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty in file KotlinIntroducePropertyHandler.kt[PropertyDescriptorImpl]

'propertyTargets' @ [46:17] ==> public val propertyTargets: List<ExtractionTarget> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file ExtractableCodeDescriptor.kt[PropertyDescriptorImpl]

'firstOrNull' @ [46:33] ==> public inline fun <T> Iterable<ExtractionTarget>.firstOrNull(predicate: (ExtractionTarget) -> Boolean): ExtractionTarget? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExtractionTarget

'it' @ [46:47] ==> value-parameter it: ExtractionTarget defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.InteractiveExtractionHelper.getExtractionTarget.<anonymous>[ValueParameterDescriptorImpl]

'isAvailable' @ [46:50] ==> public abstract fun isAvailable(descriptor: ExtractableCodeDescriptor): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget[SimpleFunctionDescriptorImpl]

'descriptor' @ [46:62] ==> value-parameter descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.InteractiveExtractionHelper.getExtractionTarget[ValueParameterDescriptorImpl]

'descriptor' @ [49:17] ==> value-parameter descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.InteractiveExtractionHelper.validate[ValueParameterDescriptorImpl]

'validate' @ [49:28] ==> @JvmOverloads public fun ExtractableCodeDescriptor.validate(target: ExtractionTarget = ...): ExtractableCodeDescriptorWithConflicts defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[SimpleFunctionDescriptorImpl]

'getExtractionTarget' @ [49:37] ==> private final fun getExtractionTarget(descriptor: ExtractableCodeDescriptor): ExtractionTarget? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.InteractiveExtractionHelper[SimpleFunctionDescriptorImpl]

'descriptor' @ [49:57] ==> value-parameter descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.InteractiveExtractionHelper.validate[ValueParameterDescriptorImpl]

'ExtractionTarget' @ [49:72] ==> public companion object defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget[FakeCallableDescriptorForObject]

'FUNCTION' @ [49:89] ==> enum entry FUNCTION defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget[FakeCallableDescriptorForObject]

'descriptorWithConflicts' @ [57:30] ==> value-parameter descriptorWithConflicts: ExtractableCodeDescriptorWithConflicts defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.InteractiveExtractionHelper.configureAndRun[ValueParameterDescriptorImpl]

'descriptor' @ [57:54] ==> public final val descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptorWithConflicts[PropertyDescriptorImpl]

'getExtractionTarget' @ [58:26] ==> private final fun getExtractionTarget(descriptor: ExtractableCodeDescriptor): ExtractionTarget? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.InteractiveExtractionHelper[SimpleFunctionDescriptorImpl]

'descriptor' @ [58:46] ==> val descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.InteractiveExtractionHelper.configureAndRun[LocalVariableDescriptor]

'if (target != null) {
                val options = ExtractionGeneratorOptions.DEFAULT.copy(target = target, delayInitialOccurrenceReplacement = true)
                doRefactor(ExtractionGeneratorConfiguration(descriptor, options), onFinish)
            }
            else {
                showErrorHint(project, editor, "Can't introduce property for this expression", INTRODUCE_PROPERTY)
            }' @ [59:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'target' @ [59:17] ==> val target: ExtractionTarget? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.InteractiveExtractionHelper.configureAndRun[LocalVariableDescriptor]

'ExtractionGeneratorOptions' @ [60:31] ==> public companion object defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionGeneratorOptions[FakeCallableDescriptorForObject]

'DEFAULT' @ [60:58] ==> @JvmField public final val DEFAULT: ExtractionGeneratorOptions defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionGeneratorOptions.Companion[PropertyDescriptorImpl]

'copy' @ [60:66] ==> public final fun copy(inTempFile: Boolean = ..., target: ExtractionTarget = ..., dummyName: String? = ..., allowExpressionBody: Boolean = ..., delayInitialOccurrenceReplacement: Boolean = ...): ExtractionGeneratorOptions defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionGeneratorOptions[SimpleFunctionDescriptorImpl]

'target' @ [60:80] ==> val target: ExtractionTarget? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.InteractiveExtractionHelper.configureAndRun[LocalVariableDescriptor]

'doRefactor' @ [61:17] ==> public final fun doRefactor(config: ExtractionGeneratorConfiguration, onFinish: (ExtractionResult) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.InteractiveExtractionHelper[SimpleFunctionDescriptorImpl]

'ExtractionGeneratorConfiguration' @ [61:28] ==> public constructor ExtractionGeneratorConfiguration(descriptor: ExtractableCodeDescriptor, generatorOptions: ExtractionGeneratorOptions) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionGeneratorConfiguration[ClassConstructorDescriptorImpl]

'descriptor' @ [61:61] ==> val descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.InteractiveExtractionHelper.configureAndRun[LocalVariableDescriptor]

'options' @ [61:73] ==> val options: ExtractionGeneratorOptions defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.InteractiveExtractionHelper.configureAndRun[LocalVariableDescriptor]

'onFinish' @ [61:83] ==> value-parameter onFinish: (ExtractionResult) -> Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.InteractiveExtractionHelper.configureAndRun[ValueParameterDescriptorImpl]

'showErrorHint' @ [64:17] ==> public fun showErrorHint(project: Project, editor: Editor, message: String, title: String): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce in file introduceUtil.kt[SimpleFunctionDescriptorImpl]

'project' @ [64:31] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.InteractiveExtractionHelper.configureAndRun[ValueParameterDescriptorImpl]

'editor' @ [64:40] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.InteractiveExtractionHelper.configureAndRun[ValueParameterDescriptorImpl]

'INTRODUCE_PROPERTY' @ [64:96] ==> public val INTRODUCE_PROPERTY: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty in file KotlinIntroducePropertyHandler.kt[PropertyDescriptorImpl]

'selectElementsWithTargetSibling' @ [70:9] ==> public fun selectElementsWithTargetSibling(operationName: String, editor: Editor, file: KtFile, title: String, elementKinds: Collection<CodeInsightUtils.ElementKind>, getContainers: (elements: List<PsiElement>, commonParent: PsiElement) -> List<PsiElement>, continuation: (elements: List<PsiElement>, targetSibling: PsiElement) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce[SimpleFunctionDescriptorImpl]

'INTRODUCE_PROPERTY' @ [71:17] ==> public val INTRODUCE_PROPERTY: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty in file KotlinIntroducePropertyHandler.kt[PropertyDescriptorImpl]

'editor' @ [72:17] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.selectElements[ValueParameterDescriptorImpl]

'file' @ [73:17] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.selectElements[ValueParameterDescriptorImpl]

'listOf' @ [75:17] ==> public fun <T> listOf(element: CodeInsightUtils.ElementKind): List<CodeInsightUtils.ElementKind> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ElementKind

'EXPRESSION' @ [75:53] ==> enum entry EXPRESSION defined in org.jetbrains.kotlin.idea.codeInsight.CodeInsightUtils.ElementKind[FakeCallableDescriptorForObject]

'parent' @ [77:21] ==> value-parameter parent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.selectElements.<anonymous>[ValueParameterDescriptorImpl]

'getExtractionContainers' @ [77:28] ==> public fun PsiElement.getExtractionContainers(strict: Boolean = ..., includeAll: Boolean = ...): List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring[SimpleFunctionDescriptorImpl]

'filter' @ [77:86] ==> public inline fun <T> Iterable<KtElement>.filter(predicate: (KtElement) -> Boolean): List<KtElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'it' @ [77:95] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.selectElements.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [77:117] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.selectElements.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [77:133] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [77:134] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.selectElements.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isScript' @ [77:137] ==> public final val KtFile.isScript: Boolean[MyPropertyDescriptor]

'continuation' @ [79:17] ==> value-parameter continuation: (elements: List<PsiElement>, targetSibling: PsiElement) -> Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.selectElements[ValueParameterDescriptorImpl]

'?:' @ [84:32] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: List<PsiElement>?, right: List<PsiElement>): List<PsiElement>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> List<PsiElement>

'elements' @ [84:33] ==> value-parameter elements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.doInvoke[ValueParameterDescriptorImpl]

'singleOrNull' @ [84:42] ==> public fun <T> List<PsiElement>.singleOrNull(): PsiElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'statements' @ [84:81] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'elements' @ [84:95] ==> value-parameter elements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.doInvoke[ValueParameterDescriptorImpl]

'if (adjustedElements.isNotEmpty()) {
            val options = ExtractionOptions(extractAsProperty = true)
            val extractionData = ExtractionData(file, adjustedElements.toRange(), targetSibling, null, options)
            ExtractionEngine(helper).run(editor, extractionData) {
                val property = it.declaration as KtProperty
                val descriptor = it.config.descriptor

                editor.caretModel.moveToOffset(property.textOffset)
                editor.selectionModel.removeSelection()
                if (editor.settings.isVariableInplaceRenameEnabled && !ApplicationManager.getApplication().isUnitTestMode) {
                    with(PsiDocumentManager.getInstance(project)) {
                        commitDocument(editor.document)
                        doPostponedOperationsAndUnblockDocument(editor.document)
                    }

                    val introducer = KotlinInplacePropertyIntroducer(
                            property = property,
                            editor = editor,
                            project = project,
                            title = INTRODUCE_PROPERTY,
                            doNotChangeVar = false,
                            exprType = descriptor.returnType,
                            extractionResult = it,
                            availableTargets = propertyTargets.filter { it.isAvailable(descriptor) }
                    )
                    introducer.performInplaceRefactoring(LinkedHashSet(descriptor.suggestedNames))
                }
                else {
                    processDuplicatesSilently(it.duplicateReplacers, project)
                }
            }
        }
        else {
            showErrorHintByKey(project, editor, "cannot.refactor.no.expression", INTRODUCE_PROPERTY)
        }' @ [85:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'adjustedElements' @ [85:13] ==> val adjustedElements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.doInvoke[LocalVariableDescriptor]

'isNotEmpty' @ [85:30] ==> @InlineOnly public inline fun <T> Collection<PsiElement>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'ExtractionOptions' @ [86:27] ==> public constructor ExtractionOptions(inferUnitTypeForUnusedValues: Boolean = ..., enableListBoxing: Boolean = ..., extractAsProperty: Boolean = ..., allowSpecialClassNames: Boolean = ..., captureLocalFunctions: Boolean = ..., canWrapInWith: Boolean = ...) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionOptions[ClassConstructorDescriptorImpl]

'ExtractionData' @ [87:34] ==> public constructor ExtractionData(originalFile: KtFile, originalRange: KotlinPsiRange, targetSibling: PsiElement, duplicateContainer: PsiElement? = ..., options: ExtractionOptions = ...) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[ClassConstructorDescriptorImpl]

'file' @ [87:49] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.doInvoke[ValueParameterDescriptorImpl]

'adjustedElements' @ [87:55] ==> val adjustedElements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.doInvoke[LocalVariableDescriptor]

'toRange' @ [87:72] ==> public fun List<PsiElement>.toRange(significantOnly: Boolean = ...): KotlinPsiRange defined in org.jetbrains.kotlin.idea.util.psi.patternMatching[DeserializedSimpleFunctionDescriptor]

'targetSibling' @ [87:83] ==> value-parameter targetSibling: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.doInvoke[ValueParameterDescriptorImpl]

'options' @ [87:104] ==> val options: ExtractionOptions defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.doInvoke[LocalVariableDescriptor]

'ExtractionEngine' @ [88:13] ==> public constructor ExtractionEngine(helper: ExtractionEngineHelper) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngine[ClassConstructorDescriptorImpl]

'helper' @ [88:30] ==> public final val helper: ExtractionEngineHelper defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler[PropertyDescriptorImpl]

'run' @ [88:38] ==> public final fun run(editor: Editor, extractionData: ExtractionData, onFinish: (ExtractionResult) -> Unit = ...): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngine[SimpleFunctionDescriptorImpl]

'editor' @ [88:42] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.doInvoke[ValueParameterDescriptorImpl]

'extractionData' @ [88:50] ==> val extractionData: ExtractionData defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.doInvoke[LocalVariableDescriptor]

'it' @ [89:32] ==> value-parameter it: ExtractionResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.doInvoke.<anonymous>[ValueParameterDescriptorImpl]

'declaration' @ [89:35] ==> public final val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionResult[PropertyDescriptorImpl]

'it' @ [90:34] ==> value-parameter it: ExtractionResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.doInvoke.<anonymous>[ValueParameterDescriptorImpl]

'config' @ [90:37] ==> public final val config: ExtractionGeneratorConfiguration defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionResult[PropertyDescriptorImpl]

'descriptor' @ [90:44] ==> public final val descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionGeneratorConfiguration[PropertyDescriptorImpl]

'editor' @ [92:17] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.doInvoke[ValueParameterDescriptorImpl]

'caretModel' @ [92:24] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'moveToOffset' @ [92:35] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'property' @ [92:48] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.doInvoke.<anonymous>[LocalVariableDescriptor]

'textOffset' @ [92:57] ==> public final val KtProperty.textOffset: Int[MyPropertyDescriptor]

'editor' @ [93:17] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.doInvoke[ValueParameterDescriptorImpl]

'selectionModel' @ [93:24] ==> public final val Editor.selectionModel: SelectionModel[MyPropertyDescriptor]

'removeSelection' @ [93:39] ==> public abstract fun removeSelection(): Unit defined in com.intellij.openapi.editor.SelectionModel[JavaMethodDescriptor]

'if (editor.settings.isVariableInplaceRenameEnabled && !ApplicationManager.getApplication().isUnitTestMode) {
                    with(PsiDocumentManager.getInstance(project)) {
                        commitDocument(editor.document)
                        doPostponedOperationsAndUnblockDocument(editor.document)
                    }

                    val introducer = KotlinInplacePropertyIntroducer(
                            property = property,
                            editor = editor,
                            project = project,
                            title = INTRODUCE_PROPERTY,
                            doNotChangeVar = false,
                            exprType = descriptor.returnType,
                            extractionResult = it,
                            availableTargets = propertyTargets.filter { it.isAvailable(descriptor) }
                    )
                    introducer.performInplaceRefactoring(LinkedHashSet(descriptor.suggestedNames))
                }
                else {
                    processDuplicatesSilently(it.duplicateReplacers, project)
                }' @ [94:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'editor' @ [94:21] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.doInvoke[ValueParameterDescriptorImpl]

'settings' @ [94:28] ==> public final val Editor.settings: EditorSettings[MyPropertyDescriptor]

'isVariableInplaceRenameEnabled' @ [94:37] ==> public final var EditorSettings.isVariableInplaceRenameEnabled: Boolean[MyPropertyDescriptor]

'!' @ [94:71] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'getApplication' @ [94:91] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [94:108] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'with' @ [95:21] ==> @InlineOnly public inline fun <T, R> with(receiver: (PsiDocumentManager..PsiDocumentManager?), block: (PsiDocumentManager..PsiDocumentManager?).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiDocumentManager..com.intellij.psi.PsiDocumentManager?)
    <R> -> Unit

'getInstance' @ [95:45] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [95:57] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.doInvoke[ValueParameterDescriptorImpl]

'commitDocument' @ [96:25] ==> public abstract fun commitDocument(@NotNull p0: Document): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'editor' @ [96:40] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.doInvoke[ValueParameterDescriptorImpl]

'document' @ [96:47] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'doPostponedOperationsAndUnblockDocument' @ [97:25] ==> public abstract fun doPostponedOperationsAndUnblockDocument(@NotNull p0: Document): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'editor' @ [97:65] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.doInvoke[ValueParameterDescriptorImpl]

'document' @ [97:72] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'KotlinInplacePropertyIntroducer' @ [100:38] ==> public constructor KotlinInplacePropertyIntroducer(property: KtProperty, editor: Editor, project: Project, title: String, doNotChangeVar: Boolean, exprType: KotlinType?, extractionResult: ExtractionResult, availableTargets: List<ExtractionTarget>) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer[ClassConstructorDescriptorImpl]

'property' @ [101:40] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.doInvoke.<anonymous>[LocalVariableDescriptor]

'editor' @ [102:38] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.doInvoke[ValueParameterDescriptorImpl]

'project' @ [103:39] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.doInvoke[ValueParameterDescriptorImpl]

'INTRODUCE_PROPERTY' @ [104:37] ==> public val INTRODUCE_PROPERTY: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty in file KotlinIntroducePropertyHandler.kt[PropertyDescriptorImpl]

'descriptor' @ [106:40] ==> val descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.doInvoke.<anonymous>[LocalVariableDescriptor]

'returnType' @ [106:51] ==> public final val returnType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptor[PropertyDescriptorImpl]

'it' @ [107:48] ==> value-parameter it: ExtractionResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.doInvoke.<anonymous>[ValueParameterDescriptorImpl]

'propertyTargets' @ [108:48] ==> public val propertyTargets: List<ExtractionTarget> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file ExtractableCodeDescriptor.kt[PropertyDescriptorImpl]

'filter' @ [108:64] ==> public inline fun <T> Iterable<ExtractionTarget>.filter(predicate: (ExtractionTarget) -> Boolean): List<ExtractionTarget> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExtractionTarget

'it' @ [108:73] ==> value-parameter it: ExtractionTarget defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.doInvoke.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isAvailable' @ [108:76] ==> public abstract fun isAvailable(descriptor: ExtractableCodeDescriptor): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionTarget[SimpleFunctionDescriptorImpl]

'descriptor' @ [108:88] ==> val descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.doInvoke.<anonymous>[LocalVariableDescriptor]

'introducer' @ [110:21] ==> val introducer: KotlinInplacePropertyIntroducer defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.doInvoke.<anonymous>[LocalVariableDescriptor]

'performInplaceRefactoring' @ [110:32] ==> @Override public open fun performInplaceRefactoring(nameSuggestions: (LinkedHashSet<(String..String?)>..LinkedHashSet<(String..String?)>?)): Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinInplacePropertyIntroducer[JavaMethodDescriptor]

'LinkedHashSet' @ [110:58] ==> public constructor LinkedHashSet<E : (Any..Any?)>(p0: (MutableCollection<out (String..String?)>..Collection<(String..String?)>?)) defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'descriptor' @ [110:72] ==> val descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.doInvoke.<anonymous>[LocalVariableDescriptor]

'suggestedNames' @ [110:83] ==> public final val suggestedNames: List<String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptor[PropertyDescriptorImpl]

'processDuplicatesSilently' @ [113:21] ==> public fun processDuplicatesSilently(duplicateReplacers: Map<KotlinPsiRange, () -> Unit>, project: Project): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine[SimpleFunctionDescriptorImpl]

'it' @ [113:47] ==> value-parameter it: ExtractionResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.doInvoke.<anonymous>[ValueParameterDescriptorImpl]

'duplicateReplacers' @ [113:50] ==> public final val duplicateReplacers: Map<KotlinPsiRange, () -> Unit> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionResult[PropertyDescriptorImpl]

'project' @ [113:70] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.doInvoke[ValueParameterDescriptorImpl]

'showErrorHintByKey' @ [118:13] ==> public fun showErrorHintByKey(project: Project, editor: Editor, messageKey: String, title: String): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce in file introduceUtil.kt[SimpleFunctionDescriptorImpl]

'project' @ [118:32] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.doInvoke[ValueParameterDescriptorImpl]

'editor' @ [118:41] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.doInvoke[ValueParameterDescriptorImpl]

'INTRODUCE_PROPERTY' @ [118:82] ==> public val INTRODUCE_PROPERTY: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty in file KotlinIntroducePropertyHandler.kt[PropertyDescriptorImpl]

'file' @ [123:13] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.invoke[ValueParameterDescriptorImpl]

'selectElements' @ [124:9] ==> public final fun selectElements(editor: Editor, file: KtFile, continuation: (elements: List<PsiElement>, targetSibling: PsiElement) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler[SimpleFunctionDescriptorImpl]

'editor' @ [124:24] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.invoke[ValueParameterDescriptorImpl]

'file' @ [124:32] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.invoke[ValueParameterDescriptorImpl]

'doInvoke' @ [124:67] ==> public final fun doInvoke(project: Project, editor: Editor, file: KtFile, elements: List<PsiElement>, targetSibling: PsiElement): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler[SimpleFunctionDescriptorImpl]

'project' @ [124:76] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.invoke[ValueParameterDescriptorImpl]

'editor' @ [124:85] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.invoke[ValueParameterDescriptorImpl]

'file' @ [124:93] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.invoke[ValueParameterDescriptorImpl]

'elements' @ [124:99] ==> value-parameter elements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.invoke.<anonymous>[ValueParameterDescriptorImpl]

'targetSibling' @ [124:109] ==> value-parameter targetSibling: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty.KotlinIntroducePropertyHandler.invoke.<anonymous>[ValueParameterDescriptorImpl]

'AssertionError' @ [128:15] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'INTRODUCE_PROPERTY' @ [128:32] ==> public val INTRODUCE_PROPERTY: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceProperty in file KotlinIntroducePropertyHandler.kt[PropertyDescriptorImpl]

'message' @ [132:58] ==> @NotNull public open fun message(@NonNls @PropertyKey key: (String..String?), vararg params: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.refactoring.KotlinRefactoringBundle[JavaMethodDescriptor]

