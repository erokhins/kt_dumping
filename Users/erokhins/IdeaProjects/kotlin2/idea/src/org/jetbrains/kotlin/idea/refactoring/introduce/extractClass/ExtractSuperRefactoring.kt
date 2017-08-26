'originalClass' @ [92:27] ==> value-parameter originalClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.getElementsToMove[ValueParameterDescriptorImpl]

'project' @ [92:41] ==> public final val KtClassOrObject.project: Project[MyPropertyDescriptor]

'LinkedHashMap' @ [93:34] ==> public final fun <K, V> <init>(): LinkedHashMap<KtElement, KotlinMemberInfo?> /* = LinkedHashMap<KtElement, KotlinMemberInfo?> */ defined in kotlin.collections.LinkedHashMap[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <K> -> KtElement
    <V> -> KotlinMemberInfo?

'runReadAction' @ [94:13] ==> public fun <T> runReadAction(action: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'ArrayList' @ [95:45] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtElement

'memberInfos' @ [96:36] ==> value-parameter memberInfos: Collection<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.getElementsToMove[ValueParameterDescriptorImpl]

'memberInfo' @ [97:34] ==> val memberInfo: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.getElementsToMove.<anonymous>[LocalVariableDescriptor]

'member' @ [97:45] ==> public final val KotlinMemberInfo.member: (KtNamedDeclaration..KtNamedDeclaration?)[MyPropertyDescriptor]

'if (memberInfo.isSuperClass) {
                        superInterfacesToMove += member
                    }
                    else {
                        elementsToMove[member] = memberInfo
                    }' @ [98:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'memberInfo' @ [98:25] ==> val memberInfo: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.getElementsToMove.<anonymous>[LocalVariableDescriptor]

'isSuperClass' @ [98:36] ==> public final val isSuperClass: Boolean defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinMemberInfo[PropertyDescriptorImpl]

'superInterfacesToMove' @ [99:25] ==> val superInterfacesToMove: ArrayList<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.getElementsToMove.<anonymous>[LocalVariableDescriptor]

'member' @ [99:50] ==> val member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.getElementsToMove.<anonymous>[LocalVariableDescriptor]

'elementsToMove' @ [102:25] ==> val elementsToMove: LinkedHashMap<KtElement, KotlinMemberInfo?> /* = LinkedHashMap<KtElement, KotlinMemberInfo?> */ defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.getElementsToMove[LocalVariableDescriptor]

'member' @ [102:40] ==> val member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.getElementsToMove.<anonymous>[LocalVariableDescriptor]

'memberInfo' @ [102:50] ==> val memberInfo: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.getElementsToMove.<anonymous>[LocalVariableDescriptor]

'originalClass' @ [106:37] ==> value-parameter originalClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.getElementsToMove[ValueParameterDescriptorImpl]

'getSuperTypeList' @ [106:51] ==> public final fun getSuperTypeList(): KtSuperTypeList? defined in org.jetbrains.kotlin.psi.KtClassOrObject[DeserializedSimpleFunctionDescriptor]

'superTypeList' @ [107:21] ==> val superTypeList: KtSuperTypeList? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.getElementsToMove.<anonymous>[LocalVariableDescriptor]

'originalClass' @ [108:48] ==> value-parameter originalClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.getElementsToMove[ValueParameterDescriptorImpl]

'superTypeListEntries' @ [108:62] ==> public final val KtClassOrObject.superTypeListEntries: List<KtSuperTypeListEntry>[MyPropertyDescriptor]

'superTypeListEntry' @ [109:41] ==> val superTypeListEntry: KtSuperTypeListEntry defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.getElementsToMove.<anonymous>[LocalVariableDescriptor]

'analyze' @ [109:60] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [109:84] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'TYPE' @ [109:108] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'superTypeListEntry' @ [109:114] ==> val superTypeListEntry: KtSuperTypeListEntry defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.getElementsToMove.<anonymous>[LocalVariableDescriptor]

'typeReference' @ [109:133] ==> public final val KtSuperTypeListEntry.typeReference: KtTypeReference?[MyPropertyDescriptor]

'superType' @ [111:52] ==> val superType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.getElementsToMove.<anonymous>[LocalVariableDescriptor]

'constructor' @ [111:62] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [111:74] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'DescriptorToSourceUtilsIde' @ [112:42] ==> public object DescriptorToSourceUtilsIde defined in org.jetbrains.kotlin.idea.codeInsight[FakeCallableDescriptorForObject]

'getAnyDeclaration' @ [112:69] ==> public final fun getAnyDeclaration(project: Project, descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[DeserializedSimpleFunctionDescriptor]

'project' @ [112:87] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.getElementsToMove[LocalVariableDescriptor]

'superClassDescriptor' @ [112:96] ==> val superClassDescriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.getElementsToMove.<anonymous>[LocalVariableDescriptor]

'!' @ [113:30] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isExtractInterface' @ [113:31] ==> value-parameter isExtractInterface: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.getElementsToMove[ValueParameterDescriptorImpl]

'!' @ [113:53] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'superClass' @ [113:54] ==> val superClass: KtClass defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.getElementsToMove.<anonymous>[LocalVariableDescriptor]

'isInterface' @ [113:65] ==> public final fun isInterface(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'superClass' @ [113:83] ==> val superClass: KtClass defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.getElementsToMove.<anonymous>[LocalVariableDescriptor]

'superInterfacesToMove' @ [113:97] ==> val superInterfacesToMove: ArrayList<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.getElementsToMove.<anonymous>[LocalVariableDescriptor]

'elementsToMove' @ [114:29] ==> val elementsToMove: LinkedHashMap<KtElement, KotlinMemberInfo?> /* = LinkedHashMap<KtElement, KotlinMemberInfo?> */ defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.getElementsToMove[LocalVariableDescriptor]

'superTypeListEntry' @ [114:44] ==> val superTypeListEntry: KtSuperTypeListEntry defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.getElementsToMove.<anonymous>[LocalVariableDescriptor]

'elementsToMove' @ [119:20] ==> val elementsToMove: LinkedHashMap<KtElement, KotlinMemberInfo?> /* = LinkedHashMap<KtElement, KotlinMemberInfo?> */ defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.getElementsToMove[LocalVariableDescriptor]

'MultiMap' @ [129:29] ==> public constructor MultiMap<K : (Any..Any?), V : (Any..Any?)>() defined in com.intellij.util.containers.MultiMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> String

'originalClass' @ [131:27] ==> value-parameter originalClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts[ValueParameterDescriptorImpl]

'project' @ [131:41] ==> public final val KtClassOrObject.project: Project[MyPropertyDescriptor]

'targetParent' @ [133:17] ==> value-parameter targetParent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts[ValueParameterDescriptorImpl]

'originalClass' @ [134:37] ==> value-parameter originalClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts[ValueParameterDescriptorImpl]

'parentsWithSelf' @ [134:51] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'first' @ [134:67] ==> public inline fun <T> Sequence<PsiElement>.first(predicate: (PsiElement) -> Boolean): PsiElement defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [134:75] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [134:78] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'targetParent' @ [134:88] ==> value-parameter targetParent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts[ValueParameterDescriptorImpl]

'targetSibling' @ [135:17] ==> val targetSibling: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts[LocalVariableDescriptor]

'getResolutionScope' @ [135:31] ==> public fun KtElement.getResolutionScope(): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'findClassifier' @ [136:26] ==> public fun HierarchicalScope.findClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'identifier' @ [136:46] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'newClassName' @ [136:57] ==> value-parameter newClassName: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts[ValueParameterDescriptorImpl]

'FROM_IDE' @ [136:89] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'let' @ [137:27] ==> @InlineOnly public inline fun <T, R> ClassifierDescriptor.let(block: (ClassifierDescriptor) -> PsiElement?): PsiElement? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptor
    <R> -> PsiElement?

'DescriptorToSourceUtilsIde' @ [137:33] ==> public object DescriptorToSourceUtilsIde defined in org.jetbrains.kotlin.idea.codeInsight[FakeCallableDescriptorForObject]

'getAnyDeclaration' @ [137:60] ==> public final fun getAnyDeclaration(project: Project, descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[DeserializedSimpleFunctionDescriptor]

'project' @ [137:78] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts[LocalVariableDescriptor]

'it' @ [137:87] ==> value-parameter it: ClassifierDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [138:27] ==> @InlineOnly public inline fun <T, R> PsiElement.let(block: (PsiElement) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> Unit

'conflicts' @ [138:33] ==> val conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts[LocalVariableDescriptor]

'putValue' @ [138:43] ==> public open fun putValue(@Nullable p0: PsiElement?, p1: (String..String?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'it' @ [138:52] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts.<anonymous>[ValueParameterDescriptorImpl]

'newClassName' @ [138:64] ==> value-parameter newClassName: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts[ValueParameterDescriptorImpl]

'getElementsToMove' @ [141:34] ==> private final fun getElementsToMove(memberInfos: Collection<KotlinMemberInfo>, originalClass: KtClassOrObject, isExtractInterface: Boolean): Map<KtElement, KotlinMemberInfo?> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion[SimpleFunctionDescriptorImpl]

'memberInfos' @ [141:52] ==> value-parameter memberInfos: List<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts[ValueParameterDescriptorImpl]

'originalClass' @ [141:65] ==> value-parameter originalClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts[ValueParameterDescriptorImpl]

'isExtractInterface' @ [141:80] ==> value-parameter isExtractInterface: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts[ValueParameterDescriptorImpl]

'keys' @ [141:100] ==> public abstract val keys: Set<KtElement> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'if (targetParent is PsiDirectory) {
                val targetPackage = targetParent.getPackage() ?: return conflicts
                KotlinMoveTargetForDeferredFile(FqName(targetPackage.qualifiedName), targetParent) { null }
            }
            else {
                KotlinMoveTargetForExistingElement(targetParent as KtElement)
            }' @ [143:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinMoveTarget, elseBranch: KotlinMoveTarget): KotlinMoveTarget[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinMoveTarget

'targetParent' @ [143:34] ==> value-parameter targetParent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts[ValueParameterDescriptorImpl]

'targetParent' @ [144:37] ==> value-parameter targetParent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts[ValueParameterDescriptorImpl]

'getPackage' @ [144:50] ==> public fun PsiDirectory.getPackage(): PsiPackage? defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'conflicts' @ [144:73] ==> val conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts[LocalVariableDescriptor]

'KotlinMoveTargetForDeferredFile' @ [145:17] ==> public constructor KotlinMoveTargetForDeferredFile(targetContainerFqName: FqName, directory: PsiDirectory?, targetFile: VirtualFile? = ..., createFile: (KtFile) -> KtFile?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinMoveTargetForDeferredFile[ClassConstructorDescriptorImpl]

'FqName' @ [145:49] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'targetPackage' @ [145:56] ==> val targetPackage: PsiPackage defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts[LocalVariableDescriptor]

'qualifiedName' @ [145:70] ==> public final val PsiPackage.qualifiedName: String[MyPropertyDescriptor]

'targetParent' @ [145:86] ==> value-parameter targetParent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts[ValueParameterDescriptorImpl]

'KotlinMoveTargetForExistingElement' @ [148:17] ==> public constructor KotlinMoveTargetForExistingElement(targetElement: KtElement) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinMoveTargetForExistingElement[ClassConstructorDescriptorImpl]

'targetParent' @ [148:52] ==> value-parameter targetParent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts[ValueParameterDescriptorImpl]

'MoveConflictChecker' @ [150:35] ==> public constructor MoveConflictChecker(project: Project, elementsToMove: Collection<KtElement>, moveTarget: KotlinMoveTarget, contextElement: KtElement, doNotGoIn: Collection<KtElement> = ..., allElementsToMove: Collection<PsiElement>? = ...) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[ClassConstructorDescriptorImpl]

'project' @ [151:21] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts[LocalVariableDescriptor]

'elementsToMove' @ [152:21] ==> val elementsToMove: Set<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts[LocalVariableDescriptor]

'moveTarget' @ [153:21] ==> val moveTarget: KotlinMoveTarget defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts[LocalVariableDescriptor]

'originalClass' @ [154:21] ==> value-parameter originalClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts[ValueParameterDescriptorImpl]

'memberInfos' @ [155:21] ==> value-parameter memberInfos: List<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts[ValueParameterDescriptorImpl]

'filter' @ [155:33] ==> public inline fun <T> Iterable<KotlinMemberInfo>.filter(predicate: (KotlinMemberInfo) -> Boolean): List<KotlinMemberInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinMemberInfo

'it' @ [155:42] ==> value-parameter it: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts.<anonymous>[ValueParameterDescriptorImpl]

'isToAbstract' @ [155:45] ==> public final var KotlinMemberInfo.isToAbstract: Boolean[MyPropertyDescriptor]

'mapNotNull' @ [155:60] ==> public inline fun <T, R : Any> Iterable<KotlinMemberInfo>.mapNotNull(transform: (KotlinMemberInfo) -> KtNamedDeclaration?): List<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinMemberInfo
    <R : Any> -> KtNamedDeclaration

'it' @ [155:73] ==> value-parameter it: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts.<anonymous>[ValueParameterDescriptorImpl]

'member' @ [155:76] ==> public final val KotlinMemberInfo.member: (KtNamedDeclaration..KtNamedDeclaration?)[MyPropertyDescriptor]

'project' @ [158:13] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts[LocalVariableDescriptor]

'runSynchronouslyWithProgress' @ [158:21] ==> public fun <T : Any> Project.runSynchronouslyWithProgress(progressTitle: String, canBeCanceled: Boolean, action: () -> Unit): Unit? defined in org.jetbrains.kotlin.idea[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> Unit

'message' @ [158:68] ==> public open fun message(@PropertyKey p0: (String..String?)): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'runReadAction' @ [159:17] ==> public fun <T> runReadAction(action: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'LinkedHashSet' @ [160:34] ==> public final fun <E> <init>(): LinkedHashSet<UsageInfo> /* = LinkedHashSet<UsageInfo> */ defined in kotlin.collections.LinkedHashSet[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> UsageInfo

'elementsToMove' @ [161:37] ==> val elementsToMove: Set<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts[LocalVariableDescriptor]

'search' @ [162:42] ==> @NotNull public open fun search(@NotNull p0: PsiElement): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'element' @ [162:49] ==> val element: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts.<anonymous>.<anonymous>[LocalVariableDescriptor]

'mapTo' @ [162:58] ==> public inline fun <T, R, C : MutableCollection<in MoveRenameUsageInfo>> Iterable<(PsiReference..PsiReference?)>.mapTo(destination: LinkedHashSet<UsageInfo> /* = LinkedHashSet<UsageInfo> */, transform: ((PsiReference..PsiReference?)) -> MoveRenameUsageInfo): LinkedHashSet<UsageInfo> /* = LinkedHashSet<UsageInfo> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)
    <R> -> MoveRenameUsageInfo
    <C : MutableCollection<in R>> -> LinkedHashSet<UsageInfo>

'usages' @ [162:64] ==> val usages: LinkedHashSet<UsageInfo> /* = LinkedHashSet<UsageInfo> */ defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts.<anonymous>.<anonymous>[LocalVariableDescriptor]

'MoveRenameUsageInfo' @ [162:74] ==> public constructor MoveRenameUsageInfo(p0: (PsiReference..PsiReference?), p1: (PsiElement..PsiElement?)) defined in com.intellij.refactoring.util.MoveRenameUsageInfo[JavaClassConstructorDescriptor]

'it' @ [162:94] ==> value-parameter it: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [162:98] ==> val element: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts.<anonymous>.<anonymous>[LocalVariableDescriptor]

'element' @ [163:29] ==> val element: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts.<anonymous>.<anonymous>[LocalVariableDescriptor]

'element' @ [164:29] ==> val element: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts.<anonymous>.<anonymous>[LocalVariableDescriptor]

'toLightMethods' @ [164:37] ==> public fun PsiElement.toLightMethods(): List<PsiMethod> defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'flatMapTo' @ [164:54] ==> public inline fun <T, R, C : MutableCollection<in MoveRenameUsageInfo>> Iterable<PsiMethod>.flatMapTo(destination: LinkedHashSet<UsageInfo> /* = LinkedHashSet<UsageInfo> */, transform: (PsiMethod) -> Iterable<MoveRenameUsageInfo>): LinkedHashSet<UsageInfo> /* = LinkedHashSet<UsageInfo> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod
    <R> -> MoveRenameUsageInfo
    <C : MutableCollection<in R>> -> LinkedHashSet<UsageInfo>

'usages' @ [164:64] ==> val usages: LinkedHashSet<UsageInfo> /* = LinkedHashSet<UsageInfo> */ defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts.<anonymous>.<anonymous>[LocalVariableDescriptor]

'search' @ [165:56] ==> public open fun search(p0: (PsiMethod..PsiMethod?)): (Query<(PsiReference..PsiReference?)>..Query<(PsiReference..PsiReference?)>?) defined in com.intellij.psi.search.searches.MethodReferencesSearch[JavaMethodDescriptor]

'it' @ [165:63] ==> value-parameter it: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [165:67] ==> public inline fun <T, R> Iterable<(PsiReference..PsiReference?)>.map(transform: ((PsiReference..PsiReference?)) -> MoveRenameUsageInfo): List<MoveRenameUsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)
    <R> -> MoveRenameUsageInfo

'MoveRenameUsageInfo' @ [165:73] ==> public constructor MoveRenameUsageInfo(p0: (PsiReference..PsiReference?), p1: (PsiElement..PsiElement?)) defined in com.intellij.refactoring.util.MoveRenameUsageInfo[JavaClassConstructorDescriptor]

'it' @ [165:93] ==> value-parameter it: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [165:97] ==> val element: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts.<anonymous>.<anonymous>[LocalVariableDescriptor]

'conflictChecker' @ [169:21] ==> val conflictChecker: MoveConflictChecker defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts[LocalVariableDescriptor]

'checkAllConflicts' @ [169:37] ==> public final fun checkAllConflicts(externalUsages: MutableSet<UsageInfo>, internalUsages: MutableSet<UsageInfo>, conflicts: MultiMap<PsiElement, String>): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveConflictChecker[SimpleFunctionDescriptorImpl]

'usages' @ [169:55] ==> val usages: LinkedHashSet<UsageInfo> /* = LinkedHashSet<UsageInfo> */ defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts.<anonymous>.<anonymous>[LocalVariableDescriptor]

'LinkedHashSet' @ [169:63] ==> public final fun <E> <init>(): LinkedHashSet<UsageInfo> /* = LinkedHashSet<UsageInfo> */ defined in kotlin.collections.LinkedHashSet[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> UsageInfo

'conflicts' @ [169:91] ==> val conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts[LocalVariableDescriptor]

'targetParent' @ [170:25] ==> value-parameter targetParent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts[ValueParameterDescriptorImpl]

'checkSuperAccessible' @ [171:47] ==> public open fun checkSuperAccessible(p0: (PsiDirectory..PsiDirectory?), p1: (MultiMap<(PsiElement..PsiElement?), (String..String?)>..MultiMap<(PsiElement..PsiElement?), (String..String?)>?), p2: (PsiClass..PsiClass?)): Unit defined in com.intellij.refactoring.extractSuperclass.ExtractSuperClassUtil[JavaMethodDescriptor]

'targetParent' @ [171:68] ==> value-parameter targetParent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts[ValueParameterDescriptorImpl]

'conflicts' @ [171:82] ==> val conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts[LocalVariableDescriptor]

'originalClass' @ [171:93] ==> value-parameter originalClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts[ValueParameterDescriptorImpl]

'toLightClass' @ [171:107] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'isExtractInterface' @ [174:25] ==> value-parameter isExtractInterface: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts[ValueParameterDescriptorImpl]

'originalClass' @ [175:48] ==> value-parameter originalClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts[ValueParameterDescriptorImpl]

'getResolutionFacade' @ [175:62] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'elementsToMove' @ [177:45] ==> val elementsToMove: Set<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts[LocalVariableDescriptor]

'filterIsInstance' @ [177:60] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtNamedDeclaration

'membersToMove' @ [178:40] ==> val membersToMove: List<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts.<anonymous>.<anonymous>[LocalVariableDescriptor]

'member' @ [179:52] ==> val member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts.<anonymous>.<anonymous>[LocalVariableDescriptor]

'resolveToDescriptorWrapperAware' @ [179:59] ==> internal fun KtNamedDeclaration.resolveToDescriptorWrapperAware(resolutionFacade: ResolutionFacade? = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.memberInfo in file memberInfoUtils.kt[SimpleFunctionDescriptorImpl]

'resolutionFacade' @ [179:91] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts.<anonymous>.<anonymous>[LocalVariableDescriptor]

'checkPrivateMembersWithUsages' @ [180:29] ==> internal fun checkPrivateMembersWithUsages(member: KtNamedDeclaration, memberDescriptor: DeclarationDescriptor, sourceClass: KtClassOrObject, membersToMove: Collection<KtNamedDeclaration>, conflicts: MultiMap<PsiElement, String>): Unit defined in org.jetbrains.kotlin.idea.refactoring.pullUp in file pullUpConflictsUtils.kt[SimpleFunctionDescriptorImpl]

'member' @ [180:59] ==> val member: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts.<anonymous>.<anonymous>[LocalVariableDescriptor]

'memberDescriptor' @ [180:67] ==> val memberDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts.<anonymous>.<anonymous>[LocalVariableDescriptor]

'originalClass' @ [180:85] ==> value-parameter originalClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts[ValueParameterDescriptorImpl]

'membersToMove' @ [180:100] ==> val membersToMove: List<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts.<anonymous>.<anonymous>[LocalVariableDescriptor]

'conflicts' @ [180:115] ==> val conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts[LocalVariableDescriptor]

'conflicts' @ [186:20] ==> val conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion.collectConflicts[LocalVariableDescriptor]

'extractInfo' @ [190:27] ==> private final var extractInfo: ExtractSuperInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring[PropertyDescriptorImpl]

'originalClass' @ [190:39] ==> public final val originalClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperInfo[PropertyDescriptorImpl]

'project' @ [190:53] ==> public final val KtClassOrObject.project: Project[MyPropertyDescriptor]

'KtPsiFactory' @ [191:30] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [191:43] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring[PropertyDescriptorImpl]

'LinkedHashSet' @ [192:34] ==> public final fun <E> <init>(): LinkedHashSet<KtTypeParameter> /* = LinkedHashSet<KtTypeParameter> */ defined in kotlin.collections.LinkedHashSet[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> KtTypeParameter

'extractInfo' @ [194:34] ==> private final var extractInfo: ExtractSuperInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring[PropertyDescriptorImpl]

'originalClass' @ [194:46] ==> public final val originalClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperInfo[PropertyDescriptorImpl]

'analyze' @ [194:60] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [194:84] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'refTarget' @ [197:13] ==> value-parameter refTarget: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.collectTypeParameters[ValueParameterDescriptorImpl]

'refTarget' @ [197:45] ==> value-parameter refTarget: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.collectTypeParameters[ValueParameterDescriptorImpl]

'getStrictParentOfType' @ [197:55] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtTypeParameterListOwner? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtTypeParameterListOwner

'extractInfo' @ [197:108] ==> private final var extractInfo: ExtractSuperInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring[PropertyDescriptorImpl]

'originalClass' @ [197:120] ==> public final val originalClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperInfo[PropertyDescriptorImpl]

'typeParameters' @ [198:13] ==> private final val typeParameters: LinkedHashSet<KtTypeParameter> /* = LinkedHashSet<KtTypeParameter> */ defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring[PropertyDescriptorImpl]

'refTarget' @ [198:31] ==> value-parameter refTarget: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.collectTypeParameters[ValueParameterDescriptorImpl]

'refTarget' @ [199:13] ==> value-parameter refTarget: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.collectTypeParameters[ValueParameterDescriptorImpl]

'accept' @ [199:23] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'KtTreeVisitorVoid' @ [200:30] ==> public constructor KtTreeVisitorVoid() defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaClassConstructorDescriptor]

'expression' @ [202:30] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.collectTypeParameters.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'mainReference' @ [202:41] ==> public val KtSimpleNameExpression.mainReference: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.references[DeserializedPropertyDescriptor]

'resolve' @ [202:55] ==> @Nullable public open fun resolve(): PsiElement? defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference[JavaMethodDescriptor]

'let' @ [202:87] ==> @InlineOnly public inline fun <T, R> KtTypeParameter.let(block: (KtTypeParameter) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeParameter
    <R> -> Unit

'typeParameters' @ [202:93] ==> private final val typeParameters: LinkedHashSet<KtTypeParameter> /* = LinkedHashSet<KtTypeParameter> */ defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring[PropertyDescriptorImpl]

'it' @ [202:111] ==> value-parameter it: KtTypeParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.collectTypeParameters.<no name provided>.visitSimpleNameExpression.<anonymous>[ValueParameterDescriptorImpl]

'KtTreeVisitorVoid' @ [210:32] ==> public constructor KtTreeVisitorVoid() defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaClassConstructorDescriptor]

'expression' @ [212:33] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.analyzeContext.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'mainReference' @ [212:44] ==> public val KtSimpleNameExpression.mainReference: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.references[DeserializedPropertyDescriptor]

'resolve' @ [212:58] ==> @Nullable public open fun resolve(): PsiElement? defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference[JavaMethodDescriptor]

'collectTypeParameters' @ [213:17] ==> private final fun collectTypeParameters(refTarget: PsiElement?): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring[SimpleFunctionDescriptorImpl]

'refTarget' @ [213:39] ==> val refTarget: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.analyzeContext.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'getElementsToMove' @ [216:9] ==> private final fun getElementsToMove(memberInfos: Collection<KotlinMemberInfo>, originalClass: KtClassOrObject, isExtractInterface: Boolean): Map<KtElement, KotlinMemberInfo?> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.Companion[SimpleFunctionDescriptorImpl]

'extractInfo' @ [216:27] ==> private final var extractInfo: ExtractSuperInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring[PropertyDescriptorImpl]

'memberInfos' @ [216:39] ==> public final val memberInfos: Collection<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperInfo[PropertyDescriptorImpl]

'extractInfo' @ [216:52] ==> private final var extractInfo: ExtractSuperInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring[PropertyDescriptorImpl]

'originalClass' @ [216:64] ==> public final val originalClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperInfo[PropertyDescriptorImpl]

'extractInfo' @ [216:79] ==> private final var extractInfo: ExtractSuperInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring[PropertyDescriptorImpl]

'isInterface' @ [216:91] ==> public final val isInterface: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperInfo[PropertyDescriptorImpl]

'asSequence' @ [217:18] ==> public fun <K, V> Map<out KtElement, KotlinMemberInfo?>.asSequence(): Sequence<Map.Entry<KtElement, KotlinMemberInfo?>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtElement
    <V> -> KotlinMemberInfo?

'flatMap' @ [218:18] ==> public fun <T, R> Sequence<Map.Entry<KtElement, KotlinMemberInfo?>>.flatMap(transform: (Map.Entry<KtElement, KotlinMemberInfo?>) -> Sequence<PsiElement>): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Entry<KtElement, KotlinMemberInfo?>
    <R> -> PsiElement

'component1' @ [219:26] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<KtElement, KotlinMemberInfo?>.component1(): KtElement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtElement
    <V> -> KotlinMemberInfo?

'component2' @ [219:35] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<KtElement, KotlinMemberInfo?>.component2(): KotlinMemberInfo? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtElement
    <V> -> KotlinMemberInfo?

'it' @ [219:43] ==> value-parameter it: Map.Entry<KtElement, KotlinMemberInfo?> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.analyzeContext.<anonymous>[ValueParameterDescriptorImpl]

'info' @ [220:21] ==> val info: KotlinMemberInfo? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.analyzeContext.<anonymous>[LocalVariableDescriptor]

'getChildrenToAnalyze' @ [220:27] ==> public fun KotlinMemberInfo.getChildrenToAnalyze(): List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.memberInfo in file memberInfoUtils.kt[SimpleFunctionDescriptorImpl]

'asSequence' @ [220:51] ==> public fun <T> Iterable<PsiElement>.asSequence(): Sequence<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'sequenceOf' @ [220:67] ==> public fun <T> sequenceOf(vararg elements: KtElement): Sequence<KtElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'element' @ [220:78] ==> val element: KtElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.analyzeContext.<anonymous>[LocalVariableDescriptor]

'forEach' @ [222:18] ==> public inline fun <T> Sequence<PsiElement>.forEach(action: (PsiElement) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [222:28] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.analyzeContext.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [222:31] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'visitor' @ [222:38] ==> val visitor: <no name provided> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.analyzeContext[LocalVariableDescriptor]

'extractInfo' @ [226:28] ==> private final var extractInfo: ExtractSuperInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring[PropertyDescriptorImpl]

'targetParent' @ [226:40] ==> public final val targetParent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperInfo[PropertyDescriptorImpl]

'extractInfo' @ [227:28] ==> private final var extractInfo: ExtractSuperInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring[PropertyDescriptorImpl]

'newClassName' @ [227:40] ==> public final val newClassName: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperInfo[PropertyDescriptorImpl]

'quoteIfNeeded' @ [227:53] ==> public fun String.quoteIfNeeded(): String defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'extractInfo' @ [228:29] ==> private final var extractInfo: ExtractSuperInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring[PropertyDescriptorImpl]

'originalClass' @ [228:41] ==> public final val originalClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperInfo[PropertyDescriptorImpl]

'if (extractInfo.isInterface) "interface" else "class"' @ [230:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'extractInfo' @ [230:24] ==> private final var extractInfo: ExtractSuperInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring[PropertyDescriptorImpl]

'isInterface' @ [230:36] ==> public final val isInterface: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperInfo[PropertyDescriptorImpl]

'psiFactory' @ [231:25] ==> private final val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring[PropertyDescriptorImpl]

'createClass' @ [231:36] ==> public final fun createClass(text: String): KtClass defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'kind' @ [231:50] ==> val kind: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass[LocalVariableDescriptor]

'newClassName' @ [231:56] ==> val newClassName: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass[LocalVariableDescriptor]

'if (targetParent is PsiDirectory) {
            val template = FileTemplateManager.getInstance(project).getInternalTemplate("Kotlin File")
            val newFile = NewKotlinFileAction.createFileFromTemplate(extractInfo.targetFileName, template, targetParent) as KtFile
            newFile.add(prototype) as KtClass
        }
        else {
            val targetSibling = originalClass.parentsWithSelf.first { it.parent == targetParent }
            insertDeclaration(prototype, targetSibling)
        }' @ [232:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtClass, elseBranch: KtClass): KtClass[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtClass

'targetParent' @ [232:28] ==> val targetParent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass[LocalVariableDescriptor]

'getInstance' @ [233:48] ==> public open fun getInstance(@NotNull p0: Project): (FileTemplateManager..FileTemplateManager?) defined in com.intellij.ide.fileTemplates.FileTemplateManager[JavaMethodDescriptor]

'project' @ [233:60] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring[PropertyDescriptorImpl]

'getInternalTemplate' @ [233:69] ==> public abstract fun getInternalTemplate(@NotNull @NonNls p0: String): (FileTemplate..FileTemplate?) defined in com.intellij.ide.fileTemplates.FileTemplateManager[JavaMethodDescriptor]

'NewKotlinFileAction' @ [234:27] ==> public companion object defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction[FakeCallableDescriptorForObject]

'createFileFromTemplate' @ [234:47] ==> public final fun createFileFromTemplate(name: String, template: FileTemplate, dir: PsiDirectory): PsiFile? defined in org.jetbrains.kotlin.idea.actions.NewKotlinFileAction.Companion[SimpleFunctionDescriptorImpl]

'extractInfo' @ [234:70] ==> private final var extractInfo: ExtractSuperInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring[PropertyDescriptorImpl]

'targetFileName' @ [234:82] ==> public final val targetFileName: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperInfo[PropertyDescriptorImpl]

'template' @ [234:98] ==> val template: (FileTemplate..FileTemplate?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass[LocalVariableDescriptor]

'targetParent' @ [234:108] ==> val targetParent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass[LocalVariableDescriptor]

'newFile' @ [235:13] ==> val newFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass[LocalVariableDescriptor]

'add' @ [235:21] ==> public open fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'prototype' @ [235:25] ==> val prototype: KtClass defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass[LocalVariableDescriptor]

'originalClass' @ [238:33] ==> val originalClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass[LocalVariableDescriptor]

'parentsWithSelf' @ [238:47] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'first' @ [238:63] ==> public inline fun <T> Sequence<PsiElement>.first(predicate: (PsiElement) -> Boolean): PsiElement defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [238:71] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [238:74] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'targetParent' @ [238:84] ==> val targetParent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass[LocalVariableDescriptor]

'insertDeclaration' @ [239:13] ==> public fun <T : KtDeclaration> insertDeclaration(declaration: KtClass, targetSibling: PsiElement): KtClass defined in org.jetbrains.kotlin.idea.refactoring.introduce[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : KtDeclaration> -> KtClass

'prototype' @ [239:31] ==> val prototype: KtClass defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass[LocalVariableDescriptor]

'targetSibling' @ [239:42] ==> val targetSibling: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass[LocalVariableDescriptor]

'extractInfo' @ [242:32] ==> private final var extractInfo: ExtractSuperInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring[PropertyDescriptorImpl]

'memberInfos' @ [242:44] ==> public final val memberInfos: Collection<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperInfo[PropertyDescriptorImpl]

'any' @ [242:56] ==> public inline fun <T> Iterable<KotlinMemberInfo>.any(predicate: (KotlinMemberInfo) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinMemberInfo

'it' @ [242:62] ==> value-parameter it: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass.<anonymous>[ValueParameterDescriptorImpl]

'isToAbstract' @ [242:65] ==> public final var KotlinMemberInfo.isToAbstract: Boolean[MyPropertyDescriptor]

'!' @ [243:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'extractInfo' @ [243:14] ==> private final var extractInfo: ExtractSuperInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring[PropertyDescriptorImpl]

'isInterface' @ [243:26] ==> public final val isInterface: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperInfo[PropertyDescriptorImpl]

'newClass' @ [244:13] ==> val newClass: KtClass defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass[LocalVariableDescriptor]

'addModifier' @ [244:22] ==> public open fun addModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtClass[JavaMethodDescriptor]

'if (shouldBeAbstract) KtTokens.ABSTRACT_KEYWORD else KtTokens.OPEN_KEYWORD' @ [244:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (KtModifierKeywordToken..KtModifierKeywordToken?), elseBranch: (KtModifierKeywordToken..KtModifierKeywordToken?)): (KtModifierKeywordToken..KtModifierKeywordToken?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (org.jetbrains.kotlin.lexer.KtModifierKeywordToken..org.jetbrains.kotlin.lexer.KtModifierKeywordToken?)

'shouldBeAbstract' @ [244:38] ==> val shouldBeAbstract: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass[LocalVariableDescriptor]

'ABSTRACT_KEYWORD' @ [244:65] ==> public final val ABSTRACT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'OPEN_KEYWORD' @ [244:96] ==> public final val OPEN_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'typeParameters' @ [247:13] ==> private final val typeParameters: LinkedHashSet<KtTypeParameter> /* = LinkedHashSet<KtTypeParameter> */ defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring[PropertyDescriptorImpl]

'isNotEmpty' @ [247:28] ==> @InlineOnly public inline fun <T> Collection<KtTypeParameter>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeParameter

'typeParameters' @ [248:41] ==> private final val typeParameters: LinkedHashSet<KtTypeParameter> /* = LinkedHashSet<KtTypeParameter> */ defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring[PropertyDescriptorImpl]

'sortedBy' @ [248:56] ==> public inline fun <T, R : Comparable<Int>> Iterable<KtTypeParameter>.sortedBy(crossinline selector: (KtTypeParameter) -> Int?): List<KtTypeParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeParameter
    <R : Comparable<R>> -> Int

'it' @ [248:67] ==> value-parameter it: KtTypeParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass.<anonymous>[ValueParameterDescriptorImpl]

'startOffset' @ [248:70] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'joinToString' @ [248:84] ==> public fun <T> Iterable<KtTypeParameter>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((KtTypeParameter) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeParameter

'it' @ [248:128] ==> value-parameter it: KtTypeParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [248:131] ==> public final val KtTypeParameter.text: (String..String?)[MyPropertyDescriptor]

'newClass' @ [249:13] ==> val newClass: KtClass defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass[LocalVariableDescriptor]

'addAfter' @ [249:22] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtClass[JavaMethodDescriptor]

'psiFactory' @ [249:31] ==> private final val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring[PropertyDescriptorImpl]

'createTypeParameterList' @ [249:42] ==> public final fun createTypeParameterList(text: String): KtTypeParameterList defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'typeParameterListText' @ [249:66] ==> val typeParameterListText: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass[LocalVariableDescriptor]

'newClass' @ [249:90] ==> val newClass: KtClass defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass[LocalVariableDescriptor]

'nameIdentifier' @ [249:99] ==> public final val KtClass.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'targetParent' @ [252:36] ==> val targetParent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass[LocalVariableDescriptor]

'getPackage' @ [252:68] ==> public fun PsiDirectory.getPackage(): PsiPackage? defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'qualifiedName' @ [252:82] ==> public final val PsiPackage.qualifiedName: String[MyPropertyDescriptor]

'buildString' @ [254:29] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'!' @ [255:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'targetPackageFqName' @ [255:18] ==> val targetPackageFqName: String? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass[LocalVariableDescriptor]

'isNullOrEmpty' @ [255:38] ==> @InlineOnly public inline fun CharSequence?.isNullOrEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'append' @ [256:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'targetPackageFqName' @ [256:24] ==> val targetPackageFqName: String? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass[LocalVariableDescriptor]

'append' @ [256:45] ==> public open fun append(p0: Char): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [258:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'newClassName' @ [258:20] ==> val newClassName: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass[LocalVariableDescriptor]

'typeParameters' @ [259:17] ==> private final val typeParameters: LinkedHashSet<KtTypeParameter> /* = LinkedHashSet<KtTypeParameter> */ defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring[PropertyDescriptorImpl]

'isNotEmpty' @ [259:32] ==> @InlineOnly public inline fun <T> Collection<KtTypeParameter>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeParameter

'append' @ [260:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'typeParameters' @ [260:24] ==> private final val typeParameters: LinkedHashSet<KtTypeParameter> /* = LinkedHashSet<KtTypeParameter> */ defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring[PropertyDescriptorImpl]

'sortedBy' @ [260:39] ==> public inline fun <T, R : Comparable<Int>> Iterable<KtTypeParameter>.sortedBy(crossinline selector: (KtTypeParameter) -> Int?): List<KtTypeParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeParameter
    <R : Comparable<R>> -> Int

'it' @ [260:50] ==> value-parameter it: KtTypeParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startOffset' @ [260:53] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'map' @ [260:67] ==> public inline fun <T, R> Iterable<KtTypeParameter>.map(transform: (KtTypeParameter) -> String?): List<String?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeParameter
    <R> -> String?

'it' @ [260:73] ==> value-parameter it: KtTypeParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [260:76] ==> public final val KtTypeParameter.name: String?[MyPropertyDescriptor]

'joinToString' @ [260:83] ==> public fun <T> Iterable<String?>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String?) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?

'!' @ [263:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'extractInfo' @ [263:30] ==> private final var extractInfo: ExtractSuperInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring[PropertyDescriptorImpl]

'isInterface' @ [263:42] ==> public final val isInterface: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperInfo[PropertyDescriptorImpl]

'superClassEntry' @ [264:33] ==> value-parameter superClassEntry: KtSuperTypeListEntry? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass[ValueParameterDescriptorImpl]

'originalClass' @ [265:32] ==> val originalClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass[LocalVariableDescriptor]

'hasPrimaryConstructor' @ [265:46] ==> public open fun hasPrimaryConstructor(): Boolean defined in org.jetbrains.kotlin.psi.KtClassOrObject[DeserializedSimpleFunctionDescriptor]

'originalClass' @ [266:32] ==> val originalClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass[LocalVariableDescriptor]

'secondaryConstructors' @ [266:46] ==> public final val KtClassOrObject.secondaryConstructors: List<KtSecondaryConstructor>[MyPropertyDescriptor]

'isEmpty' @ [266:68] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'if (needSuperCall) {
            psiFactory.createSuperTypeCallEntry("$superTypeText()")
        }
        else {
            psiFactory.createSuperTypeEntry(superTypeText)
        }' @ [267:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtSuperTypeListEntry, elseBranch: KtSuperTypeListEntry): KtSuperTypeListEntry[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtSuperTypeListEntry

'needSuperCall' @ [267:41] ==> val needSuperCall: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass[LocalVariableDescriptor]

'psiFactory' @ [268:13] ==> private final val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring[PropertyDescriptorImpl]

'createSuperTypeCallEntry' @ [268:24] ==> public final fun createSuperTypeCallEntry(text: String): KtSuperTypeCallEntry defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'superTypeText' @ [268:51] ==> val superTypeText: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass[LocalVariableDescriptor]

'psiFactory' @ [271:13] ==> private final val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring[PropertyDescriptorImpl]

'createSuperTypeEntry' @ [271:24] ==> public final fun createSuperTypeEntry(text: String): KtSuperTypeEntry defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'superTypeText' @ [271:45] ==> val superTypeText: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass[LocalVariableDescriptor]

'if (superClassEntry != null) {
            val qualifiedTypeRefText = bindingContext[BindingContext.TYPE, superClassEntry.typeReference]?.let {
                IdeDescriptorRenderers.SOURCE_CODE.renderType(it)
            }
            val superClassEntryToAdd = if (qualifiedTypeRefText != null) {
                superClassEntry.copied().apply { typeReference?.replace(psiFactory.createType(qualifiedTypeRefText)) }
            }
            else superClassEntry
            newClass.addSuperTypeListEntry(superClassEntryToAdd)
            ShortenReferences.DEFAULT.process(superClassEntry.replaced(newSuperTypeListEntry))
        }
        else {
            ShortenReferences.DEFAULT.process(originalClass.addSuperTypeListEntry(newSuperTypeListEntry))
        }' @ [273:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtElement, elseBranch: KtElement): KtElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtElement

'superClassEntry' @ [273:13] ==> value-parameter superClassEntry: KtSuperTypeListEntry? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass[ValueParameterDescriptorImpl]

'bindingContext' @ [274:40] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring[PropertyDescriptorImpl]

'TYPE' @ [274:70] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'superClassEntry' @ [274:76] ==> value-parameter superClassEntry: KtSuperTypeListEntry? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass[ValueParameterDescriptorImpl]

'typeReference' @ [274:92] ==> public final val KtSuperTypeListEntry.typeReference: KtTypeReference?[MyPropertyDescriptor]

'let' @ [274:108] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> String

'IdeDescriptorRenderers' @ [275:17] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE' @ [275:40] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [275:52] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'it' @ [275:63] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass.<anonymous>[ValueParameterDescriptorImpl]

'if (qualifiedTypeRefText != null) {
                superClassEntry.copied().apply { typeReference?.replace(psiFactory.createType(qualifiedTypeRefText)) }
            }
            else superClassEntry' @ [277:40] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtSuperTypeListEntry, elseBranch: KtSuperTypeListEntry): KtSuperTypeListEntry[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtSuperTypeListEntry

'qualifiedTypeRefText' @ [277:44] ==> val qualifiedTypeRefText: String? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass[LocalVariableDescriptor]

'superClassEntry' @ [278:17] ==> value-parameter superClassEntry: KtSuperTypeListEntry? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass[ValueParameterDescriptorImpl]

'copied' @ [278:33] ==> public fun <T : PsiElement> KtSuperTypeListEntry.copied(): KtSuperTypeListEntry defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : PsiElement> -> KtSuperTypeListEntry

'apply' @ [278:42] ==> @InlineOnly public inline fun <T> KtSuperTypeListEntry.apply(block: KtSuperTypeListEntry.() -> Unit): KtSuperTypeListEntry defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSuperTypeListEntry

'typeReference' @ [278:50] ==> public final val KtSuperTypeListEntry.typeReference: KtTypeReference?[MyPropertyDescriptor]

'replace' @ [278:65] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtTypeReference[JavaMethodDescriptor]

'psiFactory' @ [278:73] ==> private final val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring[PropertyDescriptorImpl]

'createType' @ [278:84] ==> public final fun createType(type: String): KtTypeReference defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'qualifiedTypeRefText' @ [278:95] ==> val qualifiedTypeRefText: String? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass[LocalVariableDescriptor]

'superClassEntry' @ [280:18] ==> value-parameter superClassEntry: KtSuperTypeListEntry? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass[ValueParameterDescriptorImpl]

'newClass' @ [281:13] ==> val newClass: KtClass defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass[LocalVariableDescriptor]

'addSuperTypeListEntry' @ [281:22] ==> public final fun addSuperTypeListEntry(superTypeListEntry: KtSuperTypeListEntry): KtSuperTypeListEntry defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'superClassEntryToAdd' @ [281:44] ==> val superClassEntryToAdd: KtSuperTypeListEntry defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass[LocalVariableDescriptor]

'DEFAULT' @ [282:31] ==> @field:JvmField public final val DEFAULT: ShortenReferences defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[DeserializedPropertyDescriptor]

'process' @ [282:39] ==> @JvmOverloads public final fun process(element: KtElement, elementFilter: (PsiElement) -> ShortenReferences.FilterResult = ...): KtElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences[DeserializedSimpleFunctionDescriptor]

'superClassEntry' @ [282:47] ==> value-parameter superClassEntry: KtSuperTypeListEntry? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass[ValueParameterDescriptorImpl]

'replaced' @ [282:63] ==> public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtSuperTypeListEntry): KtSuperTypeListEntry defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtSuperTypeListEntry

'newSuperTypeListEntry' @ [282:72] ==> val newSuperTypeListEntry: KtSuperTypeListEntry defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass[LocalVariableDescriptor]

'DEFAULT' @ [285:31] ==> @field:JvmField public final val DEFAULT: ShortenReferences defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[DeserializedPropertyDescriptor]

'process' @ [285:39] ==> @JvmOverloads public final fun process(element: KtElement, elementFilter: (PsiElement) -> ShortenReferences.FilterResult = ...): KtElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences[DeserializedSimpleFunctionDescriptor]

'originalClass' @ [285:47] ==> val originalClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass[LocalVariableDescriptor]

'addSuperTypeListEntry' @ [285:61] ==> public final fun addSuperTypeListEntry(superTypeListEntry: KtSuperTypeListEntry): KtSuperTypeListEntry defined in org.jetbrains.kotlin.psi.KtClassOrObject[DeserializedSimpleFunctionDescriptor]

'newSuperTypeListEntry' @ [285:83] ==> val newSuperTypeListEntry: KtSuperTypeListEntry defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass[LocalVariableDescriptor]

'ShortenReferences' @ [288:9] ==> public companion object defined in org.jetbrains.kotlin.idea.core.ShortenReferences[FakeCallableDescriptorForObject]

'DEFAULT' @ [288:27] ==> @field:JvmField public final val DEFAULT: ShortenReferences defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[DeserializedPropertyDescriptor]

'process' @ [288:35] ==> @JvmOverloads public final fun process(element: KtElement, elementFilter: (PsiElement) -> ShortenReferences.FilterResult = ...): KtElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences[DeserializedSimpleFunctionDescriptor]

'newClass' @ [288:43] ==> val newClass: KtClass defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass[LocalVariableDescriptor]

'newClass' @ [290:16] ==> val newClass: KtClass defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.createClass[LocalVariableDescriptor]

'extractInfo' @ [294:29] ==> private final var extractInfo: ExtractSuperInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring[PropertyDescriptorImpl]

'originalClass' @ [294:41] ==> public final val originalClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperInfo[PropertyDescriptorImpl]

'if (extractInfo.isInterface) KotlinExtractInterfaceHandler else KotlinExtractSuperclassHandler' @ [296:23] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinExtractSuperHandlerBase, elseBranch: KotlinExtractSuperHandlerBase): KotlinExtractSuperHandlerBase[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinExtractSuperHandlerBase

'extractInfo' @ [296:27] ==> private final var extractInfo: ExtractSuperInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring[PropertyDescriptorImpl]

'isInterface' @ [296:39] ==> public final val isInterface: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperInfo[PropertyDescriptorImpl]

'KotlinExtractInterfaceHandler' @ [296:52] ==> public object KotlinExtractInterfaceHandler : KotlinExtractSuperHandlerBase defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass in file KotlinExtractInterfaceHandler.kt[FakeCallableDescriptorForObject]

'KotlinExtractSuperclassHandler' @ [296:87] ==> public object KotlinExtractSuperclassHandler : KotlinExtractSuperHandlerBase defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass in file KotlinExtractSuperclassHandler.kt[FakeCallableDescriptorForObject]

'handler' @ [297:9] ==> val handler: KotlinExtractSuperHandlerBase defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.performRefactoring[LocalVariableDescriptor]

'getErrorMessage' @ [297:17] ==> internal abstract fun getErrorMessage(klass: KtClassOrObject): String? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.KotlinExtractSuperHandlerBase[SimpleFunctionDescriptorImpl]

'originalClass' @ [297:33] ==> val originalClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.performRefactoring[LocalVariableDescriptor]

'let' @ [297:49] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Nothing

'RefactoringErrorHintException' @ [297:83] ==> public constructor RefactoringErrorHintException(p0: (String..String?)) defined in com.intellij.refactoring.util.CommonRefactoringUtil.RefactoringErrorHintException[JavaClassConstructorDescriptor]

'it' @ [297:113] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.performRefactoring.<anonymous>[ValueParameterDescriptorImpl]

'if (!extractInfo.isInterface) {
            val originalClassDescriptor = originalClass.resolveToDescriptor() as ClassDescriptor
            val superClassDescriptor = originalClassDescriptor.getSuperClassNotAny()
            originalClass.superTypeListEntries.firstOrNull {
                bindingContext[BindingContext.TYPE, it.typeReference]?.constructor?.declarationDescriptor == superClassDescriptor
            }
        }
        else null' @ [299:31] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtSuperTypeListEntry?, elseBranch: KtSuperTypeListEntry?): KtSuperTypeListEntry?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtSuperTypeListEntry?

'!' @ [299:35] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'extractInfo' @ [299:36] ==> private final var extractInfo: ExtractSuperInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring[PropertyDescriptorImpl]

'isInterface' @ [299:48] ==> public final val isInterface: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperInfo[PropertyDescriptorImpl]

'originalClass' @ [300:43] ==> val originalClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.performRefactoring[LocalVariableDescriptor]

'resolveToDescriptor' @ [300:57] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'originalClassDescriptor' @ [301:40] ==> val originalClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.performRefactoring[LocalVariableDescriptor]

'getSuperClassNotAny' @ [301:64] ==> public fun ClassDescriptor.getSuperClassNotAny(): ClassDescriptor? defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'originalClass' @ [302:13] ==> val originalClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.performRefactoring[LocalVariableDescriptor]

'superTypeListEntries' @ [302:27] ==> public final val KtClassOrObject.superTypeListEntries: List<KtSuperTypeListEntry>[MyPropertyDescriptor]

'firstOrNull' @ [302:48] ==> public inline fun <T> Iterable<KtSuperTypeListEntry>.firstOrNull(predicate: (KtSuperTypeListEntry) -> Boolean): KtSuperTypeListEntry? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSuperTypeListEntry

'bindingContext' @ [303:17] ==> private final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring[PropertyDescriptorImpl]

'TYPE' @ [303:47] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [303:53] ==> value-parameter it: KtSuperTypeListEntry defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.performRefactoring.<anonymous>[ValueParameterDescriptorImpl]

'typeReference' @ [303:56] ==> public final val KtSuperTypeListEntry.typeReference: KtTypeReference?[MyPropertyDescriptor]

'constructor' @ [303:72] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [303:85] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'superClassDescriptor' @ [303:110] ==> val superClassDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.performRefactoring[LocalVariableDescriptor]

'project' @ [308:9] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring[PropertyDescriptorImpl]

'runSynchronouslyWithProgress' @ [308:17] ==> public fun <T : Any> Project.runSynchronouslyWithProgress(progressTitle: String, canBeCanceled: Boolean, action: () -> Unit): Unit? defined in org.jetbrains.kotlin.idea[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> Unit

'message' @ [308:64] ==> public open fun message(@PropertyKey p0: (String..String?)): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'runReadAction' @ [308:98] ==> public fun <T> runReadAction(action: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'analyzeContext' @ [308:114] ==> private final fun analyzeContext(): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring[SimpleFunctionDescriptorImpl]

'project' @ [310:9] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring[PropertyDescriptorImpl]

'executeWriteCommand' @ [310:17] ==> public fun Project.executeWriteCommand(name: String, command: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]

'REFACTORING_NAME' @ [310:68] ==> public final val REFACTORING_NAME: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.KotlinExtractSuperclassHandler[PropertyDescriptorImpl]

'createClass' @ [311:28] ==> private final fun createClass(superClassEntry: KtSuperTypeListEntry?): KtClass defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring[SimpleFunctionDescriptorImpl]

'superClassEntry' @ [311:40] ==> val superClassEntry: KtSuperTypeListEntry? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.performRefactoring[LocalVariableDescriptor]

'extractInfo' @ [313:28] ==> private final var extractInfo: ExtractSuperInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring[PropertyDescriptorImpl]

'originalClass' @ [313:40] ==> public final val originalClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperInfo[PropertyDescriptorImpl]

'toLightClass' @ [313:54] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'newClass' @ [314:30] ==> val newClass: KtClass defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.performRefactoring.<anonymous>[LocalVariableDescriptor]

'toLightClass' @ [314:39] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'PullUpProcessor' @ [316:13] ==> public constructor PullUpProcessor(p0: (PsiClass..PsiClass?), p1: (PsiClass..PsiClass?), p2: (Array<(MemberInfo..MemberInfo?)>..Array<out (MemberInfo..MemberInfo?)>?), p3: raw (DocCommentPolicy<(PsiComment..PsiComment?)>..DocCommentPolicy<*>?)) defined in com.intellij.refactoring.memberPullUp.PullUpProcessor[JavaClassConstructorDescriptor]

'subClass' @ [317:21] ==> val subClass: KtLightClass? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.performRefactoring.<anonymous>[LocalVariableDescriptor]

'superClass' @ [318:21] ==> val superClass: KtLightClass? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.performRefactoring.<anonymous>[LocalVariableDescriptor]

'extractInfo' @ [319:21] ==> private final var extractInfo: ExtractSuperInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring[PropertyDescriptorImpl]

'memberInfos' @ [319:33] ==> public final val memberInfos: Collection<KotlinMemberInfo> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperInfo[PropertyDescriptorImpl]

'mapNotNull' @ [319:45] ==> public inline fun <T, R : Any> Iterable<KotlinMemberInfo>.mapNotNull(transform: (KotlinMemberInfo) -> MemberInfo?): List<MemberInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinMemberInfo
    <R : Any> -> MemberInfo

'it' @ [319:58] ==> value-parameter it: KotlinMemberInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring.performRefactoring.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toJavaMemberInfo' @ [319:61] ==> public fun MemberInfoBase<out KtNamedDeclaration>.toJavaMemberInfo(): MemberInfo? defined in org.jetbrains.kotlin.idea.refactoring.memberInfo in file KotlinMemberInfo.kt[SimpleFunctionDescriptorImpl]

'toTypedArray' @ [319:82] ==> public inline fun <reified T> Collection<MemberInfo>.toTypedArray(): Array<MemberInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> MemberInfo

'extractInfo' @ [320:21] ==> private final var extractInfo: ExtractSuperInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring[PropertyDescriptorImpl]

'docPolicy' @ [320:33] ==> public final val docPolicy: DocCommentPolicy<*> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperInfo[PropertyDescriptorImpl]

'moveMembersToBase' @ [321:15] ==> public open fun moveMembersToBase(): Unit defined in com.intellij.refactoring.memberPullUp.PullUpProcessor[JavaMethodDescriptor]

'performDelayedRefactoringRequests' @ [323:13] ==> public fun performDelayedRefactoringRequests(project: Project): Unit defined in org.jetbrains.kotlin.idea.codeInsight.shorten[DeserializedSimpleFunctionDescriptor]

'project' @ [323:47] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractClass.ExtractSuperRefactoring[PropertyDescriptorImpl]

