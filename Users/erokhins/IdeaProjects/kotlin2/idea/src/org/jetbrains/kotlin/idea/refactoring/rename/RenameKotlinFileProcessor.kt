'RenamePsiFileProcessor' @ [32:35] ==> public constructor RenamePsiFileProcessor() defined in com.intellij.refactoring.rename.RenamePsiFileProcessor[JavaClassConstructorDescriptor]

'element' @ [33:59] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFileProcessor.canProcessElement[ValueParameterDescriptorImpl]

'ProjectRootsUtil' @ [33:80] ==> public object ProjectRootsUtil defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'isInProjectSource' @ [33:97] ==> @JvmStatic public final fun isInProjectSource(element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil[DeserializedSimpleFunctionDescriptor]

'element' @ [33:115] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFileProcessor.canProcessElement[ValueParameterDescriptorImpl]

'element' @ [39:23] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFileProcessor.prepareRenaming[ValueParameterDescriptorImpl]

'!=' @ [40:13] ==> public open fun equals(other: Any?): Boolean defined in com.intellij.openapi.fileTypes.FileType[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [40:29] ==> public open fun getInstance(): (FileTypeManager..FileTypeManager?) defined in com.intellij.openapi.fileTypes.FileTypeManager[JavaMethodDescriptor]

'getFileTypeByFileName' @ [40:43] ==> @NotNull public abstract fun getFileTypeByFileName(@NotNull @NonNls p0: String): FileType defined in com.intellij.openapi.fileTypes.FileTypeManager[JavaMethodDescriptor]

'newName' @ [40:65] ==> value-parameter newName: String defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFileProcessor.prepareRenaming[ValueParameterDescriptorImpl]

'INSTANCE' @ [40:92] ==> public final val INSTANCE: (KotlinFileType..KotlinFileType?) defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

'?:' @ [44:22] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Module?, right: Module): Module[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Module

'findModuleForPsiElement' @ [44:37] ==> @Nullable public open fun findModuleForPsiElement(@NotNull p0: PsiElement): Module? defined in com.intellij.openapi.module.ModuleUtilCore[JavaMethodDescriptor]

'element' @ [44:61] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFileProcessor.prepareRenaming[ValueParameterDescriptorImpl]

'JvmFileClassUtil' @ [46:24] ==> public object JvmFileClassUtil defined in org.jetbrains.kotlin.fileClasses[FakeCallableDescriptorForObject]

'getFileClassInfoNoResolve' @ [46:41] ==> @JvmStatic public final fun getFileClassInfoNoResolve(file: KtFile): JvmFileClassInfo defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil[DeserializedSimpleFunctionDescriptor]

'jetFile' @ [46:67] ==> val jetFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFileProcessor.prepareRenaming[LocalVariableDescriptor]

'!' @ [47:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'fileInfo' @ [47:14] ==> val fileInfo: JvmFileClassInfo defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFileProcessor.prepareRenaming[LocalVariableDescriptor]

'withJvmName' @ [47:23] ==> public abstract val withJvmName: Boolean defined in org.jetbrains.kotlin.fileClasses.JvmFileClassInfo[DeserializedPropertyDescriptor]

'fileInfo' @ [48:32] ==> val fileInfo: JvmFileClassInfo defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFileProcessor.prepareRenaming[LocalVariableDescriptor]

'facadeClassFqName' @ [48:41] ==> public abstract val facadeClassFqName: FqName defined in org.jetbrains.kotlin.fileClasses.JvmFileClassInfo[DeserializedPropertyDescriptor]

'jetFile' @ [49:27] ==> val jetFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFileProcessor.prepareRenaming[LocalVariableDescriptor]

'project' @ [49:35] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'getInstance' @ [50:45] ==> public open fun getInstance(p0: (Project..Project?)): (JavaPsiFacade..JavaPsiFacade?) defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'project' @ [50:57] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFileProcessor.prepareRenaming[LocalVariableDescriptor]

'findClass' @ [50:66] ==> @Nullable public abstract fun findClass(@NonNls @NotNull p0: String, @NotNull p1: GlobalSearchScope): PsiClass? defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'facadeFqName' @ [50:76] ==> val facadeFqName: FqName defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFileProcessor.prepareRenaming[LocalVariableDescriptor]

'asString' @ [50:89] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'moduleScope' @ [50:119] ==> @NotNull public open fun moduleScope(@NotNull p0: Module): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'module' @ [50:131] ==> val module: Module defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFileProcessor.prepareRenaming[LocalVariableDescriptor]

'facadeClass' @ [51:17] ==> val facadeClass: PsiClass? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFileProcessor.prepareRenaming[LocalVariableDescriptor]

'allRenames' @ [52:17] ==> value-parameter allRenames: MutableMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFileProcessor.prepareRenaming[ValueParameterDescriptorImpl]

'facadeClass' @ [52:28] ==> val facadeClass: PsiClass? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFileProcessor.prepareRenaming[LocalVariableDescriptor]

'PackagePartClassUtils' @ [52:43] ==> public object PackagePartClassUtils defined in org.jetbrains.kotlin.load.kotlin[FakeCallableDescriptorForObject]

'getFilePartShortName' @ [52:65] ==> @JvmStatic public final fun getFilePartShortName(fileName: String): String defined in org.jetbrains.kotlin.load.kotlin.PackagePartClassUtils[DeserializedSimpleFunctionDescriptor]

'newName' @ [52:86] ==> value-parameter newName: String defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinFileProcessor.prepareRenaming[ValueParameterDescriptorImpl]

