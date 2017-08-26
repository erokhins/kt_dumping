'CreateFileFromTemplateAction' @ [47:7] ==> public constructor CreateFileFromTemplateAction(p0: (String..String?), p1: (String..String?), p2: (Icon..Icon?)) defined in com.intellij.ide.actions.CreateFileFromTemplateAction[JavaClassConstructorDescriptor]

'INSTANCE' @ [49:51] ==> public final val INSTANCE: (KotlinFileType..KotlinFileType?) defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

'icon' @ [49:60] ==> public final val KotlinFileType.icon: Icon?[MyPropertyDescriptor]

'super' @ [53:9] ==> <this> defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction[LazyClassReceiverParameterDescriptor]

'postProcess' @ [53:15] ==> protected/*protected and package*/ open fun postProcess(p0: (PsiFile..PsiFile?), p1: (String..String?), p2: (MutableMap<(String..String?), (String..String?)>..Map<(String..String?), (String..String?)>?)): Unit defined in com.intellij.ide.actions.CreateFileFromTemplateAction[JavaMethodDescriptor]

'createdElement' @ [53:27] ==> value-parameter createdElement: PsiFile? defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.postProcess[ValueParameterDescriptorImpl]

'templateName' @ [53:43] ==> value-parameter templateName: String? defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.postProcess[ValueParameterDescriptorImpl]

'customProperties' @ [53:57] ==> value-parameter customProperties: Map<String, String>? defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.postProcess[ValueParameterDescriptorImpl]

'findModuleForPsiElement' @ [55:37] ==> @Nullable public open fun findModuleForPsiElement(@NotNull p0: PsiElement): Module? defined in com.intellij.openapi.module.ModuleUtilCore[JavaMethodDescriptor]

'createdElement' @ [55:61] ==> value-parameter createdElement: PsiFile? defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.postProcess[ValueParameterDescriptorImpl]

'module' @ [56:13] ==> val module: Module? defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.postProcess[LocalVariableDescriptor]

'showConfigureKotlinNotificationIfNeeded' @ [57:13] ==> public fun showConfigureKotlinNotificationIfNeeded(module: Module): Unit defined in org.jetbrains.kotlin.idea.configuration in file ConfigureKotlinInProjectUtils.kt[SimpleFunctionDescriptorImpl]

'module' @ [57:53] ==> val module: Module? defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.postProcess[LocalVariableDescriptor]

'createdElement' @ [60:13] ==> value-parameter createdElement: PsiFile? defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.postProcess[ValueParameterDescriptorImpl]

'createdElement' @ [61:27] ==> value-parameter createdElement: PsiFile? defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.postProcess[ValueParameterDescriptorImpl]

'declarations' @ [61:42] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'singleOrNull' @ [61:55] ==> public fun <T> List<(KtDeclaration..KtDeclaration?)>.singleOrNull(): KtDeclaration? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)

'if (ktClass != null) {
                CreateFromTemplateAction.moveCaretAfterNameIdentifier(ktClass)
            }
            else {
                val editor = FileEditorManager.getInstance(createdElement.project).selectedTextEditor ?: return
                if (editor.document == createdElement.viewProvider.document) {
                    val lineCount = editor.document.lineCount
                    if (lineCount > 0) {
                        editor.caretModel.moveToLogicalPosition(LogicalPosition(lineCount - 1, 0))
                    }
                }
            }' @ [62:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'ktClass' @ [62:17] ==> val ktClass: KtNamedDeclaration? defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.postProcess[LocalVariableDescriptor]

'moveCaretAfterNameIdentifier' @ [63:42] ==> public open fun moveCaretAfterNameIdentifier(p0: (PsiNameIdentifierOwner..PsiNameIdentifierOwner?)): Unit defined in com.intellij.ide.actions.CreateFromTemplateAction[JavaMethodDescriptor]

'ktClass' @ [63:71] ==> val ktClass: KtNamedDeclaration? defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.postProcess[LocalVariableDescriptor]

'?:' @ [66:30] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Editor?, right: Editor): Editor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Editor

'getInstance' @ [66:48] ==> public open fun getInstance(@NotNull p0: Project): (FileEditorManager..FileEditorManager?) defined in com.intellij.openapi.fileEditor.FileEditorManager[JavaMethodDescriptor]

'createdElement' @ [66:60] ==> value-parameter createdElement: PsiFile? defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.postProcess[ValueParameterDescriptorImpl]

'project' @ [66:75] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'selectedTextEditor' @ [66:84] ==> public final val FileEditorManager.selectedTextEditor: Editor?[MyPropertyDescriptor]

'editor' @ [67:21] ==> val editor: Editor defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.postProcess[LocalVariableDescriptor]

'document' @ [67:28] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'createdElement' @ [67:40] ==> value-parameter createdElement: PsiFile? defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.postProcess[ValueParameterDescriptorImpl]

'viewProvider' @ [67:55] ==> public final val KtFile.viewProvider: FileViewProvider[MyPropertyDescriptor]

'document' @ [67:68] ==> public final val FileViewProvider.document: Document?[MyPropertyDescriptor]

'editor' @ [68:37] ==> val editor: Editor defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.postProcess[LocalVariableDescriptor]

'document' @ [68:44] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'lineCount' @ [68:53] ==> public final val Document.lineCount: Int[MyPropertyDescriptor]

'lineCount' @ [69:25] ==> val lineCount: Int defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.postProcess[LocalVariableDescriptor]

'editor' @ [70:25] ==> val editor: Editor defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.postProcess[LocalVariableDescriptor]

'caretModel' @ [70:32] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'moveToLogicalPosition' @ [70:43] ==> public abstract fun moveToLogicalPosition(@NotNull p0: LogicalPosition): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'LogicalPosition' @ [70:65] ==> public constructor LogicalPosition(p0: Int, p1: Int) defined in com.intellij.openapi.editor.LogicalPosition[JavaClassConstructorDescriptor]

'lineCount' @ [70:81] ==> val lineCount: Int defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.postProcess[LocalVariableDescriptor]

'builder' @ [78:9] ==> value-parameter builder: CreateFileFromTemplateDialog.Builder defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.buildDialog[ValueParameterDescriptorImpl]

'setTitle' @ [78:17] ==> public abstract fun setTitle(p0: (String..String?)): (CreateFileFromTemplateDialog.Builder..CreateFileFromTemplateDialog.Builder?) defined in com.intellij.ide.actions.CreateFileFromTemplateDialog.Builder[JavaMethodDescriptor]

'addKind' @ [79:18] ==> public abstract fun addKind(@NotNull p0: String, @Nullable p1: Icon?, @NotNull p2: String): (CreateFileFromTemplateDialog.Builder..CreateFileFromTemplateDialog.Builder?) defined in com.intellij.ide.actions.CreateFileFromTemplateDialog.Builder[JavaMethodDescriptor]

'INSTANCE' @ [79:49] ==> public final val INSTANCE: (KotlinFileType..KotlinFileType?) defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

'icon' @ [79:58] ==> public final val KotlinFileType.icon: Icon?[MyPropertyDescriptor]

'addKind' @ [80:18] ==> public abstract fun addKind(@NotNull p0: String, @Nullable p1: Icon?, @NotNull p2: String): (CreateFileFromTemplateDialog.Builder..CreateFileFromTemplateDialog.Builder?) defined in com.intellij.ide.actions.CreateFileFromTemplateDialog.Builder[JavaMethodDescriptor]

'CLASS' @ [80:47] ==> public final val CLASS: (Icon..Icon?) defined in org.jetbrains.kotlin.idea.KotlinIcons[JavaPropertyDescriptor]

'addKind' @ [81:18] ==> public abstract fun addKind(@NotNull p0: String, @Nullable p1: Icon?, @NotNull p2: String): (CreateFileFromTemplateDialog.Builder..CreateFileFromTemplateDialog.Builder?) defined in com.intellij.ide.actions.CreateFileFromTemplateDialog.Builder[JavaMethodDescriptor]

'INTERFACE' @ [81:51] ==> public final val INTERFACE: (Icon..Icon?) defined in org.jetbrains.kotlin.idea.KotlinIcons[JavaPropertyDescriptor]

'addKind' @ [82:18] ==> public abstract fun addKind(@NotNull p0: String, @Nullable p1: Icon?, @NotNull p2: String): (CreateFileFromTemplateDialog.Builder..CreateFileFromTemplateDialog.Builder?) defined in com.intellij.ide.actions.CreateFileFromTemplateDialog.Builder[JavaMethodDescriptor]

'ENUM' @ [82:52] ==> public final val ENUM: (Icon..Icon?) defined in org.jetbrains.kotlin.idea.KotlinIcons[JavaPropertyDescriptor]

'addKind' @ [83:18] ==> public abstract fun addKind(@NotNull p0: String, @Nullable p1: Icon?, @NotNull p2: String): (CreateFileFromTemplateDialog.Builder..CreateFileFromTemplateDialog.Builder?) defined in com.intellij.ide.actions.CreateFileFromTemplateDialog.Builder[JavaMethodDescriptor]

'OBJECT' @ [83:48] ==> public final val OBJECT: (Icon..Icon?) defined in org.jetbrains.kotlin.idea.KotlinIcons[JavaPropertyDescriptor]

'super' @ [89:13] ==> <this> defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction[LazyClassReceiverParameterDescriptor]

'isAvailable' @ [89:19] ==> protected/*protected and package*/ open fun isAvailable(p0: (DataContext..DataContext?)): Boolean defined in com.intellij.ide.actions.CreateFileFromTemplateAction[JavaMethodDescriptor]

'dataContext' @ [89:31] ==> value-parameter dataContext: DataContext defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.isAvailable[ValueParameterDescriptorImpl]

'!!' @ [90:27] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: IdeView?): IdeView[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> IdeView

'IDE_VIEW' @ [90:40] ==> public final val IDE_VIEW: (DataKey<(IdeView..IdeView?)>..DataKey<(IdeView..IdeView?)>?) defined in com.intellij.openapi.actionSystem.LangDataKeys[JavaPropertyDescriptor]

'getData' @ [90:49] ==> @Nullable public open fun getData(@NotNull p0: DataContext): IdeView? defined in com.intellij.openapi.actionSystem.DataKey[JavaMethodDescriptor]

'dataContext' @ [90:57] ==> value-parameter dataContext: DataContext defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.isAvailable[ValueParameterDescriptorImpl]

'!!' @ [91:27] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: Project?): Project[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> Project

'PROJECT' @ [91:44] ==> public final val PROJECT: (DataKey<(Project..Project?)>..DataKey<(Project..Project?)>?) defined in com.intellij.openapi.actionSystem.PlatformDataKeys[JavaPropertyDescriptor]

'getData' @ [91:52] ==> @Nullable public open fun getData(@NotNull p0: DataContext): Project? defined in com.intellij.openapi.actionSystem.DataKey[JavaMethodDescriptor]

'dataContext' @ [91:60] ==> value-parameter dataContext: DataContext defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.isAvailable[ValueParameterDescriptorImpl]

'getInstance' @ [92:55] ==> public open fun getInstance(@NotNull p0: Project): (ProjectRootManager..ProjectRootManager?) defined in com.intellij.openapi.roots.ProjectRootManager[JavaMethodDescriptor]

'project' @ [92:67] ==> val project: Project defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.isAvailable[LocalVariableDescriptor]

'fileIndex' @ [92:76] ==> public final val ProjectRootManager.fileIndex: ProjectFileIndex[MyPropertyDescriptor]

'ideView' @ [93:20] ==> val ideView: IdeView defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.isAvailable[LocalVariableDescriptor]

'directories' @ [93:28] ==> public final val IdeView.directories: (Array<(PsiDirectory..PsiDirectory?)>..Array<out (PsiDirectory..PsiDirectory?)>)[MyPropertyDescriptor]

'any' @ [93:40] ==> public inline fun <T> Array<out (PsiDirectory..PsiDirectory?)>.any(predicate: ((PsiDirectory..PsiDirectory?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiDirectory..com.intellij.psi.PsiDirectory?)

'projectFileIndex' @ [93:46] ==> val projectFileIndex: ProjectFileIndex defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.isAvailable[LocalVariableDescriptor]

'isInSourceContent' @ [93:63] ==> public abstract fun isInSourceContent(@NotNull p0: VirtualFile): Boolean defined in com.intellij.openapi.roots.ProjectFileIndex[JavaMethodDescriptor]

'it' @ [93:81] ==> value-parameter it: (PsiDirectory..PsiDirectory?) defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.isAvailable.<anonymous>[ValueParameterDescriptorImpl]

'virtualFile' @ [93:84] ==> public final val PsiDirectory.virtualFile: VirtualFile[MyPropertyDescriptor]

'obj' @ [103:16] ==> value-parameter obj: Any? defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.equals[ValueParameterDescriptorImpl]

'Companion' @ [109:13] ==> public companion object defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction[FakeCallableDescriptorForObject]

'createFileFromTemplate' @ [109:23] ==> public final fun createFileFromTemplate(name: String, template: FileTemplate, dir: PsiDirectory): PsiFile? defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.Companion[SimpleFunctionDescriptorImpl]

'name' @ [109:46] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.createFileFromTemplate[ValueParameterDescriptorImpl]

'template' @ [109:52] ==> value-parameter template: FileTemplate defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.createFileFromTemplate[ValueParameterDescriptorImpl]

'dir' @ [109:62] ==> value-parameter dir: PsiDirectory defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.createFileFromTemplate[ValueParameterDescriptorImpl]

'name' @ [113:29] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.Companion.findOrCreateTarget[ValueParameterDescriptorImpl]

'removeSuffix' @ [113:34] ==> public fun String.removeSuffix(suffix: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'dir' @ [114:29] ==> value-parameter dir: PsiDirectory defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.Companion.findOrCreateTarget[ValueParameterDescriptorImpl]

'directorySeparators' @ [116:31] ==> value-parameter directorySeparators: Array<Char> defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.Companion.findOrCreateTarget[ValueParameterDescriptorImpl]

'splitChar' @ [117:21] ==> val splitChar: Char defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.Companion.findOrCreateTarget[LocalVariableDescriptor]

'className' @ [117:34] ==> var className: String defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.Companion.findOrCreateTarget[LocalVariableDescriptor]

'className' @ [118:33] ==> var className: String defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.Companion.findOrCreateTarget[LocalVariableDescriptor]

'trim' @ [118:43] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'split' @ [118:50] ==> public fun CharSequence.split(vararg delimiters: Char, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'splitChar' @ [118:56] ==> val splitChar: Char defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.Companion.findOrCreateTarget[LocalVariableDescriptor]

'names' @ [120:37] ==> val names: List<String> defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.Companion.findOrCreateTarget[LocalVariableDescriptor]

'dropLast' @ [120:43] ==> public fun <T> List<String>.dropLast(n: Int): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'targetDir' @ [121:25] ==> var targetDir: PsiDirectory defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.Companion.findOrCreateTarget[LocalVariableDescriptor]

'targetDir' @ [121:37] ==> var targetDir: PsiDirectory defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.Companion.findOrCreateTarget[LocalVariableDescriptor]

'findSubdirectory' @ [121:47] ==> @Nullable public abstract fun findSubdirectory(@NotNull p0: String): PsiDirectory? defined in com.intellij.psi.PsiDirectory[JavaMethodDescriptor]

'dirName' @ [121:64] ==> val dirName: String defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.Companion.findOrCreateTarget[LocalVariableDescriptor]

'targetDir' @ [121:76] ==> var targetDir: PsiDirectory defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.Companion.findOrCreateTarget[LocalVariableDescriptor]

'createSubdirectory' @ [121:86] ==> @NotNull public abstract fun createSubdirectory(@NotNull p0: String): PsiDirectory defined in com.intellij.psi.PsiDirectory[JavaMethodDescriptor]

'dirName' @ [121:105] ==> val dirName: String defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.Companion.findOrCreateTarget[LocalVariableDescriptor]

'className' @ [124:21] ==> var className: String defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.Companion.findOrCreateTarget[LocalVariableDescriptor]

'names' @ [124:33] ==> val names: List<String> defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.Companion.findOrCreateTarget[LocalVariableDescriptor]

'last' @ [124:39] ==> public fun <T> List<String>.last(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Pair' @ [128:20] ==> public constructor Pair<out A, out B>(first: String, second: PsiDirectory) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> PsiDirectory

'className' @ [128:25] ==> var className: String defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.Companion.findOrCreateTarget[LocalVariableDescriptor]

'targetDir' @ [128:36] ==> var targetDir: PsiDirectory defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.Companion.findOrCreateTarget[LocalVariableDescriptor]

'dir' @ [132:27] ==> value-parameter dir: PsiDirectory defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.Companion.createFromTemplate[ValueParameterDescriptorImpl]

'project' @ [132:31] ==> public final val PsiDirectory.project: Project[MyPropertyDescriptor]

'getInstance' @ [133:57] ==> public open fun getInstance(@NotNull p0: Project): (FileTemplateManager..FileTemplateManager?) defined in com.intellij.ide.fileTemplates.FileTemplateManager[JavaMethodDescriptor]

'project' @ [133:69] ==> val project: Project defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.Companion.createFromTemplate[LocalVariableDescriptor]

'defaultProperties' @ [133:78] ==> public final val FileTemplateManager.defaultProperties: Properties[MyPropertyDescriptor]

'Properties' @ [135:30] ==> public constructor Properties(p0: (Properties..Properties?)) defined in java.util.Properties[JavaClassConstructorDescriptor]

'defaultProperties' @ [135:41] ==> val defaultProperties: Properties defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.Companion.createFromTemplate[LocalVariableDescriptor]

'CreateFromTemplateDialog' @ [138:17] ==> public constructor CreateFromTemplateDialog(@NotNull p0: Project, @NotNull p1: PsiDirectory, @NotNull p2: FileTemplate, @Nullable p3: AttributesDefaults?, @Nullable p4: Properties?) defined in com.intellij.ide.fileTemplates.ui.CreateFromTemplateDialog[JavaClassConstructorDescriptor]

'project' @ [138:42] ==> val project: Project defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.Companion.createFromTemplate[LocalVariableDescriptor]

'dir' @ [138:51] ==> value-parameter dir: PsiDirectory defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.Companion.createFromTemplate[ValueParameterDescriptorImpl]

'template' @ [138:56] ==> value-parameter template: FileTemplate defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.Companion.createFromTemplate[ValueParameterDescriptorImpl]

'AttributesDefaults' @ [139:42] ==> public constructor AttributesDefaults(@Nullable p0: String?) defined in com.intellij.ide.fileTemplates.actions.AttributesDefaults[JavaClassConstructorDescriptor]

'className' @ [139:61] ==> value-parameter className: String defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.Companion.createFromTemplate[ValueParameterDescriptorImpl]

'withFixedName' @ [139:72] ==> public open fun withFixedName(p0: Boolean): (AttributesDefaults..AttributesDefaults?) defined in com.intellij.ide.fileTemplates.actions.AttributesDefaults[JavaMethodDescriptor]

'properties' @ [140:42] ==> val properties: Properties defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.Companion.createFromTemplate[LocalVariableDescriptor]

'create' @ [140:54] ==> public open fun create(): (PsiElement..PsiElement?) defined in com.intellij.ide.fileTemplates.ui.CreateFromTemplateDialog[JavaMethodDescriptor]

'e' @ [143:23] ==> val e: IncorrectOperationException defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.Companion.createFromTemplate[LocalVariableDescriptor]

'LOG' @ [146:17] ==> protected/*protected static*/ final val LOG: (Logger..Logger?) defined in com.intellij.ide.actions.CreateFileFromTemplateAction[JavaPropertyDescriptor]

'error' @ [146:21] ==> public open fun error(@NotNull p0: Throwable): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'e' @ [146:27] ==> val e: Exception /* = Exception */ defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.Companion.createFromTemplate[LocalVariableDescriptor]

'element' @ [150:20] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.Companion.createFromTemplate[LocalVariableDescriptor]

'containingFile' @ [150:29] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'if (template.name == "Kotlin File") arrayOf('/', '\\') else arrayOf('/', '\\', '.')' @ [154:39] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Array<Char>, elseBranch: Array<Char>): Array<Char>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Array<Char>

'template' @ [154:43] ==> value-parameter template: FileTemplate defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.Companion.createFileFromTemplate[ValueParameterDescriptorImpl]

'name' @ [154:52] ==> public final var FileTemplate.name: String[MyPropertyDescriptor]

'arrayOf' @ [154:75] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Char): Array<Char> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Char

'arrayOf' @ [154:99] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Char): Array<Char> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Char

'component1' @ [155:18] ==> public final operator fun component1(): String defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [155:29] ==> public final operator fun component2(): PsiDirectory defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'findOrCreateTarget' @ [155:42] ==> private final fun findOrCreateTarget(dir: PsiDirectory, name: String, directorySeparators: Array<Char>): Pair<String, PsiDirectory> defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.Companion[SimpleFunctionDescriptorImpl]

'dir' @ [155:61] ==> value-parameter dir: PsiDirectory defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.Companion.createFileFromTemplate[ValueParameterDescriptorImpl]

'name' @ [155:66] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.Companion.createFileFromTemplate[ValueParameterDescriptorImpl]

'directorySeparators' @ [155:72] ==> val directorySeparators: Array<Char> defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.Companion.createFileFromTemplate[LocalVariableDescriptor]

'getInstance' @ [157:39] ==> public open fun getInstance(@NotNull p0: Project): (DumbService..DumbService?) defined in com.intellij.openapi.project.DumbService[JavaMethodDescriptor]

'dir' @ [157:51] ==> value-parameter dir: PsiDirectory defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.Companion.createFileFromTemplate[ValueParameterDescriptorImpl]

'project' @ [157:55] ==> public final val PsiDirectory.project: Project[MyPropertyDescriptor]

'service' @ [158:13] ==> val service: (DumbService..DumbService?) defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.Companion.createFileFromTemplate[LocalVariableDescriptor]

'isAlternativeResolveEnabled' @ [158:21] ==> public final var DumbService.isAlternativeResolveEnabled: Boolean[MyPropertyDescriptor]

'createFromTemplate' @ [160:24] ==> private final fun createFromTemplate(dir: PsiDirectory, className: String, template: FileTemplate): PsiFile? defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.Companion[SimpleFunctionDescriptorImpl]

'targetDir' @ [160:43] ==> val targetDir: PsiDirectory defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.Companion.createFileFromTemplate[LocalVariableDescriptor]

'className' @ [160:54] ==> val className: String defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.Companion.createFileFromTemplate[LocalVariableDescriptor]

'template' @ [160:65] ==> value-parameter template: FileTemplate defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.Companion.createFileFromTemplate[ValueParameterDescriptorImpl]

'service' @ [163:17] ==> val service: (DumbService..DumbService?) defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.Companion.createFileFromTemplate[LocalVariableDescriptor]

'isAlternativeResolveEnabled' @ [163:25] ==> public final var DumbService.isAlternativeResolveEnabled: Boolean[MyPropertyDescriptor]

