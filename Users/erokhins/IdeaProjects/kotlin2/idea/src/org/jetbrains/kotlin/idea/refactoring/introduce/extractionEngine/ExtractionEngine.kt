'data' @ [33:75] ==> value-parameter data: ExtractionData defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngineHelper.adjustExtractionData[ValueParameterDescriptorImpl]

'config' @ [36:23] ==> value-parameter config: ExtractionGeneratorConfiguration defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngineHelper.doRefactor[ValueParameterDescriptorImpl]

'descriptor' @ [36:30] ==> public final val descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionGeneratorConfiguration[PropertyDescriptorImpl]

'extractionData' @ [36:41] ==> public final val extractionData: ExtractionData defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptor[PropertyDescriptorImpl]

'project' @ [36:56] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'invoke' @ [37:9] ==> public abstract operator fun invoke(p1: ExtractionResult): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'project' @ [37:18] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngineHelper.doRefactor[LocalVariableDescriptor]

'executeWriteCommand' @ [37:26] ==> public fun <T> Project.executeWriteCommand(name: String, groupId: Any? = ..., command: () -> ExtractionResult): ExtractionResult defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExtractionResult

'operationName' @ [37:64] ==> public final val operationName: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngineHelper[PropertyDescriptorImpl]

'config' @ [37:81] ==> value-parameter config: ExtractionGeneratorConfiguration defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngineHelper.doRefactor[ValueParameterDescriptorImpl]

'generateDeclaration' @ [37:88] ==> public fun ExtractionGeneratorConfiguration.generateDeclaration(declarationToReplace: KtNamedDeclaration? = ...): ExtractionResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractorUtil.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [40:104] ==> value-parameter descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngineHelper.validate[ValueParameterDescriptorImpl]

'validate' @ [40:115] ==> @JvmOverloads public fun ExtractableCodeDescriptor.validate(target: ExtractionTarget = ...): ExtractableCodeDescriptorWithConflicts defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[SimpleFunctionDescriptorImpl]

'extractionData' @ [57:23] ==> value-parameter extractionData: ExtractionData defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngine.run[ValueParameterDescriptorImpl]

'project' @ [57:38] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[PropertyDescriptorImpl]

'helper' @ [59:30] ==> public final val helper: ExtractionEngineHelper defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngine[PropertyDescriptorImpl]

'adjustExtractionData' @ [59:37] ==> public open fun adjustExtractionData(data: ExtractionData): ExtractionData defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngineHelper[SimpleFunctionDescriptorImpl]

'extractionData' @ [59:58] ==> value-parameter extractionData: ExtractionData defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngine.run[ValueParameterDescriptorImpl]

'performAnalysis' @ [59:74] ==> public fun ExtractionData.performAnalysis(): AnalysisResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file extractableAnalysisUtil.kt[SimpleFunctionDescriptorImpl]

'!!' @ [61:13] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: Application?): Application[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> Application

'getApplication' @ [61:32] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [61:51] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'analysisResult' @ [61:69] ==> val analysisResult: AnalysisResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngine.run[LocalVariableDescriptor]

'status' @ [61:84] ==> public final val status: AnalysisResult.Status defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult[PropertyDescriptorImpl]

'SUCCESS' @ [61:116] ==> enum entry SUCCESS defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult.Status[FakeCallableDescriptorForObject]

'ConflictsInTestsException' @ [62:44] ==> public constructor ConflictsInTestsException(@NotNull p0: (MutableCollection<out (String..String?)>..Collection<(String..String?)>)) defined in com.intellij.refactoring.BaseRefactoringProcessor.ConflictsInTestsException[JavaClassConstructorDescriptor]

'analysisResult' @ [62:70] ==> val analysisResult: AnalysisResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngine.run[LocalVariableDescriptor]

'messages' @ [62:85] ==> public final val messages: List<AnalysisResult.ErrorMessage> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult[PropertyDescriptorImpl]

'map' @ [62:94] ==> public inline fun <T, R> Iterable<AnalysisResult.ErrorMessage>.map(transform: (AnalysisResult.ErrorMessage) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ErrorMessage
    <R> -> String

'it' @ [62:100] ==> value-parameter it: AnalysisResult.ErrorMessage defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngine.run.<anonymous>[ValueParameterDescriptorImpl]

'renderMessage' @ [62:103] ==> public final fun renderMessage(): String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult.ErrorMessage[SimpleFunctionDescriptorImpl]

'helper' @ [66:36] ==> public final val helper: ExtractionEngineHelper defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngine[PropertyDescriptorImpl]

'validate' @ [66:43] ==> public open fun validate(descriptor: ExtractableCodeDescriptor): ExtractableCodeDescriptorWithConflicts defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngineHelper[SimpleFunctionDescriptorImpl]

'analysisResult' @ [66:52] ==> val analysisResult: AnalysisResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngine.run[LocalVariableDescriptor]

'descriptor' @ [66:67] ==> public final val descriptor: ExtractableCodeDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult[PropertyDescriptorImpl]

'project' @ [67:13] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngine.run[LocalVariableDescriptor]

'checkConflictsInteractively' @ [67:21] ==> public fun Project.checkConflictsInteractively(conflicts: MultiMap<PsiElement, String>, onShowConflicts: () -> Unit = ..., onAccept: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'validationResult' @ [67:49] ==> val validationResult: ExtractableCodeDescriptorWithConflicts defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngine.run.validateAndRefactor[LocalVariableDescriptor]

'conflicts' @ [67:66] ==> public final val conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptorWithConflicts[PropertyDescriptorImpl]

'helper' @ [68:17] ==> public final val helper: ExtractionEngineHelper defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngine[PropertyDescriptorImpl]

'configureAndRun' @ [68:24] ==> public abstract fun configureAndRun(project: Project, editor: Editor, descriptorWithConflicts: ExtractableCodeDescriptorWithConflicts, onFinish: (ExtractionResult) -> Unit = ...): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngineHelper[SimpleFunctionDescriptorImpl]

'project' @ [68:40] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngine.run[LocalVariableDescriptor]

'editor' @ [68:49] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngine.run[ValueParameterDescriptorImpl]

'validationResult' @ [68:57] ==> val validationResult: ExtractableCodeDescriptorWithConflicts defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngine.run.validateAndRefactor[LocalVariableDescriptor]

'invoke' @ [70:25] ==> public abstract operator fun invoke(p1: ExtractionResult): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [70:34] ==> value-parameter it: ExtractionResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngine.run.validateAndRefactor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [73:25] ==> value-parameter it: ExtractionResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngine.run.validateAndRefactor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'dispose' @ [73:28] ==> public open fun dispose(): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionResult[SimpleFunctionDescriptorImpl]

'extractionData' @ [74:25] ==> value-parameter extractionData: ExtractionData defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngine.run[ValueParameterDescriptorImpl]

'dispose' @ [74:40] ==> public open fun dispose(): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[SimpleFunctionDescriptorImpl]

'analysisResult' @ [80:23] ==> val analysisResult: AnalysisResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngine.run[LocalVariableDescriptor]

'messages' @ [80:38] ==> public final val messages: List<AnalysisResult.ErrorMessage> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult[PropertyDescriptorImpl]

'joinToString' @ [80:47] ==> public fun <T> Iterable<AnalysisResult.ErrorMessage>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((AnalysisResult.ErrorMessage) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ErrorMessage

'it' @ [80:68] ==> value-parameter it: AnalysisResult.ErrorMessage defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngine.run.<anonymous>[ValueParameterDescriptorImpl]

'renderMessage' @ [80:71] ==> public final fun renderMessage(): String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult.ErrorMessage[SimpleFunctionDescriptorImpl]

'when (analysisResult.status) {
            AnalysisResult.Status.CRITICAL_ERROR -> {
                showErrorHint(project, editor, message, helper.operationName)
            }

            AnalysisResult.Status.NON_CRITICAL_ERROR -> {
                val anchorPoint = RelativePoint(
                        editor.contentComponent,
                        editor.visualPositionToXY(editor.selectionModel.selectionStartPosition!!)
                )
                JBPopupFactory.getInstance()!!
                        .createHtmlTextBalloonBuilder(
                                "$message<br/><br/><a href=\"EXTRACT\">Proceed with extraction</a>",
                                MessageType.WARNING,
                                { event ->
                                    if (event?.eventType == HyperlinkEvent.EventType.ACTIVATED) {
                                        validateAndRefactor()
                                    }
                                }
                        )
                        .setHideOnClickOutside(true)
                        .setHideOnFrameResize(false)
                        .setHideOnLinkClick(true)
                        .createBalloon()
                        .show(anchorPoint, Balloon.Position.below)
            }

            AnalysisResult.Status.SUCCESS -> validateAndRefactor()
        }' @ [81:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'analysisResult' @ [81:15] ==> val analysisResult: AnalysisResult defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngine.run[LocalVariableDescriptor]

'status' @ [81:30] ==> public final val status: AnalysisResult.Status defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult[PropertyDescriptorImpl]

'CRITICAL_ERROR' @ [82:35] ==> enum entry CRITICAL_ERROR defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult.Status[FakeCallableDescriptorForObject]

'showErrorHint' @ [83:17] ==> public fun showErrorHint(project: Project, editor: Editor, message: String, title: String): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce in file introduceUtil.kt[SimpleFunctionDescriptorImpl]

'project' @ [83:31] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngine.run[LocalVariableDescriptor]

'editor' @ [83:40] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngine.run[ValueParameterDescriptorImpl]

'message' @ [83:48] ==> val message: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngine.run[LocalVariableDescriptor]

'helper' @ [83:57] ==> public final val helper: ExtractionEngineHelper defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngine[PropertyDescriptorImpl]

'operationName' @ [83:64] ==> public final val operationName: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngineHelper[PropertyDescriptorImpl]

'NON_CRITICAL_ERROR' @ [86:35] ==> enum entry NON_CRITICAL_ERROR defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult.Status[FakeCallableDescriptorForObject]

'RelativePoint' @ [87:35] ==> public constructor RelativePoint(@NotNull p0: Component, p1: (Point..Point?)) defined in com.intellij.ui.awt.RelativePoint[JavaClassConstructorDescriptor]

'editor' @ [88:25] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngine.run[ValueParameterDescriptorImpl]

'contentComponent' @ [88:32] ==> public final val Editor.contentComponent: JComponent[MyPropertyDescriptor]

'editor' @ [89:25] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngine.run[ValueParameterDescriptorImpl]

'visualPositionToXY' @ [89:32] ==> @NotNull public abstract fun visualPositionToXY(@NotNull p0: VisualPosition): Point defined in com.intellij.openapi.editor.Editor[JavaMethodDescriptor]

'editor' @ [89:51] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngine.run[ValueParameterDescriptorImpl]

'selectionModel' @ [89:58] ==> public final val Editor.selectionModel: SelectionModel[MyPropertyDescriptor]

'selectionStartPosition' @ [89:73] ==> public final val SelectionModel.selectionStartPosition: VisualPosition?[MyPropertyDescriptor]

'!!' @ [91:17] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: JBPopupFactory?): JBPopupFactory[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> JBPopupFactory

'getInstance' @ [91:32] ==> public open fun getInstance(): (JBPopupFactory..JBPopupFactory?) defined in com.intellij.openapi.ui.popup.JBPopupFactory[JavaMethodDescriptor]

'createHtmlTextBalloonBuilder' @ [92:26] ==> @NotNull public final fun createHtmlTextBalloonBuilder(@NotNull p0: String, p1: (MessageType..MessageType?), @Nullable p2: (((HyperlinkEvent..HyperlinkEvent?)) -> Unit)?): BalloonBuilder defined in com.intellij.openapi.ui.popup.JBPopupFactory[MyFunctionDescriptor]

'message' @ [93:35] ==> val message: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngine.run[LocalVariableDescriptor]

'WARNING' @ [94:45] ==> public final val WARNING: (MessageType..MessageType?) defined in com.intellij.openapi.ui.MessageType[JavaPropertyDescriptor]

'event' @ [96:41] ==> value-parameter event: (HyperlinkEvent..HyperlinkEvent?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngine.run.<anonymous>[ValueParameterDescriptorImpl]

'eventType' @ [96:48] ==> public final val HyperlinkEvent.eventType: (HyperlinkEvent.EventType..HyperlinkEvent.EventType?)[MyPropertyDescriptor]

'ACTIVATED' @ [96:86] ==> public final val ACTIVATED: (HyperlinkEvent.EventType..HyperlinkEvent.EventType?) defined in javax.swing.event.HyperlinkEvent.EventType[JavaPropertyDescriptor]

'validateAndRefactor' @ [97:41] ==> local final fun validateAndRefactor(): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngine.run[SimpleFunctionDescriptorImpl]

'setHideOnClickOutside' @ [101:26] ==> @NotNull public abstract fun setHideOnClickOutside(p0: Boolean): BalloonBuilder defined in com.intellij.openapi.ui.popup.BalloonBuilder[JavaMethodDescriptor]

'setHideOnFrameResize' @ [102:26] ==> @NotNull public abstract fun setHideOnFrameResize(p0: Boolean): BalloonBuilder defined in com.intellij.openapi.ui.popup.BalloonBuilder[JavaMethodDescriptor]

'setHideOnLinkClick' @ [103:26] ==> @NotNull public abstract fun setHideOnLinkClick(p0: Boolean): BalloonBuilder defined in com.intellij.openapi.ui.popup.BalloonBuilder[JavaMethodDescriptor]

'createBalloon' @ [104:26] ==> @NotNull public abstract fun createBalloon(): Balloon defined in com.intellij.openapi.ui.popup.BalloonBuilder[JavaMethodDescriptor]

'show' @ [105:26] ==> public abstract fun show(p0: (RelativePoint..RelativePoint?), p1: (Balloon.Position..Balloon.Position?)): Unit defined in com.intellij.openapi.ui.popup.Balloon[JavaMethodDescriptor]

'anchorPoint' @ [105:31] ==> val anchorPoint: RelativePoint defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngine.run[LocalVariableDescriptor]

'below' @ [105:61] ==> enum entry below defined in com.intellij.openapi.ui.popup.Balloon.Position[FakeCallableDescriptorForObject]

'SUCCESS' @ [108:35] ==> enum entry SUCCESS defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.AnalysisResult.Status[FakeCallableDescriptorForObject]

'validateAndRefactor' @ [108:46] ==> local final fun validateAndRefactor(): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngine.run[SimpleFunctionDescriptorImpl]

