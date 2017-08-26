'implementationsOf' @ [35:9] ==> private fun ModuleDescriptor.implementationsOf(descriptor: MemberDescriptor): List<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.highlighter.markers in file ImplementedHeaderMarker.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [35:27] ==> value-parameter descriptor: MemberDescriptor defined in org.jetbrains.kotlin.idea.highlighter.markers.hasImplementationsOf[ValueParameterDescriptorImpl]

'isNotEmpty' @ [35:39] ==> @InlineOnly public inline fun <T> Collection<DeclarationDescriptor>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'with' @ [38:9] ==> @InlineOnly public inline fun <T, R> with(receiver: HeaderImplDeclarationChecker, block: HeaderImplDeclarationChecker.() -> List<MemberDescriptor>): List<MemberDescriptor> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> HeaderImplDeclarationChecker
    <R> -> List<MemberDescriptor>

'HeaderImplDeclarationChecker' @ [38:14] ==> public object HeaderImplDeclarationChecker : DeclarationChecker defined in org.jetbrains.kotlin.resolve.checkers[FakeCallableDescriptorForObject]

'descriptor' @ [39:13] ==> value-parameter descriptor: MemberDescriptor defined in org.jetbrains.kotlin.idea.highlighter.markers.implementationsOf[ValueParameterDescriptorImpl]

'findCompatibleImplForHeader' @ [39:24] ==> public final fun MemberDescriptor.findCompatibleImplForHeader(platformModule: ModuleDescriptor): List<MemberDescriptor> defined in org.jetbrains.kotlin.resolve.checkers.HeaderImplDeclarationChecker[DeserializedSimpleFunctionDescriptor]

'this@implementationsOf' @ [39:52] ==> <this> defined in org.jetbrains.kotlin.idea.highlighter.markers.implementationsOf[ReceiverParameterDescriptorImpl]

'declaration' @ [43:22] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.highlighter.markers.getPlatformImplementationTooltip[ValueParameterDescriptorImpl]

'toDescriptor' @ [43:34] ==> public fun KtDeclaration.toDescriptor(): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'declaration' @ [44:34] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.highlighter.markers.getPlatformImplementationTooltip[ValueParameterDescriptorImpl]

'containingKtFile' @ [44:46] ==> public final val KtDeclaration.containingKtFile: KtFile[MyPropertyDescriptor]

'findModuleDescriptor' @ [44:63] ==> public fun KtElement.findModuleDescriptor(): ModuleDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'commonModuleDescriptor' @ [46:45] ==> val commonModuleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.highlighter.markers.getPlatformImplementationTooltip[LocalVariableDescriptor]

'allImplementingCompatibleModules' @ [46:68] ==> public val ModuleDescriptor.allImplementingCompatibleModules: List<ModuleDescriptor> defined in org.jetbrains.kotlin.idea.highlighter[DeserializedPropertyDescriptor]

'filter' @ [46:101] ==> public inline fun <T> Iterable<ModuleDescriptor>.filter(predicate: (ModuleDescriptor) -> Boolean): List<ModuleDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleDescriptor

'it' @ [47:9] ==> value-parameter it: ModuleDescriptor defined in org.jetbrains.kotlin.idea.highlighter.markers.getPlatformImplementationTooltip.<anonymous>[ValueParameterDescriptorImpl]

'hasImplementationsOf' @ [47:12] ==> public fun ModuleDescriptor.hasImplementationsOf(descriptor: MemberDescriptor): Boolean defined in org.jetbrains.kotlin.idea.highlighter.markers in file ImplementedHeaderMarker.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [47:33] ==> val descriptor: MemberDescriptor defined in org.jetbrains.kotlin.idea.highlighter.markers.getPlatformImplementationTooltip[LocalVariableDescriptor]

'platformModulesWithImplementation' @ [49:9] ==> val platformModulesWithImplementation: List<ModuleDescriptor> defined in org.jetbrains.kotlin.idea.highlighter.markers.getPlatformImplementationTooltip[LocalVariableDescriptor]

'isEmpty' @ [49:43] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'platformModulesWithImplementation' @ [51:12] ==> val platformModulesWithImplementation: List<ModuleDescriptor> defined in org.jetbrains.kotlin.idea.highlighter.markers.getPlatformImplementationTooltip[LocalVariableDescriptor]

'joinToString' @ [51:46] ==> public fun <T> Iterable<ModuleDescriptor>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((ModuleDescriptor) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleDescriptor

'it' @ [52:10] ==> value-parameter it: ModuleDescriptor defined in org.jetbrains.kotlin.idea.highlighter.markers.getPlatformImplementationTooltip.<anonymous>[ValueParameterDescriptorImpl]

'getMultiTargetPlatform' @ [52:13] ==> public fun ModuleDescriptor.getMultiTargetPlatform(): MultiTargetPlatform? defined in org.jetbrains.kotlin.resolve[DeserializedSimpleFunctionDescriptor]

'platform' @ [52:71] ==> public final val platform: String defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform.Specific[DeserializedPropertyDescriptor]

'declaration' @ [57:27] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.highlighter.markers.navigateToPlatformImplementation[ValueParameterDescriptorImpl]

'headerImplementations' @ [57:39] ==> internal fun KtDeclaration.headerImplementations(): Set<KtDeclaration> defined in org.jetbrains.kotlin.idea.highlighter.markers in file ImplementedHeaderMarker.kt[SimpleFunctionDescriptorImpl]

'implementations' @ [58:9] ==> val implementations: Set<KtDeclaration> defined in org.jetbrains.kotlin.idea.highlighter.markers.navigateToPlatformImplementation[LocalVariableDescriptor]

'isEmpty' @ [58:25] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'DefaultPsiElementCellRenderer' @ [60:20] ==> public constructor DefaultPsiElementCellRenderer() defined in com.intellij.ide.util.DefaultPsiElementCellRenderer[JavaClassConstructorDescriptor]

'openTargets' @ [61:29] ==> public open fun openTargets(p0: (MouseEvent..MouseEvent?), p1: (Array<(NavigatablePsiElement..NavigatablePsiElement?)>..Array<out (NavigatablePsiElement..NavigatablePsiElement?)>?), p2: (String..String?), p3: (String..String?), p4: raw (ListCellRenderer<(Any..Any?)>..ListCellRenderer<*>?)): Unit defined in com.intellij.codeInsight.daemon.impl.PsiElementListNavigator[JavaMethodDescriptor]

'e' @ [61:41] ==> value-parameter e: MouseEvent? defined in org.jetbrains.kotlin.idea.highlighter.markers.navigateToPlatformImplementation[ValueParameterDescriptorImpl]

'implementations' @ [62:41] ==> val implementations: Set<KtDeclaration> defined in org.jetbrains.kotlin.idea.highlighter.markers.navigateToPlatformImplementation[LocalVariableDescriptor]

'toTypedArray' @ [62:57] ==> public inline fun <reified T> Collection<KtDeclaration>.toTypedArray(): Array<KtDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> KtDeclaration

'declaration' @ [63:69] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.highlighter.markers.navigateToPlatformImplementation[ValueParameterDescriptorImpl]

'name' @ [63:81] ==> public final val KtDeclaration.name: String?[MyPropertyDescriptor]

'declaration' @ [64:63] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.highlighter.markers.navigateToPlatformImplementation[ValueParameterDescriptorImpl]

'name' @ [64:75] ==> public final val KtDeclaration.name: String?[MyPropertyDescriptor]

'renderer' @ [65:41] ==> val renderer: DefaultPsiElementCellRenderer defined in org.jetbrains.kotlin.idea.highlighter.markers.navigateToPlatformImplementation[LocalVariableDescriptor]

'this' @ [69:9] ==> <this> defined in org.jetbrains.kotlin.idea.highlighter.markers.headerImplementations[ReceiverParameterDescriptorImpl]

'!' @ [70:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'this' @ [70:14] ==> <this> defined in org.jetbrains.kotlin.idea.highlighter.markers.headerImplementations[ReceiverParameterDescriptorImpl]

'isHeader' @ [70:19] ==> public final val MemberDescriptor.isHeader: Boolean[MyPropertyDescriptor]

'emptyList' @ [70:36] ==> public fun <T> emptyList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'module' @ [72:16] ==> public val DeclarationDescriptor.module: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'allImplementingCompatibleModules' @ [72:23] ==> public val ModuleDescriptor.allImplementingCompatibleModules: List<ModuleDescriptor> defined in org.jetbrains.kotlin.idea.highlighter[DeserializedPropertyDescriptor]

'flatMap' @ [72:56] ==> public inline fun <T, R> Iterable<ModuleDescriptor>.flatMap(transform: (ModuleDescriptor) -> Iterable<DeclarationDescriptor>): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleDescriptor
    <R> -> DeclarationDescriptor

'it' @ [72:66] ==> value-parameter it: ModuleDescriptor defined in org.jetbrains.kotlin.idea.highlighter.markers.headerImplementations.<anonymous>[ValueParameterDescriptorImpl]

'implementationsOf' @ [72:69] ==> private fun ModuleDescriptor.implementationsOf(descriptor: MemberDescriptor): List<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.highlighter.markers in file ImplementedHeaderMarker.kt[SimpleFunctionDescriptorImpl]

'this' @ [72:87] ==> <this> defined in org.jetbrains.kotlin.idea.highlighter.markers.headerImplementations[ReceiverParameterDescriptorImpl]

'this' @ [75:9] ==> <this> defined in org.jetbrains.kotlin.idea.highlighter.markers.headerImplementations[ReceiverParameterDescriptorImpl]

'containingDeclaration' @ [76:16] ==> public final val ValueParameterDescriptor.containingDeclaration: CallableDescriptor[MyPropertyDescriptor]

'headerImplementations' @ [76:38] ==> private fun DeclarationDescriptor.headerImplementations(): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.highlighter.markers in file ImplementedHeaderMarker.kt[SimpleFunctionDescriptorImpl]

'mapNotNull' @ [76:62] ==> public inline fun <T, R : Any> Iterable<DeclarationDescriptor>.mapNotNull(transform: (DeclarationDescriptor) -> ValueParameterDescriptor?): List<ValueParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R : Any> -> ValueParameterDescriptor

'it' @ [76:76] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.highlighter.markers.headerImplementations.<anonymous>[ValueParameterDescriptorImpl]

'valueParameters' @ [76:104] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'getOrNull' @ [76:121] ==> public fun <T> List<(ValueParameterDescriptor..ValueParameterDescriptor?)>.getOrNull(index: Int): ValueParameterDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'index' @ [76:131] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'emptyList' @ [79:12] ==> public fun <T> emptyList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'resolveToDescriptor' @ [83:12] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'headerImplementations' @ [83:34] ==> private fun DeclarationDescriptor.headerImplementations(): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.highlighter.markers in file ImplementedHeaderMarker.kt[SimpleFunctionDescriptorImpl]

'mapNotNullTo' @ [83:58] ==> public inline fun <T, R : Any, C : MutableCollection<in KtDeclaration>> Iterable<DeclarationDescriptor>.mapNotNullTo(destination: LinkedHashSet<KtDeclaration> /* = LinkedHashSet<KtDeclaration> */, transform: (DeclarationDescriptor) -> KtDeclaration?): LinkedHashSet<KtDeclaration> /* = LinkedHashSet<KtDeclaration> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R : Any> -> KtDeclaration
    <C : MutableCollection<in R>> -> LinkedHashSet<KtDeclaration>

'LinkedHashSet' @ [83:71] ==> public final fun <E> <init>(): LinkedHashSet<KtDeclaration> /* = LinkedHashSet<KtDeclaration> */ defined in kotlin.collections.LinkedHashSet[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> KtDeclaration

'DescriptorToSourceUtils' @ [84:9] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [84:33] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'it' @ [84:57] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.highlighter.markers.headerImplementations.<anonymous>[ValueParameterDescriptorImpl]

