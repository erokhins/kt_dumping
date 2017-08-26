'MultiFileTestCase' @ [32:42] ==> public constructor MultiFileTestCase() defined in com.intellij.refactoring.MultiFileTestCase[JavaClassConstructorDescriptor]

'super' @ [36:9] ==> <this> defined in org.jetbrains.kotlin.idea.test.KotlinMultiFileTestCase[LazyClassReceiverParameterDescriptor]

'setUp' @ [36:15] ==> protected/*protected and package*/ open fun setUp(): Unit defined in com.intellij.refactoring.MultiFileTestCase[JavaMethodDescriptor]

'allowRootAccess' @ [37:23] ==> public open fun allowRootAccess(@NotNull vararg p0: (String..String?)): Unit defined in com.intellij.openapi.vfs.newvfs.impl.VfsRootAccess[JavaMethodDescriptor]

'getHomeDirectory' @ [37:55] ==> @NotNull public open fun getHomeDirectory(): String defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'getTestName' @ [41:24] ==> @NotNull protected/*protected and package*/ open fun getTestName(p0: Boolean): String defined in org.jetbrains.kotlin.idea.test.KotlinMultiFileTestCase[JavaMethodDescriptor]

'lowercaseFirstLetter' @ [41:36] ==> value-parameter lowercaseFirstLetter: Boolean defined in org.jetbrains.kotlin.idea.test.KotlinMultiFileTestCase.getTestDirName[ValueParameterDescriptorImpl]

'testName' @ [42:24] ==> val testName: String defined in org.jetbrains.kotlin.idea.test.KotlinMultiFileTestCase.getTestDirName[LocalVariableDescriptor]

'lastIndexOf' @ [42:33] ==> public fun CharSequence.lastIndexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'endIndex' @ [43:13] ==> val endIndex: Int defined in org.jetbrains.kotlin.idea.test.KotlinMultiFileTestCase.getTestDirName[LocalVariableDescriptor]

'testName' @ [43:34] ==> val testName: String defined in org.jetbrains.kotlin.idea.test.KotlinMultiFileTestCase.getTestDirName[LocalVariableDescriptor]

'testName' @ [44:16] ==> val testName: String defined in org.jetbrains.kotlin.idea.test.KotlinMultiFileTestCase.getTestDirName[LocalVariableDescriptor]

'substring' @ [44:25] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'endIndex' @ [44:38] ==> val endIndex: Int defined in org.jetbrains.kotlin.idea.test.KotlinMultiFileTestCase.getTestDirName[LocalVariableDescriptor]

'replace' @ [44:48] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'super' @ [48:9] ==> <this> defined in org.jetbrains.kotlin.idea.test.KotlinMultiFileTestCase[LazyClassReceiverParameterDescriptor]

'doTest' @ [48:15] ==> protected/*protected and package*/ for synthetic extension final fun doTest(p0: (((VirtualFile..VirtualFile?), (VirtualFile..VirtualFile?)) -> Unit..(((VirtualFile..VirtualFile?), (VirtualFile..VirtualFile?)) -> Unit)?), p1: (String..String?)): Unit defined in com.intellij.refactoring.MultiFileTestCase[MyFunctionDescriptor]

'invoke' @ [49:26] ==> public abstract operator fun invoke(p1: VirtualFile, p2: VirtualFile?): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'rootDir' @ [49:33] ==> value-parameter rootDir: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.test.KotlinMultiFileTestCase.doTestCommittingDocuments.<anonymous>[ValueParameterDescriptorImpl]

'rootAfter' @ [49:42] ==> value-parameter rootAfter: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.test.KotlinMultiFileTestCase.doTestCommittingDocuments.<anonymous>[ValueParameterDescriptorImpl]

'getInstance' @ [51:45] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [51:57] ==> public final val KotlinMultiFileTestCase.project: (Project..Project?)[MyPropertyDescriptor]

'commitAllDocuments' @ [51:68] ==> public abstract fun commitAllDocuments(): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'getInstance' @ [52:46] ==> @NotNull public open fun getInstance(): FileDocumentManager defined in com.intellij.openapi.fileEditor.FileDocumentManager[JavaMethodDescriptor]

'saveAllDocuments' @ [52:60] ==> public abstract fun saveAllDocuments(): Unit defined in com.intellij.openapi.fileEditor.FileDocumentManager[JavaMethodDescriptor]

'getTestDirName' @ [53:25] ==> protected final fun getTestDirName(lowercaseFirstLetter: Boolean): String defined in org.jetbrains.kotlin.idea.test.KotlinMultiFileTestCase[SimpleFunctionDescriptorImpl]

'if (isMultiModule) {
            val model = ModuleManager.getInstance(project).modifiableModel

            VfsUtilCore.visitChildrenRecursively(
                    rootDir,
                    object : VirtualFileVisitor<Any>() {
                        override fun visitFile(file: VirtualFile): Boolean {
                            if (!file.isDirectory && file.name.endsWith(ModuleFileType.DOT_DEFAULT_EXTENSION)) {
                                model.loadModule(file.path)
                                return false
                            }

                            return true
                        }
                    }
            )

            runWriteAction { model.commit() }
        }
        else {
            PsiTestUtil.addSourceContentToRoots(myModule, rootDir)
        }' @ [57:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isMultiModule' @ [57:13] ==> protected final var isMultiModule: Boolean defined in org.jetbrains.kotlin.idea.test.KotlinMultiFileTestCase[PropertyDescriptorImpl]

'getInstance' @ [58:39] ==> public open fun getInstance(@NotNull p0: Project): (ModuleManager..ModuleManager?) defined in com.intellij.openapi.module.ModuleManager[JavaMethodDescriptor]

'project' @ [58:51] ==> public final val KotlinMultiFileTestCase.project: (Project..Project?)[MyPropertyDescriptor]

'modifiableModel' @ [58:60] ==> public final val ModuleManager.modifiableModel: ModifiableModuleModel[MyPropertyDescriptor]

'visitChildrenRecursively' @ [60:25] ==> @NotNull public open fun visitChildrenRecursively(@NotNull p0: VirtualFile, @NotNull p1: VirtualFileVisitor<*>): VirtualFileVisitor.Result defined in com.intellij.openapi.vfs.VfsUtilCore[JavaMethodDescriptor]

'rootDir' @ [61:21] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.test.KotlinMultiFileTestCase.prepareProject[ValueParameterDescriptorImpl]

'VirtualFileVisitor<Any>' @ [62:30] ==> protected/*protected and package*/ constructor VirtualFileVisitor<T : (Any..Any?)>(@NotNull vararg p0: (VirtualFileVisitor.Option..VirtualFileVisitor.Option?)) defined in com.intellij.openapi.vfs.VirtualFileVisitor[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'!' @ [64:33] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'file' @ [64:34] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.test.KotlinMultiFileTestCase.prepareProject.<no name provided>.visitFile[ValueParameterDescriptorImpl]

'isDirectory' @ [64:39] ==> public final val VirtualFile.isDirectory: Boolean[MyPropertyDescriptor]

'file' @ [64:54] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.test.KotlinMultiFileTestCase.prepareProject.<no name provided>.visitFile[ValueParameterDescriptorImpl]

'name' @ [64:59] ==> public final val VirtualFile.name: String[MyPropertyDescriptor]

'endsWith' @ [64:64] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'DOT_DEFAULT_EXTENSION' @ [64:88] ==> @NonNls public const final val DOT_DEFAULT_EXTENSION: String defined in com.intellij.ide.highlighter.ModuleFileType[JavaPropertyDescriptor]

'model' @ [65:33] ==> val model: ModifiableModuleModel defined in org.jetbrains.kotlin.idea.test.KotlinMultiFileTestCase.prepareProject[LocalVariableDescriptor]

'loadModule' @ [65:39] ==> @NotNull public abstract fun loadModule(@NotNull p0: String): Module defined in com.intellij.openapi.module.ModifiableModuleModel[JavaMethodDescriptor]

'file' @ [65:50] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.test.KotlinMultiFileTestCase.prepareProject.<no name provided>.visitFile[ValueParameterDescriptorImpl]

'path' @ [65:55] ==> public final val VirtualFile.path: String[MyPropertyDescriptor]

'runWriteAction' @ [74:13] ==> public fun <T> runWriteAction(action: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'model' @ [74:30] ==> val model: ModifiableModuleModel defined in org.jetbrains.kotlin.idea.test.KotlinMultiFileTestCase.prepareProject[LocalVariableDescriptor]

'commit' @ [74:36] ==> public abstract fun commit(): Unit defined in com.intellij.openapi.module.ModifiableModuleModel[JavaMethodDescriptor]

'addSourceContentToRoots' @ [77:25] ==> public open fun addSourceContentToRoots(p0: (Module..Module?), @NotNull p1: VirtualFile): Unit defined in com.intellij.testFramework.PsiTestUtil[JavaMethodDescriptor]

'myModule' @ [77:49] ==> protected/*protected and package*/ final var myModule: (Module..Module?) defined in org.jetbrains.kotlin.idea.test.KotlinMultiFileTestCase[JavaPropertyDescriptor]

'rootDir' @ [77:59] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.test.KotlinMultiFileTestCase.prepareProject[ValueParameterDescriptorImpl]

'disallowRootAccess' @ [82:23] ==> public open fun disallowRootAccess(@NotNull vararg p0: (String..String?)): Unit defined in com.intellij.openapi.vfs.newvfs.impl.VfsRootAccess[JavaMethodDescriptor]

'getHomeDirectory' @ [82:58] ==> @NotNull public open fun getHomeDirectory(): String defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'super' @ [83:9] ==> <this> defined in org.jetbrains.kotlin.idea.test.KotlinMultiFileTestCase[LazyClassReceiverParameterDescriptor]

'tearDown' @ [83:15] ==> protected/*protected and package*/ open fun tearDown(): Unit defined in com.intellij.refactoring.MultiFileTestCase[JavaMethodDescriptor]

