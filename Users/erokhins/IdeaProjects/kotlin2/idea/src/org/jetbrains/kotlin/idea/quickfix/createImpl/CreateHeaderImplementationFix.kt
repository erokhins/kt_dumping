'KotlinQuickFixAction<D>' @ [50:5] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: D) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> D

'declaration' @ [50:29] ==> value-parameter declaration: D defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.<init>[ValueParameterDescriptorImpl]

'text' @ [52:36] ==> public final val <out D : KtNamedDeclaration> CreateHeaderImplementationFix<D>.text: String[MyPropertyDescriptor]
Inferred types:
    <out D : KtNamedDeclaration> -> D

'elementType' @ [56:46] ==> protected abstract val elementType: String defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix[PropertyDescriptorImpl]

'implPlatform' @ [56:88] ==> private final val implPlatform: MultiTargetPlatform.Specific defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix[PropertyDescriptorImpl]

'platform' @ [56:101] ==> public final val platform: String defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform.Specific[DeserializedPropertyDescriptor]

'element' @ [61:23] ==> protected final val element: D? defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix[PropertyDescriptorImpl]

'KtPsiFactory' @ [62:23] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [62:36] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.invoke[ValueParameterDescriptorImpl]

'getOrCreateImplementationFile' @ [64:24] ==> private final fun getOrCreateImplementationFile(project: Project): KtFile? defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix[SimpleFunctionDescriptorImpl]

'project' @ [64:54] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.invoke[ValueParameterDescriptorImpl]

'factory' @ [65:25] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.invoke[LocalVariableDescriptor]

'invoke' @ [65:33] ==> public abstract operator fun KtPsiFactory.invoke(p2: Project, p3: D): D? defined in kotlin.Function3[FunctionInvokeDescriptor]

'project' @ [65:44] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.invoke[ValueParameterDescriptorImpl]

'element' @ [65:53] ==> val element: D defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.invoke[LocalVariableDescriptor]

'runWriteAction' @ [67:9] ==> public fun <T> runWriteAction(action: () -> KtElement): KtElement defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'implFile' @ [68:17] ==> val implFile: KtFile defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.invoke[LocalVariableDescriptor]

'packageDirective' @ [68:26] ==> public final val KtFile.packageDirective: KtPackageDirective?[MyPropertyDescriptor]

'fqName' @ [68:44] ==> public final var KtPackageDirective.fqName: FqName[MyPropertyDescriptor]

'file' @ [68:54] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.invoke[ValueParameterDescriptorImpl]

'packageDirective' @ [68:59] ==> public final val KtFile.packageDirective: KtPackageDirective?[MyPropertyDescriptor]

'fqName' @ [68:77] ==> public final var KtPackageDirective.fqName: FqName[MyPropertyDescriptor]

'implFile' @ [69:17] ==> val implFile: KtFile defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.invoke[LocalVariableDescriptor]

'declarations' @ [69:26] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'isEmpty' @ [69:39] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'file' @ [70:40] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.invoke[ValueParameterDescriptorImpl]

'packageDirective' @ [70:45] ==> public final val KtFile.packageDirective: KtPackageDirective?[MyPropertyDescriptor]

'packageDirective' @ [71:17] ==> val packageDirective: KtPackageDirective? defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.invoke.<anonymous>[LocalVariableDescriptor]

'let' @ [71:35] ==> @InlineOnly public inline fun <T, R> KtPackageDirective.let(block: (KtPackageDirective) -> (PsiElement..PsiElement?)): (PsiElement..PsiElement?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtPackageDirective
    <R> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'implFile' @ [72:47] ==> val implFile: KtFile defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.invoke[LocalVariableDescriptor]

'packageDirective' @ [72:56] ==> public final val KtFile.packageDirective: KtPackageDirective?[MyPropertyDescriptor]

'factory' @ [73:47] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.invoke[LocalVariableDescriptor]

'createPackageDirective' @ [73:55] ==> public final fun createPackageDirective(fqName: FqName): KtPackageDirective defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'it' @ [73:78] ==> value-parameter it: KtPackageDirective defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.invoke.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'fqName' @ [73:81] ==> public final var KtPackageDirective.fqName: FqName[MyPropertyDescriptor]

'if (oldPackageDirective != null) {
                        oldPackageDirective.replace(newPackageDirective)
                    }
                    else {
                        implFile.add(newPackageDirective)
                    }' @ [74:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (PsiElement..PsiElement?), elseBranch: (PsiElement..PsiElement?)): (PsiElement..PsiElement?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'oldPackageDirective' @ [74:25] ==> val oldPackageDirective: KtPackageDirective? defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.invoke.<anonymous>.<anonymous>[LocalVariableDescriptor]

'oldPackageDirective' @ [75:25] ==> val oldPackageDirective: KtPackageDirective? defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.invoke.<anonymous>.<anonymous>[LocalVariableDescriptor]

'replace' @ [75:45] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtPackageDirective[JavaMethodDescriptor]

'newPackageDirective' @ [75:53] ==> val newPackageDirective: KtPackageDirective defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.invoke.<anonymous>.<anonymous>[LocalVariableDescriptor]

'implFile' @ [78:25] ==> val implFile: KtFile defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.invoke[LocalVariableDescriptor]

'add' @ [78:34] ==> public open fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'newPackageDirective' @ [78:38] ==> val newPackageDirective: KtPackageDirective defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.invoke.<anonymous>.<anonymous>[LocalVariableDescriptor]

'implFile' @ [82:35] ==> val implFile: KtFile defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.invoke[LocalVariableDescriptor]

'add' @ [82:44] ==> public open fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'generated' @ [82:48] ==> val generated: D defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.invoke[LocalVariableDescriptor]

'getInstance' @ [83:48] ==> public open fun getInstance(@NotNull p0: Project): (CodeStyleManager..CodeStyleManager?) defined in com.intellij.psi.codeStyle.CodeStyleManager[JavaMethodDescriptor]

'project' @ [83:60] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.invoke[ValueParameterDescriptorImpl]

'reformat' @ [83:69] ==> @NotNull public abstract fun reformat(@NotNull p0: PsiElement): PsiElement defined in com.intellij.psi.codeStyle.CodeStyleManager[JavaMethodDescriptor]

'implDeclaration' @ [83:78] ==> val implDeclaration: KtElement defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.invoke.<anonymous>[LocalVariableDescriptor]

'ShortenReferences' @ [84:13] ==> public companion object defined in org.jetbrains.kotlin.idea.core.ShortenReferences[FakeCallableDescriptorForObject]

'DEFAULT' @ [84:31] ==> @field:JvmField public final val DEFAULT: ShortenReferences defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[DeserializedPropertyDescriptor]

'process' @ [84:39] ==> @JvmOverloads public final fun process(element: KtElement, elementFilter: (PsiElement) -> ShortenReferences.FilterResult = ...): KtElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences[DeserializedSimpleFunctionDescriptor]

'reformatted' @ [84:47] ==> val reformatted: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.invoke.<anonymous>[LocalVariableDescriptor]

'allModules' @ [89:13] ==> public fun Project.allModules(): List<(Module..Module?)> defined in org.jetbrains.kotlin.idea.util.projectStructure[SimpleFunctionDescriptorImpl]

'firstOrNull' @ [89:26] ==> public inline fun <T> Iterable<(Module..Module?)>.firstOrNull(predicate: ((Module..Module?)) -> Boolean): Module? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.module.Module..com.intellij.openapi.module.Module?)

'checkSourceRootsConfigured' @ [90:29] ==> public open fun checkSourceRootsConfigured(p0: (Module..Module?), p1: Boolean): Boolean defined in com.intellij.ide.util.PackageUtil[JavaMethodDescriptor]

'it' @ [90:56] ==> value-parameter it: (Module..Module?) defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.implementationModuleOf.<anonymous>[ValueParameterDescriptorImpl]

'==' @ [91:17] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform[DeserializedSimpleFunctionDescriptor]

'getPlatform' @ [91:40] ==> @NotNull public open fun getPlatform(@NotNull p0: Module): TargetPlatform defined in org.jetbrains.kotlin.idea.project.TargetPlatformDetector[JavaMethodDescriptor]

'it' @ [91:52] ==> value-parameter it: (Module..Module?) defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.implementationModuleOf.<anonymous>[ValueParameterDescriptorImpl]

'multiTargetPlatform' @ [91:56] ==> public abstract val multiTargetPlatform: MultiTargetPlatform defined in org.jetbrains.kotlin.resolve.TargetPlatform[DeserializedPropertyDescriptor]

'implPlatform' @ [91:79] ==> private final val implPlatform: MultiTargetPlatform.Specific defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix[PropertyDescriptorImpl]

'headerModule' @ [92:17] ==> value-parameter headerModule: Module defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.implementationModuleOf[ValueParameterDescriptorImpl]

'getInstance' @ [92:51] ==> public open fun getInstance(@NotNull p0: Module): (ModuleRootManager..ModuleRootManager?) defined in com.intellij.openapi.roots.ModuleRootManager[JavaMethodDescriptor]

'it' @ [92:63] ==> value-parameter it: (Module..Module?) defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.implementationModuleOf.<anonymous>[ValueParameterDescriptorImpl]

'dependencies' @ [92:67] ==> public final val ModuleRootManager.dependencies: (Array<(Module..Module?)>..Array<out (Module..Module?)>)[MyPropertyDescriptor]

'element' @ [98:27] ==> protected final val element: D? defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix[PropertyDescriptorImpl]

'declaration' @ [99:20] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.getOrCreateImplementationFile[LocalVariableDescriptor]

'name' @ [99:32] ==> public final val KtNamedDeclaration.name: String?[MyPropertyDescriptor]

'declaration' @ [101:25] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.getOrCreateImplementationFile[LocalVariableDescriptor]

'containingFile' @ [101:37] ==> public final val KtNamedDeclaration.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'containingDirectory' @ [101:52] ==> public final val PsiFile.containingDirectory: (PsiDirectory..PsiDirectory?)[MyPropertyDescriptor]

'getInstance' @ [102:50] ==> public open fun getInstance(): (JavaDirectoryService..JavaDirectoryService?) defined in com.intellij.psi.JavaDirectoryService[JavaMethodDescriptor]

'getPackage' @ [102:64] ==> @Nullable public abstract fun getPackage(@NotNull p0: PsiDirectory): PsiPackage? defined in com.intellij.psi.JavaDirectoryService[JavaMethodDescriptor]

'headerDir' @ [102:75] ==> val headerDir: (PsiDirectory..PsiDirectory?) defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.getOrCreateImplementationFile[LocalVariableDescriptor]

'?:' @ [104:28] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Module?, right: Module): Module[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Module

'findModuleForPsiElement' @ [104:43] ==> @Nullable public open fun findModuleForPsiElement(@NotNull p0: PsiElement): Module? defined in com.intellij.openapi.module.ModuleUtilCore[JavaMethodDescriptor]

'declaration' @ [104:67] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.getOrCreateImplementationFile[LocalVariableDescriptor]

'project' @ [105:26] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.getOrCreateImplementationFile[ValueParameterDescriptorImpl]

'implementationModuleOf' @ [105:34] ==> private final fun Project.implementationModuleOf(headerModule: Module): Module? defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix[SimpleFunctionDescriptorImpl]

'headerModule' @ [105:57] ==> val headerModule: Module defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.getOrCreateImplementationFile[LocalVariableDescriptor]

'?:' @ [106:29] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiDirectory?, right: PsiDirectory): PsiDirectory[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiDirectory

'findOrCreateDirectoryForPackage' @ [106:41] ==> @Nullable public open fun findOrCreateDirectoryForPackage(@NotNull p0: Module, p1: (String..String?), @Nullable p2: PsiDirectory?, p3: Boolean): PsiDirectory? defined in com.intellij.ide.util.PackageUtil[JavaMethodDescriptor]

'implModule' @ [107:17] ==> val implModule: Module defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.getOrCreateImplementationFile[LocalVariableDescriptor]

'headerPackage' @ [107:29] ==> val headerPackage: PsiPackage? defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.getOrCreateImplementationFile[LocalVariableDescriptor]

'qualifiedName' @ [107:44] ==> public final val PsiPackage.qualifiedName: String[MyPropertyDescriptor]

'runWriteAction' @ [109:16] ==> public fun <T> runWriteAction(action: () -> KtFile): KtFile defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'name' @ [110:30] ==> val name: String defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.getOrCreateImplementationFile[LocalVariableDescriptor]

'implDirectory' @ [111:32] ==> val implDirectory: PsiDirectory defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.getOrCreateImplementationFile[LocalVariableDescriptor]

'findFile' @ [111:46] ==> @Nullable public abstract fun findFile(@NotNull @NonNls p0: String): PsiFile? defined in com.intellij.psi.PsiDirectory[JavaMethodDescriptor]

'fileName' @ [111:55] ==> val fileName: String defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.getOrCreateImplementationFile.<anonymous>[LocalVariableDescriptor]

'declaration' @ [112:36] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.getOrCreateImplementationFile[LocalVariableDescriptor]

'containingKtFile' @ [112:48] ==> public final val KtNamedDeclaration.containingKtFile: KtFile[MyPropertyDescriptor]

'packageDirective' @ [112:65] ==> public final val KtFile.packageDirective: KtPackageDirective?[MyPropertyDescriptor]

'if (packageDirective?.packageNameExpression == null) implDirectory.getPackage()?.qualifiedName
                    else packageDirective.fqName.asString()' @ [114:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'packageDirective' @ [114:25] ==> val packageDirective: KtPackageDirective? defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.getOrCreateImplementationFile.<anonymous>[LocalVariableDescriptor]

'packageNameExpression' @ [114:43] ==> public final val KtPackageDirective.packageNameExpression: KtExpression?[MyPropertyDescriptor]

'implDirectory' @ [114:74] ==> val implDirectory: PsiDirectory defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.getOrCreateImplementationFile[LocalVariableDescriptor]

'getPackage' @ [114:88] ==> public fun PsiDirectory.getPackage(): PsiPackage? defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'qualifiedName' @ [114:102] ==> public final val PsiPackage.qualifiedName: String[MyPropertyDescriptor]

'packageDirective' @ [115:26] ==> val packageDirective: KtPackageDirective? defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.getOrCreateImplementationFile.<anonymous>[LocalVariableDescriptor]

'fqName' @ [115:43] ==> public final var KtPackageDirective.fqName: FqName[MyPropertyDescriptor]

'asString' @ [115:50] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'if (existingFile is KtFile) {
                val existingPackageDirective = existingFile.packageDirective
                if (existingFile.declarations.isNotEmpty() &&
                    existingPackageDirective?.fqName != packageDirective?.fqName) {
                    val newName = KotlinNameSuggester.suggestNameByName(name) {
                        implDirectory.findFile("$it.kt") == null
                    } + ".kt"
                    createKotlinFile(newName, implDirectory, packageName)
                }
                else {
                    existingFile
                }
            }
            else {
                createKotlinFile(fileName, implDirectory, packageName)
            }' @ [116:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtFile, elseBranch: KtFile): KtFile[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtFile

'existingFile' @ [116:17] ==> val existingFile: PsiFile? defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.getOrCreateImplementationFile.<anonymous>[LocalVariableDescriptor]

'existingFile' @ [117:48] ==> val existingFile: PsiFile? defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.getOrCreateImplementationFile.<anonymous>[LocalVariableDescriptor]

'packageDirective' @ [117:61] ==> public final val KtFile.packageDirective: KtPackageDirective?[MyPropertyDescriptor]

'if (existingFile.declarations.isNotEmpty() &&
                    existingPackageDirective?.fqName != packageDirective?.fqName) {
                    val newName = KotlinNameSuggester.suggestNameByName(name) {
                        implDirectory.findFile("$it.kt") == null
                    } + ".kt"
                    createKotlinFile(newName, implDirectory, packageName)
                }
                else {
                    existingFile
                }' @ [118:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtFile, elseBranch: KtFile): KtFile[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtFile

'existingFile' @ [118:21] ==> val existingFile: PsiFile? defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.getOrCreateImplementationFile.<anonymous>[LocalVariableDescriptor]

'declarations' @ [118:34] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'isNotEmpty' @ [118:47] ==> @InlineOnly public inline fun <T> Collection<(KtDeclaration..KtDeclaration?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)

'existingPackageDirective' @ [119:21] ==> val existingPackageDirective: KtPackageDirective? defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.getOrCreateImplementationFile.<anonymous>[LocalVariableDescriptor]

'fqName' @ [119:47] ==> public final var KtPackageDirective.fqName: FqName[MyPropertyDescriptor]

'packageDirective' @ [119:57] ==> val packageDirective: KtPackageDirective? defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.getOrCreateImplementationFile.<anonymous>[LocalVariableDescriptor]

'fqName' @ [119:75] ==> public final var KtPackageDirective.fqName: FqName[MyPropertyDescriptor]

'KotlinNameSuggester' @ [120:35] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'suggestNameByName' @ [120:55] ==> public final fun suggestNameByName(name: String, validator: (String) -> Boolean): String defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'name' @ [120:73] ==> val name: String defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.getOrCreateImplementationFile[LocalVariableDescriptor]

'implDirectory' @ [121:25] ==> val implDirectory: PsiDirectory defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.getOrCreateImplementationFile[LocalVariableDescriptor]

'findFile' @ [121:39] ==> @Nullable public abstract fun findFile(@NotNull @NonNls p0: String): PsiFile? defined in com.intellij.psi.PsiDirectory[JavaMethodDescriptor]

'it' @ [121:50] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.getOrCreateImplementationFile.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'createKotlinFile' @ [123:21] ==> public fun createKotlinFile(fileName: String, targetDir: PsiDirectory, packageName: String? = ...): KtFile defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'newName' @ [123:38] ==> val newName: String defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.getOrCreateImplementationFile.<anonymous>[LocalVariableDescriptor]

'implDirectory' @ [123:47] ==> val implDirectory: PsiDirectory defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.getOrCreateImplementationFile[LocalVariableDescriptor]

'packageName' @ [123:62] ==> val packageName: String? defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.getOrCreateImplementationFile.<anonymous>[LocalVariableDescriptor]

'existingFile' @ [126:21] ==> val existingFile: PsiFile? defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.getOrCreateImplementationFile.<anonymous>[LocalVariableDescriptor]

'createKotlinFile' @ [130:17] ==> public fun createKotlinFile(fileName: String, targetDir: PsiDirectory, packageName: String? = ...): KtFile defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'fileName' @ [130:34] ==> val fileName: String defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.getOrCreateImplementationFile.<anonymous>[LocalVariableDescriptor]

'implDirectory' @ [130:44] ==> val implDirectory: PsiDirectory defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.getOrCreateImplementationFile[LocalVariableDescriptor]

'packageName' @ [130:59] ==> val packageName: String? defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.getOrCreateImplementationFile.<anonymous>[LocalVariableDescriptor]

'KotlinSingleIntentionActionFactory' @ [135:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'cast' @ [137:39] ==> @NotNull public open fun <D : (Diagnostic..Diagnostic?)> cast(@NotNull p0: Diagnostic, @NotNull vararg p1: (DiagnosticFactory<out (DiagnosticWithParameters3<(KtDeclaration..KtDeclaration?), (MemberDescriptor..MemberDescriptor?), (ModuleDescriptor..ModuleDescriptor?), (MutableMap<(HeaderImplDeclarationChecker.Compatibility.Incompatible..HeaderImplDeclarationChecker.Compatibility.Incompatible?), (MutableCollection<(MemberDescriptor..MemberDescriptor?)>..Collection<(MemberDescriptor..MemberDescriptor?)>?)>..Map<(HeaderImplDeclarationChecker.Compatibility.Incompatible..HeaderImplDeclarationChecker.Compatibility.Incompatible?), (MutableCollection<(MemberDescriptor..MemberDescriptor?)>..Collection<(MemberDescriptor..MemberDescriptor?)>?)>?)>..DiagnosticWithParameters3<(KtDeclaration..KtDeclaration?), (MemberDescriptor..MemberDescriptor?), (ModuleDescriptor..ModuleDescriptor?), (MutableMap<(HeaderImplDeclarationChecker.Compatibility.Incompatible..HeaderImplDeclarationChecker.Compatibility.Incompatible?), (MutableCollection<(MemberDescriptor..MemberDescriptor?)>..Collection<(MemberDescriptor..MemberDescriptor?)>?)>..Map<(HeaderImplDeclarationChecker.Compatibility.Incompatible..HeaderImplDeclarationChecker.Compatibility.Incompatible?), (MutableCollection<(MemberDescriptor..MemberDescriptor?)>..Collection<(MemberDescriptor..MemberDescriptor?)>?)>?)>?)>..DiagnosticFactory<out (DiagnosticWithParameters3<(KtDeclaration..KtDeclaration?), (MemberDescriptor..MemberDescriptor?), (ModuleDescriptor..ModuleDescriptor?), (MutableMap<(HeaderImplDeclarationChecker.Compatibility.Incompatible..HeaderImplDeclarationChecker.Compatibility.Incompatible?), (MutableCollection<(MemberDescriptor..MemberDescriptor?)>..Collection<(MemberDescriptor..MemberDescriptor?)>?)>..Map<(HeaderImplDeclarationChecker.Compatibility.Incompatible..HeaderImplDeclarationChecker.Compatibility.Incompatible?), (MutableCollection<(MemberDescriptor..MemberDescriptor?)>..Collection<(MemberDescriptor..MemberDescriptor?)>?)>?)>..DiagnosticWithParameters3<(KtDeclaration..KtDeclaration?), (MemberDescriptor..MemberDescriptor?), (ModuleDescriptor..ModuleDescriptor?), (MutableMap<(HeaderImplDeclarationChecker.Compatibility.Incompatible..HeaderImplDeclarationChecker.Compatibility.Incompatible?), (MutableCollection<(MemberDescriptor..MemberDescriptor?)>..Collection<(MemberDescriptor..MemberDescriptor?)>?)>..Map<(HeaderImplDeclarationChecker.Compatibility.Incompatible..HeaderImplDeclarationChecker.Compatibility.Incompatible?), (MutableCollection<(MemberDescriptor..MemberDescriptor?)>..Collection<(MemberDescriptor..MemberDescriptor?)>?)>?)>?)>?)): DiagnosticWithParameters3<(KtDeclaration..KtDeclaration?), (MemberDescriptor..MemberDescriptor?), (ModuleDescriptor..ModuleDescriptor?), (MutableMap<(HeaderImplDeclarationChecker.Compatibility.Incompatible..HeaderImplDeclarationChecker.Compatibility.Incompatible?), (MutableCollection<(MemberDescriptor..MemberDescriptor?)>..Collection<(MemberDescriptor..MemberDescriptor?)>?)>..Map<(HeaderImplDeclarationChecker.Compatibility.Incompatible..HeaderImplDeclarationChecker.Compatibility.Incompatible?), (MutableCollection<(MemberDescriptor..MemberDescriptor?)>..Collection<(MemberDescriptor..MemberDescriptor?)>?)>?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory[JavaMethodDescriptor]
Inferred types:
    <D : (Diagnostic..Diagnostic?)> -> DiagnosticWithParameters3<(org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?), (org.jetbrains.kotlin.descriptors.MemberDescriptor..org.jetbrains.kotlin.descriptors.MemberDescriptor?), (org.jetbrains.kotlin.descriptors.ModuleDescriptor..org.jetbrains.kotlin.descriptors.ModuleDescriptor?), (kotlin.collections.MutableMap<(org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible..org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible?), (kotlin.collections.MutableCollection<(org.jetbrains.kotlin.descriptors.MemberDescriptor..org.jetbrains.kotlin.descriptors.MemberDescriptor?)>..kotlin.collections.Collection<(org.jetbrains.kotlin.descriptors.MemberDescriptor..org.jetbrains.kotlin.descriptors.MemberDescriptor?)>?)>..kotlin.collections.Map<(org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible..org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible?), (kotlin.collections.MutableCollection<(org.jetbrains.kotlin.descriptors.MemberDescriptor..org.jetbrains.kotlin.descriptors.MemberDescriptor?)>..kotlin.collections.Collection<(org.jetbrains.kotlin.descriptors.MemberDescriptor..org.jetbrains.kotlin.descriptors.MemberDescriptor?)>?)>?)>

'diagnostic' @ [137:44] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.Companion.createAction[ValueParameterDescriptorImpl]

'HEADER_WITHOUT_IMPLEMENTATION' @ [137:63] ==> public final val HEADER_WITHOUT_IMPLEMENTATION: (DiagnosticFactory3<(KtDeclaration..KtDeclaration?), (MemberDescriptor..MemberDescriptor?), (ModuleDescriptor..ModuleDescriptor?), (MutableMap<(HeaderImplDeclarationChecker.Compatibility.Incompatible..HeaderImplDeclarationChecker.Compatibility.Incompatible?), (MutableCollection<(MemberDescriptor..MemberDescriptor?)>..Collection<(MemberDescriptor..MemberDescriptor?)>?)>..Map<(HeaderImplDeclarationChecker.Compatibility.Incompatible..HeaderImplDeclarationChecker.Compatibility.Incompatible?), (MutableCollection<(MemberDescriptor..MemberDescriptor?)>..Collection<(MemberDescriptor..MemberDescriptor?)>?)>?)>..DiagnosticFactory3<(KtDeclaration..KtDeclaration?), (MemberDescriptor..MemberDescriptor?), (ModuleDescriptor..ModuleDescriptor?), (MutableMap<(HeaderImplDeclarationChecker.Compatibility.Incompatible..HeaderImplDeclarationChecker.Compatibility.Incompatible?), (MutableCollection<(MemberDescriptor..MemberDescriptor?)>..Collection<(MemberDescriptor..MemberDescriptor?)>?)>..Map<(HeaderImplDeclarationChecker.Compatibility.Incompatible..HeaderImplDeclarationChecker.Compatibility.Incompatible?), (MutableCollection<(MemberDescriptor..MemberDescriptor?)>..Collection<(MemberDescriptor..MemberDescriptor?)>?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'd' @ [138:31] ==> val d: DiagnosticWithParameters3<(KtDeclaration..KtDeclaration?), (MemberDescriptor..MemberDescriptor?), (ModuleDescriptor..ModuleDescriptor?), (MutableMap<(HeaderImplDeclarationChecker.Compatibility.Incompatible..HeaderImplDeclarationChecker.Compatibility.Incompatible?), (MutableCollection<(MemberDescriptor..MemberDescriptor?)>..Collection<(MemberDescriptor..MemberDescriptor?)>?)>..Map<(HeaderImplDeclarationChecker.Compatibility.Incompatible..HeaderImplDeclarationChecker.Compatibility.Incompatible?), (MutableCollection<(MemberDescriptor..MemberDescriptor?)>..Collection<(MemberDescriptor..MemberDescriptor?)>?)>?)> defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.Companion.createAction[LocalVariableDescriptor]

'psiElement' @ [138:33] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?), C : (Any..Any?)> DiagnosticWithParameters3<(KtDeclaration..KtDeclaration?), (MemberDescriptor..MemberDescriptor?), (ModuleDescriptor..ModuleDescriptor?), (MutableMap<(HeaderImplDeclarationChecker.Compatibility.Incompatible..HeaderImplDeclarationChecker.Compatibility.Incompatible?), (MutableCollection<(MemberDescriptor..MemberDescriptor?)>..Collection<(MemberDescriptor..MemberDescriptor?)>?)>..Map<(HeaderImplDeclarationChecker.Compatibility.Incompatible..HeaderImplDeclarationChecker.Compatibility.Incompatible?), (MutableCollection<(MemberDescriptor..MemberDescriptor?)>..Collection<(MemberDescriptor..MemberDescriptor?)>?)>?)>.psiElement: (KtDeclaration..KtDeclaration?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)
    <A : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.MemberDescriptor..org.jetbrains.kotlin.descriptors.MemberDescriptor?)
    <B : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.ModuleDescriptor..org.jetbrains.kotlin.descriptors.ModuleDescriptor?)
    <C : (Any..Any?)> -> (kotlin.collections.MutableMap<(org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible..org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible?), (kotlin.collections.MutableCollection<(org.jetbrains.kotlin.descriptors.MemberDescriptor..org.jetbrains.kotlin.descriptors.MemberDescriptor?)>..kotlin.collections.Collection<(org.jetbrains.kotlin.descriptors.MemberDescriptor..org.jetbrains.kotlin.descriptors.MemberDescriptor?)>?)>..kotlin.collections.Map<(org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible..org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible?), (kotlin.collections.MutableCollection<(org.jetbrains.kotlin.descriptors.MemberDescriptor..org.jetbrains.kotlin.descriptors.MemberDescriptor?)>..kotlin.collections.Collection<(org.jetbrains.kotlin.descriptors.MemberDescriptor..org.jetbrains.kotlin.descriptors.MemberDescriptor?)>?)>?)

'd' @ [139:33] ==> val d: DiagnosticWithParameters3<(KtDeclaration..KtDeclaration?), (MemberDescriptor..MemberDescriptor?), (ModuleDescriptor..ModuleDescriptor?), (MutableMap<(HeaderImplDeclarationChecker.Compatibility.Incompatible..HeaderImplDeclarationChecker.Compatibility.Incompatible?), (MutableCollection<(MemberDescriptor..MemberDescriptor?)>..Collection<(MemberDescriptor..MemberDescriptor?)>?)>..Map<(HeaderImplDeclarationChecker.Compatibility.Incompatible..HeaderImplDeclarationChecker.Compatibility.Incompatible?), (MutableCollection<(MemberDescriptor..MemberDescriptor?)>..Collection<(MemberDescriptor..MemberDescriptor?)>?)>?)> defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.Companion.createAction[LocalVariableDescriptor]

'c' @ [139:35] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?), C : (Any..Any?)> DiagnosticWithParameters3<(KtDeclaration..KtDeclaration?), (MemberDescriptor..MemberDescriptor?), (ModuleDescriptor..ModuleDescriptor?), (MutableMap<(HeaderImplDeclarationChecker.Compatibility.Incompatible..HeaderImplDeclarationChecker.Compatibility.Incompatible?), (MutableCollection<(MemberDescriptor..MemberDescriptor?)>..Collection<(MemberDescriptor..MemberDescriptor?)>?)>..Map<(HeaderImplDeclarationChecker.Compatibility.Incompatible..HeaderImplDeclarationChecker.Compatibility.Incompatible?), (MutableCollection<(MemberDescriptor..MemberDescriptor?)>..Collection<(MemberDescriptor..MemberDescriptor?)>?)>?)>.c: (MutableMap<(HeaderImplDeclarationChecker.Compatibility.Incompatible..HeaderImplDeclarationChecker.Compatibility.Incompatible?), (MutableCollection<(MemberDescriptor..MemberDescriptor?)>..Collection<(MemberDescriptor..MemberDescriptor?)>?)>..Map<(HeaderImplDeclarationChecker.Compatibility.Incompatible..HeaderImplDeclarationChecker.Compatibility.Incompatible?), (MutableCollection<(MemberDescriptor..MemberDescriptor?)>..Collection<(MemberDescriptor..MemberDescriptor?)>?)>?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)
    <A : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.MemberDescriptor..org.jetbrains.kotlin.descriptors.MemberDescriptor?)
    <B : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.ModuleDescriptor..org.jetbrains.kotlin.descriptors.ModuleDescriptor?)
    <C : (Any..Any?)> -> (kotlin.collections.MutableMap<(org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible..org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible?), (kotlin.collections.MutableCollection<(org.jetbrains.kotlin.descriptors.MemberDescriptor..org.jetbrains.kotlin.descriptors.MemberDescriptor?)>..kotlin.collections.Collection<(org.jetbrains.kotlin.descriptors.MemberDescriptor..org.jetbrains.kotlin.descriptors.MemberDescriptor?)>?)>..kotlin.collections.Map<(org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible..org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible?), (kotlin.collections.MutableCollection<(org.jetbrains.kotlin.descriptors.MemberDescriptor..org.jetbrains.kotlin.descriptors.MemberDescriptor?)>..kotlin.collections.Collection<(org.jetbrains.kotlin.descriptors.MemberDescriptor..org.jetbrains.kotlin.descriptors.MemberDescriptor?)>?)>?)

'compatibility' @ [140:17] ==> val compatibility: (MutableMap<(HeaderImplDeclarationChecker.Compatibility.Incompatible..HeaderImplDeclarationChecker.Compatibility.Incompatible?), (MutableCollection<(MemberDescriptor..MemberDescriptor?)>..Collection<(MemberDescriptor..MemberDescriptor?)>?)>..Map<(HeaderImplDeclarationChecker.Compatibility.Incompatible..HeaderImplDeclarationChecker.Compatibility.Incompatible?), (MutableCollection<(MemberDescriptor..MemberDescriptor?)>..Collection<(MemberDescriptor..MemberDescriptor?)>?)>?) defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.Companion.createAction[LocalVariableDescriptor]

'isNotEmpty' @ [140:31] ==> @InlineOnly public inline fun <K, V> Map<out (HeaderImplDeclarationChecker.Compatibility.Incompatible..HeaderImplDeclarationChecker.Compatibility.Incompatible?), (MutableCollection<(MemberDescriptor..MemberDescriptor?)>..Collection<(MemberDescriptor..MemberDescriptor?)>?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible..org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible?)
    <V> -> (kotlin.collections.MutableCollection<(org.jetbrains.kotlin.descriptors.MemberDescriptor..org.jetbrains.kotlin.descriptors.MemberDescriptor?)>..kotlin.collections.Collection<(org.jetbrains.kotlin.descriptors.MemberDescriptor..org.jetbrains.kotlin.descriptors.MemberDescriptor?)>?)

'd' @ [141:32] ==> val d: DiagnosticWithParameters3<(KtDeclaration..KtDeclaration?), (MemberDescriptor..MemberDescriptor?), (ModuleDescriptor..ModuleDescriptor?), (MutableMap<(HeaderImplDeclarationChecker.Compatibility.Incompatible..HeaderImplDeclarationChecker.Compatibility.Incompatible?), (MutableCollection<(MemberDescriptor..MemberDescriptor?)>..Collection<(MemberDescriptor..MemberDescriptor?)>?)>..Map<(HeaderImplDeclarationChecker.Compatibility.Incompatible..HeaderImplDeclarationChecker.Compatibility.Incompatible?), (MutableCollection<(MemberDescriptor..MemberDescriptor?)>..Collection<(MemberDescriptor..MemberDescriptor?)>?)>?)> defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.Companion.createAction[LocalVariableDescriptor]

'b' @ [141:34] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?), C : (Any..Any?)> DiagnosticWithParameters3<(KtDeclaration..KtDeclaration?), (MemberDescriptor..MemberDescriptor?), (ModuleDescriptor..ModuleDescriptor?), (MutableMap<(HeaderImplDeclarationChecker.Compatibility.Incompatible..HeaderImplDeclarationChecker.Compatibility.Incompatible?), (MutableCollection<(MemberDescriptor..MemberDescriptor?)>..Collection<(MemberDescriptor..MemberDescriptor?)>?)>..Map<(HeaderImplDeclarationChecker.Compatibility.Incompatible..HeaderImplDeclarationChecker.Compatibility.Incompatible?), (MutableCollection<(MemberDescriptor..MemberDescriptor?)>..Collection<(MemberDescriptor..MemberDescriptor?)>?)>?)>.b: (ModuleDescriptor..ModuleDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)
    <A : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.MemberDescriptor..org.jetbrains.kotlin.descriptors.MemberDescriptor?)
    <B : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.ModuleDescriptor..org.jetbrains.kotlin.descriptors.ModuleDescriptor?)
    <C : (Any..Any?)> -> (kotlin.collections.MutableMap<(org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible..org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible?), (kotlin.collections.MutableCollection<(org.jetbrains.kotlin.descriptors.MemberDescriptor..org.jetbrains.kotlin.descriptors.MemberDescriptor?)>..kotlin.collections.Collection<(org.jetbrains.kotlin.descriptors.MemberDescriptor..org.jetbrains.kotlin.descriptors.MemberDescriptor?)>?)>..kotlin.collections.Map<(org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible..org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker.Compatibility.Incompatible?), (kotlin.collections.MutableCollection<(org.jetbrains.kotlin.descriptors.MemberDescriptor..org.jetbrains.kotlin.descriptors.MemberDescriptor?)>..kotlin.collections.Collection<(org.jetbrains.kotlin.descriptors.MemberDescriptor..org.jetbrains.kotlin.descriptors.MemberDescriptor?)>?)>?)

'getMultiTargetPlatform' @ [141:36] ==> public fun ModuleDescriptor.getMultiTargetPlatform(): MultiTargetPlatform? defined in org.jetbrains.kotlin.resolve[DeserializedSimpleFunctionDescriptor]

'when (declaration) {
                is KtClassOrObject -> CreateHeaderClassImplementationFix(declaration, implPlatform)
                is KtFunction -> CreateHeaderFunctionImplementationFix(declaration, implPlatform)
                is KtProperty -> CreateHeaderPropertyImplementationFix(declaration, implPlatform)
                else -> null
            }' @ [142:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IntentionAction?, entry1: IntentionAction?, entry2: IntentionAction?, entry3: IntentionAction?): IntentionAction?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IntentionAction?

'declaration' @ [142:26] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.Companion.createAction[LocalVariableDescriptor]

'CreateHeaderClassImplementationFix' @ [143:39] ==> public constructor CreateHeaderClassImplementationFix(klass: KtClassOrObject, implPlatform: MultiTargetPlatform.Specific) defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderClassImplementationFix[ClassConstructorDescriptorImpl]

'declaration' @ [143:74] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.Companion.createAction[LocalVariableDescriptor]

'implPlatform' @ [143:87] ==> val implPlatform: MultiTargetPlatform.Specific defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.Companion.createAction[LocalVariableDescriptor]

'CreateHeaderFunctionImplementationFix' @ [144:34] ==> public constructor CreateHeaderFunctionImplementationFix(function: KtFunction, implPlatform: MultiTargetPlatform.Specific) defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderFunctionImplementationFix[ClassConstructorDescriptorImpl]

'declaration' @ [144:72] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.Companion.createAction[LocalVariableDescriptor]

'implPlatform' @ [144:85] ==> val implPlatform: MultiTargetPlatform.Specific defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.Companion.createAction[LocalVariableDescriptor]

'CreateHeaderPropertyImplementationFix' @ [145:34] ==> public constructor CreateHeaderPropertyImplementationFix(property: KtProperty, implPlatform: MultiTargetPlatform.Specific) defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderPropertyImplementationFix[ClassConstructorDescriptorImpl]

'declaration' @ [145:72] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.Companion.createAction[LocalVariableDescriptor]

'implPlatform' @ [145:85] ==> val implPlatform: MultiTargetPlatform.Specific defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix.Companion.createAction[LocalVariableDescriptor]

'CreateHeaderImplementationFix<KtClassOrObject>' @ [155:5] ==> private constructor CreateHeaderImplementationFix<out D : KtNamedDeclaration>(declaration: KtClassOrObject, implPlatform: MultiTargetPlatform.Specific, generateIt: KtPsiFactory.(Project, KtClassOrObject) -> KtClassOrObject?) defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix[ClassConstructorDescriptorImpl]
Inferred types:
    <out D : KtNamedDeclaration> -> KtClassOrObject

'klass' @ [155:52] ==> value-parameter klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderClassImplementationFix.<init>[ValueParameterDescriptorImpl]

'implPlatform' @ [155:59] ==> value-parameter implPlatform: MultiTargetPlatform.Specific defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderClassImplementationFix.<init>[ValueParameterDescriptorImpl]

'generateClassOrObject' @ [156:5] ==> private fun KtPsiFactory.generateClassOrObject(project: Project, headerClass: KtClassOrObject, implNeeded: Boolean): KtClassOrObject defined in org.jetbrains.kotlin.idea.quickfix.createImpl in file CreateHeaderImplementationFix.kt[SimpleFunctionDescriptorImpl]

'project' @ [156:27] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderClassImplementationFix.<init>.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [156:36] ==> value-parameter element: KtClassOrObject defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderClassImplementationFix.<init>.<anonymous>[ValueParameterDescriptorImpl]

'if ((element as? KtClass)?.isInterface() ?: false) "interface" else "class"' @ [159:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'?:' @ [159:36] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Boolean?, right: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Boolean

'element' @ [159:37] ==> protected final val element: KtClassOrObject? defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderClassImplementationFix[PropertyDescriptorImpl]

'isInterface' @ [159:59] ==> public final fun isInterface(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'CreateHeaderImplementationFix<KtProperty>' @ [165:5] ==> private constructor CreateHeaderImplementationFix<out D : KtNamedDeclaration>(declaration: KtProperty, implPlatform: MultiTargetPlatform.Specific, generateIt: KtPsiFactory.(Project, KtProperty) -> KtProperty?) defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix[ClassConstructorDescriptorImpl]
Inferred types:
    <out D : KtNamedDeclaration> -> KtProperty

'property' @ [165:47] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderPropertyImplementationFix.<init>[ValueParameterDescriptorImpl]

'implPlatform' @ [165:57] ==> value-parameter implPlatform: MultiTargetPlatform.Specific defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderPropertyImplementationFix.<init>[ValueParameterDescriptorImpl]

'element' @ [166:22] ==> value-parameter element: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderPropertyImplementationFix.<init>.<anonymous>[ValueParameterDescriptorImpl]

'toDescriptor' @ [166:30] ==> public fun KtDeclaration.toDescriptor(): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [167:5] ==> val descriptor: PropertyDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderPropertyImplementationFix.<init>.<anonymous>[LocalVariableDescriptor]

'let' @ [167:17] ==> @InlineOnly public inline fun <T, R> PropertyDescriptor.let(block: (PropertyDescriptor) -> KtProperty): KtProperty defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyDescriptor
    <R> -> KtProperty

'generateProperty' @ [167:23] ==> private fun KtPsiFactory.generateProperty(project: Project, headerProperty: KtProperty, descriptor: PropertyDescriptor, implNeeded: Boolean): KtProperty defined in org.jetbrains.kotlin.idea.quickfix.createImpl in file CreateHeaderImplementationFix.kt[SimpleFunctionDescriptorImpl]

'project' @ [167:40] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderPropertyImplementationFix.<init>.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [167:49] ==> value-parameter element: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderPropertyImplementationFix.<init>.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [167:58] ==> val descriptor: PropertyDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderPropertyImplementationFix.<init>.<anonymous>[LocalVariableDescriptor]

'CreateHeaderImplementationFix<KtFunction>' @ [176:5] ==> private constructor CreateHeaderImplementationFix<out D : KtNamedDeclaration>(declaration: KtFunction, implPlatform: MultiTargetPlatform.Specific, generateIt: KtPsiFactory.(Project, KtFunction) -> KtFunction?) defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderImplementationFix[ClassConstructorDescriptorImpl]
Inferred types:
    <out D : KtNamedDeclaration> -> KtFunction

'function' @ [176:47] ==> value-parameter function: KtFunction defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderFunctionImplementationFix.<init>[ValueParameterDescriptorImpl]

'implPlatform' @ [176:57] ==> value-parameter implPlatform: MultiTargetPlatform.Specific defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderFunctionImplementationFix.<init>[ValueParameterDescriptorImpl]

'element' @ [177:22] ==> value-parameter element: KtFunction defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderFunctionImplementationFix.<init>.<anonymous>[ValueParameterDescriptorImpl]

'toDescriptor' @ [177:30] ==> public fun KtDeclaration.toDescriptor(): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [178:5] ==> val descriptor: FunctionDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderFunctionImplementationFix.<init>.<anonymous>[LocalVariableDescriptor]

'let' @ [178:17] ==> @InlineOnly public inline fun <T, R> FunctionDescriptor.let(block: (FunctionDescriptor) -> KtFunction): KtFunction defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor
    <R> -> KtFunction

'generateFunction' @ [178:23] ==> private fun KtPsiFactory.generateFunction(project: Project, headerFunction: KtFunction, descriptor: FunctionDescriptor, implNeeded: Boolean): KtFunction defined in org.jetbrains.kotlin.idea.quickfix.createImpl in file CreateHeaderImplementationFix.kt[SimpleFunctionDescriptorImpl]

'project' @ [178:40] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderFunctionImplementationFix.<init>.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [178:49] ==> value-parameter element: KtFunction defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderFunctionImplementationFix.<init>.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [178:58] ==> val descriptor: FunctionDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.createImpl.CreateHeaderFunctionImplementationFix.<init>.<anonymous>[LocalVariableDescriptor]

'if (implNeeded) {
        addModifier(KtTokens.IMPL_KEYWORD)
    }
    else {
        removeModifier(KtTokens.HEADER_KEYWORD)
    }' @ [185:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'implNeeded' @ [185:9] ==> value-parameter implNeeded: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createImpl.replaceHeaderModifier[ValueParameterDescriptorImpl]

'addModifier' @ [186:9] ==> public abstract fun addModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtModifierListOwner[JavaMethodDescriptor]

'IMPL_KEYWORD' @ [186:30] ==> public final val IMPL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'removeModifier' @ [189:9] ==> public abstract fun removeModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtModifierListOwner[JavaMethodDescriptor]

'HEADER_KEYWORD' @ [189:33] ==> public final val HEADER_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'headerClass' @ [198:18] ==> value-parameter headerClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateClassOrObject[ValueParameterDescriptorImpl]

'text' @ [198:30] ==> public final val KtClassOrObject.text: (String..String?)[MyPropertyDescriptor]

'if (headerClass is KtObjectDeclaration) createObject(header) else createClass(header)' @ [199:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtClassOrObject, elseBranch: KtClassOrObject): KtClassOrObject[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtClassOrObject

'headerClass' @ [199:25] ==> value-parameter headerClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateClassOrObject[ValueParameterDescriptorImpl]

'createObject' @ [199:61] ==> public final fun createObject(text: String): KtObjectDeclaration defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'header' @ [199:74] ==> val header: (String..String?) defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateClassOrObject[LocalVariableDescriptor]

'createClass' @ [199:87] ==> public final fun createClass(text: String): KtClass defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'header' @ [199:99] ==> val header: (String..String?) defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateClassOrObject[LocalVariableDescriptor]

'headerClass' @ [200:9] ==> value-parameter headerClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateClassOrObject[ValueParameterDescriptorImpl]

'!' @ [200:36] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'headerClass' @ [200:37] ==> value-parameter headerClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateClassOrObject[ValueParameterDescriptorImpl]

'isInterface' @ [200:49] ==> public final fun isInterface(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'implClass' @ [201:9] ==> val implClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateClassOrObject[LocalVariableDescriptor]

'declarations' @ [201:19] ==> public final val KtClassOrObject.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'forEach' @ [201:32] ==> @HidesMembers public inline fun <T> Iterable<KtDeclaration>.forEach(action: (KtDeclaration) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'it' @ [202:17] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateClassOrObject.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [203:17] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateClassOrObject.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [204:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [204:18] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateClassOrObject.<anonymous>[ValueParameterDescriptorImpl]

'hasModifier' @ [204:21] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtDeclaration[JavaMethodDescriptor]

'ABSTRACT_KEYWORD' @ [204:42] ==> public final val ABSTRACT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'it' @ [205:17] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateClassOrObject.<anonymous>[ValueParameterDescriptorImpl]

'delete' @ [205:20] ==> public abstract fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtDeclaration[JavaMethodDescriptor]

'headerClass' @ [209:45] ==> value-parameter headerClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateClassOrObject[ValueParameterDescriptorImpl]

'declarations' @ [209:57] ==> public final val KtClassOrObject.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'headerDeclaration' @ [210:17] ==> val headerDeclaration: KtDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateClassOrObject[LocalVariableDescriptor]

'hasModifier' @ [210:35] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtDeclaration[JavaMethodDescriptor]

'ABSTRACT_KEYWORD' @ [210:56] ==> public final val ABSTRACT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'headerDeclaration' @ [211:30] ==> val headerDeclaration: KtDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateClassOrObject[LocalVariableDescriptor]

'toDescriptor' @ [211:48] ==> public fun KtDeclaration.toDescriptor(): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'when (headerDeclaration) {
                is KtFunction -> generateFunction(project, headerDeclaration, descriptor as FunctionDescriptor, implNeeded = true)
                is KtProperty -> generateProperty(project, headerDeclaration, descriptor as PropertyDescriptor, implNeeded = true)
                else -> continue@declLoop
            }' @ [212:50] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtDeclaration, entry1: KtDeclaration, entry2: KtDeclaration): KtDeclaration[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtDeclaration

'headerDeclaration' @ [212:56] ==> val headerDeclaration: KtDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateClassOrObject[LocalVariableDescriptor]

'generateFunction' @ [213:34] ==> private fun KtPsiFactory.generateFunction(project: Project, headerFunction: KtFunction, descriptor: FunctionDescriptor, implNeeded: Boolean): KtFunction defined in org.jetbrains.kotlin.idea.quickfix.createImpl in file CreateHeaderImplementationFix.kt[SimpleFunctionDescriptorImpl]

'project' @ [213:51] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateClassOrObject[ValueParameterDescriptorImpl]

'headerDeclaration' @ [213:60] ==> val headerDeclaration: KtDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateClassOrObject[LocalVariableDescriptor]

'descriptor' @ [213:79] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateClassOrObject[LocalVariableDescriptor]

'generateProperty' @ [214:34] ==> private fun KtPsiFactory.generateProperty(project: Project, headerProperty: KtProperty, descriptor: PropertyDescriptor, implNeeded: Boolean): KtProperty defined in org.jetbrains.kotlin.idea.quickfix.createImpl in file CreateHeaderImplementationFix.kt[SimpleFunctionDescriptorImpl]

'project' @ [214:51] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateClassOrObject[ValueParameterDescriptorImpl]

'headerDeclaration' @ [214:60] ==> val headerDeclaration: KtDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateClassOrObject[LocalVariableDescriptor]

'descriptor' @ [214:79] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateClassOrObject[LocalVariableDescriptor]

'implClass' @ [217:13] ==> val implClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateClassOrObject[LocalVariableDescriptor]

'addDeclaration' @ [217:23] ==> public final inline fun <reified T : KtDeclaration> addDeclaration(declaration: KtDeclaration): KtDeclaration defined in org.jetbrains.kotlin.psi.KtClassOrObject[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : KtDeclaration> -> KtDeclaration

'implDeclaration' @ [217:38] ==> val implDeclaration: KtDeclaration defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateClassOrObject[LocalVariableDescriptor]

'implClass' @ [221:12] ==> val implClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateClassOrObject[LocalVariableDescriptor]

'apply' @ [221:22] ==> @InlineOnly public inline fun <T> KtClassOrObject.apply(block: KtClassOrObject.() -> Unit): KtClassOrObject defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClassOrObject

'replaceHeaderModifier' @ [222:9] ==> private fun KtModifierListOwner.replaceHeaderModifier(implNeeded: Boolean): Unit defined in org.jetbrains.kotlin.idea.quickfix.createImpl in file CreateHeaderImplementationFix.kt[SimpleFunctionDescriptorImpl]

'implNeeded' @ [222:31] ==> value-parameter implNeeded: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateClassOrObject[ValueParameterDescriptorImpl]

'descriptor' @ [232:22] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateFunction[ValueParameterDescriptorImpl]

'returnType' @ [232:33] ==> public final val FunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'run' @ [233:16] ==> @InlineOnly public inline fun <T, R> KtPsiFactory.run(block: KtPsiFactory.() -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtPsiFactory
    <R> -> String

'if (returnType != null && !KotlinBuiltIns.isUnit(returnType)) {
            val delegation = getFunctionBodyTextFromTemplate(
                    project,
                    TemplateKind.FUNCTION,
                    descriptor.name.asString(),
                    IdeDescriptorRenderers.SOURCE_CODE.renderType(returnType)
            )

            "{$delegation\n}"
        }
        else {
            "{}"
        }' @ [234:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'returnType' @ [234:13] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateFunction[LocalVariableDescriptor]

'!' @ [234:35] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isUnit' @ [234:51] ==> public open fun isUnit(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'returnType' @ [234:58] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateFunction[LocalVariableDescriptor]

'getFunctionBodyTextFromTemplate' @ [235:30] ==> public fun getFunctionBodyTextFromTemplate(project: Project, kind: TemplateKind, name: String?, returnType: String, classFqName: FqName? = ...): String defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'project' @ [236:21] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateFunction[ValueParameterDescriptorImpl]

'FUNCTION' @ [237:34] ==> enum entry FUNCTION defined in org.jetbrains.kotlin.idea.core.TemplateKind[FakeCallableDescriptorForObject]

'descriptor' @ [238:21] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateFunction[ValueParameterDescriptorImpl]

'name' @ [238:32] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [238:37] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'IdeDescriptorRenderers' @ [239:21] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE' @ [239:44] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [239:56] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'returnType' @ [239:67] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateFunction[LocalVariableDescriptor]

'delegation' @ [242:16] ==> val delegation: String defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateFunction.<anonymous>[LocalVariableDescriptor]

'if (headerFunction is KtSecondaryConstructor) {
        createSecondaryConstructor(headerFunction.text + " " +  body)
    }
    else {
        createFunction(headerFunction.text + " " +  body).apply {
            replaceHeaderModifier(implNeeded)
            if (returnType != null && KotlinBuiltIns.isUnit(returnType)) {
                typeReference = null
            }
        }
    }' @ [249:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtFunction, elseBranch: KtFunction): KtFunction[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtFunction

'headerFunction' @ [249:16] ==> value-parameter headerFunction: KtFunction defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateFunction[ValueParameterDescriptorImpl]

'createSecondaryConstructor' @ [250:9] ==> public final fun createSecondaryConstructor(decl: String): KtSecondaryConstructor defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'headerFunction' @ [250:36] ==> value-parameter headerFunction: KtFunction defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateFunction[ValueParameterDescriptorImpl]

'text' @ [250:51] ==> public final val KtSecondaryConstructor.text: (String..String?)[MyPropertyDescriptor]

'body' @ [250:65] ==> val body: String defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateFunction[LocalVariableDescriptor]

'createFunction' @ [253:9] ==> public final fun createFunction(funDecl: String): KtNamedFunction defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'headerFunction' @ [253:24] ==> value-parameter headerFunction: KtFunction defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateFunction[ValueParameterDescriptorImpl]

'text' @ [253:39] ==> public final val KtFunction.text: (String..String?)[MyPropertyDescriptor]

'body' @ [253:53] ==> val body: String defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateFunction[LocalVariableDescriptor]

'apply' @ [253:59] ==> @InlineOnly public inline fun <T> KtNamedFunction.apply(block: KtNamedFunction.() -> Unit): KtNamedFunction defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedFunction

'replaceHeaderModifier' @ [254:13] ==> private fun KtModifierListOwner.replaceHeaderModifier(implNeeded: Boolean): Unit defined in org.jetbrains.kotlin.idea.quickfix.createImpl in file CreateHeaderImplementationFix.kt[SimpleFunctionDescriptorImpl]

'implNeeded' @ [254:35] ==> value-parameter implNeeded: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateFunction[ValueParameterDescriptorImpl]

'returnType' @ [255:17] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateFunction[LocalVariableDescriptor]

'isUnit' @ [255:54] ==> public open fun isUnit(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'returnType' @ [255:61] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateFunction[LocalVariableDescriptor]

'typeReference' @ [256:17] ==> public final var KtNamedFunction.typeReference: KtTypeReference?[MyPropertyDescriptor]

'buildString' @ [268:16] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'append' @ [269:9] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [270:9] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [271:9] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'getFunctionBodyTextFromTemplate' @ [271:16] ==> public fun getFunctionBodyTextFromTemplate(project: Project, kind: TemplateKind, name: String?, returnType: String, classFqName: FqName? = ...): String defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'project' @ [272:17] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateProperty[ValueParameterDescriptorImpl]

'FUNCTION' @ [273:30] ==> enum entry FUNCTION defined in org.jetbrains.kotlin.idea.core.TemplateKind[FakeCallableDescriptorForObject]

'descriptor' @ [274:17] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateProperty[ValueParameterDescriptorImpl]

'name' @ [274:28] ==> public final val PropertyDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [274:33] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'descriptor' @ [275:17] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateProperty[ValueParameterDescriptorImpl]

'returnType' @ [275:28] ==> public final val PropertyDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'let' @ [275:40] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> String

'IdeDescriptorRenderers' @ [275:46] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE' @ [275:69] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [275:81] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'it' @ [275:92] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateProperty.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [277:13] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateProperty[ValueParameterDescriptorImpl]

'isVar' @ [277:24] ==> public final val PropertyDescriptor.isVar: Boolean[MyPropertyDescriptor]

'append' @ [278:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'createProperty' @ [281:12] ==> public final fun createProperty(text: String): KtProperty defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'headerProperty' @ [281:27] ==> value-parameter headerProperty: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateProperty[ValueParameterDescriptorImpl]

'text' @ [281:42] ==> public final val KtProperty.text: (String..String?)[MyPropertyDescriptor]

'body' @ [281:55] ==> val body: String defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateProperty[LocalVariableDescriptor]

'apply' @ [281:61] ==> @InlineOnly public inline fun <T> KtProperty.apply(block: KtProperty.() -> Unit): KtProperty defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtProperty

'replaceHeaderModifier' @ [282:9] ==> private fun KtModifierListOwner.replaceHeaderModifier(implNeeded: Boolean): Unit defined in org.jetbrains.kotlin.idea.quickfix.createImpl in file CreateHeaderImplementationFix.kt[SimpleFunctionDescriptorImpl]

'implNeeded' @ [282:31] ==> value-parameter implNeeded: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createImpl.generateProperty[ValueParameterDescriptorImpl]

