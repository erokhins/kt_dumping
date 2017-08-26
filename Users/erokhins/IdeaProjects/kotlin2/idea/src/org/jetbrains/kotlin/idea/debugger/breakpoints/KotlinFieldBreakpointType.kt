'XLineBreakpointType<KotlinPropertyBreakpointProperties>' @ [47:91] ==> protected/*protected and package*/ constructor XLineBreakpointType<P : raw (XBreakpointProperties<(Any..Any?)>..XBreakpointProperties<*>?)>(@NonNls @NotNull p0: String, @Nls @NotNull p1: String) defined in com.intellij.xdebugger.breakpoints.XLineBreakpointType[JavaClassConstructorDescriptor]
Inferred types:
    <P : raw (XBreakpointProperties<(Any..Any?)>..XBreakpointProperties<*>?)> -> KotlinPropertyBreakpointProperties

'message' @ [48:38] ==> @NotNull public open fun message(@NonNls @PropertyKey p0: (String..String?), vararg p1: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'KotlinFieldBreakpoint' @ [51:16] ==> public constructor KotlinFieldBreakpoint(project: Project, breakpoint: XBreakpoint<KotlinPropertyBreakpointProperties>) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpoint[ClassConstructorDescriptorImpl]

'project' @ [51:38] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.createJavaBreakpoint[ValueParameterDescriptorImpl]

'breakpoint' @ [51:47] ==> value-parameter breakpoint: XBreakpoint<KotlinPropertyBreakpointProperties> defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.createJavaBreakpoint[ValueParameterDescriptorImpl]

'canPutAt' @ [55:16] ==> public fun canPutAt(file: VirtualFile, line: Int, project: Project, breakpointTypeClass: Class<*>): Boolean defined in org.jetbrains.kotlin.idea.debugger.breakpoints in file breakpointTypeUtils.kt[SimpleFunctionDescriptorImpl]

'file' @ [55:25] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.canPutAt[ValueParameterDescriptorImpl]

'line' @ [55:31] ==> value-parameter line: Int defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.canPutAt[ValueParameterDescriptorImpl]

'project' @ [55:37] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.canPutAt[ValueParameterDescriptorImpl]

'this' @ [55:46] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType[LazyClassReceiverParameterDescriptor]

'java' @ [55:58] ==> public val <T> KClass<out KotlinFieldBreakpointType>.java: Class<out KotlinFieldBreakpointType> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out KotlinFieldBreakpointType)

'KotlinPropertyBreakpointProperties' @ [61:16] ==> public constructor KotlinPropertyBreakpointProperties(myFieldName: String = ..., myClassName: String = ...) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinPropertyBreakpointProperties[ClassConstructorDescriptorImpl]

'AddFieldBreakpointDialog' @ [67:31] ==> public constructor AddFieldBreakpointDialog(project: (Project..Project?)) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.dialog.AddFieldBreakpointDialog[JavaClassConstructorDescriptor]

'project' @ [67:56] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.addBreakpoint[ValueParameterDescriptorImpl]

'className' @ [69:33] ==> public final val <no name provided>.className: (String..String?)[MyPropertyDescriptor]

'className' @ [70:21] ==> val className: (String..String?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.addBreakpoint.<no name provided>.validateData[LocalVariableDescriptor]

'isEmpty' @ [70:31] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'reportError' @ [71:21] ==> private final fun reportError(project: Project, message: String): Unit defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType[SimpleFunctionDescriptorImpl]

'project' @ [71:33] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.addBreakpoint[ValueParameterDescriptorImpl]

'message' @ [71:57] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.debugger.DebuggerBundle[JavaMethodDescriptor]

'getInstance' @ [75:46] ==> public open fun getInstance(p0: (Project..Project?)): (JavaPsiFacade..JavaPsiFacade?) defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'project' @ [75:58] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.addBreakpoint[ValueParameterDescriptorImpl]

'findClass' @ [75:67] ==> @Nullable public abstract fun findClass(@NonNls @NotNull p0: String, @NotNull p1: GlobalSearchScope): PsiClass? defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'className' @ [75:77] ==> val className: (String..String?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.addBreakpoint.<no name provided>.validateData[LocalVariableDescriptor]

'allScope' @ [75:106] ==> @NotNull public open fun allScope(@NotNull p0: Project): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'project' @ [75:115] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.addBreakpoint[ValueParameterDescriptorImpl]

'psiClass' @ [76:21] ==> val psiClass: PsiClass? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.addBreakpoint.<no name provided>.validateData[LocalVariableDescriptor]

'reportError' @ [77:21] ==> private final fun reportError(project: Project, message: String): Unit defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType[SimpleFunctionDescriptorImpl]

'project' @ [77:33] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.addBreakpoint[ValueParameterDescriptorImpl]

'className' @ [77:59] ==> val className: (String..String?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.addBreakpoint.<no name provided>.validateData[LocalVariableDescriptor]

'fieldName' @ [81:33] ==> public final val <no name provided>.fieldName: (String..String?)[MyPropertyDescriptor]

'fieldName' @ [82:21] ==> val fieldName: (String..String?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.addBreakpoint.<no name provided>.validateData[LocalVariableDescriptor]

'isEmpty' @ [82:31] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'reportError' @ [83:21] ==> private final fun reportError(project: Project, message: String): Unit defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType[SimpleFunctionDescriptorImpl]

'project' @ [83:33] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.addBreakpoint[ValueParameterDescriptorImpl]

'message' @ [83:57] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.debugger.DebuggerBundle[JavaMethodDescriptor]

'result' @ [87:17] ==> var result: XLineBreakpoint<KotlinPropertyBreakpointProperties>? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.addBreakpoint[LocalVariableDescriptor]

'when (psiClass) {
                    is KtLightClassForFacade -> {
                        psiClass.files.asSequence().mapNotNull { createBreakpointIfPropertyExists(it, it, className, fieldName) }.firstOrNull()
                    }
                    is KtLightClassForSourceDeclaration -> {
                        val jetClass = psiClass.kotlinOrigin
                        createBreakpointIfPropertyExists(jetClass, jetClass.containingKtFile, className, fieldName)
                    }
                    else -> null
                }' @ [87:26] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: XLineBreakpoint<KotlinPropertyBreakpointProperties>?, entry1: XLineBreakpoint<KotlinPropertyBreakpointProperties>?, entry2: XLineBreakpoint<KotlinPropertyBreakpointProperties>?): XLineBreakpoint<KotlinPropertyBreakpointProperties>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> XLineBreakpoint<KotlinPropertyBreakpointProperties>?

'psiClass' @ [87:32] ==> val psiClass: PsiClass? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.addBreakpoint.<no name provided>.validateData[LocalVariableDescriptor]

'psiClass' @ [89:25] ==> val psiClass: PsiClass? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.addBreakpoint.<no name provided>.validateData[LocalVariableDescriptor]

'files' @ [89:34] ==> public final val files: Collection<KtFile> defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[DeserializedPropertyDescriptor]

'asSequence' @ [89:40] ==> public fun <T> Iterable<KtFile>.asSequence(): Sequence<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'mapNotNull' @ [89:53] ==> public fun <T, R : Any> Sequence<KtFile>.mapNotNull(transform: (KtFile) -> XLineBreakpoint<KotlinPropertyBreakpointProperties>?): Sequence<XLineBreakpoint<KotlinPropertyBreakpointProperties>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile
    <R : Any> -> XLineBreakpoint<KotlinPropertyBreakpointProperties>

'createBreakpointIfPropertyExists' @ [89:66] ==> private final fun createBreakpointIfPropertyExists(declaration: KtDeclarationContainer, file: KtFile, className: String, fieldName: String): XLineBreakpoint<KotlinPropertyBreakpointProperties>? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType[SimpleFunctionDescriptorImpl]

'it' @ [89:99] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.addBreakpoint.<no name provided>.validateData.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [89:103] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.addBreakpoint.<no name provided>.validateData.<anonymous>[ValueParameterDescriptorImpl]

'className' @ [89:107] ==> val className: (String..String?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.addBreakpoint.<no name provided>.validateData[LocalVariableDescriptor]

'fieldName' @ [89:118] ==> val fieldName: (String..String?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.addBreakpoint.<no name provided>.validateData[LocalVariableDescriptor]

'firstOrNull' @ [89:131] ==> public fun <T> Sequence<XLineBreakpoint<KotlinPropertyBreakpointProperties>>.firstOrNull(): XLineBreakpoint<KotlinPropertyBreakpointProperties>? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> XLineBreakpoint<KotlinPropertyBreakpointProperties>

'psiClass' @ [92:40] ==> val psiClass: PsiClass? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.addBreakpoint.<no name provided>.validateData[LocalVariableDescriptor]

'kotlinOrigin' @ [92:49] ==> public open val kotlinOrigin: KtClassOrObject defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForSourceDeclaration[DeserializedPropertyDescriptor]

'createBreakpointIfPropertyExists' @ [93:25] ==> private final fun createBreakpointIfPropertyExists(declaration: KtDeclarationContainer, file: KtFile, className: String, fieldName: String): XLineBreakpoint<KotlinPropertyBreakpointProperties>? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType[SimpleFunctionDescriptorImpl]

'jetClass' @ [93:58] ==> val jetClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.addBreakpoint.<no name provided>.validateData[LocalVariableDescriptor]

'jetClass' @ [93:68] ==> val jetClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.addBreakpoint.<no name provided>.validateData[LocalVariableDescriptor]

'containingKtFile' @ [93:77] ==> public final val KtClassOrObject.containingKtFile: KtFile[MyPropertyDescriptor]

'className' @ [93:95] ==> val className: (String..String?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.addBreakpoint.<no name provided>.validateData[LocalVariableDescriptor]

'fieldName' @ [93:106] ==> val fieldName: (String..String?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.addBreakpoint.<no name provided>.validateData[LocalVariableDescriptor]

'result' @ [98:21] ==> var result: XLineBreakpoint<KotlinPropertyBreakpointProperties>? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.addBreakpoint[LocalVariableDescriptor]

'reportError' @ [99:21] ==> private final fun reportError(project: Project, message: String): Unit defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType[SimpleFunctionDescriptorImpl]

'project' @ [99:33] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.addBreakpoint[ValueParameterDescriptorImpl]

'message' @ [99:57] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.debugger.DebuggerBundle[JavaMethodDescriptor]

'className' @ [99:107] ==> val className: (String..String?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.addBreakpoint.<no name provided>.validateData[LocalVariableDescriptor]

'fieldName' @ [99:118] ==> val fieldName: (String..String?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.addBreakpoint.<no name provided>.validateData[LocalVariableDescriptor]

'fieldName' @ [99:129] ==> val fieldName: (String..String?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.addBreakpoint.<no name provided>.validateData[LocalVariableDescriptor]

'result' @ [102:24] ==> var result: XLineBreakpoint<KotlinPropertyBreakpointProperties>? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.addBreakpoint[LocalVariableDescriptor]

'dialog' @ [106:9] ==> val dialog: <no name provided> defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.addBreakpoint[LocalVariableDescriptor]

'show' @ [106:16] ==> public open fun show(): Unit defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.addBreakpoint.<no name provided>[JavaMethodDescriptor]

'result' @ [107:16] ==> var result: XLineBreakpoint<KotlinPropertyBreakpointProperties>? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.addBreakpoint[LocalVariableDescriptor]

'file' @ [116:23] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.createBreakpointIfPropertyExists[ValueParameterDescriptorImpl]

'project' @ [116:28] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'declaration' @ [117:24] ==> value-parameter declaration: KtDeclarationContainer defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.createBreakpointIfPropertyExists[ValueParameterDescriptorImpl]

'declarations' @ [117:36] ==> public final val KtDeclarationContainer.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'firstOrNull' @ [117:49] ==> public inline fun <T> Iterable<(KtDeclaration..KtDeclaration?)>.firstOrNull(predicate: ((KtDeclaration..KtDeclaration?)) -> Boolean): KtDeclaration? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)

'it' @ [117:63] ==> value-parameter it: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.createBreakpointIfPropertyExists.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [117:83] ==> value-parameter it: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.createBreakpointIfPropertyExists.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [117:86] ==> public final val KtProperty.name: String?[MyPropertyDescriptor]

'fieldName' @ [117:94] ==> value-parameter fieldName: String defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.createBreakpointIfPropertyExists[ValueParameterDescriptorImpl]

'?:' @ [119:24] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Document?, right: Document): Document[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Document

'getInstance' @ [119:43] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [119:55] ==> val project: Project defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.createBreakpointIfPropertyExists[LocalVariableDescriptor]

'getDocument' @ [119:64] ==> @Nullable public abstract fun getDocument(@NotNull p0: PsiFile): Document? defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'file' @ [119:76] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.createBreakpointIfPropertyExists[ValueParameterDescriptorImpl]

'document' @ [120:20] ==> val document: Document defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.createBreakpointIfPropertyExists[LocalVariableDescriptor]

'getLineNumber' @ [120:29] ==> @Contract public abstract fun getLineNumber(p0: Int): Int defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'property' @ [120:43] ==> val property: KtDeclaration defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.createBreakpointIfPropertyExists[LocalVariableDescriptor]

'textOffset' @ [120:52] ==> public final val KtDeclaration.textOffset: Int[MyPropertyDescriptor]

'runWriteAction' @ [121:16] ==> public fun <T> runWriteAction(action: () -> XLineBreakpoint<(KotlinPropertyBreakpointProperties..KotlinPropertyBreakpointProperties?)>): XLineBreakpoint<(KotlinPropertyBreakpointProperties..KotlinPropertyBreakpointProperties?)> defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> XLineBreakpoint<(org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinPropertyBreakpointProperties..org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinPropertyBreakpointProperties?)>

'getInstance' @ [122:30] ==> public open fun getInstance(@NotNull p0: Project): (XDebuggerManager..XDebuggerManager?) defined in com.intellij.xdebugger.XDebuggerManager[JavaMethodDescriptor]

'project' @ [122:42] ==> val project: Project defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.createBreakpointIfPropertyExists[LocalVariableDescriptor]

'breakpointManager' @ [122:51] ==> public final val XDebuggerManager.breakpointManager: XBreakpointManager[MyPropertyDescriptor]

'addLineBreakpoint' @ [122:69] ==> @NotNull public abstract fun <T : raw (XBreakpointProperties<(Any..Any?)>..XBreakpointProperties<*>?)> addLineBreakpoint(p0: (XLineBreakpointType<(KotlinPropertyBreakpointProperties..KotlinPropertyBreakpointProperties?)>..XLineBreakpointType<(KotlinPropertyBreakpointProperties..KotlinPropertyBreakpointProperties?)>?), @NotNull p1: String, p2: Int, @Nullable p3: KotlinPropertyBreakpointProperties?): XLineBreakpoint<(KotlinPropertyBreakpointProperties..KotlinPropertyBreakpointProperties?)> defined in com.intellij.xdebugger.breakpoints.XBreakpointManager[JavaMethodDescriptor]
Inferred types:
    <T : raw (XBreakpointProperties<(Any..Any?)>..XBreakpointProperties<*>?)> -> (org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinPropertyBreakpointProperties..org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinPropertyBreakpointProperties?)

'this' @ [123:21] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType[LazyClassReceiverParameterDescriptor]

'file' @ [124:21] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.createBreakpointIfPropertyExists[ValueParameterDescriptorImpl]

'virtualFile' @ [124:26] ==> public final val KtFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'url' @ [124:38] ==> public final val VirtualFile.url: String[MyPropertyDescriptor]

'line' @ [125:21] ==> val line: Int defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.createBreakpointIfPropertyExists[LocalVariableDescriptor]

'KotlinPropertyBreakpointProperties' @ [126:21] ==> public constructor KotlinPropertyBreakpointProperties(myFieldName: String = ..., myClassName: String = ...) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinPropertyBreakpointProperties[ClassConstructorDescriptorImpl]

'fieldName' @ [126:56] ==> value-parameter fieldName: String defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.createBreakpointIfPropertyExists[ValueParameterDescriptorImpl]

'className' @ [126:67] ==> value-parameter className: String defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.createBreakpointIfPropertyExists[ValueParameterDescriptorImpl]

'showMessageDialog' @ [132:18] ==> public open fun showMessageDialog(@Nullable p0: Project?, p1: (String..String?), @NotNull @Nls p2: String, @Nullable p3: Icon?): Unit defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'project' @ [132:36] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.reportError[ValueParameterDescriptorImpl]

'message' @ [132:45] ==> value-parameter message: String defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.reportError[ValueParameterDescriptorImpl]

'message' @ [132:69] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.debugger.DebuggerBundle[JavaMethodDescriptor]

'getErrorIcon' @ [132:124] ==> @NotNull public open fun getErrorIcon(): Icon defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'Db_muted_field_breakpoint' @ [137:60] ==> public final val Db_muted_field_breakpoint: (Icon..Icon?) defined in com.intellij.icons.AllIcons.Debugger[JavaPropertyDescriptor]

'Db_disabled_field_breakpoint' @ [139:56] ==> public final val Db_disabled_field_breakpoint: (Icon..Icon?) defined in com.intellij.icons.AllIcons.Debugger[JavaPropertyDescriptor]

'Db_field_breakpoint' @ [141:55] ==> public final val Db_field_breakpoint: (Icon..Icon?) defined in com.intellij.icons.AllIcons.Debugger[JavaPropertyDescriptor]

'Db_muted_disabled_field_breakpoint' @ [143:61] ==> public final val Db_muted_disabled_field_breakpoint: (Icon..Icon?) defined in com.intellij.icons.AllIcons.Debugger[JavaPropertyDescriptor]

'breakpoint' @ [148:26] ==> value-parameter breakpoint: XLineBreakpoint<KotlinPropertyBreakpointProperties> defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.getShortText[ValueParameterDescriptorImpl]

'properties' @ [148:37] ==> public final val <P : raw (XBreakpointProperties<(Any..Any?)>..XBreakpointProperties<*>?)> XLineBreakpoint<KotlinPropertyBreakpointProperties>.properties: (KotlinPropertyBreakpointProperties..KotlinPropertyBreakpointProperties?)[MyPropertyDescriptor]
Inferred types:
    <P : raw (XBreakpointProperties<(Any..Any?)>..XBreakpointProperties<*>?)> -> KotlinPropertyBreakpointProperties

'properties' @ [149:25] ==> val properties: (KotlinPropertyBreakpointProperties..KotlinPropertyBreakpointProperties?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.getShortText[LocalVariableDescriptor]

'myClassName' @ [149:36] ==> @Attribute public final var myClassName: String defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinPropertyBreakpointProperties[PropertyDescriptorImpl]

'if (!className.isEmpty()) className + "." + properties.myFieldName else properties.myFieldName' @ [150:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'!' @ [150:20] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'className' @ [150:21] ==> val className: String defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.getShortText[LocalVariableDescriptor]

'isEmpty' @ [150:31] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'className' @ [150:42] ==> val className: String defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.getShortText[LocalVariableDescriptor]

'properties' @ [150:60] ==> val properties: (KotlinPropertyBreakpointProperties..KotlinPropertyBreakpointProperties?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.getShortText[LocalVariableDescriptor]

'myFieldName' @ [150:71] ==> @Attribute public final var myFieldName: String defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinPropertyBreakpointProperties[PropertyDescriptorImpl]

'properties' @ [150:88] ==> val properties: (KotlinPropertyBreakpointProperties..KotlinPropertyBreakpointProperties?) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.getShortText[LocalVariableDescriptor]

'myFieldName' @ [150:99] ==> @Attribute public final var myFieldName: String defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinPropertyBreakpointProperties[PropertyDescriptorImpl]

'KotlinPropertyBreakpointProperties' @ [154:16] ==> public constructor KotlinPropertyBreakpointProperties(myFieldName: String = ..., myClassName: String = ...) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinPropertyBreakpointProperties[ClassConstructorDescriptorImpl]

'KotlinFieldBreakpointPropertiesPanel' @ [158:16] ==> public constructor KotlinFieldBreakpointPropertiesPanel() defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointPropertiesPanel[ClassConstructorDescriptorImpl]

'getJavaBreakpoint' @ [162:50] ==> @Nullable public open fun getJavaBreakpoint(@Nullable p0: raw (XBreakpoint<(XBreakpointProperties<*>..XBreakpointProperties<*>?)>?..XBreakpoint<out (XBreakpointProperties<*>..XBreakpointProperties<*>?)>?)): raw (Breakpoint<(JavaBreakpointProperties<*>..JavaBreakpointProperties<*>?)>?..Breakpoint<out (JavaBreakpointProperties<*>..JavaBreakpointProperties<*>?)>?) defined in com.intellij.debugger.ui.breakpoints.BreakpointManager[JavaMethodDescriptor]

'breakpoint' @ [162:68] ==> value-parameter breakpoint: XLineBreakpoint<KotlinPropertyBreakpointProperties> defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.getDisplayText[ValueParameterDescriptorImpl]

'if (kotlinBreakpoint != null) {
            kotlinBreakpoint.description
        }
        else {
            super.getDisplayText(breakpoint)
        }' @ [163:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'kotlinBreakpoint' @ [163:20] ==> val kotlinBreakpoint: BreakpointWithHighlighter<(JavaBreakpointProperties<*>..JavaBreakpointProperties<*>?)>? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.getDisplayText[LocalVariableDescriptor]

'kotlinBreakpoint' @ [164:13] ==> val kotlinBreakpoint: BreakpointWithHighlighter<(JavaBreakpointProperties<*>..JavaBreakpointProperties<*>?)>? defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.getDisplayText[LocalVariableDescriptor]

'description' @ [164:30] ==> public final val <P : raw (JavaBreakpointProperties<(JavaBreakpointProperties<*>..JavaBreakpointProperties<*>?)>..JavaBreakpointProperties<out (JavaBreakpointProperties<*>..JavaBreakpointProperties<*>?)>?)> BreakpointWithHighlighter<(JavaBreakpointProperties<*>..JavaBreakpointProperties<*>?)>.description: String[MyPropertyDescriptor]
Inferred types:
    <P : raw (JavaBreakpointProperties<(JavaBreakpointProperties<*>..JavaBreakpointProperties<*>?)>..JavaBreakpointProperties<out (JavaBreakpointProperties<*>..JavaBreakpointProperties<*>?)>?)> -> (org.jetbrains.java.debugger.breakpoints.properties.JavaBreakpointProperties<*>..org.jetbrains.java.debugger.breakpoints.properties.JavaBreakpointProperties<*>?)

'super' @ [167:13] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType[LazyClassReceiverParameterDescriptor]

'getDisplayText' @ [167:19] ==> public open fun getDisplayText(p0: (XLineBreakpoint<(KotlinPropertyBreakpointProperties..KotlinPropertyBreakpointProperties?)>..XLineBreakpoint<(KotlinPropertyBreakpointProperties..KotlinPropertyBreakpointProperties?)>?)): (String..String?) defined in com.intellij.xdebugger.breakpoints.XLineBreakpointType[JavaMethodDescriptor]

'breakpoint' @ [167:34] ==> value-parameter breakpoint: XLineBreakpoint<KotlinPropertyBreakpointProperties> defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.getDisplayText[ValueParameterDescriptorImpl]

'KotlinBreakpointFiltersPanel' @ [174:16] ==> public constructor KotlinBreakpointFiltersPanel<T : (KotlinPropertyBreakpointProperties..KotlinPropertyBreakpointProperties?), B : (XBreakpoint<(KotlinPropertyBreakpointProperties..KotlinPropertyBreakpointProperties?)>..XBreakpoint<(KotlinPropertyBreakpointProperties..KotlinPropertyBreakpointProperties?)>?)>(project: (Project..Project?)) defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinBreakpointFiltersPanel[JavaClassConstructorDescriptor]
Inferred types:
    <T : (KotlinPropertyBreakpointProperties..KotlinPropertyBreakpointProperties?)> -> (org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinPropertyBreakpointProperties..org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinPropertyBreakpointProperties?)
    <B : (XBreakpoint<(T..T?)>..XBreakpoint<(T..T?)>?)> -> (com.intellij.xdebugger.breakpoints.XLineBreakpoint<org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinPropertyBreakpointProperties>..com.intellij.xdebugger.breakpoints.XLineBreakpoint<org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinPropertyBreakpointProperties>?)

'project' @ [174:45] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.breakpoints.KotlinFieldBreakpointType.createCustomRightPropertiesPanel[ValueParameterDescriptorImpl]

