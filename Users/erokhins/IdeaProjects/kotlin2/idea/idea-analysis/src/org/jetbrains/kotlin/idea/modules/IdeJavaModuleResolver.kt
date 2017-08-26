'getInstance' @ [30:41] ==> @NotNull public open fun getInstance(@NotNull p0: Project): PsiManager defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'project' @ [30:53] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.modules.IdeJavaModuleResolver.<init>[ValueParameterDescriptorImpl]

'psiManager' @ [33:16] ==> private final val psiManager: PsiManager defined in org.jetbrains.kotlin.idea.modules.IdeJavaModuleResolver[PropertyDescriptorImpl]

'findFile' @ [33:27] ==> @Nullable public abstract fun findFile(@NotNull p0: VirtualFile): PsiFile? defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'file' @ [33:36] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.modules.IdeJavaModuleResolver.findJavaModule[ValueParameterDescriptorImpl]

'let' @ [33:43] ==> @InlineOnly public inline fun <T, R> PsiFile.let(block: (PsiFile) -> PsiJavaModule?): PsiJavaModule? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiFile
    <R> -> PsiJavaModule?

'JavaModuleGraphUtil' @ [33:47] ==> private constructor JavaModuleGraphUtil() defined in com.intellij.codeInsight.daemon.impl.analysis.JavaModuleGraphUtil[JavaClassConstructorDescriptor]

'findDescriptorByElement' @ [33:68] ==> @Nullable public open fun findDescriptorByElement(@Nullable p0: PsiElement?): PsiJavaModule? defined in com.intellij.codeInsight.daemon.impl.analysis.JavaModuleGraphUtil[JavaMethodDescriptor]

'fileFromOurModule' @ [39:25] ==> value-parameter fileFromOurModule: VirtualFile? defined in org.jetbrains.kotlin.idea.modules.IdeJavaModuleResolver.checkAccessibility[ValueParameterDescriptorImpl]

'let' @ [39:44] ==> @InlineOnly public inline fun <T, R> VirtualFile.let(block: (VirtualFile) -> PsiJavaModule?): PsiJavaModule? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile
    <R> -> PsiJavaModule?

'this' @ [39:48] ==> <this> defined in org.jetbrains.kotlin.idea.modules.IdeJavaModuleResolver[LazyClassReceiverParameterDescriptor]

'findJavaModule' @ [39:54] ==> private final fun findJavaModule(file: VirtualFile): PsiJavaModule? defined in org.jetbrains.kotlin.idea.modules.IdeJavaModuleResolver[SimpleFunctionDescriptorImpl]

'this' @ [40:27] ==> <this> defined in org.jetbrains.kotlin.idea.modules.IdeJavaModuleResolver[LazyClassReceiverParameterDescriptor]

'findJavaModule' @ [40:32] ==> private final fun findJavaModule(file: VirtualFile): PsiJavaModule? defined in org.jetbrains.kotlin.idea.modules.IdeJavaModuleResolver[SimpleFunctionDescriptorImpl]

'referencedFile' @ [40:47] ==> value-parameter referencedFile: VirtualFile defined in org.jetbrains.kotlin.idea.modules.IdeJavaModuleResolver.checkAccessibility[ValueParameterDescriptorImpl]

'ourModule' @ [43:13] ==> val ourModule: PsiJavaModule? defined in org.jetbrains.kotlin.idea.modules.IdeJavaModuleResolver.checkAccessibility[LocalVariableDescriptor]

'theirModule' @ [43:34] ==> val theirModule: PsiJavaModule? defined in org.jetbrains.kotlin.idea.modules.IdeJavaModuleResolver.checkAccessibility[LocalVariableDescriptor]

'theirModule' @ [45:13] ==> val theirModule: PsiJavaModule? defined in org.jetbrains.kotlin.idea.modules.IdeJavaModuleResolver.checkAccessibility[LocalVariableDescriptor]

'ourModule' @ [52:13] ==> val ourModule: PsiJavaModule? defined in org.jetbrains.kotlin.idea.modules.IdeJavaModuleResolver.checkAccessibility[LocalVariableDescriptor]

'name' @ [52:24] ==> public final var PsiJavaModule.name: String[MyPropertyDescriptor]

'theirModule' @ [52:32] ==> val theirModule: PsiJavaModule? defined in org.jetbrains.kotlin.idea.modules.IdeJavaModuleResolver.checkAccessibility[LocalVariableDescriptor]

'name' @ [52:44] ==> public final var PsiJavaModule.name: String[MyPropertyDescriptor]

'ourModule' @ [54:13] ==> val ourModule: PsiJavaModule? defined in org.jetbrains.kotlin.idea.modules.IdeJavaModuleResolver.checkAccessibility[LocalVariableDescriptor]

'!' @ [54:34] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'reads' @ [54:55] ==> public open fun reads(@NotNull p0: PsiJavaModule, @NotNull p1: PsiJavaModule): Boolean defined in com.intellij.codeInsight.daemon.impl.analysis.JavaModuleGraphUtil[JavaMethodDescriptor]

'ourModule' @ [54:61] ==> val ourModule: PsiJavaModule? defined in org.jetbrains.kotlin.idea.modules.IdeJavaModuleResolver.checkAccessibility[LocalVariableDescriptor]

'theirModule' @ [54:72] ==> val theirModule: PsiJavaModule? defined in org.jetbrains.kotlin.idea.modules.IdeJavaModuleResolver.checkAccessibility[LocalVariableDescriptor]

'JavaModuleResolver' @ [55:20] ==> public companion object SERVICE defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleResolver[FakeCallableDescriptorForObject]

'ModuleDoesNotReadModule' @ [55:51] ==> public constructor ModuleDoesNotReadModule(dependencyModuleName: String) defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleResolver.AccessError.ModuleDoesNotReadModule[DeserializedClassConstructorDescriptor]

'theirModule' @ [55:75] ==> val theirModule: PsiJavaModule? defined in org.jetbrains.kotlin.idea.modules.IdeJavaModuleResolver.checkAccessibility[LocalVariableDescriptor]

'name' @ [55:87] ==> public final var PsiJavaModule.name: String[MyPropertyDescriptor]

'referencedPackage' @ [58:22] ==> value-parameter referencedPackage: FqName? defined in org.jetbrains.kotlin.idea.modules.IdeJavaModuleResolver.checkAccessibility[ValueParameterDescriptorImpl]

'asString' @ [58:41] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'!' @ [59:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'exports' @ [59:14] ==> private final fun exports(source: PsiJavaModule, packageName: String, target: PsiJavaModule?): Boolean defined in org.jetbrains.kotlin.idea.modules.IdeJavaModuleResolver[SimpleFunctionDescriptorImpl]

'theirModule' @ [59:22] ==> val theirModule: PsiJavaModule? defined in org.jetbrains.kotlin.idea.modules.IdeJavaModuleResolver.checkAccessibility[LocalVariableDescriptor]

'fqName' @ [59:35] ==> val fqName: String defined in org.jetbrains.kotlin.idea.modules.IdeJavaModuleResolver.checkAccessibility[LocalVariableDescriptor]

'ourModule' @ [59:43] ==> val ourModule: PsiJavaModule? defined in org.jetbrains.kotlin.idea.modules.IdeJavaModuleResolver.checkAccessibility[LocalVariableDescriptor]

'JavaModuleResolver' @ [60:20] ==> public companion object SERVICE defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleResolver[FakeCallableDescriptorForObject]

'ModuleDoesNotExportPackage' @ [60:51] ==> public constructor ModuleDoesNotExportPackage(dependencyModuleName: String) defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleResolver.AccessError.ModuleDoesNotExportPackage[DeserializedClassConstructorDescriptor]

'theirModule' @ [60:78] ==> val theirModule: PsiJavaModule? defined in org.jetbrains.kotlin.idea.modules.IdeJavaModuleResolver.checkAccessibility[LocalVariableDescriptor]

'name' @ [60:90] ==> public final var PsiJavaModule.name: String[MyPropertyDescriptor]

'source' @ [68:13] ==> value-parameter source: PsiJavaModule defined in org.jetbrains.kotlin.idea.modules.IdeJavaModuleResolver.exports[ValueParameterDescriptorImpl]

'target' @ [73:13] ==> value-parameter target: PsiJavaModule? defined in org.jetbrains.kotlin.idea.modules.IdeJavaModuleResolver.exports[ValueParameterDescriptorImpl]

'exports' @ [74:40] ==> public open fun exports(@NotNull p0: PsiJavaModule, @NotNull p1: String, @NotNull p2: PsiJavaModule): Boolean defined in com.intellij.codeInsight.daemon.impl.analysis.JavaModuleGraphUtil[JavaMethodDescriptor]

'source' @ [74:48] ==> value-parameter source: PsiJavaModule defined in org.jetbrains.kotlin.idea.modules.IdeJavaModuleResolver.exports[ValueParameterDescriptorImpl]

'packageName' @ [74:56] ==> value-parameter packageName: String defined in org.jetbrains.kotlin.idea.modules.IdeJavaModuleResolver.exports[ValueParameterDescriptorImpl]

'target' @ [74:69] ==> value-parameter target: PsiJavaModule? defined in org.jetbrains.kotlin.idea.modules.IdeJavaModuleResolver.exports[ValueParameterDescriptorImpl]

'source' @ [76:16] ==> value-parameter source: PsiJavaModule defined in org.jetbrains.kotlin.idea.modules.IdeJavaModuleResolver.exports[ValueParameterDescriptorImpl]

'exports' @ [76:23] ==> public final val PsiJavaModule.exports: (MutableIterable<(PsiPackageAccessibilityStatement..PsiPackageAccessibilityStatement?)>..Iterable<(PsiPackageAccessibilityStatement..PsiPackageAccessibilityStatement?)>)[MyPropertyDescriptor]

'any' @ [76:31] ==> public inline fun <T> Iterable<(PsiPackageAccessibilityStatement..PsiPackageAccessibilityStatement?)>.any(predicate: ((PsiPackageAccessibilityStatement..PsiPackageAccessibilityStatement?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiPackageAccessibilityStatement..com.intellij.psi.PsiPackageAccessibilityStatement?)

'statement' @ [77:13] ==> value-parameter statement: (PsiPackageAccessibilityStatement..PsiPackageAccessibilityStatement?) defined in org.jetbrains.kotlin.idea.modules.IdeJavaModuleResolver.exports.<anonymous>[ValueParameterDescriptorImpl]

'moduleNames' @ [77:23] ==> public final val PsiPackageAccessibilityStatement.moduleNames: (MutableList<(String..String?)>..List<(String..String?)>)[MyPropertyDescriptor]

'isEmpty' @ [77:35] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'statement' @ [77:48] ==> value-parameter statement: (PsiPackageAccessibilityStatement..PsiPackageAccessibilityStatement?) defined in org.jetbrains.kotlin.idea.modules.IdeJavaModuleResolver.exports.<anonymous>[ValueParameterDescriptorImpl]

'packageName' @ [77:58] ==> public final val PsiPackageAccessibilityStatement.packageName: String?[MyPropertyDescriptor]

'packageName' @ [77:73] ==> value-parameter packageName: String defined in org.jetbrains.kotlin.idea.modules.IdeJavaModuleResolver.exports[ValueParameterDescriptorImpl]

