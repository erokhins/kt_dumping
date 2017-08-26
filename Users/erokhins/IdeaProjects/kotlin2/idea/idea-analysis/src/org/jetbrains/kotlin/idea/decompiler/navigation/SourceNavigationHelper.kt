'getInstance' @ [48:30] ==> @NotNull public open fun getInstance(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'SourceNavigationHelper' @ [48:42] ==> public object SourceNavigationHelper defined in org.jetbrains.kotlin.idea.decompiler.navigation in file SourceNavigationHelper.kt[FakeCallableDescriptorForObject]

'java' @ [48:72] ==> public val <T> KClass<SourceNavigationHelper>.java: Class<SourceNavigationHelper> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> SourceNavigationHelper

'TestOnly' @ [57:5] ==> public constructor TestOnly() defined in org.jetbrains.annotations.TestOnly[JavaClassConstructorDescriptor]

'SourceNavigationHelper' @ [59:9] ==> public object SourceNavigationHelper defined in org.jetbrains.kotlin.idea.decompiler.navigation in file SourceNavigationHelper.kt[FakeCallableDescriptorForObject]

'forceResolve' @ [59:32] ==> private final var forceResolve: Boolean defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper[PropertyDescriptorImpl]

'forceResolve' @ [59:47] ==> value-parameter forceResolve: Boolean defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.setForceResolve[ValueParameterDescriptorImpl]

'declaration' @ [63:30] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.targetScope[ValueParameterDescriptorImpl]

'containingKtFile' @ [63:42] ==> public final val KtNamedDeclaration.containingKtFile: KtFile[MyPropertyDescriptor]

'containingFile' @ [64:21] ==> val containingFile: KtFile defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.targetScope[LocalVariableDescriptor]

'virtualFile' @ [64:36] ==> public final val KtFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'when (navigationKind) {
            NavigationKind.CLASS_FILES_TO_SOURCES -> getBinaryLibrariesModuleInfos(declaration.project, vFile)
                    .mapNotNull { it.sourcesModuleInfo?.sourceScope() }.union()

            NavigationKind.SOURCES_TO_CLASS_FILES -> getLibrarySourcesModuleInfos(declaration.project, vFile)
                    .map { it.binariesModuleInfo.binariesScope() }.union()
        }' @ [66:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: GlobalSearchScope?, entry1: GlobalSearchScope?): GlobalSearchScope?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> GlobalSearchScope?

'navigationKind' @ [66:22] ==> value-parameter navigationKind: SourceNavigationHelper.NavigationKind defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.targetScope[ValueParameterDescriptorImpl]

'CLASS_FILES_TO_SOURCES' @ [67:28] ==> enum entry CLASS_FILES_TO_SOURCES defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.NavigationKind[FakeCallableDescriptorForObject]

'getBinaryLibrariesModuleInfos' @ [67:54] ==> public fun getBinaryLibrariesModuleInfos(project: Project, virtualFile: VirtualFile): Collection<BinaryModuleInfo> defined in org.jetbrains.kotlin.idea.caches.resolve[SimpleFunctionDescriptorImpl]

'declaration' @ [67:84] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.targetScope[ValueParameterDescriptorImpl]

'project' @ [67:96] ==> public final val KtNamedDeclaration.project: Project[MyPropertyDescriptor]

'vFile' @ [67:105] ==> val vFile: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.targetScope[LocalVariableDescriptor]

'mapNotNull' @ [68:22] ==> public inline fun <T, R : Any> Iterable<BinaryModuleInfo>.mapNotNull(transform: (BinaryModuleInfo) -> GlobalSearchScope?): List<GlobalSearchScope> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BinaryModuleInfo
    <R : Any> -> GlobalSearchScope

'it' @ [68:35] ==> value-parameter it: BinaryModuleInfo defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.targetScope.<anonymous>[ValueParameterDescriptorImpl]

'sourcesModuleInfo' @ [68:38] ==> public abstract val sourcesModuleInfo: SourceForBinaryModuleInfo? defined in org.jetbrains.kotlin.idea.caches.resolve.BinaryModuleInfo[PropertyDescriptorImpl]

'sourceScope' @ [68:57] ==> public abstract fun sourceScope(): GlobalSearchScope defined in org.jetbrains.kotlin.idea.caches.resolve.SourceForBinaryModuleInfo[SimpleFunctionDescriptorImpl]

'union' @ [68:73] ==> private final fun Collection<GlobalSearchScope>.union(): GlobalSearchScope? defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper[SimpleFunctionDescriptorImpl]

'SOURCES_TO_CLASS_FILES' @ [70:28] ==> enum entry SOURCES_TO_CLASS_FILES defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.NavigationKind[FakeCallableDescriptorForObject]

'getLibrarySourcesModuleInfos' @ [70:54] ==> public fun getLibrarySourcesModuleInfos(project: Project, virtualFile: VirtualFile): Collection<LibrarySourceInfo> defined in org.jetbrains.kotlin.idea.caches.resolve[SimpleFunctionDescriptorImpl]

'declaration' @ [70:83] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.targetScope[ValueParameterDescriptorImpl]

'project' @ [70:95] ==> public final val KtNamedDeclaration.project: Project[MyPropertyDescriptor]

'vFile' @ [70:104] ==> val vFile: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.targetScope[LocalVariableDescriptor]

'map' @ [71:22] ==> public inline fun <T, R> Iterable<LibrarySourceInfo>.map(transform: (LibrarySourceInfo) -> GlobalSearchScope): List<GlobalSearchScope> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LibrarySourceInfo
    <R> -> GlobalSearchScope

'it' @ [71:28] ==> value-parameter it: LibrarySourceInfo defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.targetScope.<anonymous>[ValueParameterDescriptorImpl]

'binariesModuleInfo' @ [71:31] ==> public open val binariesModuleInfo: BinaryModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.LibrarySourceInfo[PropertyDescriptorImpl]

'binariesScope' @ [71:50] ==> public open fun binariesScope(): GlobalSearchScope defined in org.jetbrains.kotlin.idea.caches.resolve.BinaryModuleInfo[SimpleFunctionDescriptorImpl]

'union' @ [71:68] ==> private final fun Collection<GlobalSearchScope>.union(): GlobalSearchScope? defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper[SimpleFunctionDescriptorImpl]

'if (this.isNotEmpty()) GlobalSearchScope.union(this.toTypedArray()) else null' @ [75:57] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: GlobalSearchScope?, elseBranch: GlobalSearchScope?): GlobalSearchScope?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> GlobalSearchScope?

'this' @ [75:61] ==> <this> defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.union[ReceiverParameterDescriptorImpl]

'isNotEmpty' @ [75:66] ==> @InlineOnly public inline fun <T> Collection<GlobalSearchScope>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GlobalSearchScope

'union' @ [75:98] ==> @NotNull @Contract public open fun union(@NotNull p0: (Array<(GlobalSearchScope..GlobalSearchScope?)>..Array<out (GlobalSearchScope..GlobalSearchScope?)>)): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'this' @ [75:104] ==> <this> defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.union[ReceiverParameterDescriptorImpl]

'toTypedArray' @ [75:109] ==> public inline fun <reified T> Collection<GlobalSearchScope>.toTypedArray(): Array<GlobalSearchScope> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> GlobalSearchScope

'files' @ [77:67] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.haveRenamesInImports[ValueParameterDescriptorImpl]

'any' @ [77:73] ==> public inline fun <T> Iterable<KtFile>.any(predicate: (KtFile) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'it' @ [77:79] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.haveRenamesInImports.<anonymous>[ValueParameterDescriptorImpl]

'importDirectives' @ [77:82] ==> public final val KtFile.importDirectives: (MutableList<(KtImportDirective..KtImportDirective?)>..List<(KtImportDirective..KtImportDirective?)>)[MyPropertyDescriptor]

'any' @ [77:99] ==> public inline fun <T> Iterable<(KtImportDirective..KtImportDirective?)>.any(predicate: ((KtImportDirective..KtImportDirective?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtImportDirective..org.jetbrains.kotlin.psi.KtImportDirective?)

'it' @ [77:105] ==> value-parameter it: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.haveRenamesInImports.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'aliasName' @ [77:108] ==> public final val KtImportDirective.aliasName: String?[MyPropertyDescriptor]

'containingClass' @ [81:37] ==> value-parameter containingClass: KtClass defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.findSpecialProperty[ValueParameterDescriptorImpl]

'primaryConstructorParameters' @ [81:53] ==> public final val KtClass.primaryConstructorParameters: List<KtParameter>[MyPropertyDescriptor]

'constructorParameters' @ [82:38] ==> val constructorParameters: List<KtParameter> defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.findSpecialProperty[LocalVariableDescriptor]

'memberName' @ [83:17] ==> value-parameter memberName: Name defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.findSpecialProperty[ValueParameterDescriptorImpl]

'constructorParameter' @ [83:31] ==> val constructorParameter: KtParameter defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.findSpecialProperty[LocalVariableDescriptor]

'nameAsName' @ [83:52] ==> public final val KtParameter.nameAsName: Name?[MyPropertyDescriptor]

'constructorParameter' @ [83:66] ==> val constructorParameter: KtParameter defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.findSpecialProperty[LocalVariableDescriptor]

'hasValOrVar' @ [83:87] ==> public open fun hasValOrVar(): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'constructorParameter' @ [84:24] ==> val constructorParameter: KtParameter defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.findSpecialProperty[LocalVariableDescriptor]

'containingClass' @ [89:13] ==> value-parameter containingClass: KtClass defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.findSpecialProperty[ValueParameterDescriptorImpl]

'hasModifier' @ [89:29] ==> public open fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtClass[JavaMethodDescriptor]

'ENUM_KEYWORD' @ [89:50] ==> public final val ENUM_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'iterator' @ [90:31] ==> public abstract fun iterator(): MutableIterator<(KtEnumEntry..KtEnumEntry?)> defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'findAll' @ [90:45] ==> @NotNull @Contract public open fun <T : (Any..Any?), V : (Any..Any?)> findAll(@NotNull p0: (MutableCollection<out (KtDeclaration..KtDeclaration?)>..Collection<(KtDeclaration..KtDeclaration?)>), @NotNull p1: Class<(KtEnumEntry..KtEnumEntry?)>): (MutableList<(KtEnumEntry..KtEnumEntry?)>..List<(KtEnumEntry..KtEnumEntry?)>) defined in com.intellij.util.containers.ContainerUtil[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KtDeclaration
    <V : (Any..Any?)> -> KtEnumEntry

'containingClass' @ [90:81] ==> value-parameter containingClass: KtClass defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.findSpecialProperty[ValueParameterDescriptorImpl]

'declarations' @ [90:97] ==> public final val KtClass.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'java' @ [90:130] ==> public val <T> KClass<KtEnumEntry>.java: Class<KtEnumEntry> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtEnumEntry

'memberName' @ [91:21] ==> value-parameter memberName: Name defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.findSpecialProperty[ValueParameterDescriptorImpl]

'enumEntry' @ [91:35] ==> val enumEntry: (KtEnumEntry..KtEnumEntry?) defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.findSpecialProperty[LocalVariableDescriptor]

'nameAsName' @ [91:45] ==> public final val KtEnumEntry.nameAsName: Name?[MyPropertyDescriptor]

'enumEntry' @ [92:28] ==> val enumEntry: (KtEnumEntry..KtEnumEntry?) defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.findSpecialProperty[LocalVariableDescriptor]

'declaration' @ [103:13] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[ValueParameterDescriptorImpl]

'findClassOrObject' @ [104:39] ==> private final fun findClassOrObject(decompiledClassOrObject: KtClassOrObject, navigationKind: SourceNavigationHelper.NavigationKind): KtClassOrObject? defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper[SimpleFunctionDescriptorImpl]

'declaration' @ [104:57] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[ValueParameterDescriptorImpl]

'getContainingClassOrObject' @ [104:69] ==> public open fun getContainingClassOrObject(): KtClassOrObject defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor[DeserializedSimpleFunctionDescriptor]

'navigationKind' @ [104:99] ==> value-parameter navigationKind: SourceNavigationHelper.NavigationKind defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[ValueParameterDescriptorImpl]

'sourceClassOrObject' @ [105:20] ==> val sourceClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[LocalVariableDescriptor]

'primaryConstructor' @ [105:41] ==> public final val KtClassOrObject.primaryConstructor: KtPrimaryConstructor?[MyPropertyDescriptor]

'sourceClassOrObject' @ [105:63] ==> val sourceClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[LocalVariableDescriptor]

'declaration' @ [108:34] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[ValueParameterDescriptorImpl]

'name' @ [108:46] ==> public final val KtNamedDeclaration.name: String?[MyPropertyDescriptor]

'memberNameAsString' @ [109:13] ==> val memberNameAsString: String? defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[LocalVariableDescriptor]

'LOG' @ [110:13] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper[PropertyDescriptorImpl]

'debug' @ [110:17] ==> public abstract fun debug(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'+' @ [110:23] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'declaration' @ [110:55] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[ValueParameterDescriptorImpl]

'getDebugText' @ [110:67] ==> public fun KtElement.getDebugText(): String defined in org.jetbrains.kotlin.psi.debugText[DeserializedSimpleFunctionDescriptor]

'identifier' @ [113:31] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'memberNameAsString' @ [113:42] ==> val memberNameAsString: String? defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[LocalVariableDescriptor]

'declaration' @ [115:35] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[ValueParameterDescriptorImpl]

'parent' @ [115:47] ==> public final val KtNamedDeclaration.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (decompiledContainer) {
            is KtFile -> candidates = getInitialTopLevelCandidates(declaration, navigationKind)
            is KtClassBody -> {
                val decompiledClassOrObject = decompiledContainer.getParent() as KtClassOrObject
                val sourceClassOrObject = findClassOrObject(decompiledClassOrObject, navigationKind)

                candidates = sourceClassOrObject?.let {
                    getInitialMemberCandidates(sourceClassOrObject, memberName, declaration::class.java)
                }.orEmpty()

                if (candidates.isEmpty()) {
                    if (declaration is KtProperty && sourceClassOrObject is KtClass) {
                        return findSpecialProperty(memberName, sourceClassOrObject)
                    }
                }
            }
            else -> throw IllegalStateException("Unexpected container of " +
                                                (if (navigationKind == NavigationKind.CLASS_FILES_TO_SOURCES) "decompiled" else "source") +
                                                " declaration: " +
                                                decompiledContainer::class.java.simpleName)
        }' @ [118:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'decompiledContainer' @ [118:15] ==> val decompiledContainer: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[LocalVariableDescriptor]

'candidates' @ [119:26] ==> var candidates: Collection<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[LocalVariableDescriptor]

'getInitialTopLevelCandidates' @ [119:39] ==> private final fun getInitialTopLevelCandidates(declaration: KtNamedDeclaration, navigationKind: SourceNavigationHelper.NavigationKind): Collection<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper[SimpleFunctionDescriptorImpl]

'declaration' @ [119:68] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[ValueParameterDescriptorImpl]

'navigationKind' @ [119:81] ==> value-parameter navigationKind: SourceNavigationHelper.NavigationKind defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[ValueParameterDescriptorImpl]

'decompiledContainer' @ [121:47] ==> val decompiledContainer: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[LocalVariableDescriptor]

'getParent' @ [121:67] ==> @Contract public abstract fun getParent(): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'findClassOrObject' @ [122:43] ==> private final fun findClassOrObject(decompiledClassOrObject: KtClassOrObject, navigationKind: SourceNavigationHelper.NavigationKind): KtClassOrObject? defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper[SimpleFunctionDescriptorImpl]

'decompiledClassOrObject' @ [122:61] ==> val decompiledClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[LocalVariableDescriptor]

'navigationKind' @ [122:86] ==> value-parameter navigationKind: SourceNavigationHelper.NavigationKind defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[ValueParameterDescriptorImpl]

'candidates' @ [124:17] ==> var candidates: Collection<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[LocalVariableDescriptor]

'sourceClassOrObject' @ [124:30] ==> val sourceClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[LocalVariableDescriptor]

'let' @ [124:51] ==> @InlineOnly public inline fun <T, R> KtClassOrObject.let(block: (KtClassOrObject) -> List<KtNamedDeclaration>): List<KtNamedDeclaration> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClassOrObject
    <R> -> List<KtNamedDeclaration>

'getInitialMemberCandidates' @ [125:21] ==> private final fun getInitialMemberCandidates(sourceClassOrObject: KtClassOrObject, name: Name, declarationClass: Class<out KtNamedDeclaration>): List<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper[SimpleFunctionDescriptorImpl]

'sourceClassOrObject' @ [125:48] ==> val sourceClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[LocalVariableDescriptor]

'memberName' @ [125:69] ==> val memberName: Name defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[LocalVariableDescriptor]

'declaration' @ [125:81] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[ValueParameterDescriptorImpl]

'java' @ [125:100] ==> public val <T> KClass<out KtNamedDeclaration>.java: Class<out KtNamedDeclaration> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration

'orEmpty' @ [126:19] ==> @InlineOnly public inline fun <T> List<KtNamedDeclaration>?.orEmpty(): List<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration

'candidates' @ [128:21] ==> var candidates: Collection<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[LocalVariableDescriptor]

'isEmpty' @ [128:32] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'declaration' @ [129:25] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[ValueParameterDescriptorImpl]

'sourceClassOrObject' @ [129:54] ==> val sourceClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[LocalVariableDescriptor]

'findSpecialProperty' @ [130:32] ==> private final fun findSpecialProperty(memberName: Name, containingClass: KtClass): KtNamedDeclaration? defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper[SimpleFunctionDescriptorImpl]

'memberName' @ [130:52] ==> val memberName: Name defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[LocalVariableDescriptor]

'sourceClassOrObject' @ [130:64] ==> val sourceClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[LocalVariableDescriptor]

'IllegalStateException' @ [134:27] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'+' @ [134:49] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'if (navigationKind == NavigationKind.CLASS_FILES_TO_SOURCES) "decompiled" else "source"' @ [135:50] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'navigationKind' @ [135:54] ==> value-parameter navigationKind: SourceNavigationHelper.NavigationKind defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[ValueParameterDescriptorImpl]

'CLASS_FILES_TO_SOURCES' @ [135:87] ==> enum entry CLASS_FILES_TO_SOURCES defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.NavigationKind[FakeCallableDescriptorForObject]

'decompiledContainer' @ [137:49] ==> val decompiledContainer: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[LocalVariableDescriptor]

'java' @ [137:76] ==> public val <T> KClass<out PsiElement>.java: Class<out PsiElement> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PsiElement

'simpleName' @ [137:81] ==> public final val <T : (Any..Any?)> Class<out PsiElement>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PsiElement

'candidates' @ [140:13] ==> var candidates: Collection<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[LocalVariableDescriptor]

'isEmpty' @ [140:24] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'!' @ [144:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'forceResolve' @ [144:14] ==> private final var forceResolve: Boolean defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper[PropertyDescriptorImpl]

'candidates' @ [145:13] ==> var candidates: Collection<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[LocalVariableDescriptor]

'candidates' @ [145:26] ==> var candidates: Collection<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[LocalVariableDescriptor]

'filter' @ [145:37] ==> public inline fun <T> Iterable<KtNamedDeclaration>.filter(predicate: (KtNamedDeclaration) -> Boolean): List<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration

'sameReceiverPresenceAndParametersCount' @ [145:46] ==> public/*package*/ open fun sameReceiverPresenceAndParametersCount(@NotNull a: KtNamedDeclaration, @NotNull b: KtNamedDeclaration): Boolean defined in org.jetbrains.kotlin.idea.decompiler.navigation.MemberMatching[JavaMethodDescriptor]

'it' @ [145:85] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction.<anonymous>[ValueParameterDescriptorImpl]

'declaration' @ [145:89] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[ValueParameterDescriptorImpl]

'candidates' @ [147:17] ==> var candidates: Collection<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[LocalVariableDescriptor]

'size' @ [147:28] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'candidates' @ [148:24] ==> var candidates: Collection<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[LocalVariableDescriptor]

'firstOrNull' @ [148:35] ==> public fun <T> List<KtNamedDeclaration>.firstOrNull(): KtNamedDeclaration? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration

'!' @ [151:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'haveRenamesInImports' @ [151:18] ==> private final fun haveRenamesInImports(files: Collection<KtFile>): Boolean defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper[SimpleFunctionDescriptorImpl]

'candidates' @ [151:39] ==> var candidates: Collection<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[LocalVariableDescriptor]

'getContainingFiles' @ [151:50] ==> private fun Collection<KtNamedDeclaration>.getContainingFiles(): Collection<KtFile> defined in org.jetbrains.kotlin.idea.decompiler.navigation[SimpleFunctionDescriptorImpl]

'candidates' @ [152:17] ==> var candidates: Collection<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[LocalVariableDescriptor]

'candidates' @ [152:30] ==> var candidates: Collection<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[LocalVariableDescriptor]

'filter' @ [152:41] ==> public inline fun <T> Iterable<KtNamedDeclaration>.filter(predicate: (KtNamedDeclaration) -> Boolean): List<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration

'receiverAndParametersShortTypesMatch' @ [152:50] ==> public/*package*/ open fun receiverAndParametersShortTypesMatch(@NotNull a: KtNamedDeclaration, @NotNull b: KtNamedDeclaration): Boolean defined in org.jetbrains.kotlin.idea.decompiler.navigation.MemberMatching[JavaMethodDescriptor]

'it' @ [152:87] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction.<anonymous>[ValueParameterDescriptorImpl]

'declaration' @ [152:91] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[ValueParameterDescriptorImpl]

'candidates' @ [155:21] ==> var candidates: Collection<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[LocalVariableDescriptor]

'size' @ [155:32] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'candidates' @ [156:28] ==> var candidates: Collection<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[LocalVariableDescriptor]

'firstOrNull' @ [156:39] ==> public fun <T> List<KtNamedDeclaration>.firstOrNull(): KtNamedDeclaration? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration

'candidates' @ [161:27] ==> var candidates: Collection<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[LocalVariableDescriptor]

'candidate' @ [162:39] ==> val candidate: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[LocalVariableDescriptor]

'resolveToDescriptor' @ [162:49] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'receiversMatch' @ [163:17] ==> public/*package*/ open fun receiversMatch(@NotNull declaration: KtNamedDeclaration, @NotNull descriptor: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.idea.decompiler.navigation.MemberMatching[JavaMethodDescriptor]

'declaration' @ [163:32] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[ValueParameterDescriptorImpl]

'candidateDescriptor' @ [163:45] ==> val candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[LocalVariableDescriptor]

'valueParametersTypesMatch' @ [164:20] ==> public/*package*/ open fun valueParametersTypesMatch(@NotNull declaration: KtNamedDeclaration, @NotNull descriptor: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.idea.decompiler.navigation.MemberMatching[JavaMethodDescriptor]

'declaration' @ [164:46] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[ValueParameterDescriptorImpl]

'candidateDescriptor' @ [164:59] ==> val candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[LocalVariableDescriptor]

'typeParametersMatch' @ [165:20] ==> public/*package*/ open fun typeParametersMatch(@NotNull typeParameterListOwner: KtTypeParameterListOwner, @NotNull typeParameterDescriptors: (MutableList<(TypeParameterDescriptor..TypeParameterDescriptor?)>..List<(TypeParameterDescriptor..TypeParameterDescriptor?)>)): Boolean defined in org.jetbrains.kotlin.idea.decompiler.navigation.MemberMatching[JavaMethodDescriptor]

'declaration' @ [165:40] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[ValueParameterDescriptorImpl]

'candidateDescriptor' @ [165:81] ==> val candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[LocalVariableDescriptor]

'typeParameters' @ [165:101] ==> public final val CallableDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'candidate' @ [166:24] ==> val candidate: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.convertPropertyOrFunction[LocalVariableDescriptor]

'entity' @ [178:27] ==> value-parameter entity: T defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.findFirstMatchingInIndex[ValueParameterDescriptorImpl]

'fqName' @ [178:34] ==> public final val KtNamedDeclaration.fqName: FqName?[MyPropertyDescriptor]

'targetScope' @ [180:21] ==> private final fun targetScope(declaration: KtNamedDeclaration, navigationKind: SourceNavigationHelper.NavigationKind): GlobalSearchScope? defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper[SimpleFunctionDescriptorImpl]

'entity' @ [180:33] ==> value-parameter entity: T defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.findFirstMatchingInIndex[ValueParameterDescriptorImpl]

'navigationKind' @ [180:41] ==> value-parameter navigationKind: SourceNavigationHelper.NavigationKind defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.findFirstMatchingInIndex[ValueParameterDescriptorImpl]

'index' @ [181:16] ==> value-parameter index: StringStubIndexExtension<T> defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.findFirstMatchingInIndex[ValueParameterDescriptorImpl]

'get' @ [181:22] ==> public open fun get(@NotNull p0: String, @NotNull p1: Project, @NotNull p2: GlobalSearchScope): (MutableCollection<(T..T?)>..Collection<(T..T?)>?) defined in com.intellij.psi.stubs.StringStubIndexExtension[JavaMethodDescriptor]

'classFqName' @ [181:26] ==> val classFqName: FqName defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.findFirstMatchingInIndex[LocalVariableDescriptor]

'asString' @ [181:38] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'entity' @ [181:50] ==> value-parameter entity: T defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.findFirstMatchingInIndex[ValueParameterDescriptorImpl]

'project' @ [181:57] ==> public final val KtNamedDeclaration.project: Project[MyPropertyDescriptor]

'scope' @ [181:66] ==> val scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.findFirstMatchingInIndex[LocalVariableDescriptor]

'firstOrNull' @ [181:73] ==> public fun <T> Iterable<(T..T?)>.firstOrNull(): T? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (T..T?)

'findFirstMatchingInIndex' @ [185:16] ==> private final fun <T : KtNamedDeclaration> findFirstMatchingInIndex(entity: KtClassOrObject, navigationKind: SourceNavigationHelper.NavigationKind, index: StringStubIndexExtension<KtClassOrObject>): KtClassOrObject? defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : KtNamedDeclaration> -> KtClassOrObject

'decompiledClassOrObject' @ [185:58] ==> value-parameter decompiledClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.findClassOrObject[ValueParameterDescriptorImpl]

'navigationKind' @ [185:83] ==> value-parameter navigationKind: SourceNavigationHelper.NavigationKind defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.findClassOrObject[ValueParameterDescriptorImpl]

'getInstance' @ [185:124] ==> @NotNull public open fun getInstance(): KotlinFullClassNameIndex defined in org.jetbrains.kotlin.idea.stubindex.KotlinFullClassNameIndex[JavaMethodDescriptor]

'targetScope' @ [192:21] ==> private final fun targetScope(declaration: KtNamedDeclaration, navigationKind: SourceNavigationHelper.NavigationKind): GlobalSearchScope? defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper[SimpleFunctionDescriptorImpl]

'declaration' @ [192:33] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.getInitialTopLevelCandidates[ValueParameterDescriptorImpl]

'navigationKind' @ [192:46] ==> value-parameter navigationKind: SourceNavigationHelper.NavigationKind defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.getInitialTopLevelCandidates[ValueParameterDescriptorImpl]

'emptyList' @ [192:72] ==> public fun <T> emptyList(): List<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration

'getIndexForTopLevelPropertyOrFunction' @ [193:21] ==> private final fun getIndexForTopLevelPropertyOrFunction(decompiledDeclaration: KtNamedDeclaration): StringStubIndexExtension<out KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper[SimpleFunctionDescriptorImpl]

'declaration' @ [193:59] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.getInitialTopLevelCandidates[ValueParameterDescriptorImpl]

'index' @ [194:16] ==> val index: StringStubIndexExtension<out KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.getInitialTopLevelCandidates[LocalVariableDescriptor]

'get' @ [194:22] ==> public open fun get(@NotNull p0: String, @NotNull p1: Project, @NotNull p2: GlobalSearchScope): (MutableCollection<out (KtNamedDeclaration..KtNamedDeclaration?)>..Collection<(KtNamedDeclaration..KtNamedDeclaration?)>?) defined in com.intellij.psi.stubs.StringStubIndexExtension[JavaMethodDescriptor]

'declaration' @ [194:26] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.getInitialTopLevelCandidates[ValueParameterDescriptorImpl]

'fqName' @ [194:38] ==> public final val KtNamedDeclaration.fqName: FqName?[MyPropertyDescriptor]

'asString' @ [194:47] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'declaration' @ [194:59] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.getInitialTopLevelCandidates[ValueParameterDescriptorImpl]

'project' @ [194:71] ==> public final val KtNamedDeclaration.project: Project[MyPropertyDescriptor]

'scope' @ [194:80] ==> val scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.getInitialTopLevelCandidates[LocalVariableDescriptor]

'when (decompiledDeclaration) {
        is KtNamedFunction -> KotlinTopLevelFunctionFqnNameIndex.getInstance()
        is KtProperty -> KotlinTopLevelPropertyFqnNameIndex.getInstance()
        else -> throw IllegalArgumentException("Neither function nor declaration: " + decompiledDeclaration::class.java.name)
    }' @ [199:59] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: StringStubIndexExtension<out KtNamedDeclaration>, entry1: StringStubIndexExtension<out KtNamedDeclaration>, entry2: StringStubIndexExtension<out KtNamedDeclaration>): StringStubIndexExtension<out KtNamedDeclaration>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> StringStubIndexExtension<out KtNamedDeclaration>

'decompiledDeclaration' @ [199:65] ==> value-parameter decompiledDeclaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.getIndexForTopLevelPropertyOrFunction[ValueParameterDescriptorImpl]

'getInstance' @ [200:66] ==> @NotNull public open fun getInstance(): KotlinTopLevelFunctionFqnNameIndex defined in org.jetbrains.kotlin.idea.stubindex.KotlinTopLevelFunctionFqnNameIndex[JavaMethodDescriptor]

'getInstance' @ [201:61] ==> @NotNull public open fun getInstance(): KotlinTopLevelPropertyFqnNameIndex defined in org.jetbrains.kotlin.idea.stubindex.KotlinTopLevelPropertyFqnNameIndex[JavaMethodDescriptor]

'IllegalArgumentException' @ [202:23] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'+' @ [202:48] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'decompiledDeclaration' @ [202:87] ==> value-parameter decompiledDeclaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.getIndexForTopLevelPropertyOrFunction[ValueParameterDescriptorImpl]

'java' @ [202:116] ==> public val <T> KClass<out KtNamedDeclaration>.java: Class<out KtNamedDeclaration> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration

'name' @ [202:121] ==> public final val <T : (Any..Any?)> Class<out KtNamedDeclaration>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KtNamedDeclaration

'sourceClassOrObject' @ [209:9] ==> value-parameter sourceClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.getInitialMemberCandidates[ValueParameterDescriptorImpl]

'declarations' @ [209:29] ==> public final val KtClassOrObject.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'filterIsInstance' @ [209:42] ==> public fun <R> Iterable<*>.filterIsInstance(klass: Class<out KtNamedDeclaration>): List<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> KtNamedDeclaration

'declarationClass' @ [209:59] ==> value-parameter declarationClass: Class<out KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.getInitialMemberCandidates[ValueParameterDescriptorImpl]

'filter' @ [209:77] ==> public inline fun <T> Iterable<KtNamedDeclaration>.filter(predicate: (KtNamedDeclaration) -> Boolean): List<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration

'name' @ [211:9] ==> value-parameter name: Name defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.getInitialMemberCandidates[ValueParameterDescriptorImpl]

'declaration' @ [211:17] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.getInitialMemberCandidates.<anonymous>[ValueParameterDescriptorImpl]

'nameAsSafeName' @ [211:29] ==> public final val KtNamedDeclaration.nameAsSafeName: Name[MyPropertyDescriptor]

'classOrObject' @ [215:22] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.getOriginalPsiClassOrCreateLightClass[ValueParameterDescriptorImpl]

'fqName' @ [215:36] ==> public final val KtClassOrObject.fqName: FqName?[MyPropertyDescriptor]

'fqName' @ [216:13] ==> val fqName: FqName? defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.getOriginalPsiClassOrCreateLightClass[LocalVariableDescriptor]

'JavaToKotlinClassMap' @ [217:31] ==> public object JavaToKotlinClassMap : PlatformToKotlinClassMap defined in org.jetbrains.kotlin.platform[FakeCallableDescriptorForObject]

'mapKotlinToJava' @ [217:52] ==> public final fun mapKotlinToJava(kotlinFqName: FqNameUnsafe): ClassId? defined in org.jetbrains.kotlin.platform.JavaToKotlinClassMap[DeserializedSimpleFunctionDescriptor]

'fqName' @ [217:68] ==> val fqName: FqName? defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.getOriginalPsiClassOrCreateLightClass[LocalVariableDescriptor]

'toUnsafe' @ [217:75] ==> @NotNull public open fun toUnsafe(): FqNameUnsafe defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'javaClassId' @ [218:17] ==> val javaClassId: ClassId? defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.getOriginalPsiClassOrCreateLightClass[LocalVariableDescriptor]

'getInstance' @ [219:38] ==> public open fun getInstance(p0: (Project..Project?)): (JavaPsiFacade..JavaPsiFacade?) defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'classOrObject' @ [219:50] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.getOriginalPsiClassOrCreateLightClass[ValueParameterDescriptorImpl]

'project' @ [219:64] ==> public final val KtClassOrObject.project: Project[MyPropertyDescriptor]

'findClass' @ [219:73] ==> @Nullable public abstract fun findClass(@NonNls @NotNull p0: String, @NotNull p1: GlobalSearchScope): PsiClass? defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'javaClassId' @ [220:25] ==> val javaClassId: ClassId? defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.getOriginalPsiClassOrCreateLightClass[LocalVariableDescriptor]

'asSingleFqName' @ [220:37] ==> @NotNull public open fun asSingleFqName(): FqName defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'asString' @ [220:54] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'allScope' @ [221:43] ==> @NotNull public open fun allScope(@NotNull p0: Project): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'classOrObject' @ [221:52] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.getOriginalPsiClassOrCreateLightClass[ValueParameterDescriptorImpl]

'project' @ [221:66] ==> public final val KtClassOrObject.project: Project[MyPropertyDescriptor]

'classOrObject' @ [225:16] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.getOriginalPsiClassOrCreateLightClass[ValueParameterDescriptorImpl]

'toLightClass' @ [225:30] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'classOrObject' @ [230:22] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.getOriginalClass[ValueParameterDescriptorImpl]

'fqName' @ [230:36] ==> public final val KtClassOrObject.fqName: FqName?[MyPropertyDescriptor]

'classOrObject' @ [232:20] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.getOriginalClass[ValueParameterDescriptorImpl]

'containingKtFile' @ [232:34] ==> public final val KtClassOrObject.containingKtFile: KtFile[MyPropertyDescriptor]

'file' @ [234:21] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.getOriginalClass[LocalVariableDescriptor]

'virtualFile' @ [234:26] ==> public final val KtFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'file' @ [235:23] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.getOriginalClass[LocalVariableDescriptor]

'project' @ [235:28] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'getInstance' @ [237:38] ==> public open fun getInstance(@NotNull p0: Project): (ProjectRootManager..ProjectRootManager?) defined in com.intellij.openapi.roots.ProjectRootManager[JavaMethodDescriptor]

'project' @ [237:50] ==> val project: Project defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.getOriginalClass[LocalVariableDescriptor]

'fileIndex' @ [237:59] ==> public final val ProjectRootManager.fileIndex: ProjectFileIndex[MyPropertyDescriptor]

'vFile' @ [239:13] ==> val vFile: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.getOriginalClass[LocalVariableDescriptor]

'!' @ [239:30] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'idx' @ [239:31] ==> val idx: ProjectFileIndex defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.getOriginalClass[LocalVariableDescriptor]

'isInLibrarySource' @ [239:35] ==> public abstract fun isInLibrarySource(@NotNull p0: VirtualFile): Boolean defined in com.intellij.openapi.roots.ProjectFileIndex[JavaMethodDescriptor]

'vFile' @ [239:53] ==> val vFile: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.getOriginalClass[LocalVariableDescriptor]

'THashSet' @ [240:28] ==> public constructor THashSet<E : (Any..Any?)>(p0: (MutableCollection<out (OrderEntry..OrderEntry?)>..Collection<(OrderEntry..OrderEntry?)>?)) defined in gnu.trove.THashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> OrderEntry

'idx' @ [240:49] ==> val idx: ProjectFileIndex defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.getOriginalClass[LocalVariableDescriptor]

'getOrderEntriesForFile' @ [240:53] ==> @NotNull public abstract fun getOrderEntriesForFile(@NotNull p0: VirtualFile): (MutableList<(OrderEntry..OrderEntry?)>..List<(OrderEntry..OrderEntry?)>) defined in com.intellij.openapi.roots.ProjectFileIndex[JavaMethodDescriptor]

'vFile' @ [240:76] ==> val vFile: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.getOriginalClass[LocalVariableDescriptor]

'getInstance' @ [242:30] ==> public open fun getInstance(p0: (Project..Project?)): (JavaPsiFacade..JavaPsiFacade?) defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'project' @ [242:42] ==> val project: Project defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.getOriginalClass[LocalVariableDescriptor]

'findClass' @ [242:51] ==> @Nullable public abstract fun findClass(@NonNls @NotNull p0: String, @NotNull p1: GlobalSearchScope): PsiClass? defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'fqName' @ [242:61] ==> val fqName: FqName defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.getOriginalClass[LocalVariableDescriptor]

'asString' @ [242:68] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'GlobalSearchScope' @ [242:89] ==> protected/*protected and package*/ constructor GlobalSearchScope(@Nullable p0: Project?) defined in com.intellij.psi.search.GlobalSearchScope[JavaClassConstructorDescriptor]

'project' @ [242:107] ==> val project: Project defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.getOriginalClass[LocalVariableDescriptor]

'idx' @ [248:31] ==> val idx: ProjectFileIndex defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.getOriginalClass[LocalVariableDescriptor]

'getOrderEntriesForFile' @ [248:35] ==> @NotNull public abstract fun getOrderEntriesForFile(@NotNull p0: VirtualFile): (MutableList<(OrderEntry..OrderEntry?)>..List<(OrderEntry..OrderEntry?)>) defined in com.intellij.openapi.roots.ProjectFileIndex[JavaMethodDescriptor]

'file' @ [248:58] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.getOriginalClass.<no name provided>.contains[ValueParameterDescriptorImpl]

'entries' @ [249:31] ==> val entries: (MutableList<(OrderEntry..OrderEntry?)>..List<(OrderEntry..OrderEntry?)>) defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.getOriginalClass.<no name provided>.contains[LocalVariableDescriptor]

'orderEntries' @ [250:25] ==> val orderEntries: THashSet<OrderEntry> defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.getOriginalClass[LocalVariableDescriptor]

'contains' @ [250:38] ==> public open fun contains(element: (OrderEntry..OrderEntry?)): Boolean defined in gnu.trove.THashSet[DeserializedSimpleFunctionDescriptor]

'entry' @ [250:47] ==> val entry: (OrderEntry..OrderEntry?) defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.getOriginalClass.<no name provided>.contains[LocalVariableDescriptor]

'navigateToDeclaration' @ [265:60] ==> private final fun navigateToDeclaration(from: KtDeclaration, navigationKind: SourceNavigationHelper.NavigationKind): KtDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper[SimpleFunctionDescriptorImpl]

'declaration' @ [265:82] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.getNavigationElement[ValueParameterDescriptorImpl]

'CLASS_FILES_TO_SOURCES' @ [265:110] ==> enum entry CLASS_FILES_TO_SOURCES defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.NavigationKind[FakeCallableDescriptorForObject]

'navigateToDeclaration' @ [267:58] ==> private final fun navigateToDeclaration(from: KtDeclaration, navigationKind: SourceNavigationHelper.NavigationKind): KtDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper[SimpleFunctionDescriptorImpl]

'declaration' @ [267:80] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.getOriginalElement[ValueParameterDescriptorImpl]

'SOURCES_TO_CLASS_FILES' @ [267:108] ==> enum entry SOURCES_TO_CLASS_FILES defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.NavigationKind[FakeCallableDescriptorForObject]

'isDumb' @ [273:25] ==> public open fun isDumb(@NotNull p0: Project): Boolean defined in com.intellij.openapi.project.DumbService[JavaMethodDescriptor]

'from' @ [273:32] ==> value-parameter from: KtDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.navigateToDeclaration[ValueParameterDescriptorImpl]

'project' @ [273:37] ==> public final val KtDeclaration.project: Project[MyPropertyDescriptor]

'from' @ [273:54] ==> value-parameter from: KtDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.navigateToDeclaration[ValueParameterDescriptorImpl]

'when (navigationKind) {
            SourceNavigationHelper.NavigationKind.CLASS_FILES_TO_SOURCES -> if (!from.containingKtFile.isCompiled) return from
            SourceNavigationHelper.NavigationKind.SOURCES_TO_CLASS_FILES -> {
                if (from.containingKtFile.isCompiled) return from
                if (!ProjectRootsUtil.isInContent(from, false, true, false, true)) return from
                if (KtPsiUtil.isLocal(from)) return from
            }
        }' @ [275:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'navigationKind' @ [275:15] ==> value-parameter navigationKind: SourceNavigationHelper.NavigationKind defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.navigateToDeclaration[ValueParameterDescriptorImpl]

'SourceNavigationHelper' @ [276:13] ==> public object SourceNavigationHelper defined in org.jetbrains.kotlin.idea.decompiler.navigation in file SourceNavigationHelper.kt[FakeCallableDescriptorForObject]

'CLASS_FILES_TO_SOURCES' @ [276:51] ==> enum entry CLASS_FILES_TO_SOURCES defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.NavigationKind[FakeCallableDescriptorForObject]

'!' @ [276:81] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'from' @ [276:82] ==> value-parameter from: KtDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.navigateToDeclaration[ValueParameterDescriptorImpl]

'containingKtFile' @ [276:87] ==> public final val KtDeclaration.containingKtFile: KtFile[MyPropertyDescriptor]

'isCompiled' @ [276:104] ==> public final val KtFile.isCompiled: Boolean[MyPropertyDescriptor]

'from' @ [276:123] ==> value-parameter from: KtDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.navigateToDeclaration[ValueParameterDescriptorImpl]

'SourceNavigationHelper' @ [277:13] ==> public object SourceNavigationHelper defined in org.jetbrains.kotlin.idea.decompiler.navigation in file SourceNavigationHelper.kt[FakeCallableDescriptorForObject]

'SOURCES_TO_CLASS_FILES' @ [277:51] ==> enum entry SOURCES_TO_CLASS_FILES defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.NavigationKind[FakeCallableDescriptorForObject]

'from' @ [278:21] ==> value-parameter from: KtDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.navigateToDeclaration[ValueParameterDescriptorImpl]

'containingKtFile' @ [278:26] ==> public final val KtDeclaration.containingKtFile: KtFile[MyPropertyDescriptor]

'isCompiled' @ [278:43] ==> public final val KtFile.isCompiled: Boolean[MyPropertyDescriptor]

'from' @ [278:62] ==> value-parameter from: KtDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.navigateToDeclaration[ValueParameterDescriptorImpl]

'!' @ [279:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'ProjectRootsUtil' @ [279:22] ==> public object ProjectRootsUtil defined in org.jetbrains.kotlin.idea.util in file ProjectRootsUtil.kt[FakeCallableDescriptorForObject]

'isInContent' @ [279:39] ==> @JvmStatic public final fun isInContent(element: PsiElement, includeProjectSource: Boolean, includeLibrarySource: Boolean, includeLibraryClasses: Boolean, includeScriptDependencies: Boolean): Boolean defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil[SimpleFunctionDescriptorImpl]

'from' @ [279:51] ==> value-parameter from: KtDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.navigateToDeclaration[ValueParameterDescriptorImpl]

'from' @ [279:91] ==> value-parameter from: KtDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.navigateToDeclaration[ValueParameterDescriptorImpl]

'isLocal' @ [280:31] ==> public open fun isLocal(@NotNull p0: KtDeclaration): Boolean defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'from' @ [280:39] ==> value-parameter from: KtDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.navigateToDeclaration[ValueParameterDescriptorImpl]

'from' @ [280:53] ==> value-parameter from: KtDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.navigateToDeclaration[ValueParameterDescriptorImpl]

'from' @ [284:16] ==> value-parameter from: KtDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.navigateToDeclaration[ValueParameterDescriptorImpl]

'accept' @ [284:21] ==> public abstract fun <R : (Any..Any?), D : (Any..Any?)> accept(@NotNull visitor: KtVisitor<KtDeclaration?, Unit>, data: Unit): KtDeclaration? defined in org.jetbrains.kotlin.psi.KtDeclaration[JavaMethodDescriptor]
Inferred types:
    <R : (Any..Any?)> -> KtDeclaration?
    <D : (Any..Any?)> -> Unit

'SourceAndDecompiledConversionVisitor' @ [284:28] ==> public constructor SourceAndDecompiledConversionVisitor(navigationKind: SourceNavigationHelper.NavigationKind) defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.SourceAndDecompiledConversionVisitor[ClassConstructorDescriptorImpl]

'navigationKind' @ [284:65] ==> value-parameter navigationKind: SourceNavigationHelper.NavigationKind defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.navigateToDeclaration[ValueParameterDescriptorImpl]

'Unit' @ [284:82] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'from' @ [284:91] ==> value-parameter from: KtDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.navigateToDeclaration[ValueParameterDescriptorImpl]

'KtVisitor<KtDeclaration?, Unit>' @ [287:102] ==> public constructor KtVisitor<R : (Any..Any?), D : (Any..Any?)>() defined in org.jetbrains.kotlin.psi.KtVisitor[JavaClassConstructorDescriptor]
Inferred types:
    <R : (Any..Any?)> -> KtDeclaration?
    <D : (Any..Any?)> -> Unit

'convertPropertyOrFunction' @ [289:82] ==> private final fun convertPropertyOrFunction(declaration: KtNamedDeclaration, navigationKind: SourceNavigationHelper.NavigationKind): KtNamedDeclaration? defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper[SimpleFunctionDescriptorImpl]

'function' @ [289:108] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.SourceAndDecompiledConversionVisitor.visitNamedFunction[ValueParameterDescriptorImpl]

'navigationKind' @ [289:118] ==> private final val navigationKind: SourceNavigationHelper.NavigationKind defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.SourceAndDecompiledConversionVisitor[PropertyDescriptorImpl]

'convertPropertyOrFunction' @ [291:72] ==> private final fun convertPropertyOrFunction(declaration: KtNamedDeclaration, navigationKind: SourceNavigationHelper.NavigationKind): KtNamedDeclaration? defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper[SimpleFunctionDescriptorImpl]

'property' @ [291:98] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.SourceAndDecompiledConversionVisitor.visitProperty[ValueParameterDescriptorImpl]

'navigationKind' @ [291:108] ==> private final val navigationKind: SourceNavigationHelper.NavigationKind defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.SourceAndDecompiledConversionVisitor[PropertyDescriptorImpl]

'findClassOrObject' @ [293:93] ==> private final fun findClassOrObject(decompiledClassOrObject: KtClassOrObject, navigationKind: SourceNavigationHelper.NavigationKind): KtClassOrObject? defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper[SimpleFunctionDescriptorImpl]

'declaration' @ [293:111] ==> value-parameter declaration: KtObjectDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.SourceAndDecompiledConversionVisitor.visitObjectDeclaration[ValueParameterDescriptorImpl]

'navigationKind' @ [293:124] ==> private final val navigationKind: SourceNavigationHelper.NavigationKind defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.SourceAndDecompiledConversionVisitor[PropertyDescriptorImpl]

'findClassOrObject' @ [295:63] ==> private final fun findClassOrObject(decompiledClassOrObject: KtClassOrObject, navigationKind: SourceNavigationHelper.NavigationKind): KtClassOrObject? defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper[SimpleFunctionDescriptorImpl]

'klass' @ [295:81] ==> value-parameter klass: KtClass defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.SourceAndDecompiledConversionVisitor.visitClass[ValueParameterDescriptorImpl]

'navigationKind' @ [295:88] ==> private final val navigationKind: SourceNavigationHelper.NavigationKind defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.SourceAndDecompiledConversionVisitor[PropertyDescriptorImpl]

'findFirstMatchingInIndex' @ [298:19] ==> private final fun <T : KtNamedDeclaration> findFirstMatchingInIndex(entity: KtTypeAlias, navigationKind: SourceNavigationHelper.NavigationKind, index: StringStubIndexExtension<KtTypeAlias>): KtTypeAlias? defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : KtNamedDeclaration> -> KtTypeAlias

'typeAlias' @ [298:44] ==> value-parameter typeAlias: KtTypeAlias defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.SourceAndDecompiledConversionVisitor.visitTypeAlias[ValueParameterDescriptorImpl]

'navigationKind' @ [298:55] ==> private final val navigationKind: SourceNavigationHelper.NavigationKind defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.SourceAndDecompiledConversionVisitor[PropertyDescriptorImpl]

'KotlinTopLevelTypeAliasFqNameIndex' @ [298:71] ==> public companion object defined in org.jetbrains.kotlin.idea.stubindex.KotlinTopLevelTypeAliasFqNameIndex[FakeCallableDescriptorForObject]

'getInstance' @ [298:106] ==> @JvmStatic public final fun getInstance(): KotlinTopLevelTypeAliasFqNameIndex defined in org.jetbrains.kotlin.idea.stubindex.KotlinTopLevelTypeAliasFqNameIndex.Companion[SimpleFunctionDescriptorImpl]

'parameter' @ [301:39] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.SourceAndDecompiledConversionVisitor.visitParameter[ValueParameterDescriptorImpl]

'parent' @ [301:49] ==> public final val KtParameter.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [301:56] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'callableDeclaration' @ [302:30] ==> val callableDeclaration: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.SourceAndDecompiledConversionVisitor.visitParameter[LocalVariableDescriptor]

'valueParameters' @ [302:50] ==> public final val KtCallableDeclaration.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'parameters' @ [303:25] ==> val parameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>) defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.SourceAndDecompiledConversionVisitor.visitParameter[LocalVariableDescriptor]

'indexOf' @ [303:36] ==> public abstract fun indexOf(element: (KtParameter..KtParameter?)): Int defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'parameter' @ [303:44] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.SourceAndDecompiledConversionVisitor.visitParameter[ValueParameterDescriptorImpl]

'callableDeclaration' @ [305:34] ==> val callableDeclaration: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.SourceAndDecompiledConversionVisitor.visitParameter[LocalVariableDescriptor]

'accept' @ [305:54] ==> public abstract fun <R : (Any..Any?), D : (Any..Any?)> accept(@NotNull visitor: KtVisitor<KtDeclaration?, Unit>, data: Unit): KtDeclaration? defined in org.jetbrains.kotlin.psi.KtCallableDeclaration[JavaMethodDescriptor]
Inferred types:
    <R : (Any..Any?)> -> KtDeclaration?
    <D : (Any..Any?)> -> Unit

'this' @ [305:61] ==> <this> defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.SourceAndDecompiledConversionVisitor[LazyClassReceiverParameterDescriptor]

'Unit' @ [305:67] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'sourceCallable' @ [306:36] ==> val sourceCallable: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.SourceAndDecompiledConversionVisitor.visitParameter[LocalVariableDescriptor]

'valueParameters' @ [306:51] ==> public final val KtCallableDeclaration.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'sourceParameters' @ [307:17] ==> val sourceParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>) defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.SourceAndDecompiledConversionVisitor.visitParameter[LocalVariableDescriptor]

'size' @ [307:34] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'parameters' @ [307:42] ==> val parameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>) defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.SourceAndDecompiledConversionVisitor.visitParameter[LocalVariableDescriptor]

'size' @ [307:53] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'sourceParameters' @ [308:20] ==> val sourceParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>) defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.SourceAndDecompiledConversionVisitor.visitParameter[LocalVariableDescriptor]

'get' @ [308:37] ==> public abstract fun get(index: Int): (KtParameter..KtParameter?) defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'index' @ [308:41] ==> val index: Int defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.SourceAndDecompiledConversionVisitor.visitParameter[LocalVariableDescriptor]

'convertPropertyOrFunction' @ [312:19] ==> private final fun convertPropertyOrFunction(declaration: KtNamedDeclaration, navigationKind: SourceNavigationHelper.NavigationKind): KtNamedDeclaration? defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper[SimpleFunctionDescriptorImpl]

'constructor' @ [312:45] ==> value-parameter constructor: KtPrimaryConstructor defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.SourceAndDecompiledConversionVisitor.visitPrimaryConstructor[ValueParameterDescriptorImpl]

'navigationKind' @ [312:58] ==> private final val navigationKind: SourceNavigationHelper.NavigationKind defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.SourceAndDecompiledConversionVisitor[PropertyDescriptorImpl]

'convertPropertyOrFunction' @ [315:19] ==> private final fun convertPropertyOrFunction(declaration: KtNamedDeclaration, navigationKind: SourceNavigationHelper.NavigationKind): KtNamedDeclaration? defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper[SimpleFunctionDescriptorImpl]

'constructor' @ [315:45] ==> value-parameter constructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.SourceAndDecompiledConversionVisitor.visitSecondaryConstructor[ValueParameterDescriptorImpl]

'navigationKind' @ [315:58] ==> private final val navigationKind: SourceNavigationHelper.NavigationKind defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper.SourceAndDecompiledConversionVisitor[PropertyDescriptorImpl]

'mapNotNullTo' @ [319:87] ==> public inline fun <T, R : Any, C : MutableCollection<in KtFile>> Iterable<KtNamedDeclaration>.mapNotNullTo(destination: LinkedHashSet<KtFile> /* = LinkedHashSet<KtFile> */, transform: (KtNamedDeclaration) -> KtFile?): LinkedHashSet<KtFile> /* = LinkedHashSet<KtFile> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration
    <R : Any> -> KtFile
    <C : MutableCollection<in R>> -> LinkedHashSet<KtFile>

'LinkedHashSet' @ [319:100] ==> public final fun <E> <init>(): LinkedHashSet<KtFile> /* = LinkedHashSet<KtFile> */ defined in kotlin.collections.LinkedHashSet[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> KtFile

'it' @ [320:5] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.decompiler.navigation.getContainingFiles.<anonymous>[ValueParameterDescriptorImpl]

'containingFile' @ [320:8] ==> public final val KtNamedDeclaration.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

