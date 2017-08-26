'file' @ [36:27] ==> public final val file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.KotlinChangePackageRefactoring[PropertyDescriptorImpl]

'project' @ [36:32] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'file' @ [39:32] ==> public final val file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.KotlinChangePackageRefactoring[PropertyDescriptorImpl]

'packageDirective' @ [39:37] ==> public final val KtFile.packageDirective: KtPackageDirective?[MyPropertyDescriptor]

'packageDirective' @ [40:29] ==> val packageDirective: KtPackageDirective defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.KotlinChangePackageRefactoring.run[LocalVariableDescriptor]

'fqName' @ [40:46] ==> public final var KtPackageDirective.fqName: FqName[MyPropertyDescriptor]

'MoveKotlinDeclarationsProcessor' @ [42:36] ==> public constructor MoveKotlinDeclarationsProcessor(descriptor: MoveDeclarationsDescriptor, mover: Mover = ...) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[ClassConstructorDescriptorImpl]

'MoveDeclarationsDescriptor' @ [43:17] ==> @JvmOverloads public constructor MoveDeclarationsDescriptor(project: Project, elementsToMove: Collection<KtNamedDeclaration>, moveTarget: KotlinMoveTarget, delegate: MoveDeclarationsDelegate, searchInCommentsAndStrings: Boolean = ..., searchInNonCode: Boolean = ..., scanEntireFile: Boolean = ..., deleteSourceFiles: Boolean = ..., moveCallback: MoveCallback? = ..., openInEditor: Boolean = ..., allElementsToMove: List<PsiElement>? = ...) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDescriptor[ClassConstructorDescriptorImpl]

'project' @ [44:35] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.KotlinChangePackageRefactoring[PropertyDescriptorImpl]

'file' @ [45:42] ==> public final val file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.KotlinChangePackageRefactoring[PropertyDescriptorImpl]

'declarations' @ [45:47] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'filterIsInstance' @ [45:60] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtNamedDeclaration

'KotlinDirectoryMoveTarget' @ [46:38] ==> public constructor KotlinDirectoryMoveTarget(targetContainerFqName: FqName, directory: PsiDirectory) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinDirectoryMoveTarget[ClassConstructorDescriptorImpl]

'newFqName' @ [46:64] ==> value-parameter newFqName: FqName defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.KotlinChangePackageRefactoring.run[ValueParameterDescriptorImpl]

'file' @ [46:75] ==> public final val file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.KotlinChangePackageRefactoring[PropertyDescriptorImpl]

'containingDirectory' @ [46:80] ==> public final val KtFile.containingDirectory: PsiDirectory?[MyPropertyDescriptor]

'TopLevel' @ [47:61] ==> public object TopLevel : MoveDeclarationsDelegate defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate[FakeCallableDescriptorForObject]

'Idle' @ [50:23] ==> public object Idle : Mover defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.Mover[FakeCallableDescriptorForObject]

'declarationProcessor' @ [53:33] ==> val declarationProcessor: MoveKotlinDeclarationsProcessor defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.KotlinChangePackageRefactoring.run[LocalVariableDescriptor]

'findUsages' @ [53:54] ==> public open fun findUsages(): Array<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[SimpleFunctionDescriptorImpl]

'toList' @ [53:67] ==> public fun <T> Array<out UsageInfo>.toList(): List<UsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageInfo

'ContainerChangeInfo' @ [54:26] ==> public constructor ContainerChangeInfo(oldContainer: ContainerInfo, newContainer: ContainerInfo) defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerChangeInfo[ClassConstructorDescriptorImpl]

'Package' @ [54:60] ==> public constructor Package(fqName: FqName) defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerInfo.Package[ClassConstructorDescriptorImpl]

'currentFqName' @ [54:68] ==> val currentFqName: FqName defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.KotlinChangePackageRefactoring.run[LocalVariableDescriptor]

'Package' @ [54:98] ==> public constructor Package(fqName: FqName) defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerInfo.Package[ClassConstructorDescriptorImpl]

'newFqName' @ [54:106] ==> value-parameter newFqName: FqName defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.KotlinChangePackageRefactoring.run[ValueParameterDescriptorImpl]

'file' @ [55:30] ==> public final val file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.KotlinChangePackageRefactoring[PropertyDescriptorImpl]

'getInternalReferencesToUpdateOnPackageNameChange' @ [55:35] ==> public fun KtElement.getInternalReferencesToUpdateOnPackageNameChange(containerChangeInfo: ContainerChangeInfo): List<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move in file moveUtils.kt[SimpleFunctionDescriptorImpl]

'changeInfo' @ [55:84] ==> val changeInfo: ContainerChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.KotlinChangePackageRefactoring.run[LocalVariableDescriptor]

'project' @ [57:9] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.KotlinChangePackageRefactoring[PropertyDescriptorImpl]

'executeWriteCommand' @ [57:17] ==> public fun Project.executeWriteCommand(name: String, command: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]

'newFqName' @ [57:66] ==> value-parameter newFqName: FqName defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.KotlinChangePackageRefactoring.run[ValueParameterDescriptorImpl]

'asString' @ [57:76] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'packageDirective' @ [58:13] ==> val packageDirective: KtPackageDirective defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.KotlinChangePackageRefactoring.run[LocalVariableDescriptor]

'fqName' @ [58:30] ==> public final var KtPackageDirective.fqName: FqName[MyPropertyDescriptor]

'newFqName' @ [58:39] ==> value-parameter newFqName: FqName defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.KotlinChangePackageRefactoring.run[ValueParameterDescriptorImpl]

'quoteIfNeeded' @ [58:49] ==> public fun FqName.quoteIfNeeded(): FqName defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'postProcessMoveUsages' @ [59:13] ==> public fun postProcessMoveUsages(usages: Collection<UsageInfo>, oldToNewElementsMapping: Map<PsiElement, PsiElement> = ..., shorteningMode: KtSimpleNameReference.ShorteningMode = ...): List<NonCodeUsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move in file moveUtils.kt[SimpleFunctionDescriptorImpl]

'internalUsages' @ [59:35] ==> val internalUsages: List<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.KotlinChangePackageRefactoring.run[LocalVariableDescriptor]

'project' @ [60:13] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.KotlinChangePackageRefactoring[PropertyDescriptorImpl]

'runRefactoringAndKeepDelayedRequests' @ [60:21] ==> public fun Project.runRefactoringAndKeepDelayedRequests(action: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.codeInsight.shorten[DeserializedSimpleFunctionDescriptor]

'declarationProcessor' @ [60:60] ==> val declarationProcessor: MoveKotlinDeclarationsProcessor defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.KotlinChangePackageRefactoring.run[LocalVariableDescriptor]

'execute' @ [60:81] ==> public final fun execute(usages: List<UsageInfo>): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsProcessor[SimpleFunctionDescriptorImpl]

'declarationUsages' @ [60:89] ==> val declarationUsages: List<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.KotlinChangePackageRefactoring.run[LocalVariableDescriptor]

