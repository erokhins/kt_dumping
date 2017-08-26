'emptyList' @ [39:92] ==> public fun <T> emptyList(): List<UsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageInfo

'MoveDeclarationsDelegate' @ [57:23] ==> private constructor MoveDeclarationsDelegate() defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate[ClassConstructorDescriptorImpl]

'Package' @ [59:47] ==> public constructor Package(fqName: FqName) defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerInfo.Package[ClassConstructorDescriptorImpl]

'originalDeclaration' @ [59:55] ==> value-parameter originalDeclaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.TopLevel.getContainerChangeInfo[ValueParameterDescriptorImpl]

'containingKtFile' @ [59:75] ==> public final val KtNamedDeclaration.containingKtFile: KtFile[MyPropertyDescriptor]

'packageFqName' @ [59:92] ==> public final val KtFile.packageFqName: FqName[MyPropertyDescriptor]

'moveTarget' @ [60:33] ==> value-parameter moveTarget: KotlinMoveTarget defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.TopLevel.getContainerChangeInfo[ValueParameterDescriptorImpl]

'targetContainerFqName' @ [60:44] ==> public abstract val targetContainerFqName: FqName? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinMoveTarget[PropertyDescriptorImpl]

'let' @ [60:67] ==> @InlineOnly public inline fun <T, R> FqName.let(block: (FqName) -> ContainerInfo.Package): ContainerInfo.Package defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName
    <R> -> Package

'Package' @ [60:87] ==> public constructor Package(fqName: FqName) defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerInfo.Package[ClassConstructorDescriptorImpl]

'it' @ [60:95] ==> value-parameter it: FqName defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.TopLevel.getContainerChangeInfo.<anonymous>[ValueParameterDescriptorImpl]

'UnknownPackage' @ [60:118] ==> public object UnknownPackage : ContainerInfo defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerInfo[FakeCallableDescriptorForObject]

'ContainerChangeInfo' @ [61:20] ==> public constructor ContainerChangeInfo(oldContainer: ContainerInfo, newContainer: ContainerInfo) defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerChangeInfo[ClassConstructorDescriptorImpl]

'sourcePackage' @ [61:40] ==> val sourcePackage: ContainerInfo.Package defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.TopLevel.getContainerChangeInfo[LocalVariableDescriptor]

'targetPackage' @ [61:55] ==> val targetPackage: ContainerInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.TopLevel.getContainerChangeInfo[LocalVariableDescriptor]

'MoveDeclarationsDelegate' @ [68:9] ==> private constructor MoveDeclarationsDelegate() defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate[ClassConstructorDescriptorImpl]

'Class' @ [70:46] ==> public constructor Class(fqName: FqName) defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerInfo.Class[ClassConstructorDescriptorImpl]

'originalDeclaration' @ [70:52] ==> value-parameter originalDeclaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.getContainerChangeInfo[ValueParameterDescriptorImpl]

'containingClassOrObject' @ [70:72] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'fqName' @ [70:98] ==> public final val KtClassOrObject.fqName: FqName?[MyPropertyDescriptor]

'moveTarget' @ [71:34] ==> value-parameter moveTarget: KotlinMoveTarget defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.getContainerChangeInfo[ValueParameterDescriptorImpl]

'targetElement' @ [71:86] ==> public final val targetElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinMoveTargetForExistingElement[PropertyDescriptorImpl]

'moveTarget' @ [72:41] ==> value-parameter moveTarget: KotlinMoveTarget defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.getContainerChangeInfo[ValueParameterDescriptorImpl]

'targetContainerFqName' @ [72:52] ==> public abstract val targetContainerFqName: FqName? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinMoveTarget[PropertyDescriptorImpl]

'when {
                targetContainerFqName == null -> ContainerInfo.UnknownPackage
                movingToClass -> ContainerInfo.Class(targetContainerFqName)
                else -> ContainerInfo.Package(targetContainerFqName)
            }' @ [73:27] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ContainerInfo, entry1: ContainerInfo, entry2: ContainerInfo): ContainerInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ContainerInfo

'targetContainerFqName' @ [74:17] ==> val targetContainerFqName: FqName? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.getContainerChangeInfo[LocalVariableDescriptor]

'UnknownPackage' @ [74:64] ==> public object UnknownPackage : ContainerInfo defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerInfo[FakeCallableDescriptorForObject]

'movingToClass' @ [75:17] ==> val movingToClass: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.getContainerChangeInfo[LocalVariableDescriptor]

'Class' @ [75:48] ==> public constructor Class(fqName: FqName) defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerInfo.Class[ClassConstructorDescriptorImpl]

'targetContainerFqName' @ [75:54] ==> val targetContainerFqName: FqName? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.getContainerChangeInfo[LocalVariableDescriptor]

'Package' @ [76:39] ==> public constructor Package(fqName: FqName) defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerInfo.Package[ClassConstructorDescriptorImpl]

'targetContainerFqName' @ [76:47] ==> val targetContainerFqName: FqName? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.getContainerChangeInfo[LocalVariableDescriptor]

'ContainerChangeInfo' @ [78:20] ==> public constructor ContainerChangeInfo(oldContainer: ContainerInfo, newContainer: ContainerInfo) defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerChangeInfo[ClassConstructorDescriptorImpl]

'originalInfo' @ [78:40] ==> val originalInfo: ContainerInfo.Class defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.getContainerChangeInfo[LocalVariableDescriptor]

'newInfo' @ [78:54] ==> val newInfo: ContainerInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.getContainerChangeInfo[LocalVariableDescriptor]

'descriptor' @ [82:31] ==> value-parameter descriptor: MoveDeclarationsDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.findInternalUsages[ValueParameterDescriptorImpl]

'elementsToMove' @ [82:42] ==> public final val elementsToMove: Collection<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDescriptor[PropertyDescriptorImpl]

'singleOrNull' @ [82:57] ==> public fun <T> Iterable<KtNamedDeclaration>.singleOrNull(): KtNamedDeclaration? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration

'emptyList' @ [82:94] ==> public fun <T> emptyList(): List<UsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageInfo

'collectOuterInstanceReferences' @ [83:20] ==> public fun collectOuterInstanceReferences(member: KtNamedDeclaration): List<OuterInstanceReferenceUsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move[SimpleFunctionDescriptorImpl]

'classToMove' @ [83:51] ==> val classToMove: KtClass defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.findInternalUsages[LocalVariableDescriptor]

'moveDescriptor' @ [90:30] ==> value-parameter moveDescriptor: MoveDeclarationsDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.isValidTargetForImplicitCompanionAsDispatchReceiver[ValueParameterDescriptorImpl]

'moveTarget' @ [90:45] ==> public final val moveTarget: KotlinMoveTarget defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDescriptor[PropertyDescriptorImpl]

'when (moveTarget) {
                is KotlinMoveTargetForCompanion -> true
                is KotlinMoveTargetForExistingElement -> {
                    val targetClass = moveTarget.targetElement as? KtClassOrObject ?: return false
                    val targetClassDescriptor = targetClass.resolveToDescriptor() as ClassDescriptor
                    val companionClassDescriptor = companionDescriptor.containingDeclaration as? ClassDescriptor ?: return false
                    targetClassDescriptor.isSubclassOf(companionClassDescriptor)
                }
                else -> false
            }' @ [91:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'moveTarget' @ [91:26] ==> val moveTarget: KotlinMoveTarget defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.isValidTargetForImplicitCompanionAsDispatchReceiver[LocalVariableDescriptor]

'moveTarget' @ [94:39] ==> val moveTarget: KotlinMoveTarget defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.isValidTargetForImplicitCompanionAsDispatchReceiver[LocalVariableDescriptor]

'targetElement' @ [94:50] ==> public final val targetElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinMoveTargetForExistingElement[PropertyDescriptorImpl]

'targetClass' @ [95:49] ==> val targetClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.isValidTargetForImplicitCompanionAsDispatchReceiver[LocalVariableDescriptor]

'resolveToDescriptor' @ [95:61] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'companionDescriptor' @ [96:52] ==> value-parameter companionDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.isValidTargetForImplicitCompanionAsDispatchReceiver[ValueParameterDescriptorImpl]

'containingDeclaration' @ [96:72] ==> public final val ClassDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'targetClassDescriptor' @ [97:21] ==> val targetClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.isValidTargetForImplicitCompanionAsDispatchReceiver[LocalVariableDescriptor]

'isSubclassOf' @ [97:43] ==> public fun ClassDescriptor.isSubclassOf(superclass: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'companionClassDescriptor' @ [97:56] ==> val companionClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.isValidTargetForImplicitCompanionAsDispatchReceiver[LocalVariableDescriptor]

'internalUsages' @ [108:33] ==> value-parameter internalUsages: MutableSet<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.collectConflicts[ValueParameterDescriptorImpl]

'iterator' @ [108:48] ==> public abstract fun iterator(): MutableIterator<UsageInfo> defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'usageIterator' @ [109:20] ==> val usageIterator: MutableIterator<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.collectConflicts[LocalVariableDescriptor]

'hasNext' @ [109:34] ==> public abstract fun hasNext(): Boolean defined in kotlin.collections.MutableIterator[DeserializedSimpleFunctionDescriptor]

'usageIterator' @ [110:29] ==> val usageIterator: MutableIterator<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.collectConflicts[LocalVariableDescriptor]

'next' @ [110:43] ==> public abstract fun next(): UsageInfo defined in kotlin.collections.MutableIterator[DeserializedSimpleFunctionDescriptor]

'usage' @ [111:31] ==> val usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.collectConflicts[LocalVariableDescriptor]

'element' @ [111:37] ==> public final val UsageInfo.element: PsiElement?[MyPropertyDescriptor]

'when (usage) {
                    is ImplicitCompanionAsDispatchReceiverUsageInfo -> {
                        if (!isValidTargetForImplicitCompanionAsDispatchReceiver(descriptor, usage.companionDescriptor)) {
                            conflicts.putValue(element, "Implicit companion object will be inaccessible: ${element.text}")
                        }
                        true
                    }

                    is OuterInstanceReferenceUsageInfo -> usage.reportConflictIfAny(conflicts)

                    else -> false
                }' @ [113:34] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'usage' @ [113:40] ==> val usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.collectConflicts[LocalVariableDescriptor]

'!' @ [115:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isValidTargetForImplicitCompanionAsDispatchReceiver' @ [115:30] ==> private final fun isValidTargetForImplicitCompanionAsDispatchReceiver(moveDescriptor: MoveDeclarationsDescriptor, companionDescriptor: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass[SimpleFunctionDescriptorImpl]

'descriptor' @ [115:82] ==> value-parameter descriptor: MoveDeclarationsDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.collectConflicts[ValueParameterDescriptorImpl]

'usage' @ [115:94] ==> val usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.collectConflicts[LocalVariableDescriptor]

'companionDescriptor' @ [115:100] ==> public final val companionDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.ImplicitCompanionAsDispatchReceiverUsageInfo[PropertyDescriptorImpl]

'conflicts' @ [116:29] ==> value-parameter conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.collectConflicts[ValueParameterDescriptorImpl]

'putValue' @ [116:39] ==> public open fun putValue(@Nullable p0: PsiElement?, p1: (String..String?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'element' @ [116:48] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.collectConflicts[LocalVariableDescriptor]

'element' @ [116:108] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.collectConflicts[LocalVariableDescriptor]

'text' @ [116:116] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'usage' @ [121:59] ==> val usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.collectConflicts[LocalVariableDescriptor]

'reportConflictIfAny' @ [121:65] ==> public open fun reportConflictIfAny(conflicts: MultiMap<PsiElement, String>): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.OuterInstanceReferenceUsageInfo[SimpleFunctionDescriptorImpl]

'conflicts' @ [121:85] ==> value-parameter conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.collectConflicts[ValueParameterDescriptorImpl]

'isConflict' @ [125:21] ==> val isConflict: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.collectConflicts[LocalVariableDescriptor]

'usageIterator' @ [126:21] ==> val usageIterator: MutableIterator<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.collectConflicts[LocalVariableDescriptor]

'remove' @ [126:35] ==> public abstract fun remove(): Unit defined in kotlin.collections.MutableIterator[DeserializedSimpleFunctionDescriptor]

'with' @ [132:13] ==> @InlineOnly public inline fun <T, R> with(receiver: KtNamedDeclaration, block: KtNamedDeclaration.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration
    <R> -> Unit

'originalDeclaration' @ [132:18] ==> value-parameter originalDeclaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.preprocessDeclaration[ValueParameterDescriptorImpl]

'newClassName' @ [133:17] ==> public final val newClassName: String? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass[PropertyDescriptorImpl]

'let' @ [133:31] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> (PsiElement..PsiElement?)): (PsiElement..PsiElement?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'setName' @ [133:37] ==> public abstract fun setName(@NotNull p0: String): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'it' @ [133:45] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.preprocessDeclaration.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [135:21] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.preprocessDeclaration.<anonymous>[ReceiverParameterDescriptorImpl]

'descriptor' @ [136:26] ==> value-parameter descriptor: MoveDeclarationsDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.preprocessDeclaration[ValueParameterDescriptorImpl]

'moveTarget' @ [136:37] ==> public final val moveTarget: KotlinMoveTarget defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDescriptor[PropertyDescriptorImpl]

'targetElement' @ [136:89] ==> public final val targetElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinMoveTargetForExistingElement[PropertyDescriptorImpl]

'hasModifier' @ [137:29] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'INNER_KEYWORD' @ [137:50] ==> public final val INNER_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'removeModifier' @ [137:66] ==> public abstract fun removeModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'INNER_KEYWORD' @ [137:90] ==> public final val INNER_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'hasModifier' @ [138:29] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'PROTECTED_KEYWORD' @ [138:50] ==> public final val PROTECTED_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'removeModifier' @ [138:70] ==> public abstract fun removeModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'PROTECTED_KEYWORD' @ [138:94] ==> public final val PROTECTED_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'outerInstanceParameterName' @ [141:25] ==> public final val outerInstanceParameterName: String? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass[PropertyDescriptorImpl]

'containingClassOrObject' @ [142:37] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'resolveToDescriptor' @ [142:63] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'defaultType' @ [142:105] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'KtPsiFactory' @ [143:41] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [143:54] ==> public final val KtClass.project: Project[MyPropertyDescriptor]

'createParameter' @ [144:34] ==> public final fun createParameter(text: String): KtParameter defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'outerInstanceParameterName' @ [144:64] ==> public final val outerInstanceParameterName: String? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass[PropertyDescriptorImpl]

'IdeDescriptorRenderers' @ [144:94] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE' @ [144:117] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [144:129] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'type' @ [144:140] ==> val type: SimpleType defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.preprocessDeclaration.<anonymous>[LocalVariableDescriptor]

'createPrimaryConstructorParameterListIfAbsent' @ [145:25] ==> public fun KtClass.createPrimaryConstructorParameterListIfAbsent(): KtParameterList defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'addParameter' @ [145:73] ==> @NotNull public open fun addParameter(@NotNull p0: KtParameter): KtParameter defined in org.jetbrains.kotlin.psi.KtParameterList[JavaMethodDescriptor]

'parameter' @ [145:86] ==> val parameter: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.preprocessDeclaration.<anonymous>[LocalVariableDescriptor]

'isToBeShortened' @ [145:97] ==> public var KtElement.isToBeShortened: Boolean? defined in org.jetbrains.kotlin.idea.codeInsight.shorten[DeserializedPropertyDescriptor]

'outerInstanceParameterName' @ [152:17] ==> public final val outerInstanceParameterName: String? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass[PropertyDescriptorImpl]

'KtPsiFactory' @ [153:30] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'descriptor' @ [153:43] ==> value-parameter descriptor: MoveDeclarationsDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.preprocessUsages[ValueParameterDescriptorImpl]

'project' @ [153:54] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDescriptor[PropertyDescriptorImpl]

'psiFactory' @ [154:39] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.preprocessUsages[LocalVariableDescriptor]

'createExpression' @ [154:50] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'outerInstanceParameterName' @ [154:67] ==> public final val outerInstanceParameterName: String? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass[PropertyDescriptorImpl]

'descriptor' @ [155:31] ==> value-parameter descriptor: MoveDeclarationsDescriptor defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.preprocessUsages[ValueParameterDescriptorImpl]

'elementsToMove' @ [155:42] ==> public final val elementsToMove: Collection<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDescriptor[PropertyDescriptorImpl]

'singleOrNull' @ [155:57] ==> public fun <T> Iterable<KtNamedDeclaration>.singleOrNull(): KtNamedDeclaration? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration

'usages' @ [157:27] ==> value-parameter usages: List<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.preprocessUsages[ValueParameterDescriptorImpl]

'usage' @ [158:21] ==> val usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.preprocessUsages[LocalVariableDescriptor]

'usage' @ [159:49] ==> val usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.preprocessUsages[LocalVariableDescriptor]

'referencedElement' @ [159:55] ==> public final val MoveRenameUsageInfo.referencedElement: PsiElement?[MyPropertyDescriptor]

'unwrapped' @ [159:74] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'referencedNestedClass' @ [160:25] ==> val referencedNestedClass: KtClassOrObject? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.preprocessUsages[LocalVariableDescriptor]

'classToMove' @ [160:50] ==> val classToMove: KtClass? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.preprocessUsages[LocalVariableDescriptor]

'referencedNestedClass' @ [161:42] ==> val referencedNestedClass: KtClassOrObject? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.preprocessUsages[LocalVariableDescriptor]

'containingClassOrObject' @ [161:65] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'outerClass' @ [162:47] ==> val outerClass: KtClassOrObject? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.preprocessUsages[LocalVariableDescriptor]

'toLightClass' @ [162:59] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'lightOuterClass' @ [163:29] ==> val lightOuterClass: KtLightClass? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.preprocessUsages[LocalVariableDescriptor]

'EP_NAME' @ [164:57] ==> public final val EP_NAME: (LanguageExtension<(MoveInnerClassUsagesHandler..MoveInnerClassUsagesHandler?)>..LanguageExtension<(MoveInnerClassUsagesHandler..MoveInnerClassUsagesHandler?)>?) defined in com.intellij.refactoring.move.moveInner.MoveInnerClassUsagesHandler[JavaPropertyDescriptor]

'forLanguage' @ [165:38] ==> public open fun forLanguage(@NotNull p0: Language): (MoveInnerClassUsagesHandler..MoveInnerClassUsagesHandler?) defined in com.intellij.lang.LanguageExtension[JavaMethodDescriptor]

'usage' @ [165:50] ==> val usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.preprocessUsages[LocalVariableDescriptor]

'element' @ [165:56] ==> public final val MoveRenameUsageInfo.element: PsiElement?[MyPropertyDescriptor]

'language' @ [165:66] ==> public final val PsiElement.language: Language[MyPropertyDescriptor]

'correctInnerClassUsage' @ [166:39] ==> public abstract fun correctInnerClassUsage(@NotNull p0: UsageInfo, @NotNull p1: PsiClass): Unit defined in com.intellij.refactoring.move.moveInner.MoveInnerClassUsagesHandler[JavaMethodDescriptor]

'usage' @ [166:62] ==> val usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.preprocessUsages[LocalVariableDescriptor]

'lightOuterClass' @ [166:69] ==> val lightOuterClass: KtLightClass? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.preprocessUsages[LocalVariableDescriptor]

'when (usage) {
                    is OuterInstanceReferenceUsageInfo.ExplicitThis -> {
                        usage.expression?.replace(newOuterInstanceRef)
                    }
                    is OuterInstanceReferenceUsageInfo.ImplicitReceiver -> {
                        usage.callElement?.let { it.replace(psiFactory.createExpressionByPattern("$0.$1", outerInstanceParameterName, it)) }
                    }
                }' @ [171:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiElement?, entry1: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiElement?

'usage' @ [171:23] ==> val usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.preprocessUsages[LocalVariableDescriptor]

'usage' @ [173:25] ==> val usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.preprocessUsages[LocalVariableDescriptor]

'expression' @ [173:31] ==> public final val expression: KtThisExpression? defined in org.jetbrains.kotlin.idea.refactoring.move.OuterInstanceReferenceUsageInfo.ExplicitThis[PropertyDescriptorImpl]

'replace' @ [173:43] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtThisExpression[DeserializedSimpleFunctionDescriptor]

'newOuterInstanceRef' @ [173:51] ==> val newOuterInstanceRef: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.preprocessUsages[LocalVariableDescriptor]

'usage' @ [176:25] ==> val usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.preprocessUsages[LocalVariableDescriptor]

'callElement' @ [176:31] ==> public final val callElement: KtElement? defined in org.jetbrains.kotlin.idea.refactoring.move.OuterInstanceReferenceUsageInfo.ImplicitReceiver[PropertyDescriptorImpl]

'let' @ [176:44] ==> @InlineOnly public inline fun <T, R> KtElement.let(block: (KtElement) -> (PsiElement..PsiElement?)): (PsiElement..PsiElement?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement
    <R> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'it' @ [176:50] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.preprocessUsages.<anonymous>[ValueParameterDescriptorImpl]

'replace' @ [176:53] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'psiFactory' @ [176:61] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.preprocessUsages[LocalVariableDescriptor]

'createExpressionByPattern' @ [176:72] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'outerInstanceParameterName' @ [176:107] ==> public final val outerInstanceParameterName: String? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass[PropertyDescriptorImpl]

'it' @ [176:135] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveDeclarationsDelegate.NestedClass.preprocessUsages.<anonymous>[ValueParameterDescriptorImpl]

