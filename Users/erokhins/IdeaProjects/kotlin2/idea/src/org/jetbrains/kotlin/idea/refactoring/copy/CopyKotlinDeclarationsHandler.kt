'CopyHandlerDelegateBase' @ [61:39] ==> public constructor CopyHandlerDelegateBase() defined in com.intellij.refactoring.copy.CopyHandlerDelegateBase[JavaClassConstructorDescriptor]

'UserDataProperty' @ [64:41] ==> public constructor UserDataProperty<in R : UserDataHolder, T : Any>(key: Key<String>) defined in org.jetbrains.kotlin.psi.UserDataProperty[DeserializedClassConstructorDescriptor]
Inferred types:
    <in R : UserDataHolder> -> Project
    <T : Any> -> String

'create' @ [64:62] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): Key<(String..String?)> defined in com.intellij.openapi.util.Key[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'parentsWithSelf' @ [67:37] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'firstOrNull' @ [67:53] ==> public inline fun <T> Sequence<PsiElement>.firstOrNull(predicate: (PsiElement) -> Boolean): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [67:67] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.Companion.getElementsToCopy.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [67:84] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.Companion.getElementsToCopy.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [67:112] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.Companion.getElementsToCopy.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [67:115] ==> public final val KtNamedDeclaration.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (declarationOrFile) {
                is KtFile -> declarationOrFile.declarations.filterIsInstance<KtNamedDeclaration>().ifEmpty { listOf(declarationOrFile) }
                is KtNamedDeclaration -> listOf(declarationOrFile)
                else -> emptyList()
            }' @ [68:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<KtElement>, entry1: List<KtElement>, entry2: List<KtElement>): List<KtElement>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<KtElement>

'declarationOrFile' @ [68:26] ==> val declarationOrFile: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.Companion.getElementsToCopy[LocalVariableDescriptor]

'declarationOrFile' @ [69:30] ==> val declarationOrFile: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.Companion.getElementsToCopy[LocalVariableDescriptor]

'declarations' @ [69:48] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'filterIsInstance' @ [69:61] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtNamedDeclaration

'ifEmpty' @ [69:100] ==> public inline fun <T, C : Collection<{PsiNamedElement & KtAnnotated}>> List<{PsiNamedElement & KtAnnotated}>.ifEmpty(body: () -> List<{PsiNamedElement & KtAnnotated}>): List<{PsiNamedElement & KtAnnotated}> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> {PsiNamedElement & KtAnnotated}
    <C : Collection<T>> -> List<{PsiNamedElement & KtAnnotated}>

'listOf' @ [69:110] ==> public fun <T> listOf(element: KtFile): List<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'declarationOrFile' @ [69:117] ==> val declarationOrFile: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.Companion.getElementsToCopy[LocalVariableDescriptor]

'listOf' @ [70:42] ==> public fun <T> listOf(element: KtNamedDeclaration): List<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration

'declarationOrFile' @ [70:49] ==> val declarationOrFile: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.Companion.getElementsToCopy[LocalVariableDescriptor]

'emptyList' @ [71:25] ==> public fun <T> emptyList(): List<KtElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'lazy' @ [76:37] ==> public fun <T> lazy(initializer: () -> CopyFilesOrDirectoriesHandler): Lazy<CopyFilesOrDirectoriesHandler> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CopyFilesOrDirectoriesHandler

'CopyFilesOrDirectoriesHandler' @ [76:44] ==> public constructor CopyFilesOrDirectoriesHandler() defined in com.intellij.refactoring.copy.CopyFilesOrDirectoriesHandler[JavaClassConstructorDescriptor]

'elements' @ [79:16] ==> value-parameter elements: Array<out PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.getSourceFiles[ValueParameterDescriptorImpl]

'map' @ [80:18] ==> public inline fun <T, R> Array<out PsiElement>.map(transform: (PsiElement) -> PsiFileSystemItem): List<PsiFileSystemItem> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> PsiFileSystemItem

'it' @ [80:24] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.getSourceFiles.<anonymous>[ValueParameterDescriptorImpl]

'containingFile' @ [80:27] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'it' @ [80:45] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.getSourceFiles.<anonymous>[ValueParameterDescriptorImpl]

'toTypedArray' @ [81:18] ==> public inline fun <reified T> Collection<PsiElement>.toTypedArray(): Array<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> PsiElement

'getSourceFiles' @ [85:27] ==> private final fun getSourceFiles(elements: Array<out PsiElement>): Array<PsiElement>? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler[SimpleFunctionDescriptorImpl]

'elements' @ [85:42] ==> value-parameter elements: Array<out PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.canCopyFiles[ValueParameterDescriptorImpl]

'!' @ [86:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'sourceFiles' @ [86:14] ==> val sourceFiles: Array<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.canCopyFiles[LocalVariableDescriptor]

'any' @ [86:26] ==> public inline fun <T> Array<out PsiElement>.any(predicate: (PsiElement) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [86:32] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.canCopyFiles.<anonymous>[ValueParameterDescriptorImpl]

'copyFilesHandler' @ [87:16] ==> private final val copyFilesHandler: CopyFilesOrDirectoriesHandler defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler[PropertyDescriptorImpl]

'canCopy' @ [87:33] ==> public open fun canCopy(p0: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>?), p1: Boolean): Boolean defined in com.intellij.refactoring.copy.CopyFilesOrDirectoriesHandler[JavaMethodDescriptor]

'sourceFiles' @ [87:41] ==> val sourceFiles: Array<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.canCopyFiles[LocalVariableDescriptor]

'fromUpdate' @ [87:54] ==> value-parameter fromUpdate: Boolean defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.canCopyFiles[ValueParameterDescriptorImpl]

'elements' @ [92:17] ==> value-parameter elements: Array<out PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.canCopyDeclarations[ValueParameterDescriptorImpl]

'flatMap' @ [93:26] ==> public inline fun <T, R> Array<out PsiElement>.flatMap(transform: (PsiElement) -> Iterable<KtElement>): List<KtElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> KtElement

'it' @ [93:36] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.canCopyDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'getElementsToCopy' @ [93:39] ==> private final fun PsiElement.getElementsToCopy(): List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.Companion[SimpleFunctionDescriptorImpl]

'ifEmpty' @ [93:59] ==> public inline fun <T, C : Collection<KtElement>> List<KtElement>.ifEmpty(body: () -> List<KtElement>): List<KtElement> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement
    <C : Collection<T>> -> List<KtElement>

'distinctBy' @ [94:26] ==> public inline fun <T, K> Iterable<KtElement>.distinctBy(selector: (KtElement) -> (PsiFile..PsiFile?)): List<KtElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement
    <K> -> (com.intellij.psi.PsiFile..com.intellij.psi.PsiFile?)

'it' @ [94:39] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.canCopyDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'containingFile' @ [94:42] ==> public final val KtElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'singleOrNull' @ [95:26] ==> public fun <T> List<KtElement>.singleOrNull(): KtElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'containingFile' @ [96:27] ==> public final val KtElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'containingFile' @ [97:16] ==> val containingFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.canCopyDeclarations[LocalVariableDescriptor]

'sourceRoot' @ [97:31] ==> public val PsiFileSystemItem.sourceRoot: VirtualFile? defined in org.jetbrains.kotlin.idea.util[DeserializedPropertyDescriptor]

'canCopyDeclarations' @ [101:16] ==> private final fun canCopyDeclarations(elements: Array<out PsiElement>): Boolean defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler[SimpleFunctionDescriptorImpl]

'elements' @ [101:36] ==> value-parameter elements: Array<out PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.canCopy[ValueParameterDescriptorImpl]

'canCopyFiles' @ [101:49] ==> private final fun canCopyFiles(elements: Array<out PsiElement>, fromUpdate: Boolean): Boolean defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler[SimpleFunctionDescriptorImpl]

'elements' @ [101:62] ==> value-parameter elements: Array<out PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.canCopy[ValueParameterDescriptorImpl]

'fromUpdate' @ [101:72] ==> value-parameter fromUpdate: Boolean defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.canCopy[ValueParameterDescriptorImpl]

'targetDirectory' @ [114:28] ==> value-parameter targetDirectory: PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.getOrCreateTargetFile[ValueParameterDescriptorImpl]

'findFile' @ [114:44] ==> @Nullable public abstract fun findFile(@NotNull @NonNls p0: String): PsiFile? defined in com.intellij.psi.PsiDirectory[JavaMethodDescriptor]

'targetFileName' @ [114:53] ==> value-parameter targetFileName: String defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.getOrCreateTargetFile[ValueParameterDescriptorImpl]

'existingFile' @ [115:13] ==> val existingFile: PsiFile? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.getOrCreateTargetFile[LocalVariableDescriptor]

'originalFile' @ [115:29] ==> value-parameter originalFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.getOrCreateTargetFile[ValueParameterDescriptorImpl]

'existingFile' @ [116:13] ==> val existingFile: PsiFile? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.getOrCreateTargetFile[LocalVariableDescriptor]

'getFilePolicy' @ [117:26] ==> private final fun getFilePolicy(existingFile: PsiFile?, targetFileName: String, targetDirectory: PsiDirectory, commandName: String): CopyKotlinDeclarationsHandler.ExistingFilePolicy defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler[SimpleFunctionDescriptorImpl]

'existingFile' @ [117:40] ==> val existingFile: PsiFile? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.getOrCreateTargetFile[LocalVariableDescriptor]

'targetFileName' @ [117:54] ==> value-parameter targetFileName: String defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.getOrCreateTargetFile[ValueParameterDescriptorImpl]

'targetDirectory' @ [117:70] ==> value-parameter targetDirectory: PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.getOrCreateTargetFile[ValueParameterDescriptorImpl]

'commandName' @ [117:87] ==> value-parameter commandName: String defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.getOrCreateTargetFile[ValueParameterDescriptorImpl]

'when (policy) {
                ExistingFilePolicy.APPEND -> {}
                ExistingFilePolicy.OVERWRITE -> runWriteAction { existingFile.delete() }
                ExistingFilePolicy.SKIP -> return null
            }' @ [118:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'policy' @ [118:19] ==> val policy: CopyKotlinDeclarationsHandler.ExistingFilePolicy defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.getOrCreateTargetFile[LocalVariableDescriptor]

'APPEND' @ [119:36] ==> enum entry APPEND defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.ExistingFilePolicy[FakeCallableDescriptorForObject]

'OVERWRITE' @ [120:36] ==> enum entry OVERWRITE defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.ExistingFilePolicy[FakeCallableDescriptorForObject]

'runWriteAction' @ [120:49] ==> public fun <T> runWriteAction(action: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'existingFile' @ [120:66] ==> val existingFile: PsiFile? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.getOrCreateTargetFile[LocalVariableDescriptor]

'delete' @ [120:79] ==> public abstract fun delete(): Unit defined in com.intellij.psi.PsiFile[JavaMethodDescriptor]

'SKIP' @ [121:36] ==> enum entry SKIP defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.ExistingFilePolicy[FakeCallableDescriptorForObject]

'runWriteAction' @ [124:16] ==> public fun <T> runWriteAction(action: () -> KtFile): KtFile defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'if (existingFile != null && existingFile.isValid) {
                existingFile as KtFile
            } else {
                createKotlinFile(targetFileName, targetDirectory)
            }' @ [125:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtFile, elseBranch: KtFile): KtFile[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtFile

'existingFile' @ [125:17] ==> val existingFile: PsiFile? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.getOrCreateTargetFile[LocalVariableDescriptor]

'existingFile' @ [125:41] ==> val existingFile: PsiFile? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.getOrCreateTargetFile[LocalVariableDescriptor]

'isValid' @ [125:54] ==> public final val PsiFile.isValid: Boolean[MyPropertyDescriptor]

'existingFile' @ [126:17] ==> val existingFile: PsiFile? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.getOrCreateTargetFile[LocalVariableDescriptor]

'createKotlinFile' @ [128:17] ==> public fun createKotlinFile(fileName: String, targetDir: PsiDirectory, packageName: String? = ...): KtFile defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'targetFileName' @ [128:34] ==> value-parameter targetFileName: String defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.getOrCreateTargetFile[ValueParameterDescriptorImpl]

'targetDirectory' @ [128:50] ==> value-parameter targetDirectory: PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.getOrCreateTargetFile[ValueParameterDescriptorImpl]

'getApplication' @ [139:49] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [139:66] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'if (existingFile !is KtFile) {
            if (isUnitTestMode) return ExistingFilePolicy.OVERWRITE

            val answer = Messages.showOkCancelDialog(
                    "File $targetFileName already exists in ${targetDirectory.virtualFile.path}",
                    commandName,
                    "Overwrite",
                    "Cancel",
                    Messages.getQuestionIcon()
            )
            if (answer == Messages.OK) ExistingFilePolicy.OVERWRITE else ExistingFilePolicy.SKIP
        }
        else {
            if (isUnitTestMode) return ExistingFilePolicy.APPEND

            val answer = Messages.showYesNoCancelDialog(
                    "File $targetFileName already exists in ${targetDirectory.virtualFile.path}",
                    commandName,
                    "Append",
                    "Overwrite",
                    "Cancel",
                    Messages.getQuestionIcon()
            )
            when (answer) {
                Messages.YES -> ExistingFilePolicy.APPEND
                Messages.NO -> ExistingFilePolicy.OVERWRITE
                else -> ExistingFilePolicy.SKIP
            }
        }' @ [140:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CopyKotlinDeclarationsHandler.ExistingFilePolicy, elseBranch: CopyKotlinDeclarationsHandler.ExistingFilePolicy): CopyKotlinDeclarationsHandler.ExistingFilePolicy[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ExistingFilePolicy

'existingFile' @ [140:20] ==> value-parameter existingFile: PsiFile? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.getFilePolicy[ValueParameterDescriptorImpl]

'isUnitTestMode' @ [141:17] ==> val isUnitTestMode: Boolean defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.getFilePolicy[LocalVariableDescriptor]

'OVERWRITE' @ [141:59] ==> enum entry OVERWRITE defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.ExistingFilePolicy[FakeCallableDescriptorForObject]

'showOkCancelDialog' @ [143:35] ==> @Messages.OkCancelResult public open fun showOkCancelDialog(p0: (String..String?), @Nls p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: (Icon..Icon?)): Int defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'targetFileName' @ [144:28] ==> value-parameter targetFileName: String defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.getFilePolicy[ValueParameterDescriptorImpl]

'targetDirectory' @ [144:63] ==> value-parameter targetDirectory: PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.getFilePolicy[ValueParameterDescriptorImpl]

'virtualFile' @ [144:79] ==> public final val PsiDirectory.virtualFile: VirtualFile[MyPropertyDescriptor]

'path' @ [144:91] ==> public final val VirtualFile.path: String[MyPropertyDescriptor]

'commandName' @ [145:21] ==> value-parameter commandName: String defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.getFilePolicy[ValueParameterDescriptorImpl]

'getQuestionIcon' @ [148:30] ==> @NotNull public open fun getQuestionIcon(): Icon defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'if (answer == Messages.OK) ExistingFilePolicy.OVERWRITE else ExistingFilePolicy.SKIP' @ [150:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CopyKotlinDeclarationsHandler.ExistingFilePolicy, elseBranch: CopyKotlinDeclarationsHandler.ExistingFilePolicy): CopyKotlinDeclarationsHandler.ExistingFilePolicy[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ExistingFilePolicy

'answer' @ [150:17] ==> val answer: Int defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.getFilePolicy[LocalVariableDescriptor]

'OK' @ [150:36] ==> public const final val OK: Int defined in com.intellij.openapi.ui.Messages[JavaPropertyDescriptor]

'OVERWRITE' @ [150:59] ==> enum entry OVERWRITE defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.ExistingFilePolicy[FakeCallableDescriptorForObject]

'SKIP' @ [150:93] ==> enum entry SKIP defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.ExistingFilePolicy[FakeCallableDescriptorForObject]

'isUnitTestMode' @ [153:17] ==> val isUnitTestMode: Boolean defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.getFilePolicy[LocalVariableDescriptor]

'APPEND' @ [153:59] ==> enum entry APPEND defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.ExistingFilePolicy[FakeCallableDescriptorForObject]

'showYesNoCancelDialog' @ [155:35] ==> @Messages.YesNoCancelResult public open fun showYesNoCancelDialog(p0: (String..String?), @Nls p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: (String..String?), p5: (Icon..Icon?)): Int defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'targetFileName' @ [156:28] ==> value-parameter targetFileName: String defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.getFilePolicy[ValueParameterDescriptorImpl]

'targetDirectory' @ [156:63] ==> value-parameter targetDirectory: PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.getFilePolicy[ValueParameterDescriptorImpl]

'virtualFile' @ [156:79] ==> public final val PsiDirectory.virtualFile: VirtualFile[MyPropertyDescriptor]

'path' @ [156:91] ==> public final val VirtualFile.path: String[MyPropertyDescriptor]

'commandName' @ [157:21] ==> value-parameter commandName: String defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.getFilePolicy[ValueParameterDescriptorImpl]

'getQuestionIcon' @ [161:30] ==> @NotNull public open fun getQuestionIcon(): Icon defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'when (answer) {
                Messages.YES -> ExistingFilePolicy.APPEND
                Messages.NO -> ExistingFilePolicy.OVERWRITE
                else -> ExistingFilePolicy.SKIP
            }' @ [163:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CopyKotlinDeclarationsHandler.ExistingFilePolicy, entry1: CopyKotlinDeclarationsHandler.ExistingFilePolicy, entry2: CopyKotlinDeclarationsHandler.ExistingFilePolicy): CopyKotlinDeclarationsHandler.ExistingFilePolicy[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ExistingFilePolicy

'answer' @ [163:19] ==> val answer: Int defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.getFilePolicy[LocalVariableDescriptor]

'YES' @ [164:26] ==> public const final val YES: Int defined in com.intellij.openapi.ui.Messages[JavaPropertyDescriptor]

'APPEND' @ [164:52] ==> enum entry APPEND defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.ExistingFilePolicy[FakeCallableDescriptorForObject]

'NO' @ [165:26] ==> public const final val NO: Int defined in com.intellij.openapi.ui.Messages[JavaPropertyDescriptor]

'OVERWRITE' @ [165:51] ==> enum entry OVERWRITE defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.ExistingFilePolicy[FakeCallableDescriptorForObject]

'SKIP' @ [166:44] ==> enum entry SKIP defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.ExistingFilePolicy[FakeCallableDescriptorForObject]

'!' @ [172:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'canCopyDeclarations' @ [172:14] ==> private final fun canCopyDeclarations(elements: Array<out PsiElement>): Boolean defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler[SimpleFunctionDescriptorImpl]

'elements' @ [172:34] ==> value-parameter elements: Array<out PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[ValueParameterDescriptorImpl]

'getSourceFiles' @ [173:31] ==> private final fun getSourceFiles(elements: Array<out PsiElement>): Array<PsiElement>? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler[SimpleFunctionDescriptorImpl]

'elements' @ [173:46] ==> value-parameter elements: Array<out PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[ValueParameterDescriptorImpl]

'copyFilesHandler' @ [174:20] ==> private final val copyFilesHandler: CopyFilesOrDirectoriesHandler defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler[PropertyDescriptorImpl]

'doCopy' @ [174:37] ==> public open fun doCopy(p0: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>?), p1: (PsiDirectory..PsiDirectory?)): Unit defined in com.intellij.refactoring.copy.CopyFilesOrDirectoriesHandler[JavaMethodDescriptor]

'sourceFiles' @ [174:44] ==> val sourceFiles: Array<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'defaultTargetDirectory' @ [174:57] ==> value-parameter defaultTargetDirectory: PsiDirectory? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[ValueParameterDescriptorImpl]

'elements' @ [177:30] ==> value-parameter elements: Array<out PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[ValueParameterDescriptorImpl]

'flatMap' @ [177:39] ==> public inline fun <T, R> Array<out PsiElement>.flatMap(transform: (PsiElement) -> Iterable<KtElement>): List<KtElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> KtElement

'it' @ [177:49] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy.<anonymous>[ValueParameterDescriptorImpl]

'getElementsToCopy' @ [177:52] ==> private final fun PsiElement.getElementsToCopy(): List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.Companion[SimpleFunctionDescriptorImpl]

'elementsToCopy' @ [178:13] ==> val elementsToCopy: List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'isEmpty' @ [178:28] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'elementsToCopy' @ [180:35] ==> val elementsToCopy: List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'singleOrNull' @ [180:50] ==> public fun <T> List<KtElement>.singleOrNull(): KtElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'elementsToCopy' @ [182:28] ==> val elementsToCopy: List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'first' @ [182:43] ==> public fun <T> List<KtElement>.first(): KtElement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'containingFile' @ [182:51] ==> public final val KtElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'defaultTargetDirectory' @ [183:38] ==> value-parameter defaultTargetDirectory: PsiDirectory? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[ValueParameterDescriptorImpl]

'originalFile' @ [183:64] ==> val originalFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'containingDirectory' @ [183:77] ==> public final val KtFile.containingDirectory: PsiDirectory?[MyPropertyDescriptor]

'initialTargetDirectory' @ [185:23] ==> val initialTargetDirectory: PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'project' @ [185:46] ==> public final val PsiDirectory.project: Project[MyPropertyDescriptor]

'singleElementToCopy' @ [190:32] ==> val singleElementToCopy: KtElement? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'name' @ [190:53] ==> public final val KtElement.name: String?[MyPropertyDescriptor]

'originalFile' @ [190:61] ==> val originalFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'name' @ [190:74] ==> public final var KtFile.name: String[MyPropertyDescriptor]

'initialTargetDirectory' @ [191:65] ==> val initialTargetDirectory: PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'toDirectoryWrapper' @ [191:88] ==> public fun PsiDirectory.toDirectoryWrapper(): AutocreatingPsiDirectoryWrapper.ByPsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.move[SimpleFunctionDescriptorImpl]

'initialTargetDirectory' @ [192:46] ==> val initialTargetDirectory: PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'sourceRoot' @ [192:69] ==> public val PsiFileSystemItem.sourceRoot: VirtualFile? defined in org.jetbrains.kotlin.idea.util[DeserializedPropertyDescriptor]

'getApplication' @ [194:49] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [194:66] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'if (!isUnitTestMode) {
            if (singleElementToCopy != null && singleElementToCopy is KtNamedDeclaration) {
                val dialog = CopyKotlinDeclarationDialog(singleElementToCopy, initialTargetDirectory, project)
                dialog.title = commandName
                if (!dialog.showAndGet()) return

                openInEditor = dialog.openInEditor
                newName = dialog.newName ?: singleElementToCopy.name
                targetDirWrapper = dialog.targetDirectory?.toDirectoryWrapper() ?: return
                targetSourceRoot = dialog.targetSourceRoot
            }
            else {
                val dialog = CopyFilesOrDirectoriesDialog(arrayOf(originalFile), initialTargetDirectory, project, false)
                if (!dialog.showAndGet()) return
                openInEditor = dialog.openInEditor()
                newName = dialog.newName
                targetDirWrapper = dialog.targetDirectory?.toDirectoryWrapper() ?: return
                targetSourceRoot = dialog.targetDirectory?.sourceRoot
            }
        }
        else {
            project.newName?.let { newName = it }
        }' @ [196:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit?, elseBranch: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit?

'!' @ [196:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isUnitTestMode' @ [196:14] ==> val isUnitTestMode: Boolean defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'if (singleElementToCopy != null && singleElementToCopy is KtNamedDeclaration) {
                val dialog = CopyKotlinDeclarationDialog(singleElementToCopy, initialTargetDirectory, project)
                dialog.title = commandName
                if (!dialog.showAndGet()) return

                openInEditor = dialog.openInEditor
                newName = dialog.newName ?: singleElementToCopy.name
                targetDirWrapper = dialog.targetDirectory?.toDirectoryWrapper() ?: return
                targetSourceRoot = dialog.targetSourceRoot
            }
            else {
                val dialog = CopyFilesOrDirectoriesDialog(arrayOf(originalFile), initialTargetDirectory, project, false)
                if (!dialog.showAndGet()) return
                openInEditor = dialog.openInEditor()
                newName = dialog.newName
                targetDirWrapper = dialog.targetDirectory?.toDirectoryWrapper() ?: return
                targetSourceRoot = dialog.targetDirectory?.sourceRoot
            }' @ [197:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'singleElementToCopy' @ [197:17] ==> val singleElementToCopy: KtElement? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'singleElementToCopy' @ [197:48] ==> val singleElementToCopy: KtElement? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'CopyKotlinDeclarationDialog' @ [198:30] ==> public constructor CopyKotlinDeclarationDialog(declaration: KtNamedDeclaration, defaultTargetDirectory: PsiDirectory?, project: Project) defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationDialog[ClassConstructorDescriptorImpl]

'singleElementToCopy' @ [198:58] ==> val singleElementToCopy: KtElement? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'initialTargetDirectory' @ [198:79] ==> val initialTargetDirectory: PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'project' @ [198:103] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'dialog' @ [199:17] ==> val dialog: CopyKotlinDeclarationDialog defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'title' @ [199:24] ==> public final var CopyKotlinDeclarationDialog.title: (String..String?)[MyPropertyDescriptor]

'commandName' @ [199:32] ==> val commandName: String defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'!' @ [200:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'dialog' @ [200:22] ==> val dialog: CopyKotlinDeclarationDialog defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'showAndGet' @ [200:29] ==> public open fun showAndGet(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationDialog[JavaMethodDescriptor]

'openInEditor' @ [202:17] ==> var openInEditor: Boolean defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'dialog' @ [202:32] ==> val dialog: CopyKotlinDeclarationDialog defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'openInEditor' @ [202:39] ==> public final val openInEditor: Boolean defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationDialog[PropertyDescriptorImpl]

'newName' @ [203:17] ==> var newName: String? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'dialog' @ [203:27] ==> val dialog: CopyKotlinDeclarationDialog defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'newName' @ [203:34] ==> public final val newName: String? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationDialog[PropertyDescriptorImpl]

'singleElementToCopy' @ [203:45] ==> val singleElementToCopy: KtElement? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'name' @ [203:65] ==> public final val KtNamedDeclaration.name: String?[MyPropertyDescriptor]

'targetDirWrapper' @ [204:17] ==> var targetDirWrapper: AutocreatingPsiDirectoryWrapper defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'dialog' @ [204:36] ==> val dialog: CopyKotlinDeclarationDialog defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'targetDirectory' @ [204:43] ==> public final var targetDirectory: MoveDestination? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationDialog[PropertyDescriptorImpl]

'toDirectoryWrapper' @ [204:60] ==> public fun MoveDestination.toDirectoryWrapper(): AutocreatingPsiDirectoryWrapper.ByMoveDestination defined in org.jetbrains.kotlin.idea.refactoring.move[SimpleFunctionDescriptorImpl]

'targetSourceRoot' @ [205:17] ==> var targetSourceRoot: VirtualFile? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'dialog' @ [205:36] ==> val dialog: CopyKotlinDeclarationDialog defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'targetSourceRoot' @ [205:43] ==> public final val targetSourceRoot: VirtualFile? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationDialog[PropertyDescriptorImpl]

'CopyFilesOrDirectoriesDialog' @ [208:30] ==> public constructor CopyFilesOrDirectoriesDialog(p0: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>?), @Nullable p1: PsiDirectory?, p2: (Project..Project?), p3: Boolean) defined in com.intellij.refactoring.copy.CopyFilesOrDirectoriesDialog[JavaClassConstructorDescriptor]

'arrayOf' @ [208:59] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: KtFile): Array<KtFile> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> KtFile

'originalFile' @ [208:67] ==> val originalFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'initialTargetDirectory' @ [208:82] ==> val initialTargetDirectory: PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'project' @ [208:106] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'!' @ [209:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'dialog' @ [209:22] ==> val dialog: CopyFilesOrDirectoriesDialog defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'showAndGet' @ [209:29] ==> public open fun showAndGet(): Boolean defined in com.intellij.refactoring.copy.CopyFilesOrDirectoriesDialog[JavaMethodDescriptor]

'openInEditor' @ [210:17] ==> var openInEditor: Boolean defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'dialog' @ [210:32] ==> val dialog: CopyFilesOrDirectoriesDialog defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'openInEditor' @ [210:39] ==> public open fun openInEditor(): Boolean defined in com.intellij.refactoring.copy.CopyFilesOrDirectoriesDialog[JavaMethodDescriptor]

'newName' @ [211:17] ==> var newName: String? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'dialog' @ [211:27] ==> val dialog: CopyFilesOrDirectoriesDialog defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'newName' @ [211:34] ==> public final val CopyFilesOrDirectoriesDialog.newName: (String..String?)[MyPropertyDescriptor]

'targetDirWrapper' @ [212:17] ==> var targetDirWrapper: AutocreatingPsiDirectoryWrapper defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'dialog' @ [212:36] ==> val dialog: CopyFilesOrDirectoriesDialog defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'targetDirectory' @ [212:43] ==> public final val CopyFilesOrDirectoriesDialog.targetDirectory: (PsiDirectory..PsiDirectory?)[MyPropertyDescriptor]

'toDirectoryWrapper' @ [212:60] ==> public fun PsiDirectory.toDirectoryWrapper(): AutocreatingPsiDirectoryWrapper.ByPsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.move[SimpleFunctionDescriptorImpl]

'targetSourceRoot' @ [213:17] ==> var targetSourceRoot: VirtualFile? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'dialog' @ [213:36] ==> val dialog: CopyFilesOrDirectoriesDialog defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'targetDirectory' @ [213:43] ==> public final val CopyFilesOrDirectoriesDialog.targetDirectory: (PsiDirectory..PsiDirectory?)[MyPropertyDescriptor]

'sourceRoot' @ [213:60] ==> public val PsiFileSystemItem.sourceRoot: VirtualFile? defined in org.jetbrains.kotlin.idea.util[DeserializedPropertyDescriptor]

'project' @ [217:13] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'newName' @ [217:21] ==> public final var Project.newName: String? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.Companion[PropertyDescriptorImpl]

'let' @ [217:30] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Unit

'newName' @ [217:36] ==> var newName: String? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'it' @ [217:46] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy.<anonymous>[ValueParameterDescriptorImpl]

'singleElementToCopy' @ [220:13] ==> val singleElementToCopy: KtElement? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'newName' @ [220:44] ==> var newName: String? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'isNullOrEmpty' @ [220:52] ==> @InlineOnly public inline fun CharSequence?.isNullOrEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'runReadAction' @ [222:30] ==> public fun <T> runReadAction(action: () -> LinkedHashSet<UsageInfo> /* = LinkedHashSet<UsageInfo> */): LinkedHashSet<UsageInfo> /* = LinkedHashSet<UsageInfo> */ defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LinkedHashSet<UsageInfo>

'targetDirWrapper' @ [223:37] ==> var targetDirWrapper: AutocreatingPsiDirectoryWrapper defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'getPackageName' @ [223:54] ==> public abstract fun getPackageName(): String defined in org.jetbrains.kotlin.idea.refactoring.move.AutocreatingPsiDirectoryWrapper[SimpleFunctionDescriptorImpl]

'ContainerChangeInfo' @ [224:30] ==> public constructor ContainerChangeInfo(oldContainer: ContainerInfo, newContainer: ContainerInfo) defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerChangeInfo[ClassConstructorDescriptorImpl]

'Package' @ [225:35] ==> public constructor Package(fqName: FqName) defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerInfo.Package[ClassConstructorDescriptorImpl]

'originalFile' @ [225:43] ==> val originalFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'packageFqName' @ [225:56] ==> public final val KtFile.packageFqName: FqName[MyPropertyDescriptor]

'Package' @ [226:35] ==> public constructor Package(fqName: FqName) defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerInfo.Package[ClassConstructorDescriptorImpl]

'FqName' @ [226:43] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'targetPackageName' @ [226:50] ==> val targetPackageName: String defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy.<anonymous>[LocalVariableDescriptor]

'elementsToCopy' @ [228:13] ==> val elementsToCopy: List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'flatMapTo' @ [228:28] ==> public inline fun <T, R, C : MutableCollection<in UsageInfo>> Iterable<KtElement>.flatMapTo(destination: LinkedHashSet<UsageInfo> /* = LinkedHashSet<UsageInfo> */, transform: (KtElement) -> Iterable<UsageInfo>): LinkedHashSet<UsageInfo> /* = LinkedHashSet<UsageInfo> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement
    <R> -> UsageInfo
    <C : MutableCollection<in R>> -> LinkedHashSet<UsageInfo>

'LinkedHashSet' @ [228:38] ==> public final fun <E> <init>(): LinkedHashSet<UsageInfo> /* = LinkedHashSet<UsageInfo> */ defined in kotlin.collections.LinkedHashSet[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> UsageInfo

'elementToCopy' @ [229:17] ==> value-parameter elementToCopy: KtElement defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getInternalReferencesToUpdateOnPackageNameChange' @ [229:31] ==> public fun KtElement.getInternalReferencesToUpdateOnPackageNameChange(containerChangeInfo: ContainerChangeInfo): List<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move[SimpleFunctionDescriptorImpl]

'changeInfo' @ [229:80] ==> val changeInfo: ContainerChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy.<anonymous>[LocalVariableDescriptor]

'filter' @ [229:92] ==> public inline fun <T> Iterable<UsageInfo>.filter(predicate: (UsageInfo) -> Boolean): List<UsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageInfo

'it' @ [230:46] ==> value-parameter it: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'referencedElement' @ [230:75] ==> public final val MoveRenameUsageInfo.referencedElement: PsiElement?[MyPropertyDescriptor]

'referencedElement' @ [231:21] ==> val referencedElement: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'!' @ [231:50] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'elementToCopy' @ [231:51] ==> value-parameter elementToCopy: KtElement defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isAncestor' @ [231:65] ==> public fun PsiElement?.isAncestor(element: PsiElement, strict: Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'referencedElement' @ [231:76] ==> val referencedElement: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'markInternalUsages' @ [235:9] ==> internal fun markInternalUsages(usages: Collection<UsageInfo>): Unit defined in org.jetbrains.kotlin.idea.refactoring.move[SimpleFunctionDescriptorImpl]

'internalUsages' @ [235:28] ==> val internalUsages: LinkedHashSet<UsageInfo> /* = LinkedHashSet<UsageInfo> */ defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'ArrayList' @ [238:42] ==> public final fun <E> <init>(): ArrayList<UsageInfo> /* = ArrayList<UsageInfo> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> UsageInfo

'project' @ [240:13] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'executeCommand' @ [240:21] ==> public fun <T> Project.executeCommand(name: String, groupId: Any? = ..., command: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'commandName' @ [240:36] ==> val commandName: String defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'runWriteAction' @ [242:43] ==> public fun <T> runWriteAction(action: () -> PsiDirectory): PsiDirectory defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiDirectory

'targetDirWrapper' @ [242:60] ==> var targetDirWrapper: AutocreatingPsiDirectoryWrapper defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'getOrCreateDirectory' @ [242:77] ==> public abstract fun getOrCreateDirectory(source: PsiDirectory): PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.move.AutocreatingPsiDirectoryWrapper[SimpleFunctionDescriptorImpl]

'initialTargetDirectory' @ [242:98] ==> val initialTargetDirectory: PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'if (newName?.contains(".") ?: false) newName!! else newName + "." + originalFile.virtualFile.extension' @ [243:42] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'newName' @ [243:46] ==> var newName: String? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'contains' @ [243:55] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'newName' @ [243:79] ==> var newName: String? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'newName' @ [243:94] ==> var newName: String? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'originalFile' @ [243:110] ==> val originalFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'virtualFile' @ [243:123] ==> public final val KtFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'extension' @ [243:135] ==> public final val VirtualFile.extension: String?[MyPropertyDescriptor]

'HashMap' @ [245:51] ==> public final fun <K, V> <init>(): HashMap<PsiElement, PsiElement> /* = HashMap<PsiElement, PsiElement> */ defined in kotlin.collections.HashMap[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <K> -> PsiElement
    <V> -> PsiElement

'if (singleElementToCopy is KtFile) {
                        targetFile = runWriteAction {
                            val copiedFile = targetDirectory.copyFileFrom(targetFileName, singleElementToCopy) as KtFile
                            performDelayedRefactoringRequests(project)
                            copiedFile
                        }
                    }
                    else {
                        targetFile = getOrCreateTargetFile(originalFile, targetDirectory, targetFileName, commandName) ?: return@executeCommand
                        runWriteAction {
                            val newElements = elementsToCopy.map { targetFile.add(it.copy()) as KtNamedDeclaration }
                            elementsToCopy.zip(newElements).toMap(oldToNewElementsMapping)

                            for (newElement in oldToNewElementsMapping.values) {
                                restoredInternalUsages += restoreInternalUsages(newElement as KtElement, oldToNewElementsMapping, true)
                                postProcessMoveUsages(restoredInternalUsages, oldToNewElementsMapping)
                            }

                            performDelayedRefactoringRequests(project)
                        }
                    }' @ [248:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'singleElementToCopy' @ [248:25] ==> val singleElementToCopy: KtElement? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'targetFile' @ [249:25] ==> val targetFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy.doRefactor.<anonymous>[LocalVariableDescriptor]

'runWriteAction' @ [249:38] ==> public fun <T> runWriteAction(action: () -> KtFile): KtFile defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'targetDirectory' @ [250:46] ==> val targetDirectory: PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy.doRefactor.<anonymous>[LocalVariableDescriptor]

'copyFileFrom' @ [250:62] ==> @NotNull public abstract fun copyFileFrom(@NotNull p0: String, @NotNull p1: PsiFile): PsiFile defined in com.intellij.psi.PsiDirectory[JavaMethodDescriptor]

'targetFileName' @ [250:75] ==> val targetFileName: String defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy.doRefactor.<anonymous>[LocalVariableDescriptor]

'singleElementToCopy' @ [250:91] ==> val singleElementToCopy: KtElement? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'performDelayedRefactoringRequests' @ [251:29] ==> public fun performDelayedRefactoringRequests(project: Project): Unit defined in org.jetbrains.kotlin.idea.codeInsight.shorten[DeserializedSimpleFunctionDescriptor]

'project' @ [251:63] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'copiedFile' @ [252:29] ==> val copiedFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy.doRefactor.<anonymous>.<anonymous>[LocalVariableDescriptor]

'targetFile' @ [256:25] ==> val targetFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy.doRefactor.<anonymous>[LocalVariableDescriptor]

'getOrCreateTargetFile' @ [256:38] ==> private final fun getOrCreateTargetFile(originalFile: KtFile, targetDirectory: PsiDirectory, targetFileName: String, commandName: String): KtFile? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler[SimpleFunctionDescriptorImpl]

'originalFile' @ [256:60] ==> val originalFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'targetDirectory' @ [256:74] ==> val targetDirectory: PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy.doRefactor.<anonymous>[LocalVariableDescriptor]

'targetFileName' @ [256:91] ==> val targetFileName: String defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy.doRefactor.<anonymous>[LocalVariableDescriptor]

'commandName' @ [256:107] ==> val commandName: String defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'runWriteAction' @ [257:25] ==> public fun <T> runWriteAction(action: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'elementsToCopy' @ [258:47] ==> val elementsToCopy: List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'map' @ [258:62] ==> public inline fun <T, R> Iterable<KtElement>.map(transform: (KtElement) -> KtNamedDeclaration): List<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement
    <R> -> KtNamedDeclaration

'targetFile' @ [258:68] ==> val targetFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy.doRefactor.<anonymous>[LocalVariableDescriptor]

'add' @ [258:79] ==> public open fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'it' @ [258:83] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy.doRefactor.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'copy' @ [258:86] ==> public abstract fun copy(): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'elementsToCopy' @ [259:29] ==> val elementsToCopy: List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'zip' @ [259:44] ==> public infix fun <T, R> Iterable<KtElement>.zip(other: Iterable<KtNamedDeclaration>): List<Pair<KtElement, KtNamedDeclaration>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement
    <R> -> KtNamedDeclaration

'newElements' @ [259:48] ==> val newElements: List<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy.doRefactor.<anonymous>.<anonymous>[LocalVariableDescriptor]

'toMap' @ [259:61] ==> public fun <K, V, M : MutableMap<in KtElement, in KtNamedDeclaration>> Iterable<Pair<KtElement, KtNamedDeclaration>>.toMap(destination: HashMap<PsiElement, PsiElement> /* = HashMap<PsiElement, PsiElement> */): HashMap<PsiElement, PsiElement> /* = HashMap<PsiElement, PsiElement> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtElement
    <V> -> KtNamedDeclaration
    <M : MutableMap<in K, in V>> -> HashMap<PsiElement, PsiElement>

'oldToNewElementsMapping' @ [259:67] ==> val oldToNewElementsMapping: HashMap<PsiElement, PsiElement> /* = HashMap<PsiElement, PsiElement> */ defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy.doRefactor.<anonymous>[LocalVariableDescriptor]

'oldToNewElementsMapping' @ [261:48] ==> val oldToNewElementsMapping: HashMap<PsiElement, PsiElement> /* = HashMap<PsiElement, PsiElement> */ defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy.doRefactor.<anonymous>[LocalVariableDescriptor]

'values' @ [261:72] ==> public open val values: MutableCollection<PsiElement> defined in java.util.HashMap[JavaPropertyDescriptor]

'restoredInternalUsages' @ [262:33] ==> val restoredInternalUsages: ArrayList<UsageInfo> /* = ArrayList<UsageInfo> */ defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy.doRefactor[LocalVariableDescriptor]

'restoreInternalUsages' @ [262:59] ==> internal fun restoreInternalUsages(scope: KtElement, oldToNewElementsMapping: Map<PsiElement, PsiElement>, forcedRestore: Boolean = ...): List<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move[SimpleFunctionDescriptorImpl]

'newElement' @ [262:81] ==> val newElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy.doRefactor.<anonymous>.<anonymous>[LocalVariableDescriptor]

'oldToNewElementsMapping' @ [262:106] ==> val oldToNewElementsMapping: HashMap<PsiElement, PsiElement> /* = HashMap<PsiElement, PsiElement> */ defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy.doRefactor.<anonymous>[LocalVariableDescriptor]

'postProcessMoveUsages' @ [263:33] ==> public fun postProcessMoveUsages(usages: Collection<UsageInfo>, oldToNewElementsMapping: Map<PsiElement, PsiElement> = ..., shorteningMode: KtSimpleNameReference.ShorteningMode = ...): List<NonCodeUsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move[SimpleFunctionDescriptorImpl]

'restoredInternalUsages' @ [263:55] ==> val restoredInternalUsages: ArrayList<UsageInfo> /* = ArrayList<UsageInfo> */ defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy.doRefactor[LocalVariableDescriptor]

'oldToNewElementsMapping' @ [263:79] ==> val oldToNewElementsMapping: HashMap<PsiElement, PsiElement> /* = HashMap<PsiElement, PsiElement> */ defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy.doRefactor.<anonymous>[LocalVariableDescriptor]

'performDelayedRefactoringRequests' @ [266:29] ==> public fun performDelayedRefactoringRequests(project: Project): Unit defined in org.jetbrains.kotlin.idea.codeInsight.shorten[DeserializedSimpleFunctionDescriptor]

'project' @ [266:63] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'oldToNewElementsMapping' @ [270:22] ==> val oldToNewElementsMapping: HashMap<PsiElement, PsiElement> /* = HashMap<PsiElement, PsiElement> */ defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy.doRefactor.<anonymous>[LocalVariableDescriptor]

'values' @ [270:46] ==> public open val values: MutableCollection<PsiElement> defined in java.util.HashMap[JavaPropertyDescriptor]

'singleOrNull' @ [270:53] ==> public fun <T> Iterable<PsiElement>.singleOrNull(): PsiElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'let' @ [270:93] ==> @InlineOnly public inline fun <T, R> KtNamedDeclaration.let(block: (KtNamedDeclaration) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration
    <R> -> Unit

'newName' @ [271:29] ==> var newName: String? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'newDeclaration' @ [271:40] ==> value-parameter newDeclaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy.doRefactor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [271:55] ==> public final val KtNamedDeclaration.name: String?[MyPropertyDescriptor]

'search' @ [272:63] ==> @NotNull public open fun search(@NotNull p0: PsiElement, @NotNull p1: SearchScope): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'newDeclaration' @ [272:70] ==> value-parameter newDeclaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy.doRefactor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'LocalSearchScope' @ [272:86] ==> public constructor LocalSearchScope(@NotNull p0: PsiElement) defined in com.intellij.psi.search.LocalSearchScope[JavaClassConstructorDescriptor]

'newDeclaration' @ [272:103] ==> value-parameter newDeclaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy.doRefactor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'findAll' @ [272:120] ==> @NotNull public abstract fun findAll(): (MutableCollection<(PsiReference..PsiReference?)>..Collection<(PsiReference..PsiReference?)>) defined in com.intellij.util.Query[JavaMethodDescriptor]

'runWriteAction' @ [273:25] ==> public fun <T> runWriteAction(action: () -> (PsiElement..PsiElement?)): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'selfReferences' @ [274:29] ==> val selfReferences: (MutableCollection<(PsiReference..PsiReference?)>..Collection<(PsiReference..PsiReference?)>) defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy.doRefactor.<anonymous>.<anonymous>[LocalVariableDescriptor]

'forEach' @ [274:44] ==> @HidesMembers public inline fun <T> Iterable<(PsiReference..PsiReference?)>.forEach(action: ((PsiReference..PsiReference?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)

'it' @ [274:54] ==> value-parameter it: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy.doRefactor.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'handleElementRename' @ [274:57] ==> public abstract fun handleElementRename(p0: (String..String?)): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiReference[JavaMethodDescriptor]

'newName' @ [274:77] ==> var newName: String? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'newDeclaration' @ [275:29] ==> value-parameter newDeclaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy.doRefactor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'setName' @ [275:44] ==> public abstract fun setName(@NotNull p0: String): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'newName' @ [275:52] ==> var newName: String? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'Unit' @ [277:25] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'openInEditor' @ [280:25] ==> var openInEditor: Boolean defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'openFilesInEditor' @ [281:38] ==> public open fun <T : (PsiElement..PsiElement?)> openFilesInEditor(@NotNull p0: (Array<(KtFile..KtFile?)>..Array<out (KtFile..KtFile?)>)): Unit defined in com.intellij.ide.util.EditorHelper[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtFile

'arrayOf' @ [281:56] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: KtFile): Array<KtFile> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> KtFile

'targetFile' @ [281:64] ==> val targetFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy.doRefactor.<anonymous>[LocalVariableDescriptor]

'showMessageDialog' @ [285:30] ==> public open fun showMessageDialog(@Nullable p0: Project?, p1: (String..String?), @NotNull @Nls p2: String, @Nullable p3: Icon?): Unit defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'project' @ [285:48] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'e' @ [285:57] ==> val e: IncorrectOperationException defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy.doRefactor.<anonymous>[LocalVariableDescriptor]

'message' @ [285:59] ==> public open val message: String? defined in com.intellij.util.IncorrectOperationException[DeserializedPropertyDescriptor]

'message' @ [285:86] ==> public open fun message(@PropertyKey p0: (String..String?)): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'getErrorIcon' @ [285:119] ==> @NotNull public open fun getErrorIcon(): Icon defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'cleanUpInternalUsages' @ [288:21] ==> internal fun cleanUpInternalUsages(usages: Collection<UsageInfo>): Unit defined in org.jetbrains.kotlin.idea.refactoring.move[SimpleFunctionDescriptorImpl]

'internalUsages' @ [288:43] ==> val internalUsages: LinkedHashSet<UsageInfo> /* = LinkedHashSet<UsageInfo> */ defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'restoredInternalUsages' @ [288:60] ==> val restoredInternalUsages: ArrayList<UsageInfo> /* = ArrayList<UsageInfo> */ defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy.doRefactor[LocalVariableDescriptor]

'MultiMap' @ [293:25] ==> public constructor MultiMap<K : (Any..Any?), V : (Any..Any?)>() defined in com.intellij.util.containers.MultiMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> String

'!' @ [295:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isUnitTestMode' @ [295:15] ==> val isUnitTestMode: Boolean defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'isTestIgnore' @ [295:84] ==> public open fun isTestIgnore(): Boolean defined in com.intellij.refactoring.BaseRefactoringProcessor.ConflictsInTestsException[JavaMethodDescriptor]

'targetSourceRoot' @ [296:39] ==> var targetSourceRoot: VirtualFile? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'toPsiDirectory' @ [296:57] ==> public fun VirtualFile.toPsiDirectory(project: Project): PsiDirectory? defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'project' @ [296:72] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'targetSourceRootPsi' @ [297:17] ==> val targetSourceRootPsi: PsiDirectory? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'MoveConflictChecker' @ [298:39] ==> public constructor MoveConflictChecker(project: Project, elementsToMove: Collection<KtElement>, moveTarget: KotlinMoveTarget, contextElement: KtElement, doNotGoIn: Collection<KtElement> = ..., allElementsToMove: Collection<PsiElement>? = ...) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[ClassConstructorDescriptorImpl]

'project' @ [299:25] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'elementsToCopy' @ [300:25] ==> val elementsToCopy: List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'KotlinDirectoryMoveTarget' @ [301:25] ==> public constructor KotlinDirectoryMoveTarget(targetContainerFqName: FqName, directory: PsiDirectory) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinDirectoryMoveTarget[ClassConstructorDescriptorImpl]

'ROOT' @ [301:58] ==> public final val ROOT: (FqName..FqName?) defined in org.jetbrains.kotlin.name.FqName[JavaPropertyDescriptor]

'targetSourceRootPsi' @ [301:64] ==> val targetSourceRootPsi: PsiDirectory? defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'originalFile' @ [302:25] ==> val originalFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'conflictChecker' @ [304:17] ==> val conflictChecker: MoveConflictChecker defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'checkModuleConflictsInDeclarations' @ [304:33] ==> public final fun checkModuleConflictsInDeclarations(internalUsages: MutableSet<UsageInfo>, conflicts: MultiMap<PsiElement, String>): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[SimpleFunctionDescriptorImpl]

'internalUsages' @ [304:68] ==> val internalUsages: LinkedHashSet<UsageInfo> /* = LinkedHashSet<UsageInfo> */ defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'conflicts' @ [304:84] ==> val conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'conflictChecker' @ [305:17] ==> val conflictChecker: MoveConflictChecker defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'checkVisibilityInDeclarations' @ [305:33] ==> public final fun checkVisibilityInDeclarations(conflicts: MultiMap<PsiElement, String>): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[SimpleFunctionDescriptorImpl]

'conflicts' @ [305:63] ==> val conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'project' @ [309:9] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

'checkConflictsInteractively' @ [309:17] ==> public fun Project.checkConflictsInteractively(conflicts: MultiMap<PsiElement, String>, onShowConflicts: () -> Unit = ..., onAccept: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring[SimpleFunctionDescriptorImpl]

'conflicts' @ [309:45] ==> val conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.copy.CopyKotlinDeclarationsHandler.doCopy[LocalVariableDescriptor]

