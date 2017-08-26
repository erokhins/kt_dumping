'sourceKind' @ [34:22] ==> public val ModuleDescriptor.sourceKind: SourceKind defined in org.jetbrains.kotlin.idea.highlighter[DeserializedPropertyDescriptor]

'allDependencyModules' @ [35:12] ==> public abstract val allDependencyModules: List<ModuleDescriptor> defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedPropertyDescriptor]

'firstOrNull' @ [35:33] ==> public inline fun <T> Iterable<ModuleDescriptor>.firstOrNull(predicate: (ModuleDescriptor) -> Boolean): ModuleDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleDescriptor

'dependency' @ [36:9] ==> value-parameter dependency: ModuleDescriptor defined in org.jetbrains.kotlin.idea.highlighter.markers.commonModuleOrNull.<anonymous>[ValueParameterDescriptorImpl]

'getMultiTargetPlatform' @ [36:20] ==> public fun ModuleDescriptor.getMultiTargetPlatform(): MultiTargetPlatform? defined in org.jetbrains.kotlin.resolve[DeserializedSimpleFunctionDescriptor]

'MultiTargetPlatform' @ [36:48] ==> public companion object defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform[FakeCallableDescriptorForObject]

'Common' @ [36:68] ==> public object Common : MultiTargetPlatform defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform[FakeCallableDescriptorForObject]

'dependency' @ [36:78] ==> value-parameter dependency: ModuleDescriptor defined in org.jetbrains.kotlin.idea.highlighter.markers.commonModuleOrNull.<anonymous>[ValueParameterDescriptorImpl]

'sourceKind' @ [36:89] ==> public val ModuleDescriptor.sourceKind: SourceKind defined in org.jetbrains.kotlin.idea.highlighter[DeserializedPropertyDescriptor]

'sourceKind' @ [36:103] ==> val sourceKind: SourceKind defined in org.jetbrains.kotlin.idea.highlighter.markers.commonModuleOrNull[LocalVariableDescriptor]

'declarationOf' @ [40:71] ==> private fun ModuleDescriptor.declarationOf(descriptor: MemberDescriptor): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.highlighter.markers in file DeclaredHeaderMarker.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [40:85] ==> value-parameter descriptor: MemberDescriptor defined in org.jetbrains.kotlin.idea.highlighter.markers.hasDeclarationOf[ValueParameterDescriptorImpl]

'with' @ [43:9] ==> @InlineOnly public inline fun <T, R> with(receiver: HeaderImplDeclarationChecker, block: HeaderImplDeclarationChecker.() -> MemberDescriptor?): MemberDescriptor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> HeaderImplDeclarationChecker
    <R> -> MemberDescriptor?

'HeaderImplDeclarationChecker' @ [43:14] ==> public object HeaderImplDeclarationChecker : DeclarationChecker defined in org.jetbrains.kotlin.resolve.checkers[FakeCallableDescriptorForObject]

'descriptor' @ [44:13] ==> value-parameter descriptor: MemberDescriptor defined in org.jetbrains.kotlin.idea.highlighter.markers.declarationOf[ValueParameterDescriptorImpl]

'findCompatibleHeaderForImpl' @ [44:24] ==> public final fun MemberDescriptor.findCompatibleHeaderForImpl(commonModule: ModuleDescriptor): List<MemberDescriptor> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[DeserializedSimpleFunctionDescriptor]

'this@declarationOf' @ [44:52] ==> <this> defined in org.jetbrains.kotlin.idea.highlighter.markers.declarationOf[ReceiverParameterDescriptorImpl]

'firstOrNull' @ [44:72] ==> public fun <T> List<MemberDescriptor>.firstOrNull(): MemberDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MemberDescriptor

'declaration' @ [48:22] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.highlighter.markers.getHeaderDeclarationTooltip[ValueParameterDescriptorImpl]

'toDescriptor' @ [48:34] ==> public fun KtDeclaration.toDescriptor(): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'declaration' @ [49:36] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.highlighter.markers.getHeaderDeclarationTooltip[ValueParameterDescriptorImpl]

'containingKtFile' @ [49:48] ==> public final val KtDeclaration.containingKtFile: KtFile[MyPropertyDescriptor]

'findModuleDescriptor' @ [49:65] ==> public fun KtElement.findModuleDescriptor(): ModuleDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'platformModuleDescriptor' @ [51:34] ==> val platformModuleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.highlighter.markers.getHeaderDeclarationTooltip[LocalVariableDescriptor]

'commonModuleOrNull' @ [51:59] ==> public fun ModuleDescriptor.commonModuleOrNull(): ModuleDescriptor? defined in org.jetbrains.kotlin.idea.highlighter.markers in file DeclaredHeaderMarker.kt[SimpleFunctionDescriptorImpl]

'!' @ [52:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'commonModuleDescriptor' @ [52:10] ==> val commonModuleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.highlighter.markers.getHeaderDeclarationTooltip[LocalVariableDescriptor]

'hasDeclarationOf' @ [52:33] ==> public fun ModuleDescriptor.hasDeclarationOf(descriptor: MemberDescriptor): Boolean defined in org.jetbrains.kotlin.idea.highlighter.markers[SimpleFunctionDescriptorImpl]

'descriptor' @ [52:50] ==> val descriptor: MemberDescriptor defined in org.jetbrains.kotlin.idea.highlighter.markers.getHeaderDeclarationTooltip[LocalVariableDescriptor]

'declaration' @ [58:5] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.highlighter.markers.navigateToHeaderDeclaration[ValueParameterDescriptorImpl]

'headerDeclarationIfAny' @ [58:17] ==> internal fun KtDeclaration.headerDeclarationIfAny(): KtDeclaration? defined in org.jetbrains.kotlin.idea.highlighter.markers in file DeclaredHeaderMarker.kt[SimpleFunctionDescriptorImpl]

'navigate' @ [58:43] ==> public abstract fun navigate(p0: Boolean): Unit defined in org.jetbrains.kotlin.psi.KtDeclaration[JavaMethodDescriptor]

'module' @ [61:52] ==> public val DeclarationDescriptor.module: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'commonModuleOrNull' @ [61:59] ==> public fun ModuleDescriptor.commonModuleOrNull(): ModuleDescriptor? defined in org.jetbrains.kotlin.idea.highlighter.markers in file DeclaredHeaderMarker.kt[SimpleFunctionDescriptorImpl]

'declarationOf' @ [61:81] ==> private fun ModuleDescriptor.declarationOf(descriptor: MemberDescriptor): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.highlighter.markers in file DeclaredHeaderMarker.kt[SimpleFunctionDescriptorImpl]

'this' @ [61:95] ==> <this> defined in org.jetbrains.kotlin.idea.highlighter.markers.headerDescriptor[ReceiverParameterDescriptorImpl]

'?:' @ [64:28] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: DeclarationDescriptor?, right: DeclarationDescriptor): DeclarationDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> DeclarationDescriptor

'toDescriptor' @ [64:29] ==> public fun KtDeclaration.toDescriptor(): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'headerDescriptor' @ [64:67] ==> internal fun MemberDescriptor.headerDescriptor(): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.highlighter.markers[SimpleFunctionDescriptorImpl]

'DescriptorToSourceUtils' @ [65:12] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [65:36] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'headerDescriptor' @ [65:60] ==> val headerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.highlighter.markers.headerDeclarationIfAny[LocalVariableDescriptor]

'hasModifier' @ [69:9] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtDeclaration[JavaMethodDescriptor]

'HEADER_KEYWORD' @ [69:30] ==> public final val HEADER_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'containingClassOrObject' @ [69:50] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'hasModifier' @ [69:75] ==> public open fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtClassOrObject[JavaMethodDescriptor]

'HEADER_KEYWORD' @ [69:96] ==> public final val HEADER_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'this' @ [72:9] ==> <this> defined in org.jetbrains.kotlin.idea.highlighter.markers.liftToHeader[ReceiverParameterDescriptorImpl]

'when {
            isHeader -> this
            isImpl -> headerDescriptor()
            else -> null
        }' @ [73:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: DeclarationDescriptor?, entry1: DeclarationDescriptor?, entry2: DeclarationDescriptor?): DeclarationDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> DeclarationDescriptor?

'isHeader' @ [74:13] ==> public final val MemberDescriptor.isHeader: Boolean[MyPropertyDescriptor]

'this' @ [74:25] ==> <this> defined in org.jetbrains.kotlin.idea.highlighter.markers.liftToHeader[ReceiverParameterDescriptorImpl]

'isImpl' @ [75:13] ==> public final val MemberDescriptor.isImpl: Boolean[MyPropertyDescriptor]

'headerDescriptor' @ [75:23] ==> internal fun MemberDescriptor.headerDescriptor(): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.highlighter.markers[SimpleFunctionDescriptorImpl]

'this' @ [80:9] ==> <this> defined in org.jetbrains.kotlin.idea.highlighter.markers.liftToHeader[ReceiverParameterDescriptorImpl]

'containingDeclaration' @ [81:42] ==> public final val ValueParameterDescriptor.containingDeclaration: CallableDescriptor[MyPropertyDescriptor]

'liftToHeader' @ [81:64] ==> internal fun DeclarationDescriptor.liftToHeader(): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.highlighter.markers in file DeclaredHeaderMarker.kt[SimpleFunctionDescriptorImpl]

'containingHeaderDescriptor' @ [82:16] ==> val containingHeaderDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.highlighter.markers.liftToHeader[LocalVariableDescriptor]

'valueParameters' @ [82:43] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'getOrNull' @ [82:59] ==> public fun <T> List<(ValueParameterDescriptor..ValueParameterDescriptor?)>.getOrNull(index: Int): ValueParameterDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'index' @ [82:69] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'resolveToDescriptor' @ [89:22] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [90:28] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.highlighter.markers.liftToHeader[LocalVariableDescriptor]

'liftToHeader' @ [90:39] ==> internal fun DeclarationDescriptor.liftToHeader(): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.highlighter.markers in file DeclaredHeaderMarker.kt[SimpleFunctionDescriptorImpl]

'DescriptorToSourceUtils' @ [91:12] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [91:36] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'headerDescriptor' @ [91:60] ==> val headerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.highlighter.markers.liftToHeader[LocalVariableDescriptor]

