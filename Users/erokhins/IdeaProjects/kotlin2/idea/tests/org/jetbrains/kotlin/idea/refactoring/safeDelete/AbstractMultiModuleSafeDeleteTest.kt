'KotlinMultiFileTestCase' @ [34:52] ==> public constructor KotlinMultiFileTestCase() defined in org.jetbrains.kotlin.idea.test.KotlinMultiFileTestCase[ClassConstructorDescriptorImpl]

'Suppress' @ [37:13] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'forName' @ [38:38] ==> @CallerSensitive public open fun forName(p0: (String..String?)): (Class<*>..Class<*>?) defined in java.lang.Class[JavaMethodDescriptor]

'config' @ [38:46] ==> value-parameter config: JsonObject defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.AbstractMultiModuleSafeDeleteTest.SafeDeleteAction.runRefactoring[ValueParameterDescriptorImpl]

'getString' @ [38:53] ==> public fun JsonObject.getString(name: String): String defined in org.jetbrains.kotlin.idea.jsonUtils in file jsonUtils.kt[SimpleFunctionDescriptorImpl]

'elementsAtCaret' @ [39:27] ==> value-parameter elementsAtCaret: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.AbstractMultiModuleSafeDeleteTest.SafeDeleteAction.runRefactoring[ValueParameterDescriptorImpl]

'single' @ [39:43] ==> public fun <T> List<PsiElement>.single(): PsiElement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'getNonStrictParentOfType' @ [39:52] ==> public fun <T : PsiElement> PsiElement.getNonStrictParentOfType(parentClass: Class<PsiElement>): PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : PsiElement> -> PsiElement

'elementClass' @ [39:77] ==> val elementClass: Class<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.AbstractMultiModuleSafeDeleteTest.SafeDeleteAction.runRefactoring[LocalVariableDescriptor]

'mainFile' @ [40:27] ==> value-parameter mainFile: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.AbstractMultiModuleSafeDeleteTest.SafeDeleteAction.runRefactoring[ValueParameterDescriptorImpl]

'project' @ [40:36] ==> public final val PsiFile.project: Project[MyPropertyDescriptor]

'project' @ [41:13] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.AbstractMultiModuleSafeDeleteTest.SafeDeleteAction.runRefactoring[LocalVariableDescriptor]

'ALLOW_LIFTING_IMPL_PARAMETER_TO_HEADER' @ [41:21] ==> internal final var Project.ALLOW_LIFTING_IMPL_PARAMETER_TO_HEADER: Boolean defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.Companion[PropertyImportedFromObject]

'config' @ [41:62] ==> value-parameter config: JsonObject defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.AbstractMultiModuleSafeDeleteTest.SafeDeleteAction.runRefactoring[ValueParameterDescriptorImpl]

'get' @ [41:69] ==> public open operator fun get(p0: (String..String?)): (JsonElement..JsonElement?) defined in com.google.gson.JsonObject[JavaMethodDescriptor]

'asBoolean' @ [41:99] ==> public final val JsonElement.asBoolean: Boolean[MyPropertyDescriptor]

'invoke' @ [42:31] ==> public open fun invoke(p0: (Project..Project?), p1: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>?), @Nullable p2: Module?, p3: Boolean, @Nullable p4: Runnable?): Unit defined in com.intellij.refactoring.safeDelete.SafeDeleteHandler[JavaMethodDescriptor]

'project' @ [42:38] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.AbstractMultiModuleSafeDeleteTest.SafeDeleteAction.runRefactoring[LocalVariableDescriptor]

'arrayOf' @ [42:47] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: PsiElement): Array<PsiElement> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> PsiElement

'element' @ [42:55] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.AbstractMultiModuleSafeDeleteTest.SafeDeleteAction.runRefactoring[LocalVariableDescriptor]

'getTestDataPathBase' @ [48:65] ==> @NotNull public open fun getTestDataPathBase(): String defined in org.jetbrains.kotlin.idea.test.PluginTestCaseBase[JavaMethodDescriptor]

'loadTestConfiguration' @ [51:22] ==> public fun loadTestConfiguration(testFile: File): JsonObject defined in org.jetbrains.kotlin.idea.refactoring.rename in file AbstractRenameTest.kt[SimpleFunctionDescriptorImpl]

'File' @ [51:44] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'path' @ [51:49] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.AbstractMultiModuleSafeDeleteTest.doTest[ValueParameterDescriptorImpl]

'isMultiModule' @ [53:9] ==> protected final var isMultiModule: Boolean defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.AbstractMultiModuleSafeDeleteTest[PropertyDescriptorImpl]

'doTestCommittingDocuments' @ [55:9] ==> protected final fun doTestCommittingDocuments(action: (VirtualFile, VirtualFile?) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.AbstractMultiModuleSafeDeleteTest[SimpleFunctionDescriptorImpl]

'runRefactoringTest' @ [56:13] ==> public fun runRefactoringTest(path: String, config: JsonObject, rootDir: VirtualFile, project: Project, action: AbstractMultifileRefactoringTest.RefactoringAction): Unit defined in org.jetbrains.kotlin.idea.refactoring in file AbstractMultifileRefactoringTest.kt[SimpleFunctionDescriptorImpl]

'path' @ [56:32] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.AbstractMultiModuleSafeDeleteTest.doTest[ValueParameterDescriptorImpl]

'config' @ [56:38] ==> val config: JsonObject defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.AbstractMultiModuleSafeDeleteTest.doTest[LocalVariableDescriptor]

'rootDir' @ [56:46] ==> value-parameter rootDir: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.AbstractMultiModuleSafeDeleteTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'project' @ [56:55] ==> public final val AbstractMultiModuleSafeDeleteTest.project: (Project..Project?)[MyPropertyDescriptor]

'SafeDeleteAction' @ [56:64] ==> public object SafeDeleteAction : AbstractMultifileRefactoringTest.RefactoringAction defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.AbstractMultiModuleSafeDeleteTest[FakeCallableDescriptorForObject]

