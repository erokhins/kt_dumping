'testWithControlledAccessToAst' @ [38:9] ==> public final fun testWithControlledAccessToAst(shouldFail: Boolean, allowedFiles: List<VirtualFile>, project: Project, disposable: Disposable, testBody: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.test.AstAccessControl[SimpleFunctionDescriptorImpl]

'shouldFail' @ [38:39] ==> value-parameter shouldFail: Boolean defined in org.jetbrains.kotlin.idea.test.AstAccessControl.testWithControlledAccessToAst[ValueParameterDescriptorImpl]

'listOf' @ [38:51] ==> @InlineOnly public inline fun <T> listOf(): List<VirtualFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile

'project' @ [38:61] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.test.AstAccessControl.testWithControlledAccessToAst[ValueParameterDescriptorImpl]

'disposable' @ [38:70] ==> value-parameter disposable: Disposable defined in org.jetbrains.kotlin.idea.test.AstAccessControl.testWithControlledAccessToAst[ValueParameterDescriptorImpl]

'testBody' @ [38:82] ==> value-parameter testBody: () -> Unit defined in org.jetbrains.kotlin.idea.test.AstAccessControl.testWithControlledAccessToAst[ValueParameterDescriptorImpl]

'testWithControlledAccessToAst' @ [45:9] ==> public final fun testWithControlledAccessToAst(shouldFail: Boolean, allowedFiles: List<VirtualFile>, project: Project, disposable: Disposable, testBody: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.test.AstAccessControl[SimpleFunctionDescriptorImpl]

'shouldFail' @ [45:39] ==> value-parameter shouldFail: Boolean defined in org.jetbrains.kotlin.idea.test.AstAccessControl.testWithControlledAccessToAst[ValueParameterDescriptorImpl]

'listOf' @ [45:51] ==> public fun <T> listOf(element: VirtualFile): List<VirtualFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile

'allowedFile' @ [45:58] ==> value-parameter allowedFile: VirtualFile defined in org.jetbrains.kotlin.idea.test.AstAccessControl.testWithControlledAccessToAst[ValueParameterDescriptorImpl]

'project' @ [45:72] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.test.AstAccessControl.testWithControlledAccessToAst[ValueParameterDescriptorImpl]

'disposable' @ [45:81] ==> value-parameter disposable: Disposable defined in org.jetbrains.kotlin.idea.test.AstAccessControl.testWithControlledAccessToAst[ValueParameterDescriptorImpl]

'testBody' @ [45:93] ==> value-parameter testBody: () -> Unit defined in org.jetbrains.kotlin.idea.test.AstAccessControl.testWithControlledAccessToAst[ValueParameterDescriptorImpl]

'wrapWithDirectiveAllow' @ [52:22] ==> public final fun wrapWithDirectiveAllow(allowedFiles: (VirtualFile) -> Boolean): (VirtualFile) -> Boolean defined in org.jetbrains.kotlin.idea.test.AstAccessControl[SimpleFunctionDescriptorImpl]

'file' @ [53:13] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.test.AstAccessControl.testWithControlledAccessToAst.<anonymous>[ValueParameterDescriptorImpl]

'fileType' @ [53:18] ==> public final val VirtualFile.fileType: FileType[MyPropertyDescriptor]

'INSTANCE' @ [53:45] ==> public final val INSTANCE: (KotlinFileType..KotlinFileType?) defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

'file' @ [53:57] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.test.AstAccessControl.testWithControlledAccessToAst.<anonymous>[ValueParameterDescriptorImpl]

'allowedFiles' @ [53:65] ==> value-parameter allowedFiles: List<VirtualFile> defined in org.jetbrains.kotlin.idea.test.AstAccessControl.testWithControlledAccessToAst[ValueParameterDescriptorImpl]

'execute' @ [56:9] ==> private final fun <T : Any> execute(shouldFail: Boolean, project: Project, disposable: Disposable, forbidAstAccessFilter: (VirtualFile) -> Boolean, testBody: () -> Unit): Unit? defined in org.jetbrains.kotlin.idea.test.AstAccessControl[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> Unit

'shouldFail' @ [56:17] ==> value-parameter shouldFail: Boolean defined in org.jetbrains.kotlin.idea.test.AstAccessControl.testWithControlledAccessToAst[ValueParameterDescriptorImpl]

'project' @ [56:29] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.test.AstAccessControl.testWithControlledAccessToAst[ValueParameterDescriptorImpl]

'disposable' @ [56:38] ==> value-parameter disposable: Disposable defined in org.jetbrains.kotlin.idea.test.AstAccessControl.testWithControlledAccessToAst[ValueParameterDescriptorImpl]

'filter' @ [56:50] ==> val filter: (VirtualFile) -> Boolean defined in org.jetbrains.kotlin.idea.test.AstAccessControl.testWithControlledAccessToAst[LocalVariableDescriptor]

'testBody' @ [56:58] ==> value-parameter testBody: () -> Unit defined in org.jetbrains.kotlin.idea.test.AstAccessControl.testWithControlledAccessToAst[ValueParameterDescriptorImpl]

'if (allowedFiles(file)) {
                false
            }
            else {
                val text = VfsUtilCore.loadText(file)
                !InTextDirectivesUtils.isDirectiveDefined(text, ALLOW_AST_ACCESS_DIRECTIVE)
            }' @ [61:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'invoke' @ [61:17] ==> public abstract operator fun invoke(p1: VirtualFile): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'file' @ [61:30] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.test.AstAccessControl.wrapWithDirectiveAllow.<anonymous>[ValueParameterDescriptorImpl]

'loadText' @ [65:40] ==> @NotNull public open fun loadText(@NotNull p0: VirtualFile): String defined in com.intellij.openapi.vfs.VfsUtilCore[JavaMethodDescriptor]

'file' @ [65:49] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.test.AstAccessControl.wrapWithDirectiveAllow.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [66:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isDirectiveDefined' @ [66:40] ==> public open fun isDirectiveDefined(p0: (String..String?), p1: (String..String?)): Boolean defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'text' @ [66:59] ==> val text: String defined in org.jetbrains.kotlin.idea.test.AstAccessControl.wrapWithDirectiveAllow.<anonymous>[LocalVariableDescriptor]

'ALLOW_AST_ACCESS_DIRECTIVE' @ [66:65] ==> public final val ALLOW_AST_ACCESS_DIRECTIVE: String defined in org.jetbrains.kotlin.idea.test.AstAccessControl[PropertyDescriptorImpl]

'execute' @ [72:16] ==> private final fun <T : Any> execute(shouldFail: Boolean, project: Project, disposable: Disposable, forbidAstAccessFilter: (VirtualFile) -> Boolean, testBody: () -> T): T? defined in org.jetbrains.kotlin.idea.test.AstAccessControl[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'shouldFail' @ [72:24] ==> value-parameter shouldFail: Boolean defined in org.jetbrains.kotlin.idea.test.AstAccessControl.execute[ValueParameterDescriptorImpl]

'fixture' @ [72:36] ==> value-parameter fixture: CodeInsightTestFixture defined in org.jetbrains.kotlin.idea.test.AstAccessControl.execute[ValueParameterDescriptorImpl]

'project' @ [72:44] ==> public final val CodeInsightTestFixture.project: (Project..Project?)[MyPropertyDescriptor]

'disposable' @ [72:53] ==> value-parameter disposable: Disposable defined in org.jetbrains.kotlin.idea.test.AstAccessControl.execute[ValueParameterDescriptorImpl]

'file' @ [72:75] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.test.AstAccessControl.execute.<anonymous>[ValueParameterDescriptorImpl]

'fixture' @ [72:83] ==> value-parameter fixture: CodeInsightTestFixture defined in org.jetbrains.kotlin.idea.test.AstAccessControl.execute[ValueParameterDescriptorImpl]

'file' @ [72:91] ==> public final val CodeInsightTestFixture.file: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'virtualFile' @ [72:96] ==> public final val PsiFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'testBody' @ [72:111] ==> value-parameter testBody: () -> T defined in org.jetbrains.kotlin.idea.test.AstAccessControl.execute[ValueParameterDescriptorImpl]

'getInstance' @ [77:35] ==> @NotNull public open fun getInstance(@NotNull p0: Project): PsiManager defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'project' @ [77:47] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.test.AstAccessControl.execute[ValueParameterDescriptorImpl]

'manager' @ [79:9] ==> val manager: PsiManagerImpl defined in org.jetbrains.kotlin.idea.test.AstAccessControl.execute[LocalVariableDescriptor]

'setAssertOnFileLoadingFilter' @ [79:17] ==> public open fun setAssertOnFileLoadingFilter(@NotNull p0: VirtualFileFilter, @NotNull p1: Disposable): Unit defined in com.intellij.psi.impl.PsiManagerImpl[JavaMethodDescriptor]

'VirtualFileFilter' @ [79:46] ==> public fun VirtualFileFilter(function: ((VirtualFile..VirtualFile?)) -> Boolean): VirtualFileFilter defined in com.intellij.openapi.vfs[SimpleFunctionDescriptorImpl]

'invoke' @ [79:74] ==> public abstract operator fun invoke(p1: VirtualFile): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'file' @ [79:96] ==> value-parameter file: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.test.AstAccessControl.execute.<anonymous>[ValueParameterDescriptorImpl]

'disposable' @ [79:105] ==> value-parameter disposable: Disposable defined in org.jetbrains.kotlin.idea.test.AstAccessControl.execute[ValueParameterDescriptorImpl]

'invoke' @ [82:26] ==> public abstract operator fun invoke(): T defined in kotlin.Function0[FunctionInvokeDescriptor]

'shouldFail' @ [83:17] ==> value-parameter shouldFail: Boolean defined in org.jetbrains.kotlin.idea.test.AstAccessControl.execute[ValueParameterDescriptorImpl]

'fail' @ [84:17] ==> public fun fail(message: String? = ...): Nothing defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'+' @ [84:22] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'result' @ [90:20] ==> val result: T defined in org.jetbrains.kotlin.idea.test.AstAccessControl.execute[LocalVariableDescriptor]

'!' @ [93:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'shouldFail' @ [93:18] ==> value-parameter shouldFail: Boolean defined in org.jetbrains.kotlin.idea.test.AstAccessControl.execute[ValueParameterDescriptorImpl]

'e' @ [94:23] ==> val e: Throwable defined in org.jetbrains.kotlin.idea.test.AstAccessControl.execute[LocalVariableDescriptor]

'manager' @ [98:13] ==> val manager: PsiManagerImpl defined in org.jetbrains.kotlin.idea.test.AstAccessControl.execute[LocalVariableDescriptor]

'setAssertOnFileLoadingFilter' @ [98:21] ==> public open fun setAssertOnFileLoadingFilter(@NotNull p0: VirtualFileFilter, @NotNull p1: Disposable): Unit defined in com.intellij.psi.impl.PsiManagerImpl[JavaMethodDescriptor]

'NONE' @ [98:68] ==> public final val NONE: (VirtualFileFilter..VirtualFileFilter?) defined in com.intellij.openapi.vfs.VirtualFileFilter[JavaPropertyDescriptor]

'disposable' @ [98:74] ==> value-parameter disposable: Disposable defined in org.jetbrains.kotlin.idea.test.AstAccessControl.execute[ValueParameterDescriptorImpl]

