'emptyList' @ [77:56] ==> public fun <T> emptyList(): List<KtElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'contextElement' @ [80:36] ==> value-parameter contextElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.<init>[ValueParameterDescriptorImpl]

'getResolutionFacade' @ [80:51] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'KtPsiFactory' @ [82:28] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [82:41] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[PropertyDescriptorImpl]

'createFile' @ [82:50] ==> public final fun createFile(text: String): KtFile defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'allElementsToMove' @ [84:37] ==> value-parameter allElementsToMove: Collection<PsiElement>? = ... defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.<init>[ValueParameterDescriptorImpl]

'elementsToMove' @ [84:58] ==> private final val elementsToMove: Collection<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[PropertyDescriptorImpl]

'this' @ [87:54] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.withSource[ReceiverParameterDescriptorImpl]

'this' @ [88:42] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.withSource.<no name provided>[LazyClassReceiverParameterDescriptor]

'KotlinSourceElement' @ [89:40] ==> public constructor KotlinSourceElement(psi: KtElement) defined in org.jetbrains.kotlin.resolve.source.KotlinSourceElement[DeserializedClassConstructorDescriptor]

'sourceFile' @ [89:60] ==> value-parameter sourceFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.withSource[ValueParameterDescriptorImpl]

'getModuleInfoByVirtualFile' @ [94:13] ==> public fun getModuleInfoByVirtualFile(project: Project, virtualFile: VirtualFile): IdeaModuleInfo? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'project' @ [94:40] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[PropertyDescriptorImpl]

'sourceFile' @ [94:49] ==> value-parameter sourceFile: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.getModuleDescriptor[ValueParameterDescriptorImpl]

'let' @ [94:62] ==> @InlineOnly public inline fun <T, R> IdeaModuleInfo.let(block: (IdeaModuleInfo) -> ModuleDescriptor?): ModuleDescriptor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IdeaModuleInfo
    <R> -> ModuleDescriptor?

'resolutionFacade' @ [94:68] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[PropertyDescriptorImpl]

'findModuleDescriptor' @ [94:85] ==> public fun ResolutionFacade.findModuleDescriptor(ideaModuleInfo: IdeaModuleInfo): ModuleDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'it' @ [94:106] ==> value-parameter it: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.getModuleDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'when (this) {
            is KotlinMoveTargetForExistingElement -> {
                val targetElement = targetElement
                when (targetElement) {
                    is KtNamedDeclaration -> resolutionFacade.resolveToDescriptor(targetElement)

                    is KtFile -> {
                        val packageFragment = resolutionFacade.analyze(targetElement)[BindingContext.FILE_TO_PACKAGE_FRAGMENT, targetElement]
                        packageFragment?.withSource(targetElement)
                    }

                    else -> null
                }
            }

            is KotlinDirectoryBasedMoveTarget -> {
                val packageFqName = targetContainerFqName ?: return null
                val targetDir = directory?.virtualFile ?: targetFile
                val targetModuleDescriptor = if (targetDir != null) {
                    getModuleDescriptor(targetDir) ?: return null
                }
                else {
                    resolutionFacade.moduleDescriptor
                }
                MutablePackageFragmentDescriptor(targetModuleDescriptor, packageFqName).withSource(fakeFile)
            }

            else -> null
        }' @ [97:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: DeclarationDescriptor?, entry1: DeclarationDescriptor?, entry2: DeclarationDescriptor?): DeclarationDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> DeclarationDescriptor?

'this' @ [97:22] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.getContainerDescriptor[ReceiverParameterDescriptorImpl]

'targetElement' @ [99:37] ==> public final val targetElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinMoveTargetForExistingElement[PropertyDescriptorImpl]

'when (targetElement) {
                    is KtNamedDeclaration -> resolutionFacade.resolveToDescriptor(targetElement)

                    is KtFile -> {
                        val packageFragment = resolutionFacade.analyze(targetElement)[BindingContext.FILE_TO_PACKAGE_FRAGMENT, targetElement]
                        packageFragment?.withSource(targetElement)
                    }

                    else -> null
                }' @ [100:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: DeclarationDescriptor?, entry1: DeclarationDescriptor?, entry2: DeclarationDescriptor?): DeclarationDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> DeclarationDescriptor?

'targetElement' @ [100:23] ==> val targetElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.getContainerDescriptor[LocalVariableDescriptor]

'resolutionFacade' @ [101:46] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[PropertyDescriptorImpl]

'resolveToDescriptor' @ [101:63] ==> public abstract fun resolveToDescriptor(declaration: KtDeclaration, bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'targetElement' @ [101:83] ==> val targetElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.getContainerDescriptor[LocalVariableDescriptor]

'resolutionFacade' @ [104:47] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[PropertyDescriptorImpl]

'analyze' @ [104:64] ==> public abstract fun analyze(element: KtElement, bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'targetElement' @ [104:72] ==> val targetElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.getContainerDescriptor[LocalVariableDescriptor]

'FILE_TO_PACKAGE_FRAGMENT' @ [104:102] ==> public final val FILE_TO_PACKAGE_FRAGMENT: (WritableSlice<(KtFile..KtFile?), (PackageFragmentDescriptor..PackageFragmentDescriptor?)>..WritableSlice<(KtFile..KtFile?), (PackageFragmentDescriptor..PackageFragmentDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'targetElement' @ [104:128] ==> val targetElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.getContainerDescriptor[LocalVariableDescriptor]

'packageFragment' @ [105:25] ==> val packageFragment: PackageFragmentDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.getContainerDescriptor[LocalVariableDescriptor]

'withSource' @ [105:42] ==> private final fun PackageFragmentDescriptor.withSource(sourceFile: KtFile): PackageFragmentDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[SimpleFunctionDescriptorImpl]

'targetElement' @ [105:53] ==> val targetElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.getContainerDescriptor[LocalVariableDescriptor]

'targetContainerFqName' @ [113:37] ==> public abstract val targetContainerFqName: FqName? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinMoveTarget[PropertyDescriptorImpl]

'directory' @ [114:33] ==> public abstract val directory: PsiDirectory? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinDirectoryBasedMoveTarget[PropertyDescriptorImpl]

'virtualFile' @ [114:44] ==> public final val PsiDirectory.virtualFile: VirtualFile[MyPropertyDescriptor]

'targetFile' @ [114:59] ==> public abstract val targetFile: VirtualFile? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinMoveTarget[PropertyDescriptorImpl]

'if (targetDir != null) {
                    getModuleDescriptor(targetDir) ?: return null
                }
                else {
                    resolutionFacade.moduleDescriptor
                }' @ [115:46] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ModuleDescriptor, elseBranch: ModuleDescriptor): ModuleDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ModuleDescriptor

'targetDir' @ [115:50] ==> val targetDir: VirtualFile? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.getContainerDescriptor[LocalVariableDescriptor]

'getModuleDescriptor' @ [116:21] ==> private final fun getModuleDescriptor(sourceFile: VirtualFile): ModuleDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[SimpleFunctionDescriptorImpl]

'targetDir' @ [116:41] ==> val targetDir: VirtualFile? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.getContainerDescriptor[LocalVariableDescriptor]

'resolutionFacade' @ [119:21] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[PropertyDescriptorImpl]

'moduleDescriptor' @ [119:38] ==> public abstract val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedPropertyDescriptor]

'MutablePackageFragmentDescriptor' @ [121:17] ==> public constructor MutablePackageFragmentDescriptor(@NotNull p0: ModuleDescriptor, @NotNull p1: FqName) defined in org.jetbrains.kotlin.descriptors.impl.MutablePackageFragmentDescriptor[JavaClassConstructorDescriptor]

'targetModuleDescriptor' @ [121:50] ==> val targetModuleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.getContainerDescriptor[LocalVariableDescriptor]

'packageFqName' @ [121:74] ==> val packageFqName: FqName defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.getContainerDescriptor[LocalVariableDescriptor]

'withSource' @ [121:89] ==> private final fun PackageFragmentDescriptor.withSource(sourceFile: KtFile): PackageFragmentDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[SimpleFunctionDescriptorImpl]

'fakeFile' @ [121:100] ==> private final val fakeFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[PropertyDescriptorImpl]

'when {
            this !is DeclarationDescriptorWithVisibility -> true
            !Visibilities.isVisibleIgnoringReceiver(this, where) -> false
            this is ConstructorDescriptor -> Visibilities.isVisibleIgnoringReceiver(containingDeclaration, where)
            else -> true
        }' @ [129:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'this' @ [130:13] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.isVisibleIn[ReceiverParameterDescriptorImpl]

'!' @ [131:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isVisibleIgnoringReceiver' @ [131:27] ==> public open fun isVisibleIgnoringReceiver(@NotNull p0: DeclarationDescriptorWithVisibility, @NotNull p1: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaMethodDescriptor]

'this' @ [131:53] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.isVisibleIn[ReceiverParameterDescriptorImpl]

'where' @ [131:59] ==> value-parameter where: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.isVisibleIn[ValueParameterDescriptorImpl]

'this' @ [132:13] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.isVisibleIn[ReceiverParameterDescriptorImpl]

'isVisibleIgnoringReceiver' @ [132:59] ==> public open fun isVisibleIgnoringReceiver(@NotNull p0: DeclarationDescriptorWithVisibility, @NotNull p1: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaMethodDescriptor]

'containingDeclaration' @ [132:85] ==> public final val ConstructorDescriptor.containingDeclaration: ClassifierDescriptorWithTypeParameters[MyPropertyDescriptor]

'where' @ [132:108] ==> value-parameter where: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.isVisibleIn[ValueParameterDescriptorImpl]

'?:' @ [138:34] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Visibility?, right: Visibility): Visibility[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Visibility

'this' @ [138:35] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.asPredicted[ReceiverParameterDescriptorImpl]

'visibility' @ [138:82] ==> public final val DeclarationDescriptorWithVisibility.visibility: Visibility[MyPropertyDescriptor]

'if (originalVisibility == Visibilities.PROTECTED && newContainer is PackageFragmentDescriptor) {
            Visibilities.PUBLIC
        } else {
            originalVisibility
        }' @ [139:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Visibility, elseBranch: Visibility): Visibility[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Visibility

'originalVisibility' @ [139:30] ==> val originalVisibility: Visibility defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.asPredicted[LocalVariableDescriptor]

'PROTECTED' @ [139:65] ==> @NotNull public final val PROTECTED: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'newContainer' @ [139:78] ==> value-parameter newContainer: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.asPredicted[ValueParameterDescriptorImpl]

'PUBLIC' @ [140:26] ==> @NotNull public final val PUBLIC: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'originalVisibility' @ [142:13] ==> val originalVisibility: Visibility defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.asPredicted[LocalVariableDescriptor]

'when (this) {
        // We rely on visibility not depending on more specific type of CallableMemberDescriptor
            is CallableMemberDescriptor -> object : CallableMemberDescriptor by this {
                override fun getOriginal() = this
                override fun getContainingDeclaration() = newContainer
                override fun getVisibility(): Visibility = visibility
                override fun getSource() = SourceElement { DescriptorUtils.getContainingSourceFile(newContainer) }
            }
            is ClassDescriptor -> object: ClassDescriptor by this {
                override fun getOriginal() = this
                override fun getContainingDeclaration() = newContainer
                override fun getVisibility(): Visibility = visibility
                override fun getSource() = SourceElement { DescriptorUtils.getContainingSourceFile(newContainer) }
            }
            else -> null
        }' @ [144:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: DeclarationDescriptor?, entry1: DeclarationDescriptor?, entry2: DeclarationDescriptor?): DeclarationDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> DeclarationDescriptor?

'this' @ [144:22] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.asPredicted[ReceiverParameterDescriptorImpl]

'this' @ [146:81] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.asPredicted[ReceiverParameterDescriptorImpl]

'this' @ [147:46] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.asPredicted.<no name provided>[LazyClassReceiverParameterDescriptor]

'newContainer' @ [148:59] ==> value-parameter newContainer: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.asPredicted[ValueParameterDescriptorImpl]

'visibility' @ [149:60] ==> val visibility: Visibility defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.asPredicted[LocalVariableDescriptor]

'SourceElement' @ [150:44] ==> public fun SourceElement(function: () -> SourceFile): SourceElement defined in org.jetbrains.kotlin.descriptors[SimpleFunctionDescriptorImpl]

'getContainingSourceFile' @ [150:76] ==> @NotNull public open fun getContainingSourceFile(@NotNull p0: DeclarationDescriptor): SourceFile defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'newContainer' @ [150:100] ==> value-parameter newContainer: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.asPredicted[ValueParameterDescriptorImpl]

'this' @ [152:62] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.asPredicted[ReceiverParameterDescriptorImpl]

'this' @ [153:46] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.asPredicted.<no name provided>[LazyClassReceiverParameterDescriptor]

'newContainer' @ [154:59] ==> value-parameter newContainer: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.asPredicted[ValueParameterDescriptorImpl]

'visibility' @ [155:60] ==> val visibility: Visibility defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.asPredicted[LocalVariableDescriptor]

'SourceElement' @ [156:44] ==> public fun SourceElement(function: () -> SourceFile): SourceElement defined in org.jetbrains.kotlin.descriptors[SimpleFunctionDescriptorImpl]

'getContainingSourceFile' @ [156:76] ==> @NotNull public open fun getContainingSourceFile(@NotNull p0: DeclarationDescriptor): SourceFile defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'newContainer' @ [156:100] ==> value-parameter newContainer: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.asPredicted[ValueParameterDescriptorImpl]

'getDescription' @ [162:69] ==> public open fun getDescription(@NotNull p0: PsiElement, p1: Boolean): (String..String?) defined in com.intellij.refactoring.util.RefactoringUIUtil[JavaMethodDescriptor]

'declaration' @ [162:84] ==> value-parameter declaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.render[ValueParameterDescriptorImpl]

'?:' @ [169:28] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Module?, right: Module): Module[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Module

'findModuleForFile' @ [169:43] ==> @Nullable public open fun findModuleForFile(@NotNull p0: VirtualFile, @NotNull p1: Project): Module? defined in com.intellij.openapi.module.ModuleUtilCore[JavaMethodDescriptor]

'sourceRoot' @ [169:61] ==> value-parameter sourceRoot: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.analyzeModuleConflictsInUsages[ValueParameterDescriptorImpl]

'project' @ [169:73] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.analyzeModuleConflictsInUsages[ValueParameterDescriptorImpl]

'getInstance' @ [171:49] ==> public open fun getInstance(@NotNull p0: Module): (ModuleRootManager..ModuleRootManager?) defined in com.intellij.openapi.roots.ModuleRootManager[JavaMethodDescriptor]

'targetModule' @ [171:61] ==> val targetModule: Module defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.analyzeModuleConflictsInUsages[LocalVariableDescriptor]

'fileIndex' @ [171:75] ==> public final val ModuleRootManager.fileIndex: ModuleFileIndex[MyPropertyDescriptor]

'isInTestSourceContent' @ [171:85] ==> public abstract fun isInTestSourceContent(@NotNull p0: VirtualFile): Boolean defined in com.intellij.openapi.roots.ModuleFileIndex[JavaMethodDescriptor]

'sourceRoot' @ [171:107] ==> value-parameter sourceRoot: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.analyzeModuleConflictsInUsages[ValueParameterDescriptorImpl]

'usages' @ [172:34] ==> value-parameter usages: Collection<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.analyzeModuleConflictsInUsages[ValueParameterDescriptorImpl]

'usage' @ [173:27] ==> val usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.analyzeModuleConflictsInUsages[LocalVariableDescriptor]

'element' @ [173:33] ==> public final val UsageInfo.element: PsiElement?[MyPropertyDescriptor]

'!=' @ [174:17] ==> public open fun equals(other: Any?): Boolean defined in com.intellij.psi.PsiImportStatement[DeserializedSimpleFunctionDescriptor]

'getParentOfType' @ [174:29] ==> @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(PsiImportStatement..PsiImportStatement?)>, p2: Boolean): PsiImportStatement? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> PsiImportStatement

'element' @ [174:45] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.analyzeModuleConflictsInUsages[LocalVariableDescriptor]

'java' @ [174:80] ==> public val <T> KClass<PsiImportStatement>.java: Class<PsiImportStatement> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PsiImportStatement

'isToBeMoved' @ [175:17] ==> private final fun isToBeMoved(element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[SimpleFunctionDescriptorImpl]

'element' @ [175:29] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.analyzeModuleConflictsInUsages[LocalVariableDescriptor]

'element' @ [177:32] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.analyzeModuleConflictsInUsages[LocalVariableDescriptor]

'resolveScope' @ [177:40] ==> public final val PsiElement.resolveScope: GlobalSearchScope[MyPropertyDescriptor]

'resolveScope' @ [178:17] ==> val resolveScope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.analyzeModuleConflictsInUsages[LocalVariableDescriptor]

'isSearchInModuleContent' @ [178:30] ==> public open fun isSearchInModuleContent(@NotNull p0: Module, p1: Boolean): Boolean defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'targetModule' @ [178:54] ==> val targetModule: Module defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.analyzeModuleConflictsInUsages[LocalVariableDescriptor]

'isInTestSources' @ [178:68] ==> val isInTestSources: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.analyzeModuleConflictsInUsages[LocalVariableDescriptor]

'element' @ [180:29] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.analyzeModuleConflictsInUsages[LocalVariableDescriptor]

'containingFile' @ [180:37] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'usageFile' @ [181:30] ==> val usageFile: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.analyzeModuleConflictsInUsages[LocalVariableDescriptor]

'virtualFile' @ [181:40] ==> public final val PsiFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'?:' @ [182:31] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Module?, right: Module): Module[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Module

'findModuleForFile' @ [182:46] ==> @Nullable public open fun findModuleForFile(@NotNull p0: VirtualFile, @NotNull p1: Project): Module? defined in com.intellij.openapi.module.ModuleUtilCore[JavaMethodDescriptor]

'usageVFile' @ [182:64] ==> val usageVFile: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.analyzeModuleConflictsInUsages[LocalVariableDescriptor]

'project' @ [182:76] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.analyzeModuleConflictsInUsages[ValueParameterDescriptorImpl]

'getDescription' @ [183:54] ==> public open fun getDescription(@NotNull p0: PsiElement, p1: Boolean): (String..String?) defined in com.intellij.refactoring.util.RefactoringUIUtil[JavaMethodDescriptor]

'element' @ [183:69] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.analyzeModuleConflictsInUsages[LocalVariableDescriptor]

'getUsageContext' @ [183:77] ==> public fun PsiElement.getUsageContext(): PsiElement defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'?:' @ [184:37] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiElement?, right: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiElement

'if (usage is MoveRenameUsageInfo) usage.referencedElement else usage.element' @ [184:38] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement?, elseBranch: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement?

'usage' @ [184:42] ==> val usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.analyzeModuleConflictsInUsages[LocalVariableDescriptor]

'usage' @ [184:72] ==> val usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.analyzeModuleConflictsInUsages[LocalVariableDescriptor]

'referencedElement' @ [184:78] ==> public final val MoveRenameUsageInfo.referencedElement: PsiElement?[MyPropertyDescriptor]

'usage' @ [184:101] ==> val usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.analyzeModuleConflictsInUsages[LocalVariableDescriptor]

'element' @ [184:107] ==> public final val UsageInfo.element: PsiElement?[MyPropertyDescriptor]

'error' @ [184:119] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'usage' @ [184:125] ==> val usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.analyzeModuleConflictsInUsages[LocalVariableDescriptor]

'if (usageModule == targetModule && isInTestSources) {
                RefactoringBundle.message("0.referenced.in.1.will.not.be.accessible.from.production.of.module.2",
                                          RefactoringUIUtil.getDescription(referencedElement, true),
                                          scopeDescription,
                                          CommonRefactoringUtil.htmlEmphasize(usageModule.name))
            }
            else {
                RefactoringBundle.message("0.referenced.in.1.will.not.be.accessible.from.module.2",
                                          RefactoringUIUtil.getDescription(referencedElement, true),
                                          scopeDescription,
                                          CommonRefactoringUtil.htmlEmphasize(usageModule.name))
            }' @ [185:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (String..String?), elseBranch: (String..String?)): (String..String?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.String..kotlin.String?)

'usageModule' @ [185:31] ==> val usageModule: Module defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.analyzeModuleConflictsInUsages[LocalVariableDescriptor]

'targetModule' @ [185:46] ==> val targetModule: Module defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.analyzeModuleConflictsInUsages[LocalVariableDescriptor]

'isInTestSources' @ [185:62] ==> val isInTestSources: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.analyzeModuleConflictsInUsages[LocalVariableDescriptor]

'message' @ [186:35] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'getDescription' @ [187:61] ==> public open fun getDescription(@NotNull p0: PsiElement, p1: Boolean): (String..String?) defined in com.intellij.refactoring.util.RefactoringUIUtil[JavaMethodDescriptor]

'referencedElement' @ [187:76] ==> val referencedElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.analyzeModuleConflictsInUsages[LocalVariableDescriptor]

'scopeDescription' @ [188:43] ==> val scopeDescription: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.analyzeModuleConflictsInUsages[LocalVariableDescriptor]

'htmlEmphasize' @ [189:65] ==> public open fun htmlEmphasize(@NotNull p0: String): (String..String?) defined in com.intellij.refactoring.util.CommonRefactoringUtil[JavaMethodDescriptor]

'usageModule' @ [189:79] ==> val usageModule: Module defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.analyzeModuleConflictsInUsages[LocalVariableDescriptor]

'name' @ [189:91] ==> public final val Module.name: String[MyPropertyDescriptor]

'message' @ [192:35] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'getDescription' @ [193:61] ==> public open fun getDescription(@NotNull p0: PsiElement, p1: Boolean): (String..String?) defined in com.intellij.refactoring.util.RefactoringUIUtil[JavaMethodDescriptor]

'referencedElement' @ [193:76] ==> val referencedElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.analyzeModuleConflictsInUsages[LocalVariableDescriptor]

'scopeDescription' @ [194:43] ==> val scopeDescription: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.analyzeModuleConflictsInUsages[LocalVariableDescriptor]

'htmlEmphasize' @ [195:65] ==> public open fun htmlEmphasize(@NotNull p0: String): (String..String?) defined in com.intellij.refactoring.util.CommonRefactoringUtil[JavaMethodDescriptor]

'usageModule' @ [195:79] ==> val usageModule: Module defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.analyzeModuleConflictsInUsages[LocalVariableDescriptor]

'name' @ [195:91] ==> public final val Module.name: String[MyPropertyDescriptor]

'conflicts' @ [197:13] ==> value-parameter conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.analyzeModuleConflictsInUsages[ValueParameterDescriptorImpl]

'putValue' @ [197:23] ==> public open fun putValue(@Nullable p0: PsiElement?, p1: (String..String?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'referencedElement' @ [197:32] ==> val referencedElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.analyzeModuleConflictsInUsages[LocalVariableDescriptor]

'capitalize' @ [197:73] ==> public open fun capitalize(@NotNull p0: String): (String..String?) defined in com.intellij.refactoring.util.CommonRefactoringUtil[JavaMethodDescriptor]

'message' @ [197:84] ==> val message: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.analyzeModuleConflictsInUsages[LocalVariableDescriptor]

'MultiMap' @ [202:28] ==> public constructor MultiMap<K : (Any..Any?), V : (Any..Any?)>() defined in com.intellij.util.containers.MultiMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> String

'moveTarget' @ [203:26] ==> private final val moveTarget: KotlinMoveTarget defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[PropertyDescriptorImpl]

'targetFile' @ [203:37] ==> public abstract val targetFile: VirtualFile? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinMoveTarget[PropertyDescriptorImpl]

'analyzeModuleConflictsInUsages' @ [205:9] ==> public final fun analyzeModuleConflictsInUsages(project: Project, usages: Collection<UsageInfo>, sourceRoot: VirtualFile, conflicts: MultiMap<PsiElement, String>): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[SimpleFunctionDescriptorImpl]

'project' @ [205:40] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[PropertyDescriptorImpl]

'externalUsages' @ [205:49] ==> value-parameter externalUsages: MutableSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInUsages[ValueParameterDescriptorImpl]

'sourceRoot' @ [205:65] ==> val sourceRoot: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInUsages[LocalVariableDescriptor]

'newConflicts' @ [205:77] ==> val newConflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInUsages[LocalVariableDescriptor]

'!' @ [206:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'newConflicts' @ [206:14] ==> val newConflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInUsages[LocalVariableDescriptor]

'isEmpty' @ [206:27] ==> public final val <K : (Any..Any?), V : (Any..Any?)> MultiMap<PsiElement, String>.isEmpty: Boolean[MyPropertyDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> String

'newConflicts' @ [207:44] ==> val newConflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInUsages[LocalVariableDescriptor]

'keySet' @ [207:57] ==> @NotNull public open fun keySet(): (MutableSet<(PsiElement..PsiElement?)>..Set<(PsiElement..PsiElement?)>) defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'mapNotNullTo' @ [207:66] ==> public inline fun <T, R : Any, C : MutableCollection<in PsiNamedElement>> Iterable<(PsiElement..PsiElement?)>.mapNotNullTo(destination: HashSet<PsiNamedElement>, transform: ((PsiElement..PsiElement?)) -> PsiNamedElement?): HashSet<PsiNamedElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <R : Any> -> PsiNamedElement
    <C : MutableCollection<in R>> -> HashSet<PsiNamedElement>

'HashSet' @ [207:79] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiNamedElement

'it' @ [207:92] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInUsages.<anonymous>[ValueParameterDescriptorImpl]

'namedUnwrappedElement' @ [207:95] ==> public val PsiElement.namedUnwrappedElement: PsiNamedElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'externalUsages' @ [208:13] ==> value-parameter externalUsages: MutableSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInUsages[ValueParameterDescriptorImpl]

'removeIf' @ [208:28] ==> public final fun removeIf(p0: (UsageInfo) -> Boolean): Boolean defined in kotlin.collections.MutableSet[MyFunctionDescriptor]

'it' @ [209:17] ==> value-parameter it: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInUsages.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [210:17] ==> value-parameter it: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInUsages.<anonymous>[ValueParameterDescriptorImpl]

'referencedElement' @ [210:20] ==> public final val MoveRenameUsageInfo.referencedElement: PsiElement?[MyPropertyDescriptor]

'namedUnwrappedElement' @ [210:39] ==> public val PsiElement.namedUnwrappedElement: PsiNamedElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'let' @ [210:62] ==> @InlineOnly public inline fun <T, R> PsiNamedElement.let(block: (PsiNamedElement) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiNamedElement
    <R> -> Boolean

'it' @ [210:68] ==> value-parameter it: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInUsages.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'referencedElementsToSkip' @ [210:74] ==> val referencedElementsToSkip: HashSet<PsiNamedElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInUsages[LocalVariableDescriptor]

'conflicts' @ [212:13] ==> value-parameter conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInUsages[ValueParameterDescriptorImpl]

'putAllValues' @ [212:23] ==> public open fun <Kk : (PsiElement..PsiElement?), Vv : (String..String?)> putAllValues(@NotNull p0: MultiMap<(PsiElement..PsiElement?), (String..String?)>): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]
Inferred types:
    <Kk : (PsiElement..PsiElement?)> -> PsiElement
    <Vv : (String..String?)> -> String

'newConflicts' @ [212:36] ==> val newConflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInUsages[LocalVariableDescriptor]

'DescriptorRenderer' @ [217:58] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'withOptions' @ [217:77] ==> public final fun withOptions(changeOptions: DescriptorRendererOptions.() -> Unit): DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedSimpleFunctionDescriptor]

'withDefinedIn' @ [218:13] ==> public abstract var withDefinedIn: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'classifierNamePolicy' @ [219:13] ==> public abstract var classifierNamePolicy: ClassifierNamePolicy defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'FULLY_QUALIFIED' @ [219:57] ==> public object FULLY_QUALIFIED : ClassifierNamePolicy defined in org.jetbrains.kotlin.renderer.ClassifierNamePolicy[FakeCallableDescriptorForObject]

'modifiers' @ [220:13] ==> public abstract var modifiers: Set<DescriptorRendererModifier> defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'emptySet' @ [220:25] ==> public fun <T> emptySet(): Set<DescriptorRendererModifier> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DescriptorRendererModifier

'withoutTypeParameters' @ [221:13] ==> public abstract var withoutTypeParameters: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'parameterNameRenderingPolicy' @ [222:13] ==> public abstract var parameterNameRenderingPolicy: ParameterNameRenderingPolicy defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'NONE' @ [222:73] ==> enum entry NONE defined in org.jetbrains.kotlin.renderer.ParameterNameRenderingPolicy[FakeCallableDescriptorForObject]

'includeAdditionalModifiers' @ [223:13] ==> public abstract var includeAdditionalModifiers: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'renderUnabbreviatedType' @ [224:13] ==> public abstract var renderUnabbreviatedType: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'withoutSuperTypes' @ [225:13] ==> public abstract var withoutSuperTypes: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'moduleWithDependenciesAndLibrariesScope' @ [230:43] ==> @NotNull public open fun moduleWithDependenciesAndLibrariesScope(@NotNull p0: Module): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'this' @ [230:83] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.getScopeWithPlatformAwareDependencies[ReceiverParameterDescriptorImpl]

'getPlatform' @ [232:53] ==> @NotNull public open fun getPlatform(@NotNull p0: Module): TargetPlatform defined in org.jetbrains.kotlin.idea.project.TargetPlatformDetector[JavaMethodDescriptor]

'this' @ [232:65] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.getScopeWithPlatformAwareDependencies[ReceiverParameterDescriptorImpl]

'targetPlatform' @ [233:13] ==> val targetPlatform: TargetPlatform defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.getScopeWithPlatformAwareDependencies[LocalVariableDescriptor]

'baseScope' @ [233:51] ==> val baseScope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.getScopeWithPlatformAwareDependencies[LocalVariableDescriptor]

'getInstance' @ [235:34] ==> public open fun getInstance(@NotNull p0: Module): (ModuleRootManager..ModuleRootManager?) defined in com.intellij.openapi.roots.ModuleRootManager[JavaMethodDescriptor]

'this' @ [235:46] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.getScopeWithPlatformAwareDependencies[ReceiverParameterDescriptorImpl]

'orderEntries' @ [236:18] ==> public final val ModuleRootManager.orderEntries: (Array<(OrderEntry..OrderEntry?)>..Array<out (OrderEntry..OrderEntry?)>)[MyPropertyDescriptor]

'filterIsInstance' @ [237:18] ==> public inline fun <reified R> Array<*>.filterIsInstance(): List<JdkOrderEntry> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> JdkOrderEntry

'fold' @ [238:18] ==> public inline fun <T, R> Iterable<JdkOrderEntry>.fold(initial: SearchScope, operation: (SearchScope, JdkOrderEntry) -> SearchScope): SearchScope defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JdkOrderEntry
    <R> -> SearchScope

'baseScope' @ [238:23] ==> val baseScope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.getScopeWithPlatformAwareDependencies[LocalVariableDescriptor]

'scope' @ [238:70] ==> value-parameter scope: SearchScope defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.getScopeWithPlatformAwareDependencies.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [238:80] ==> public operator fun GlobalSearchScope.not(): GlobalSearchScope defined in org.jetbrains.kotlin.idea.search[DeserializedSimpleFunctionDescriptor]

'JdkScope' @ [238:81] ==> public constructor JdkScope(p0: (Project..Project?), p1: (JdkOrderEntry..JdkOrderEntry?)) defined in com.intellij.openapi.module.impl.scopes.JdkScope[JavaClassConstructorDescriptor]

'project' @ [238:90] ==> public final val Module.project: Project[MyPropertyDescriptor]

'jdkEntry' @ [238:99] ==> value-parameter jdkEntry: JdkOrderEntry defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.getScopeWithPlatformAwareDependencies.<anonymous>[ValueParameterDescriptorImpl]

'moveTarget' @ [245:26] ==> private final val moveTarget: KotlinMoveTarget defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[PropertyDescriptorImpl]

'targetFile' @ [245:37] ==> public abstract val targetFile: VirtualFile? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinMoveTarget[PropertyDescriptorImpl]

'?:' @ [246:28] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Module?, right: Module): Module[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Module

'findModuleForFile' @ [246:43] ==> @Nullable public open fun findModuleForFile(@NotNull p0: VirtualFile, @NotNull p1: Project): Module? defined in com.intellij.openapi.module.ModuleUtilCore[JavaMethodDescriptor]

'sourceRoot' @ [246:61] ==> val sourceRoot: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations[LocalVariableDescriptor]

'project' @ [246:73] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[PropertyDescriptorImpl]

'targetModule' @ [247:28] ==> val targetModule: Module defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations[LocalVariableDescriptor]

'getScopeWithPlatformAwareDependencies' @ [247:41] ==> private final fun Module.getScopeWithPlatformAwareDependencies(): SearchScope defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[SimpleFunctionDescriptorImpl]

'targetElement' @ [250:17] ==> value-parameter targetElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.isInScope[ValueParameterDescriptorImpl]

'resolveScope' @ [250:34] ==> val resolveScope: SearchScope defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations[LocalVariableDescriptor]

'targetElement' @ [251:17] ==> value-parameter targetElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.isInScope[ValueParameterDescriptorImpl]

'manager' @ [251:31] ==> public final val PsiElement.manager: (PsiManager..PsiManager?)[MyPropertyDescriptor]

'isInProject' @ [251:39] ==> public abstract fun isInProject(@NotNull p0: PsiElement): Boolean defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'targetElement' @ [251:51] ==> value-parameter targetElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.isInScope[ValueParameterDescriptorImpl]

'targetDescriptor' @ [253:26] ==> value-parameter targetDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.isInScope[ValueParameterDescriptorImpl]

'importableFqName' @ [253:43] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'targetDescriptor' @ [254:40] ==> value-parameter targetDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.isInScope[ValueParameterDescriptorImpl]

'getImportableDescriptor' @ [254:57] ==> public fun DeclarationDescriptor.getImportableDescriptor(): DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'DESCRIPTOR_RENDERER_FOR_COMPARISON' @ [255:44] ==> private final val DESCRIPTOR_RENDERER_FOR_COMPARISON: DescriptorRenderer defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.Companion[PropertyDescriptorImpl]

'render' @ [255:79] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'importableDescriptor' @ [255:86] ==> val importableDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.isInScope[LocalVariableDescriptor]

'lazy' @ [256:35] ==> public fun <T> lazy(initializer: () -> String): Lazy<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'DESCRIPTOR_RENDERER_FOR_COMPARISON' @ [256:42] ==> private final val DESCRIPTOR_RENDERER_FOR_COMPARISON: DescriptorRenderer defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.Companion[PropertyDescriptorImpl]

'render' @ [256:77] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'targetDescriptor' @ [256:84] ==> value-parameter targetDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.isInScope[ValueParameterDescriptorImpl]

'getModuleInfoByVirtualFile' @ [258:36] ==> public fun getModuleInfoByVirtualFile(project: Project, virtualFile: VirtualFile): IdeaModuleInfo? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'project' @ [258:63] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[PropertyDescriptorImpl]

'sourceRoot' @ [258:72] ==> val sourceRoot: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations[LocalVariableDescriptor]

'KtPsiFactory' @ [259:29] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'targetElement' @ [259:42] ==> value-parameter targetElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.isInScope[ValueParameterDescriptorImpl]

'project' @ [259:56] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'createFile' @ [259:65] ==> public final fun createFile(fileName: String, text: String): KtFile defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'apply' @ [259:92] ==> @InlineOnly public inline fun <T> KtFile.apply(block: KtFile.() -> Unit): KtFile defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'moduleInfo' @ [260:17] ==> public var PsiFile.moduleInfo: ModuleInfo? defined in org.jetbrains.kotlin.psi[DeserializedPropertyDescriptor]

'targetModuleInfo' @ [260:30] ==> val targetModuleInfo: IdeaModuleInfo? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.isInScope[LocalVariableDescriptor]

'targetPlatform' @ [261:17] ==> public var KtFile.targetPlatform: TargetPlatform? defined in org.jetbrains.kotlin.psi[DeserializedPropertyDescriptor]

'getPlatform' @ [261:57] ==> @NotNull public open fun getPlatform(@NotNull p0: Module): TargetPlatform defined in org.jetbrains.kotlin.idea.project.TargetPlatformDetector[JavaMethodDescriptor]

'targetModule' @ [261:69] ==> val targetModule: Module defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations[LocalVariableDescriptor]

'dummyFile' @ [264:40] ==> val dummyFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.isInScope[LocalVariableDescriptor]

'resolveImportReference' @ [264:50] ==> public fun KtFile.resolveImportReference(fqName: FqName): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'fqName' @ [264:73] ==> val fqName: FqName defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.isInScope[LocalVariableDescriptor]

'newTargetDescriptors' @ [266:20] ==> val newTargetDescriptors: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.isInScope[LocalVariableDescriptor]

'any' @ [266:41] ==> public inline fun <T> Iterable<DeclarationDescriptor>.any(predicate: (DeclarationDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'DESCRIPTOR_RENDERER_FOR_COMPARISON' @ [267:21] ==> private final val DESCRIPTOR_RENDERER_FOR_COMPARISON: DescriptorRenderer defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.Companion[PropertyDescriptorImpl]

'render' @ [267:56] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'it' @ [267:63] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.isInScope.<anonymous>[ValueParameterDescriptorImpl]

'renderedImportableTarget' @ [267:70] ==> val renderedImportableTarget: String defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.isInScope[LocalVariableDescriptor]

'importableDescriptor' @ [268:21] ==> val importableDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.isInScope[LocalVariableDescriptor]

'targetDescriptor' @ [268:45] ==> value-parameter targetDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.isInScope[ValueParameterDescriptorImpl]

'when (targetDescriptor) {
                    is ConstructorDescriptor -> {
                        (it as? ClassDescriptor)?.constructors ?: emptyList<DeclarationDescriptor>()
                    }

                    is PropertyAccessorDescriptor -> {
                        (it as? PropertyDescriptor)
                                ?.let { if (targetDescriptor is PropertyGetterDescriptor) it.getter else it.setter }
                                ?.let { listOf(it) }
                        ?: emptyList<DeclarationDescriptor>()
                    }

                    else -> emptyList()
                }' @ [270:79] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Collection<DeclarationDescriptor>, entry1: Collection<DeclarationDescriptor>, entry2: Collection<DeclarationDescriptor>): Collection<DeclarationDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Collection<DeclarationDescriptor>

'targetDescriptor' @ [270:85] ==> value-parameter targetDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.isInScope[ValueParameterDescriptorImpl]

'?:' @ [272:25] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Collection<(DeclarationDescriptor..DeclarationDescriptor?)>?, right: Collection<(DeclarationDescriptor..DeclarationDescriptor?)>): Collection<(DeclarationDescriptor..DeclarationDescriptor?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Collection<(org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)>

'it' @ [272:26] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.isInScope.<anonymous>[ValueParameterDescriptorImpl]

'constructors' @ [272:51] ==> public final val ClassDescriptor.constructors: Collection<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>[MyPropertyDescriptor]

'emptyList' @ [272:67] ==> public fun <T> emptyList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'?:' @ [276:25] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: List<DeclarationDescriptor>?, right: List<DeclarationDescriptor>): List<DeclarationDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> List<DeclarationDescriptor>

'it' @ [276:26] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.isInScope.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [277:35] ==> @InlineOnly public inline fun <T, R> PropertyDescriptor.let(block: (PropertyDescriptor) -> PropertyAccessorDescriptor?): PropertyAccessorDescriptor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyDescriptor
    <R> -> PropertyAccessorDescriptor?

'if (targetDescriptor is PropertyGetterDescriptor) it.getter else it.setter' @ [277:41] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PropertyAccessorDescriptor?, elseBranch: PropertyAccessorDescriptor?): PropertyAccessorDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PropertyAccessorDescriptor?

'targetDescriptor' @ [277:45] ==> value-parameter targetDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.isInScope[ValueParameterDescriptorImpl]

'it' @ [277:91] ==> value-parameter it: PropertyDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.isInScope.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getter' @ [277:94] ==> public abstract val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'it' @ [277:106] ==> value-parameter it: PropertyDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.isInScope.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'setter' @ [277:109] ==> public abstract val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'let' @ [278:35] ==> @InlineOnly public inline fun <T, R> PropertyAccessorDescriptor.let(block: (PropertyAccessorDescriptor) -> List<PropertyAccessorDescriptor>): List<PropertyAccessorDescriptor> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyAccessorDescriptor
    <R> -> List<PropertyAccessorDescriptor>

'listOf' @ [278:41] ==> public fun <T> listOf(element: PropertyAccessorDescriptor): List<PropertyAccessorDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyAccessorDescriptor

'it' @ [278:48] ==> value-parameter it: PropertyAccessorDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.isInScope.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'emptyList' @ [279:28] ==> public fun <T> emptyList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'emptyList' @ [282:29] ==> public fun <T> emptyList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'candidateDescriptors' @ [285:17] ==> val candidateDescriptors: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.isInScope.<anonymous>[LocalVariableDescriptor]

'any' @ [285:38] ==> public inline fun <T> Iterable<DeclarationDescriptor>.any(predicate: (DeclarationDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'DESCRIPTOR_RENDERER_FOR_COMPARISON' @ [285:44] ==> private final val DESCRIPTOR_RENDERER_FOR_COMPARISON: DescriptorRenderer defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.Companion[PropertyDescriptorImpl]

'render' @ [285:79] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'it' @ [285:86] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.isInScope.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'renderedTarget' @ [285:93] ==> val renderedTarget: String defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.isInScope[LocalVariableDescriptor]

'HashSet' @ [289:32] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtReferenceExpression

'elementsToMove' @ [290:29] ==> private final val elementsToMove: Collection<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[PropertyDescriptorImpl]

'doNotGoIn' @ [290:46] ==> private final val doNotGoIn: Collection<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[PropertyDescriptorImpl]

'declaration' @ [291:13] ==> val declaration: KtElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations[LocalVariableDescriptor]

'forEachDescendantOfType' @ [291:25] ==> public inline fun <reified T : PsiElement> PsiElement.forEachDescendantOfType(noinline action: (KtReferenceExpression) -> Unit): Unit defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtReferenceExpression

'refExpr' @ [292:40] ==> value-parameter refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'analyze' @ [292:48] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [292:72] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'REFERENCE_TARGET' @ [292:96] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'refExpr' @ [292:114] ==> value-parameter refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'isBuiltIn' @ [294:36] ==> public open fun isBuiltIn(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'targetDescriptor' @ [294:46] ==> val targetDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.<anonymous>[LocalVariableDescriptor]

'DescriptorToSourceUtilsIde' @ [296:30] ==> public object DescriptorToSourceUtilsIde defined in org.jetbrains.kotlin.idea.codeInsight[FakeCallableDescriptorForObject]

'getAnyDeclaration' @ [296:57] ==> public final fun getAnyDeclaration(project: Project, descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[DeserializedSimpleFunctionDescriptor]

'project' @ [296:75] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[PropertyDescriptorImpl]

'targetDescriptor' @ [296:84] ==> val targetDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.<anonymous>[LocalVariableDescriptor]

'isToBeMoved' @ [298:21] ==> private final fun isToBeMoved(element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[SimpleFunctionDescriptorImpl]

'target' @ [298:33] ==> val target: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.<anonymous>[LocalVariableDescriptor]

'isInScope' @ [300:21] ==> local final fun isInScope(targetElement: PsiElement, targetDescriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations[SimpleFunctionDescriptorImpl]

'target' @ [300:31] ==> val target: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.<anonymous>[LocalVariableDescriptor]

'targetDescriptor' @ [300:39] ==> val targetDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.<anonymous>[LocalVariableDescriptor]

'target' @ [301:21] ==> val target: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.<anonymous>[LocalVariableDescriptor]

'SmartSet' @ [303:36] ==> public companion object defined in org.jetbrains.kotlin.utils.SmartSet[FakeCallableDescriptorForObject]

'create' @ [303:45] ==> @JvmStatic public final fun <T> create(): SmartSet<PsiMethod> defined in org.jetbrains.kotlin.utils.SmartSet.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod

'target' @ [304:17] ==> val target: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.<anonymous>[LocalVariableDescriptor]

'toLightMethods' @ [304:24] ==> public fun PsiElement.toLightMethods(): List<PsiMethod> defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'forEach' @ [304:41] ==> @HidesMembers public inline fun <T> Iterable<PsiMethod>.forEach(action: (PsiMethod) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod

'superMethods' @ [304:51] ==> val superMethods: SmartSet<PsiMethod> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.<anonymous>[LocalVariableDescriptor]

'it' @ [304:67] ==> value-parameter it: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'findDeepestSuperMethods' @ [304:70] ==> @NotNull public abstract fun findDeepestSuperMethods(): (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>) defined in com.intellij.psi.PsiMethod[JavaMethodDescriptor]

'superMethods' @ [305:21] ==> val superMethods: SmartSet<PsiMethod> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.<anonymous>[LocalVariableDescriptor]

'any' @ [305:34] ==> public inline fun <T> Iterable<(PsiMethod..PsiMethod?)>.any(predicate: ((PsiMethod..PsiMethod?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'isInScope' @ [305:40] ==> local final fun isInScope(targetElement: PsiElement, targetDescriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations[SimpleFunctionDescriptorImpl]

'it' @ [305:50] ==> value-parameter it: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'targetDescriptor' @ [305:54] ==> val targetDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.<anonymous>[LocalVariableDescriptor]

'refExpr' @ [307:36] ==> value-parameter refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'getStrictParentOfType' @ [307:44] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtNamedDeclaration? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtNamedDeclaration

'getDescription' @ [308:58] ==> public open fun getDescription(@NotNull p0: PsiElement, p1: Boolean): (String..String?) defined in com.intellij.refactoring.util.RefactoringUIUtil[JavaMethodDescriptor]

'refContainer' @ [308:73] ==> val refContainer: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.<anonymous>[LocalVariableDescriptor]

'message' @ [309:49] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'getDescription' @ [310:75] ==> public open fun getDescription(@NotNull p0: PsiElement, p1: Boolean): (String..String?) defined in com.intellij.refactoring.util.RefactoringUIUtil[JavaMethodDescriptor]

'target' @ [310:90] ==> val target: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.<anonymous>[LocalVariableDescriptor]

'scopeDescription' @ [311:57] ==> val scopeDescription: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.<anonymous>[LocalVariableDescriptor]

'htmlEmphasize' @ [312:79] ==> public open fun htmlEmphasize(@NotNull p0: String): (String..String?) defined in com.intellij.refactoring.util.CommonRefactoringUtil[JavaMethodDescriptor]

'targetModule' @ [312:93] ==> val targetModule: Module defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations[LocalVariableDescriptor]

'name' @ [312:106] ==> public final val Module.name: String[MyPropertyDescriptor]

'conflicts' @ [313:17] ==> value-parameter conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations[ValueParameterDescriptorImpl]

'putValue' @ [313:27] ==> public open fun putValue(@Nullable p0: PsiElement?, p1: (String..String?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'target' @ [313:36] ==> val target: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.<anonymous>[LocalVariableDescriptor]

'capitalize' @ [313:66] ==> public open fun capitalize(@NotNull p0: String): (String..String?) defined in com.intellij.refactoring.util.CommonRefactoringUtil[JavaMethodDescriptor]

'message' @ [313:77] ==> val message: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.<anonymous>[LocalVariableDescriptor]

'referencesToSkip' @ [314:17] ==> val referencesToSkip: HashSet<KtReferenceExpression> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations[LocalVariableDescriptor]

'refExpr' @ [314:37] ==> value-parameter refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'internalUsages' @ [317:9] ==> value-parameter internalUsages: MutableSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations[ValueParameterDescriptorImpl]

'removeIf' @ [317:24] ==> public final fun removeIf(p0: (UsageInfo) -> Boolean): Boolean defined in kotlin.collections.MutableSet[MyFunctionDescriptor]

'it' @ [317:35] ==> value-parameter it: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'reference' @ [317:38] ==> public final val UsageInfo.reference: PsiReference?[MyPropertyDescriptor]

'element' @ [317:49] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'let' @ [317:58] ==> @InlineOnly public inline fun <T, R> PsiElement.let(block: (PsiElement) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> Boolean

'it' @ [317:64] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'referencesToSkip' @ [317:70] ==> val referencesToSkip: HashSet<KtReferenceExpression> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkModuleConflictsInDeclarations[LocalVariableDescriptor]

'HashMap' @ [321:39] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtNamedDeclaration
    <V : (Any..Any?)> -> MutableSet<PsiElement>

'usages' @ [322:23] ==> value-parameter usages: Collection<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInUsages[ValueParameterDescriptorImpl]

'usage' @ [323:27] ==> val usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInUsages[LocalVariableDescriptor]

'element' @ [323:33] ==> public final val UsageInfo.element: PsiElement?[MyPropertyDescriptor]

'element' @ [324:17] ==> val element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInUsages[LocalVariableDescriptor]

'usage' @ [324:36] ==> val usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInUsages[LocalVariableDescriptor]

'usage' @ [324:69] ==> val usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInUsages[LocalVariableDescriptor]

'isToBeMoved' @ [326:17] ==> private final fun isToBeMoved(element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[SimpleFunctionDescriptorImpl]

'element' @ [326:29] ==> val element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInUsages[LocalVariableDescriptor]

'usage' @ [328:37] ==> val usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInUsages[LocalVariableDescriptor]

'referencedElement' @ [328:43] ==> public final val MoveRenameUsageInfo.referencedElement: PsiElement?[MyPropertyDescriptor]

'namedUnwrappedElement' @ [328:62] ==> public val PsiElement.namedUnwrappedElement: PsiNamedElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'resolutionFacade' @ [329:40] ==> private final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[PropertyDescriptorImpl]

'resolveToDescriptor' @ [329:57] ==> public abstract fun resolveToDescriptor(declaration: KtDeclaration, bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'referencedElement' @ [329:77] ==> val referencedElement: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInUsages[LocalVariableDescriptor]

'element' @ [331:29] ==> val element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInUsages[LocalVariableDescriptor]

'getUsageContext' @ [331:37] ==> public fun PsiElement.getUsageContext(): PsiElement defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'!' @ [332:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'declarationToContainers' @ [332:18] ==> val declarationToContainers: HashMap<KtNamedDeclaration, MutableSet<PsiElement>> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInUsages[LocalVariableDescriptor]

'getOrPut' @ [332:42] ==> public inline fun <K, V> MutableMap<KtNamedDeclaration, MutableSet<PsiElement>>.getOrPut(key: KtNamedDeclaration, defaultValue: () -> MutableSet<PsiElement>): MutableSet<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtNamedDeclaration
    <V> -> MutableSet<PsiElement>

'referencedElement' @ [332:51] ==> val referencedElement: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInUsages[LocalVariableDescriptor]

'HashSet' @ [332:72] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiElement

'add' @ [332:96] ==> public abstract fun add(element: PsiElement): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'container' @ [332:100] ==> val container: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInUsages[LocalVariableDescriptor]

'when (container) {
                                            is KtDeclaration -> container.resolveToDescriptor()
                                            is PsiMember -> container.getJavaMemberDescriptor()
                                            else -> null
                                        }' @ [334:41] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: DeclarationDescriptor?, entry1: DeclarationDescriptor?, entry2: DeclarationDescriptor?): DeclarationDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> DeclarationDescriptor?

'container' @ [334:47] ==> val container: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInUsages[LocalVariableDescriptor]

'container' @ [335:65] ==> val container: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInUsages[LocalVariableDescriptor]

'resolveToDescriptor' @ [335:75] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'container' @ [336:61] ==> val container: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInUsages[LocalVariableDescriptor]

'getJavaMemberDescriptor' @ [336:71] ==> @JvmOverloads public fun PsiMember.getJavaMemberDescriptor(resolutionFacade: ResolutionFacade? = ...): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'moveTarget' @ [339:35] ==> private final val moveTarget: KotlinMoveTarget defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[PropertyDescriptorImpl]

'getContainerDescriptor' @ [339:46] ==> private final fun KotlinMoveTarget.getContainerDescriptor(): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[SimpleFunctionDescriptorImpl]

'referencedDescriptor' @ [340:37] ==> val referencedDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInUsages[LocalVariableDescriptor]

'asPredicted' @ [340:58] ==> private final fun DeclarationDescriptor.asPredicted(newContainer: DeclarationDescriptor): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[SimpleFunctionDescriptorImpl]

'targetContainer' @ [340:70] ==> val targetContainer: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInUsages[LocalVariableDescriptor]

'referencedDescriptor' @ [342:17] ==> val referencedDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInUsages[LocalVariableDescriptor]

'isVisibleIn' @ [342:38] ==> private final fun DeclarationDescriptor.isVisibleIn(where: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[SimpleFunctionDescriptorImpl]

'referencingDescriptor' @ [342:50] ==> val referencingDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInUsages[LocalVariableDescriptor]

'!' @ [342:76] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptorToCheck' @ [342:77] ==> val descriptorToCheck: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInUsages[LocalVariableDescriptor]

'isVisibleIn' @ [342:95] ==> private final fun DeclarationDescriptor.isVisibleIn(where: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[SimpleFunctionDescriptorImpl]

'referencingDescriptor' @ [342:107] ==> val referencingDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInUsages[LocalVariableDescriptor]

'render' @ [343:34] ==> private final fun render(declaration: PsiElement): (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[SimpleFunctionDescriptorImpl]

'container' @ [343:41] ==> val container: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInUsages[LocalVariableDescriptor]

'render' @ [343:60] ==> private final fun render(declaration: PsiElement): (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[SimpleFunctionDescriptorImpl]

'referencedElement' @ [343:67] ==> val referencedElement: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInUsages[LocalVariableDescriptor]

'conflicts' @ [344:17] ==> value-parameter conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInUsages[ValueParameterDescriptorImpl]

'putValue' @ [344:27] ==> public open fun putValue(@Nullable p0: PsiElement?, p1: (String..String?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'element' @ [344:36] ==> val element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInUsages[LocalVariableDescriptor]

'message' @ [344:45] ==> val message: String defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInUsages[LocalVariableDescriptor]

'capitalize' @ [344:53] ==> public fun String.capitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'moveTarget' @ [350:31] ==> private final val moveTarget: KotlinMoveTarget defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[PropertyDescriptorImpl]

'getContainerDescriptor' @ [350:42] ==> private final fun KotlinMoveTarget.getContainerDescriptor(): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[SimpleFunctionDescriptorImpl]

'containingDeclaration' @ [353:36] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'this' @ [354:24] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations.targetAwareContainingDescriptor[ReceiverParameterDescriptorImpl]

'source' @ [354:67] ==> public final val DeclarationDescriptorWithSource.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [354:75] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'if (psi != null && psi in allElementsToMove) targetContainer else defaultContainer' @ [355:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: DeclarationDescriptor?, elseBranch: DeclarationDescriptor?): DeclarationDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> DeclarationDescriptor?

'psi' @ [355:24] ==> val psi: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations.targetAwareContainingDescriptor[LocalVariableDescriptor]

'psi' @ [355:39] ==> val psi: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations.targetAwareContainingDescriptor[LocalVariableDescriptor]

'allElementsToMove' @ [355:46] ==> private final val allElementsToMove: Collection<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[PropertyDescriptorImpl]

'targetContainer' @ [355:65] ==> val targetContainer: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations[LocalVariableDescriptor]

'defaultContainer' @ [355:86] ==> val defaultContainer: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations.targetAwareContainingDescriptor[LocalVariableDescriptor]

'generateSequence' @ [359:20] ==> @LowPriorityInOverloadResolution public fun <T : Any> generateSequence(seed: DeclarationDescriptor?, nextFunction: (DeclarationDescriptor) -> DeclarationDescriptor?): Sequence<DeclarationDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> DeclarationDescriptor

'this' @ [359:37] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations.targetAwareContainers[ReceiverParameterDescriptorImpl]

'it' @ [359:45] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations.targetAwareContainers.<anonymous>[ValueParameterDescriptorImpl]

'targetAwareContainingDescriptor' @ [359:48] ==> local final fun DeclarationDescriptor.targetAwareContainingDescriptor(): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations[SimpleFunctionDescriptorImpl]

'drop' @ [359:84] ==> public fun <T> Sequence<DeclarationDescriptor>.drop(n: Int): Sequence<DeclarationDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'targetAwareContainers' @ [363:20] ==> local final fun DeclarationDescriptor.targetAwareContainers(): Sequence<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations[SimpleFunctionDescriptorImpl]

'firstIsInstanceOrNull' @ [363:44] ==> public inline fun <reified T : Any> Sequence<*>.firstIsInstanceOrNull(): ClassDescriptor? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> ClassDescriptor

'targetAwareContainingClass' @ [367:40] ==> local final fun DeclarationDescriptor.targetAwareContainingClass(): ClassDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations[SimpleFunctionDescriptorImpl]

'referrerDescriptor' @ [368:43] ==> value-parameter referrerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations.isProtectedVisible[ValueParameterDescriptorImpl]

'targetAwareContainingClass' @ [368:62] ==> local final fun DeclarationDescriptor.targetAwareContainingClass(): ClassDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations[SimpleFunctionDescriptorImpl]

'givenClassDescriptor' @ [369:17] ==> val givenClassDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations.isProtectedVisible[LocalVariableDescriptor]

'givenClassDescriptor' @ [369:49] ==> val givenClassDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations.isProtectedVisible[LocalVariableDescriptor]

'isCompanionObject' @ [369:70] ==> public final val ClassDescriptor.isCompanionObject: Boolean[MyPropertyDescriptor]

'givenClassDescriptor' @ [370:38] ==> val givenClassDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations.isProtectedVisible[LocalVariableDescriptor]

'targetAwareContainingClass' @ [370:59] ==> local final fun DeclarationDescriptor.targetAwareContainingClass(): ClassDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations[SimpleFunctionDescriptorImpl]

'companionOwner' @ [371:21] ==> val companionOwner: ClassDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations.isProtectedVisible[LocalVariableDescriptor]

'referrerClassDescriptor' @ [371:47] ==> val referrerClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations.isProtectedVisible[LocalVariableDescriptor]

'isSubclassOf' @ [371:71] ==> public fun ClassDescriptor.isSubclassOf(superclass: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'companionOwner' @ [371:84] ==> val companionOwner: ClassDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations.isProtectedVisible[LocalVariableDescriptor]

'unwrapFakeOverrideToAnyDeclaration' @ [373:51] ==> @NotNull public open fun <D : (DeclarationDescriptorWithVisibility..DeclarationDescriptorWithVisibility?)> unwrapFakeOverrideToAnyDeclaration(@NotNull p0: DeclarationDescriptorWithVisibility): DeclarationDescriptorWithVisibility defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]
Inferred types:
    <D : (DeclarationDescriptorWithVisibility..DeclarationDescriptorWithVisibility?)> -> DeclarationDescriptorWithVisibility

'this' @ [373:86] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations.isProtectedVisible[ReceiverParameterDescriptorImpl]

'whatDeclaration' @ [374:35] ==> val whatDeclaration: DeclarationDescriptorWithVisibility defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations.isProtectedVisible[LocalVariableDescriptor]

'targetAwareContainingClass' @ [374:51] ==> local final fun DeclarationDescriptor.targetAwareContainingClass(): ClassDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations[SimpleFunctionDescriptorImpl]

'referrerClassDescriptor' @ [375:17] ==> val referrerClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations.isProtectedVisible[LocalVariableDescriptor]

'isSubclassOf' @ [375:41] ==> public fun ClassDescriptor.isSubclassOf(superclass: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'classDescriptor' @ [375:54] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations.isProtectedVisible[LocalVariableDescriptor]

'referrerDescriptor' @ [376:20] ==> value-parameter referrerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations.isProtectedVisible[ValueParameterDescriptorImpl]

'targetAwareContainingDescriptor' @ [376:39] ==> local final fun DeclarationDescriptor.targetAwareContainingDescriptor(): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations[SimpleFunctionDescriptorImpl]

'let' @ [376:74] ==> @InlineOnly public inline fun <T, R> DeclarationDescriptor.let(block: (DeclarationDescriptor) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> Boolean

'isProtectedVisible' @ [376:80] ==> local final fun DeclarationDescriptorWithVisibility.isProtectedVisible(referrerDescriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations[SimpleFunctionDescriptorImpl]

'it' @ [376:99] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations.isProtectedVisible.<anonymous>[ValueParameterDescriptorImpl]

'visibility' @ [380:36] ==> public final val DeclarationDescriptorWithVisibility.visibility: Visibility[MyPropertyDescriptor]

'normalize' @ [380:47] ==> public open fun normalize(): Visibility defined in org.jetbrains.kotlin.descriptors.Visibility[DeserializedSimpleFunctionDescriptor]

'targetVisibility' @ [381:17] ==> val targetVisibility: Visibility defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations.isVisibleFrom[LocalVariableDescriptor]

'PUBLIC' @ [381:50] ==> @NotNull public final val PUBLIC: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'ref' @ [383:28] ==> value-parameter ref: PsiReference defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations.isVisibleFrom[ValueParameterDescriptorImpl]

'element' @ [383:32] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'getStrictParentOfType' @ [383:40] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtNamedDeclaration? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtNamedDeclaration

'referrer' @ [384:38] ==> val referrer: KtNamedDeclaration? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations.isVisibleFrom[LocalVariableDescriptor]

'resolveToDescriptor' @ [384:48] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'!' @ [386:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isVisibleIn' @ [386:18] ==> private final fun DeclarationDescriptor.isVisibleIn(where: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[SimpleFunctionDescriptorImpl]

'referrerDescriptor' @ [386:30] ==> val referrerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations.isVisibleFrom[LocalVariableDescriptor]

'when (targetVisibility) {
                Visibilities.PROTECTED -> isProtectedVisible(referrerDescriptor)
                else -> isVisibleIn(targetContainer)
            }' @ [388:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'targetVisibility' @ [388:26] ==> val targetVisibility: Visibility defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations.isVisibleFrom[LocalVariableDescriptor]

'PROTECTED' @ [389:30] ==> @NotNull public final val PROTECTED: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'isProtectedVisible' @ [389:43] ==> local final fun DeclarationDescriptorWithVisibility.isProtectedVisible(referrerDescriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations[SimpleFunctionDescriptorImpl]

'referrerDescriptor' @ [389:62] ==> val referrerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations.isVisibleFrom[LocalVariableDescriptor]

'isVisibleIn' @ [390:25] ==> private final fun DeclarationDescriptor.isVisibleIn(where: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[SimpleFunctionDescriptorImpl]

'targetContainer' @ [390:37] ==> val targetContainer: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations[LocalVariableDescriptor]

'elementsToMove' @ [394:29] ==> private final val elementsToMove: Collection<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[PropertyDescriptorImpl]

'doNotGoIn' @ [394:46] ==> private final val doNotGoIn: Collection<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[PropertyDescriptorImpl]

'declaration' @ [395:13] ==> val declaration: KtElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations[LocalVariableDescriptor]

'forEachDescendantOfType' @ [395:25] ==> public inline fun <reified T : PsiElement> PsiElement.forEachDescendantOfType(noinline action: (KtReferenceExpression) -> Unit): Unit defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtReferenceExpression

'refExpr' @ [396:17] ==> value-parameter refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'references' @ [396:25] ==> public final val KtReferenceExpression.references: (Array<(PsiReference..PsiReference?)>..Array<out (PsiReference..PsiReference?)>)[MyPropertyDescriptor]

'forEach' @ [397:26] ==> public inline fun <T> Array<out (PsiReference..PsiReference?)>.forEach(action: ((PsiReference..PsiReference?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)

'ref' @ [398:42] ==> value-parameter ref: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'resolve' @ [398:46] ==> @Nullable public abstract fun resolve(): PsiElement? defined in com.intellij.psi.PsiReference[JavaMethodDescriptor]

'isToBeMoved' @ [399:33] ==> private final fun isToBeMoved(element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[SimpleFunctionDescriptorImpl]

'target' @ [399:45] ==> val target: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations.<anonymous>.<anonymous>[LocalVariableDescriptor]

'when (target) {
                                                       is KtDeclaration -> target.resolveToDescriptor()
                                                       is PsiMember -> target.getJavaMemberDescriptor()
                                                       else -> null
                                                   }' @ [401:52] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: DeclarationDescriptor?, entry1: DeclarationDescriptor?, entry2: DeclarationDescriptor?): DeclarationDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> DeclarationDescriptor?

'target' @ [401:58] ==> val target: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations.<anonymous>.<anonymous>[LocalVariableDescriptor]

'target' @ [402:76] ==> val target: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations.<anonymous>.<anonymous>[LocalVariableDescriptor]

'resolveToDescriptor' @ [402:83] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'target' @ [403:72] ==> val target: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations.<anonymous>.<anonymous>[LocalVariableDescriptor]

'getJavaMemberDescriptor' @ [403:79] ==> @JvmOverloads public fun PsiMember.getJavaMemberDescriptor(resolutionFacade: ResolutionFacade? = ...): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'targetDescriptor' @ [407:45] ==> val targetDescriptor: DeclarationDescriptorWithVisibility defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations.<anonymous>.<anonymous>[LocalVariableDescriptor]

'isVisibleFrom' @ [407:62] ==> local final fun DeclarationDescriptorWithVisibility.isVisibleFrom(ref: PsiReference): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations[SimpleFunctionDescriptorImpl]

'ref' @ [407:76] ==> value-parameter ref: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isVisible' @ [408:33] ==> var isVisible: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations.<anonymous>.<anonymous>[LocalVariableDescriptor]

'targetDescriptor' @ [408:46] ==> val targetDescriptor: DeclarationDescriptorWithVisibility defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations.<anonymous>.<anonymous>[LocalVariableDescriptor]

'isVisible' @ [409:33] ==> var isVisible: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations.<anonymous>.<anonymous>[LocalVariableDescriptor]

'targetDescriptor' @ [409:45] ==> val targetDescriptor: DeclarationDescriptorWithVisibility defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations.<anonymous>.<anonymous>[LocalVariableDescriptor]

'containingDeclaration' @ [409:62] ==> public final val ConstructorDescriptor.containingDeclaration: ClassifierDescriptorWithTypeParameters[MyPropertyDescriptor]

'isVisibleFrom' @ [409:84] ==> local final fun DeclarationDescriptorWithVisibility.isVisibleFrom(ref: PsiReference): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations[SimpleFunctionDescriptorImpl]

'ref' @ [409:98] ==> value-parameter ref: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [412:33] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isVisible' @ [412:34] ==> var isVisible: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations.<anonymous>.<anonymous>[LocalVariableDescriptor]

'render' @ [413:50] ==> private final fun render(declaration: PsiElement): (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[SimpleFunctionDescriptorImpl]

'declaration' @ [413:57] ==> val declaration: KtElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations[LocalVariableDescriptor]

'render' @ [413:78] ==> private final fun render(declaration: PsiElement): (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[SimpleFunctionDescriptorImpl]

'target' @ [413:85] ==> val target: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations.<anonymous>.<anonymous>[LocalVariableDescriptor]

'conflicts' @ [414:33] ==> value-parameter conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations[ValueParameterDescriptorImpl]

'putValue' @ [414:43] ==> public open fun putValue(@Nullable p0: PsiElement?, p1: (String..String?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'refExpr' @ [414:52] ==> value-parameter refExpr: KtReferenceExpression defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'message' @ [414:61] ==> val message: String defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkVisibilityInDeclarations.<anonymous>.<anonymous>[LocalVariableDescriptor]

'capitalize' @ [414:69] ==> public fun String.capitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'allElementsToMove' @ [421:61] ==> private final val allElementsToMove: Collection<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[PropertyDescriptorImpl]

'any' @ [421:79] ==> public inline fun <T> Iterable<PsiElement>.any(predicate: (PsiElement) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [421:85] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.isToBeMoved.<anonymous>[ValueParameterDescriptorImpl]

'isAncestor' @ [421:88] ==> public fun PsiElement?.isAncestor(element: PsiElement, strict: Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'element' @ [421:99] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.isToBeMoved[ValueParameterDescriptorImpl]

'moveTarget' @ [424:26] ==> private final val moveTarget: KotlinMoveTarget defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[PropertyDescriptorImpl]

'targetFile' @ [424:37] ==> public abstract val targetFile: VirtualFile? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinMoveTarget[PropertyDescriptorImpl]

'?:' @ [425:28] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Module?, right: Module): Module[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Module

'findModuleForFile' @ [425:43] ==> @Nullable public open fun findModuleForFile(@NotNull p0: VirtualFile, @NotNull p1: Project): Module? defined in com.intellij.openapi.module.ModuleUtilCore[JavaMethodDescriptor]

'sourceRoot' @ [425:61] ==> val sourceRoot: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkInternalMemberUsages[LocalVariableDescriptor]

'project' @ [425:73] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[PropertyDescriptorImpl]

'LinkedHashSet' @ [427:30] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtDeclaration

'KtVisitorVoid' @ [428:40] ==> public constructor KtVisitorVoid() defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaClassConstructorDescriptor]

'classOrObject' @ [430:36] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkInternalMemberUsages.<no name provided>.visitClassOrObject[ValueParameterDescriptorImpl]

'declarations' @ [430:50] ==> public final val KtClassOrObject.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'declarations' @ [431:17] ==> val declarations: List<KtDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkInternalMemberUsages.<no name provided>.visitClassOrObject[LocalVariableDescriptor]

'filterTo' @ [431:30] ==> public inline fun <T, C : MutableCollection<in KtDeclaration>> Iterable<KtDeclaration>.filterTo(destination: LinkedHashSet<KtDeclaration>, predicate: (KtDeclaration) -> Boolean): LinkedHashSet<KtDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration
    <C : MutableCollection<in T>> -> LinkedHashSet<KtDeclaration>

'membersToCheck' @ [431:39] ==> val membersToCheck: LinkedHashSet<KtDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkInternalMemberUsages[LocalVariableDescriptor]

'it' @ [431:57] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkInternalMemberUsages.<no name provided>.visitClassOrObject.<anonymous>[ValueParameterDescriptorImpl]

'hasModifier' @ [431:60] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtDeclaration[JavaMethodDescriptor]

'INTERNAL_KEYWORD' @ [431:81] ==> public final val INTERNAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'declarations' @ [432:17] ==> val declarations: List<KtDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkInternalMemberUsages.<no name provided>.visitClassOrObject[LocalVariableDescriptor]

'forEach' @ [432:30] ==> @HidesMembers public inline fun <T> Iterable<KtDeclaration>.forEach(action: (KtDeclaration) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'it' @ [432:40] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkInternalMemberUsages.<no name provided>.visitClassOrObject.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [432:43] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtDeclaration[JavaMethodDescriptor]

'this' @ [432:50] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkInternalMemberUsages.<no name provided>[LazyClassReceiverParameterDescriptor]

'elementsToMove' @ [435:9] ==> private final val elementsToMove: Collection<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[PropertyDescriptorImpl]

'forEach' @ [435:24] ==> @HidesMembers public inline fun <T> Iterable<KtElement>.forEach(action: (KtElement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'it' @ [435:34] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkInternalMemberUsages.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [435:37] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'memberCollector' @ [435:44] ==> val memberCollector: <no name provided> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkInternalMemberUsages[LocalVariableDescriptor]

'membersToCheck' @ [437:31] ==> val membersToCheck: LinkedHashSet<KtDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkInternalMemberUsages[LocalVariableDescriptor]

'iterator' @ [438:31] ==> public abstract fun iterator(): MutableIterator<(PsiReference..PsiReference?)> defined in com.intellij.util.Query[DeserializedSimpleFunctionDescriptor]

'search' @ [438:48] ==> @NotNull public open fun search(@NotNull p0: PsiElement): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'memberToCheck' @ [438:55] ==> val memberToCheck: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkInternalMemberUsages[LocalVariableDescriptor]

'reference' @ [439:31] ==> val reference: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkInternalMemberUsages[LocalVariableDescriptor]

'element' @ [439:41] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'findModuleForPsiElement' @ [440:50] ==> @Nullable public open fun findModuleForPsiElement(@NotNull p0: PsiElement): Module? defined in com.intellij.openapi.module.ModuleUtilCore[JavaMethodDescriptor]

'element' @ [440:74] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkInternalMemberUsages[LocalVariableDescriptor]

'usageModule' @ [441:21] ==> val usageModule: Module? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkInternalMemberUsages[LocalVariableDescriptor]

'targetModule' @ [441:36] ==> val targetModule: Module defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkInternalMemberUsages[LocalVariableDescriptor]

'!' @ [441:52] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isToBeMoved' @ [441:53] ==> private final fun isToBeMoved(element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[SimpleFunctionDescriptorImpl]

'element' @ [441:65] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkInternalMemberUsages[LocalVariableDescriptor]

'element' @ [442:37] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkInternalMemberUsages[LocalVariableDescriptor]

'getUsageContext' @ [442:45] ==> public fun PsiElement.getUsageContext(): PsiElement defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'render' @ [443:38] ==> private final fun render(declaration: PsiElement): (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[SimpleFunctionDescriptorImpl]

'container' @ [443:45] ==> val container: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkInternalMemberUsages[LocalVariableDescriptor]

'render' @ [443:73] ==> private final fun render(declaration: PsiElement): (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[SimpleFunctionDescriptorImpl]

'memberToCheck' @ [443:80] ==> val memberToCheck: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkInternalMemberUsages[LocalVariableDescriptor]

'conflicts' @ [444:21] ==> value-parameter conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkInternalMemberUsages[ValueParameterDescriptorImpl]

'putValue' @ [444:31] ==> public open fun putValue(@Nullable p0: PsiElement?, p1: (String..String?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'element' @ [444:40] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkInternalMemberUsages[LocalVariableDescriptor]

'message' @ [444:49] ==> val message: String defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkInternalMemberUsages[LocalVariableDescriptor]

'capitalize' @ [444:57] ==> public fun String.capitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'checkModuleConflictsInUsages' @ [455:9] ==> public final fun checkModuleConflictsInUsages(externalUsages: MutableSet<UsageInfo>, conflicts: MultiMap<PsiElement, String>): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[SimpleFunctionDescriptorImpl]

'externalUsages' @ [455:38] ==> value-parameter externalUsages: MutableSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkAllConflicts[ValueParameterDescriptorImpl]

'conflicts' @ [455:54] ==> value-parameter conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkAllConflicts[ValueParameterDescriptorImpl]

'checkModuleConflictsInDeclarations' @ [456:9] ==> public final fun checkModuleConflictsInDeclarations(internalUsages: MutableSet<UsageInfo>, conflicts: MultiMap<PsiElement, String>): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[SimpleFunctionDescriptorImpl]

'internalUsages' @ [456:44] ==> value-parameter internalUsages: MutableSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkAllConflicts[ValueParameterDescriptorImpl]

'conflicts' @ [456:60] ==> value-parameter conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkAllConflicts[ValueParameterDescriptorImpl]

'checkVisibilityInUsages' @ [457:9] ==> public final fun checkVisibilityInUsages(usages: Collection<UsageInfo>, conflicts: MultiMap<PsiElement, String>): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[SimpleFunctionDescriptorImpl]

'externalUsages' @ [457:33] ==> value-parameter externalUsages: MutableSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkAllConflicts[ValueParameterDescriptorImpl]

'conflicts' @ [457:49] ==> value-parameter conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkAllConflicts[ValueParameterDescriptorImpl]

'checkVisibilityInDeclarations' @ [458:9] ==> public final fun checkVisibilityInDeclarations(conflicts: MultiMap<PsiElement, String>): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[SimpleFunctionDescriptorImpl]

'conflicts' @ [458:39] ==> value-parameter conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkAllConflicts[ValueParameterDescriptorImpl]

'checkInternalMemberUsages' @ [459:9] ==> private final fun checkInternalMemberUsages(conflicts: MultiMap<PsiElement, String>): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[SimpleFunctionDescriptorImpl]

'conflicts' @ [459:35] ==> value-parameter conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker.checkAllConflicts[ValueParameterDescriptorImpl]

'file' @ [471:26] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.analyzeConflictsInFile[ValueParameterDescriptorImpl]

'declarations' @ [471:31] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'elementsToMove' @ [472:9] ==> val elementsToMove: List<(KtDeclaration..KtDeclaration?)> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.analyzeConflictsInFile[LocalVariableDescriptor]

'isEmpty' @ [472:24] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'component1' @ [474:10] ==> public final operator fun component1(): List<UsageInfo> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [474:26] ==> public final operator fun component2(): List<UsageInfo> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'usages' @ [474:44] ==> value-parameter usages: Collection<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.analyzeConflictsInFile[ValueParameterDescriptorImpl]

'partition' @ [474:51] ==> public inline fun <T> Iterable<UsageInfo>.partition(predicate: (UsageInfo) -> Boolean): Pair<List<UsageInfo>, List<UsageInfo>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageInfo

'it' @ [474:63] ==> value-parameter it: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.analyzeConflictsInFile.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [474:88] ==> value-parameter it: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.analyzeConflictsInFile.<anonymous>[ValueParameterDescriptorImpl]

'isInternal' @ [474:91] ==> public abstract val isInternal: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.KotlinMoveUsage[PropertyDescriptorImpl]

'internalUsages' @ [475:28] ==> val internalUsages: List<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.analyzeConflictsInFile[LocalVariableDescriptor]

'toMutableSet' @ [475:43] ==> public fun <T> Iterable<UsageInfo>.toMutableSet(): MutableSet<UsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageInfo

'externalUsages' @ [476:28] ==> val externalUsages: List<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.analyzeConflictsInFile[LocalVariableDescriptor]

'toMutableSet' @ [476:43] ==> public fun <T> Iterable<UsageInfo>.toMutableSet(): MutableSet<UsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageInfo

'MoveConflictChecker' @ [478:27] ==> public constructor MoveConflictChecker(project: Project, elementsToMove: Collection<KtElement>, moveTarget: KotlinMoveTarget, contextElement: KtElement, doNotGoIn: Collection<KtElement> = ..., allElementsToMove: Collection<PsiElement>? = ...) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[ClassConstructorDescriptorImpl]

'file' @ [479:13] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.analyzeConflictsInFile[ValueParameterDescriptorImpl]

'project' @ [479:18] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'elementsToMove' @ [480:13] ==> val elementsToMove: List<(KtDeclaration..KtDeclaration?)> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.analyzeConflictsInFile[LocalVariableDescriptor]

'moveTarget' @ [481:13] ==> value-parameter moveTarget: KotlinMoveTarget defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.analyzeConflictsInFile[ValueParameterDescriptorImpl]

'elementsToMove' @ [482:13] ==> val elementsToMove: List<(KtDeclaration..KtDeclaration?)> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.analyzeConflictsInFile[LocalVariableDescriptor]

'first' @ [482:28] ==> public fun <T> List<(KtDeclaration..KtDeclaration?)>.first(): (KtDeclaration..KtDeclaration?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)

'allElementsToMove' @ [483:33] ==> value-parameter allElementsToMove: Collection<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.analyzeConflictsInFile[ValueParameterDescriptorImpl]

'conflictChecker' @ [485:5] ==> val conflictChecker: MoveConflictChecker defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.analyzeConflictsInFile[LocalVariableDescriptor]

'checkAllConflicts' @ [485:21] ==> public final fun checkAllConflicts(externalUsages: MutableSet<UsageInfo>, internalUsages: MutableSet<UsageInfo>, conflicts: MultiMap<PsiElement, String>): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[SimpleFunctionDescriptorImpl]

'externalUsageSet' @ [485:39] ==> val externalUsageSet: MutableSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.analyzeConflictsInFile[LocalVariableDescriptor]

'internalUsageSet' @ [485:57] ==> val internalUsageSet: MutableSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.analyzeConflictsInFile[LocalVariableDescriptor]

'conflicts' @ [485:75] ==> value-parameter conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.analyzeConflictsInFile[ValueParameterDescriptorImpl]

'externalUsageSet' @ [487:9] ==> val externalUsageSet: MutableSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.analyzeConflictsInFile[LocalVariableDescriptor]

'size' @ [487:26] ==> public abstract val size: Int defined in kotlin.collections.MutableSet[DeserializedPropertyDescriptor]

'externalUsages' @ [487:34] ==> val externalUsages: List<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.analyzeConflictsInFile[LocalVariableDescriptor]

'size' @ [487:49] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'internalUsageSet' @ [487:57] ==> val internalUsageSet: MutableSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.analyzeConflictsInFile[LocalVariableDescriptor]

'size' @ [487:74] ==> public abstract val size: Int defined in kotlin.collections.MutableSet[DeserializedPropertyDescriptor]

'internalUsages' @ [487:82] ==> val internalUsages: List<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.analyzeConflictsInFile[LocalVariableDescriptor]

'size' @ [487:97] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'invoke' @ [488:9] ==> public abstract operator fun invoke(p1: List<UsageInfo>): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'externalUsageSet' @ [488:24] ==> val externalUsageSet: MutableSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.analyzeConflictsInFile[LocalVariableDescriptor]

'internalUsageSet' @ [488:43] ==> val internalUsageSet: MutableSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.analyzeConflictsInFile[LocalVariableDescriptor]

'toList' @ [488:61] ==> public fun <T> Iterable<UsageInfo>.toList(): List<UsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageInfo

