'AbstractMultiModuleTest' @ [39:50] ==> public constructor AbstractMultiModuleTest() defined in org.jetbrains.kotlin.idea.stubs.AbstractMultiModuleTest[ClassConstructorDescriptorImpl]

'+' @ [41:38] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getTestDataPathBase' @ [41:57] ==> @NotNull public open fun getTestDataPathBase(): String defined in org.jetbrains.kotlin.idea.test.PluginTestCaseBase[JavaMethodDescriptor]

'isDirectiveDefined' @ [44:35] ==> public open fun isDirectiveDefined(p0: (String..String?), p1: (String..String?)): Boolean defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'file' @ [44:54] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.shouldBeAvailableAfterExecution[ValueParameterDescriptorImpl]

'text' @ [44:59] ==> public final val KtFile.text: (String..String?)[MyPropertyDescriptor]

'availableActions' @ [46:76] ==> value-parameter availableActions: List<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.getActionsTexts[ValueParameterDescriptorImpl]

'map' @ [46:93] ==> public inline fun <T, R> Iterable<IntentionAction>.map(transform: (IntentionAction) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntentionAction
    <R> -> String

'it' @ [46:99] ==> value-parameter it: IntentionAction defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.getActionsTexts.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [46:102] ==> public final val IntentionAction.text: String[MyPropertyDescriptor]

'allFilesInProject' @ [49:56] ==> @NotNull public open fun allFilesInProject(@NotNull p0: Project): (MutableCollection<(KtFile..KtFile?)>..Collection<(KtFile..KtFile?)>) defined in org.jetbrains.kotlin.idea.project.PluginJetFilesProvider[JavaMethodDescriptor]

'myProject' @ [49:74] ==> protected/*protected and package*/ final var myProject: (Project..Project?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest[JavaPropertyDescriptor]

'allFilesInProject' @ [50:26] ==> val allFilesInProject: (MutableCollection<(KtFile..KtFile?)>..Collection<(KtFile..KtFile?)>) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doQuickFixTest[LocalVariableDescriptor]

'single' @ [50:44] ==> public inline fun <T> Iterable<(KtFile..KtFile?)>.single(predicate: ((KtFile..KtFile?)) -> Boolean): (KtFile..KtFile?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtFile..org.jetbrains.kotlin.psi.KtFile?)

'file' @ [51:13] ==> value-parameter file: (KtFile..KtFile?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doQuickFixTest.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [51:18] ==> public final val KtFile.text: (String..String?)[MyPropertyDescriptor]

'contains' @ [51:23] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'configureByExistingFile' @ [54:9] ==> protected/*protected and package*/ open fun configureByExistingFile(@NotNull p0: VirtualFile): Unit defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest[JavaMethodDescriptor]

'actionFile' @ [54:33] ==> val actionFile: (KtFile..KtFile?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doQuickFixTest[LocalVariableDescriptor]

'virtualFile' @ [54:44] ==> public final val KtFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'actionFile' @ [56:30] ==> val actionFile: (KtFile..KtFile?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doQuickFixTest[LocalVariableDescriptor]

'text' @ [56:41] ==> public final val KtFile.text: (String..String?)[MyPropertyDescriptor]

'actionFile' @ [57:30] ==> val actionFile: (KtFile..KtFile?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doQuickFixTest[LocalVariableDescriptor]

'name' @ [57:41] ==> public final var KtFile.name: String[MyPropertyDescriptor]

'getInstance' @ [59:26] ==> public open fun getInstance(): (CommandProcessor..CommandProcessor?) defined in com.intellij.openapi.command.CommandProcessor[JavaMethodDescriptor]

'executeCommand' @ [59:40] ==> public final fun executeCommand(@Nullable p0: Project?, @NotNull p1: () -> Unit, @Nullable p2: String?, @Nullable p3: Any?): Unit defined in com.intellij.openapi.command.CommandProcessor[MyFunctionDescriptor]

'project' @ [59:55] ==> public final val AbstractQuickFixMultiModuleTest.project: (Project..Project?)[MyPropertyDescriptor]

'actionFile' @ [61:31] ==> val actionFile: (KtFile..KtFile?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doQuickFixTest[LocalVariableDescriptor]

'parse' @ [63:45] ==> @NotNull public open fun parse(@NotNull p0: PsiFile, @NotNull p1: String): ActionHint defined in com.intellij.codeInsight.daemon.quickFix.ActionHint[JavaMethodDescriptor]

'psiFile' @ [63:51] ==> val psiFile: (KtFile..KtFile?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doQuickFixTest.<anonymous>[LocalVariableDescriptor]

'actionFileText' @ [63:60] ==> val actionFileText: (String..String?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doQuickFixTest[LocalVariableDescriptor]

'actionHint' @ [64:28] ==> val actionHint: ActionHint defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doQuickFixTest.<anonymous>[LocalVariableDescriptor]

'expectedText' @ [64:39] ==> public final val ActionHint.expectedText: (String..String?)[MyPropertyDescriptor]

'actionHint' @ [66:47] ==> val actionHint: ActionHint defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doQuickFixTest.<anonymous>[LocalVariableDescriptor]

'shouldPresent' @ [66:58] ==> public open fun shouldPresent(): Boolean defined in com.intellij.codeInsight.daemon.quickFix.ActionHint[JavaMethodDescriptor]

'psiFile' @ [68:21] ==> val psiFile: (KtFile..KtFile?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doQuickFixTest.<anonymous>[LocalVariableDescriptor]

'DirectiveBasedActionUtils' @ [69:21] ==> public object DirectiveBasedActionUtils defined in org.jetbrains.kotlin.idea.test in file DirectiveBasedActionUtils.kt[FakeCallableDescriptorForObject]

'checkForUnexpectedErrors' @ [69:47] ==> public final fun checkForUnexpectedErrors(file: KtFile): Unit defined in org.jetbrains.kotlin.idea.test.DirectiveBasedActionUtils[SimpleFunctionDescriptorImpl]

'psiFile' @ [69:72] ==> val psiFile: (KtFile..KtFile?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doQuickFixTest.<anonymous>[LocalVariableDescriptor]

'doAction' @ [72:17] ==> public final fun doAction(text: String, actionShouldBeAvailable: Boolean, testFilePath: String, actionFile: KtFile): Unit defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest[SimpleFunctionDescriptorImpl]

'text' @ [72:26] ==> val text: (String..String?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doQuickFixTest.<anonymous>[LocalVariableDescriptor]

'actionShouldBeAvailable' @ [72:32] ==> val actionShouldBeAvailable: Boolean defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doQuickFixTest.<anonymous>[LocalVariableDescriptor]

'actionFileName' @ [72:57] ==> val actionFileName: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doQuickFixTest[LocalVariableDescriptor]

'actionFile' @ [72:73] ==> val actionFile: (KtFile..KtFile?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doQuickFixTest[LocalVariableDescriptor]

'actionShouldBeAvailable' @ [74:21] ==> val actionShouldBeAvailable: Boolean defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doQuickFixTest.<anonymous>[LocalVariableDescriptor]

'File' @ [75:41] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'testDataPath' @ [75:46] ==> protected for synthetic extension final val AbstractQuickFixMultiModuleTest.testDataPath: String[MyPropertyDescriptor]

'File' @ [76:44] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'testDataPath' @ [76:51] ==> protected for synthetic extension final val AbstractQuickFixMultiModuleTest.testDataPath: String[MyPropertyDescriptor]

'getTestName' @ [76:65] ==> @NotNull protected/*protected and package*/ open fun getTestName(p0: Boolean): String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest[JavaMethodDescriptor]

'projectDirectory' @ [77:45] ==> val projectDirectory: File defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doQuickFixTest.<anonymous>[LocalVariableDescriptor]

'listFiles' @ [77:62] ==> public open fun listFiles(): (Array<(File..File?)>..Array<out (File..File?)>?) defined in java.io.File[JavaMethodDescriptor]

'moduleDirectory' @ [78:38] ==> val moduleDirectory: (File..File?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doQuickFixTest.<anonymous>[LocalVariableDescriptor]

'walkTopDown' @ [78:54] ==> public fun File.walkTopDown(): FileTreeWalk defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'!' @ [79:33] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'file' @ [79:34] ==> val file: File defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doQuickFixTest.<anonymous>[LocalVariableDescriptor]

'path' @ [79:39] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'endsWith' @ [79:44] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'file' @ [81:51] ==> val file: File defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doQuickFixTest.<anonymous>[LocalVariableDescriptor]

'readLines' @ [81:56] ==> public fun File.readLines(charset: Charset = ...): List<String> defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'find' @ [81:68] ==> @InlineOnly public inline fun <T> Iterable<String>.find(predicate: (String) -> Boolean): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [81:75] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doQuickFixTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [81:78] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'substringAfter' @ [81:103] ==> public fun String.substringAfter(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'allFilesInProject' @ [82:50] ==> val allFilesInProject: (MutableCollection<(KtFile..KtFile?)>..Collection<(KtFile..KtFile?)>) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doQuickFixTest[LocalVariableDescriptor]

'mapNotNull' @ [82:68] ==> public inline fun <T, R : Any> Iterable<(KtFile..KtFile?)>.mapNotNull(transform: ((KtFile..KtFile?)) -> KtFile?): List<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtFile..org.jetbrains.kotlin.psi.KtFile?)
    <R : Any> -> KtFile

'it' @ [83:53] ==> value-parameter it: (KtFile..KtFile?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doQuickFixTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'containingDirectory' @ [83:56] ==> public final val KtFile.containingDirectory: PsiDirectory?[MyPropertyDescriptor]

'findFile' @ [83:77] ==> @Nullable public abstract fun findFile(@NotNull @NonNls p0: String): PsiFile? defined in com.intellij.psi.PsiDirectory[JavaMethodDescriptor]

'file' @ [83:86] ==> val file: File defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doQuickFixTest.<anonymous>[LocalVariableDescriptor]

'name' @ [83:91] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'removeSuffix' @ [83:96] ==> public fun String.removeSuffix(suffix: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'if (candidate?.packageFqName?.toString() == packageName) candidate else null' @ [84:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtFile?, elseBranch: KtFile?): KtFile?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtFile?

'candidate' @ [84:41] ==> val candidate: KtFile? defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doQuickFixTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'packageFqName' @ [84:52] ==> public final val KtFile.packageFqName: FqName[MyPropertyDescriptor]

'toString' @ [84:67] ==> public open fun toString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'packageName' @ [84:81] ==> val packageName: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doQuickFixTest.<anonymous>[LocalVariableDescriptor]

'candidate' @ [84:94] ==> val candidate: KtFile? defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doQuickFixTest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'single' @ [85:35] ==> public fun <T> List<KtFile>.single(): KtFile defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'setActiveEditor' @ [86:33] ==> protected/*protected and package*/ final fun setActiveEditor(@NotNull p0: Editor): Unit defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest[JavaMethodDescriptor]

'editedFile' @ [86:49] ==> val editedFile: KtFile defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doQuickFixTest.<anonymous>[LocalVariableDescriptor]

'findExistingEditor' @ [86:60] ==> public fun PsiElement.findExistingEditor(): Editor? defined in org.jetbrains.kotlin.idea.inspections[DeserializedSimpleFunctionDescriptor]

'createEditor' @ [86:84] ==> protected/*protected and package*/ open fun createEditor(@NotNull p0: VirtualFile): (Editor..Editor?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest[JavaMethodDescriptor]

'editedFile' @ [86:97] ==> val editedFile: KtFile defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doQuickFixTest.<anonymous>[LocalVariableDescriptor]

'virtualFile' @ [86:108] ==> public final val KtFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'checkResultByFile' @ [87:33] ==> protected/*protected and package*/ open fun checkResultByFile(@NotNull p0: String): Unit defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest[JavaMethodDescriptor]

'file' @ [87:51] ==> val file: File defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doQuickFixTest.<anonymous>[LocalVariableDescriptor]

'relativeTo' @ [87:56] ==> public fun File.relativeTo(base: File): File defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'testDirectory' @ [87:67] ==> val testDirectory: File defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doQuickFixTest.<anonymous>[LocalVariableDescriptor]

'path' @ [87:82] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'assertEqualsToFile' @ [90:49] ==> public open fun assertEqualsToFile(@NotNull p0: File, @NotNull p1: Editor): Unit defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'file' @ [90:68] ==> val file: File defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doQuickFixTest.<anonymous>[LocalVariableDescriptor]

'editor' @ [90:74] ==> public final val AbstractQuickFixMultiModuleTest.editor: (Editor..Editor?)[MyPropertyDescriptor]

'e' @ [97:23] ==> val e: ComparisonFailure defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doQuickFixTest.<anonymous>[LocalVariableDescriptor]

'e' @ [100:23] ==> val e: AssertionError /* = AssertionError */ defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doQuickFixTest.<anonymous>[LocalVariableDescriptor]

'e' @ [103:17] ==> val e: Throwable defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doQuickFixTest.<anonymous>[LocalVariableDescriptor]

'printStackTrace' @ [103:19] ==> public open fun printStackTrace(): Unit defined in kotlin.Throwable[JavaMethodDescriptor]

'fail' @ [104:26] ==> public open fun fail(p0: (String..String?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'getTestName' @ [104:31] ==> @NotNull protected/*protected and package*/ open fun getTestName(p0: Boolean): String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest[JavaMethodDescriptor]

'if (text.startsWith("/"))
            Pattern.compile(text.substring(1, text.length - 1))
        else
            Pattern.compile(StringUtil.escapeToRegexp(text))' @ [112:23] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Pattern..Pattern?), elseBranch: (Pattern..Pattern?)): (Pattern..Pattern?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (java.util.regex.Pattern..java.util.regex.Pattern?)

'text' @ [112:27] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doAction[ValueParameterDescriptorImpl]

'startsWith' @ [112:32] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'compile' @ [113:21] ==> public open fun compile(p0: (String..String?)): (Pattern..Pattern?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'text' @ [113:29] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doAction[ValueParameterDescriptorImpl]

'substring' @ [113:34] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'text' @ [113:47] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doAction[ValueParameterDescriptorImpl]

'length' @ [113:52] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'compile' @ [115:21] ==> public open fun compile(p0: (String..String?)): (Pattern..Pattern?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'escapeToRegexp' @ [115:40] ==> @NotNull @Contract public open fun escapeToRegexp(@NotNull p0: String): String defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'text' @ [115:55] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doAction[ValueParameterDescriptorImpl]

'getAvailableActions' @ [117:32] ==> private final fun getAvailableActions(): List<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest[SimpleFunctionDescriptorImpl]

'findActionByPattern' @ [118:22] ==> private final fun findActionByPattern(pattern: Pattern, availableActions: List<IntentionAction>): IntentionAction? defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest[SimpleFunctionDescriptorImpl]

'pattern' @ [118:42] ==> val pattern: (Pattern..Pattern?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doAction[LocalVariableDescriptor]

'availableActions' @ [118:51] ==> val availableActions: List<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doAction[LocalVariableDescriptor]

'if (action == null) {
            if (actionShouldBeAvailable) {
                val texts = getActionsTexts(availableActions)
                val infos = doHighlighting()
                TestCase.fail("Action with text '" + text + "' is not available in test " + testFilePath + "\n" +
                              "Available actions (" + texts.size + "): \n" +
                              StringUtil.join(texts, "\n") +
                              "\nActions:\n" +
                              StringUtil.join(availableActions, "\n") +
                              "\nInfos:\n" +
                              StringUtil.join(infos, "\n"))
            }
            else {
                DirectiveBasedActionUtils.checkAvailableActionsAreExpected(file, availableActions)
            }
        }
        else {
            if (!actionShouldBeAvailable) {
                TestCase.fail("Action '$text' is available (but must not) in test $testFilePath")
            }

            ShowIntentionActionsHandler.chooseActionAndInvoke(file, editor, action, action.text)

            UIUtil.dispatchAllInvocationEvents()


            if (!shouldBeAvailableAfterExecution(actionFile)) {
                val afterAction = findActionByPattern(pattern, getAvailableActions())

                if (afterAction != null) {
                    TestCase.fail("Action '$text' is still available after its invocation in test $testFilePath")
                }
            }
        }' @ [120:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'action' @ [120:13] ==> val action: IntentionAction? defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doAction[LocalVariableDescriptor]

'if (actionShouldBeAvailable) {
                val texts = getActionsTexts(availableActions)
                val infos = doHighlighting()
                TestCase.fail("Action with text '" + text + "' is not available in test " + testFilePath + "\n" +
                              "Available actions (" + texts.size + "): \n" +
                              StringUtil.join(texts, "\n") +
                              "\nActions:\n" +
                              StringUtil.join(availableActions, "\n") +
                              "\nInfos:\n" +
                              StringUtil.join(infos, "\n"))
            }
            else {
                DirectiveBasedActionUtils.checkAvailableActionsAreExpected(file, availableActions)
            }' @ [121:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'actionShouldBeAvailable' @ [121:17] ==> value-parameter actionShouldBeAvailable: Boolean defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doAction[ValueParameterDescriptorImpl]

'getActionsTexts' @ [122:29] ==> private final fun getActionsTexts(availableActions: List<IntentionAction>): List<String> defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest[SimpleFunctionDescriptorImpl]

'availableActions' @ [122:45] ==> val availableActions: List<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doAction[LocalVariableDescriptor]

'doHighlighting' @ [123:29] ==> @NotNull protected/*protected and package*/ open fun doHighlighting(): (MutableList<(HighlightInfo..HighlightInfo?)>..List<(HighlightInfo..HighlightInfo?)>) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest[JavaMethodDescriptor]

'fail' @ [124:26] ==> public open fun fail(p0: (String..String?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'+' @ [124:31] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'text' @ [124:54] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doAction[ValueParameterDescriptorImpl]

'testFilePath' @ [124:93] ==> value-parameter testFilePath: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doAction[ValueParameterDescriptorImpl]

'texts' @ [125:55] ==> val texts: List<String> defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doAction[LocalVariableDescriptor]

'size' @ [125:61] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'join' @ [126:42] ==> @NotNull @Contract public open fun join(@NotNull p0: (MutableCollection<(String..String?)>..Collection<(String..String?)>), @NotNull p1: String): String defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'texts' @ [126:47] ==> val texts: List<String> defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doAction[LocalVariableDescriptor]

'join' @ [128:42] ==> @Contract public open fun join(@NotNull p0: (MutableIterable<*>..Iterable<*>), @NotNull @NonNls p1: String): (String..String?) defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'availableActions' @ [128:47] ==> val availableActions: List<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doAction[LocalVariableDescriptor]

'join' @ [130:42] ==> @Contract public open fun join(@NotNull p0: (MutableIterable<*>..Iterable<*>), @NotNull @NonNls p1: String): (String..String?) defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'infos' @ [130:47] ==> val infos: (MutableList<(HighlightInfo..HighlightInfo?)>..List<(HighlightInfo..HighlightInfo?)>) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doAction[LocalVariableDescriptor]

'DirectiveBasedActionUtils' @ [133:17] ==> public object DirectiveBasedActionUtils defined in org.jetbrains.kotlin.idea.test in file DirectiveBasedActionUtils.kt[FakeCallableDescriptorForObject]

'checkAvailableActionsAreExpected' @ [133:43] ==> public final fun checkAvailableActionsAreExpected(file: PsiFile, availableActions: Collection<IntentionAction>): Unit defined in org.jetbrains.kotlin.idea.test.DirectiveBasedActionUtils[SimpleFunctionDescriptorImpl]

'file' @ [133:76] ==> public final val AbstractQuickFixMultiModuleTest.file: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'availableActions' @ [133:82] ==> val availableActions: List<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doAction[LocalVariableDescriptor]

'!' @ [137:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'actionShouldBeAvailable' @ [137:18] ==> value-parameter actionShouldBeAvailable: Boolean defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doAction[ValueParameterDescriptorImpl]

'fail' @ [138:26] ==> public open fun fail(p0: (String..String?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'text' @ [138:41] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doAction[ValueParameterDescriptorImpl]

'testFilePath' @ [138:84] ==> value-parameter testFilePath: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doAction[ValueParameterDescriptorImpl]

'chooseActionAndInvoke' @ [141:41] ==> public open fun chooseActionAndInvoke(@NotNull p0: PsiFile, @NotNull p1: Editor, @NotNull p2: IntentionAction, @NotNull p3: String): Boolean defined in com.intellij.codeInsight.intention.impl.ShowIntentionActionsHandler[JavaMethodDescriptor]

'file' @ [141:63] ==> public final val AbstractQuickFixMultiModuleTest.file: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'editor' @ [141:69] ==> public final val AbstractQuickFixMultiModuleTest.editor: (Editor..Editor?)[MyPropertyDescriptor]

'action' @ [141:77] ==> val action: IntentionAction? defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doAction[LocalVariableDescriptor]

'action' @ [141:85] ==> val action: IntentionAction? defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doAction[LocalVariableDescriptor]

'text' @ [141:92] ==> public final val IntentionAction.text: String[MyPropertyDescriptor]

'dispatchAllInvocationEvents' @ [143:20] ==> public open fun dispatchAllInvocationEvents(): Unit defined in com.intellij.util.ui.UIUtil[JavaMethodDescriptor]

'!' @ [146:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'shouldBeAvailableAfterExecution' @ [146:18] ==> protected final fun shouldBeAvailableAfterExecution(file: KtFile): Boolean defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest[SimpleFunctionDescriptorImpl]

'actionFile' @ [146:50] ==> value-parameter actionFile: KtFile defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doAction[ValueParameterDescriptorImpl]

'findActionByPattern' @ [147:35] ==> private final fun findActionByPattern(pattern: Pattern, availableActions: List<IntentionAction>): IntentionAction? defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest[SimpleFunctionDescriptorImpl]

'pattern' @ [147:55] ==> val pattern: (Pattern..Pattern?) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doAction[LocalVariableDescriptor]

'getAvailableActions' @ [147:64] ==> private final fun getAvailableActions(): List<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest[SimpleFunctionDescriptorImpl]

'afterAction' @ [149:21] ==> val afterAction: IntentionAction? defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doAction[LocalVariableDescriptor]

'fail' @ [150:30] ==> public open fun fail(p0: (String..String?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'text' @ [150:45] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doAction[ValueParameterDescriptorImpl]

'testFilePath' @ [150:100] ==> value-parameter testFilePath: String defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.doAction[ValueParameterDescriptorImpl]

'availableActions' @ [157:33] ==> value-parameter availableActions: List<IntentionAction> defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.findActionByPattern[ValueParameterDescriptorImpl]

'pattern' @ [158:17] ==> value-parameter pattern: Pattern defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.findActionByPattern[ValueParameterDescriptorImpl]

'matcher' @ [158:25] ==> public open fun matcher(p0: (CharSequence..CharSequence?)): (Matcher..Matcher?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'availableAction' @ [158:33] ==> val availableAction: IntentionAction defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.findActionByPattern[LocalVariableDescriptor]

'text' @ [158:49] ==> public final val IntentionAction.text: String[MyPropertyDescriptor]

'matches' @ [158:55] ==> public open fun matches(): Boolean defined in java.util.regex.Matcher[JavaMethodDescriptor]

'availableAction' @ [159:24] ==> val availableAction: IntentionAction defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest.findActionByPattern[LocalVariableDescriptor]

'doHighlighting' @ [166:9] ==> @NotNull protected/*protected and package*/ open fun doHighlighting(): (MutableList<(HighlightInfo..HighlightInfo?)>..List<(HighlightInfo..HighlightInfo?)>) defined in org.jetbrains.kotlin.idea.quickfix.AbstractQuickFixMultiModuleTest[JavaMethodDescriptor]

'getAvailableActions' @ [167:38] ==> @NotNull public open fun getAvailableActions(@NotNull p0: Editor, @NotNull p1: PsiFile): (MutableList<(IntentionAction..IntentionAction?)>..List<(IntentionAction..IntentionAction?)>) defined in com.intellij.codeInsight.daemon.quickFix.LightQuickFixTestCase[JavaMethodDescriptor]

'editor' @ [167:58] ==> public final val AbstractQuickFixMultiModuleTest.editor: (Editor..Editor?)[MyPropertyDescriptor]

'file' @ [167:66] ==> public final val AbstractQuickFixMultiModuleTest.file: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'mockJdk' @ [170:59] ==> @NotNull public open fun mockJdk(): Sdk defined in org.jetbrains.kotlin.idea.test.PluginTestCaseBase[JavaMethodDescriptor]

