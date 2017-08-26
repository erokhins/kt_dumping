'getDeclarationsStream' @ [31:16] ==> private final fun getDeclarationsStream(project: Project, targetDescriptor: DeclarationDescriptor, builtInsSearchScope: GlobalSearchScope? = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[SimpleFunctionDescriptorImpl]

'project' @ [31:38] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde.getAnyDeclaration[ValueParameterDescriptorImpl]

'descriptor' @ [31:47] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde.getAnyDeclaration[ValueParameterDescriptorImpl]

'firstOrNull' @ [31:59] ==> public fun <T> Sequence<PsiElement>.firstOrNull(): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'getDeclarationsStream' @ [40:22] ==> private final fun getDeclarationsStream(project: Project, targetDescriptor: DeclarationDescriptor, builtInsSearchScope: GlobalSearchScope? = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[SimpleFunctionDescriptorImpl]

'project' @ [40:44] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde.getAllDeclarations[ValueParameterDescriptorImpl]

'targetDescriptor' @ [40:53] ==> value-parameter targetDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde.getAllDeclarations[ValueParameterDescriptorImpl]

'builtInsSearchScope' @ [40:71] ==> value-parameter builtInsSearchScope: GlobalSearchScope? = ... defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde.getAllDeclarations[ValueParameterDescriptorImpl]

'toHashSet' @ [40:92] ==> public fun <T> Sequence<PsiElement>.toHashSet(): HashSet<PsiElement> /* = HashSet<PsiElement> */ defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'result' @ [43:16] ==> val result: HashSet<PsiElement> /* = HashSet<PsiElement> */ defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde.getAllDeclarations[LocalVariableDescriptor]

'filter' @ [43:23] ==> public inline fun <T> Iterable<PsiElement>.filter(predicate: (PsiElement) -> Boolean): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'result' @ [43:43] ==> val result: HashSet<PsiElement> /* = HashSet<PsiElement> */ defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde.getAllDeclarations[LocalVariableDescriptor]

'none' @ [43:50] ==> public inline fun <T> Iterable<PsiElement>.none(predicate: (PsiElement) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'element' @ [43:57] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde.getAllDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [43:68] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde.getAllDeclarations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [43:74] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde.getAllDeclarations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'navigationElement' @ [43:77] ==> public final val PsiElement.navigationElement: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'element' @ [43:98] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde.getAllDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'DescriptorToSourceUtils' @ [49:46] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'getEffectiveReferencedDescriptors' @ [49:70] ==> @JvmStatic public final fun getEffectiveReferencedDescriptors(descriptor: DeclarationDescriptor): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'targetDescriptor' @ [49:104] ==> value-parameter targetDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde.getDeclarationsStream[ValueParameterDescriptorImpl]

'asSequence' @ [49:122] ==> public fun <T> Iterable<DeclarationDescriptor>.asSequence(): Sequence<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'effectiveReferencedDescriptors' @ [50:16] ==> val effectiveReferencedDescriptors: Sequence<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde.getDeclarationsStream[LocalVariableDescriptor]

'flatMap' @ [50:47] ==> public fun <T, R> Sequence<DeclarationDescriptor>.flatMap(transform: (DeclarationDescriptor) -> Sequence<PsiElement?>): Sequence<PsiElement?> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> PsiElement?

'sequenceOfLazyValues' @ [53:13] ==> public fun <T> sequenceOfLazyValues(vararg elements: () -> PsiElement?): Sequence<PsiElement?> defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement?

'DescriptorToSourceUtils' @ [54:23] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'getSourceFromDescriptor' @ [54:47] ==> @JvmStatic public final fun getSourceFromDescriptor(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'effectiveReferenced' @ [54:71] ==> value-parameter effectiveReferenced: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde.getDeclarationsStream.<anonymous>[ValueParameterDescriptorImpl]

'findDecompiledDeclaration' @ [55:23] ==> public fun findDecompiledDeclaration(project: Project, referencedDescriptor: DeclarationDescriptor, builtInsSearchScope: GlobalSearchScope?): KtDeclaration? defined in org.jetbrains.kotlin.idea.decompiler.navigation in file findDecompiledDeclaration.kt[SimpleFunctionDescriptorImpl]

'project' @ [55:49] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde.getDeclarationsStream[ValueParameterDescriptorImpl]

'effectiveReferenced' @ [55:58] ==> value-parameter effectiveReferenced: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde.getDeclarationsStream.<anonymous>[ValueParameterDescriptorImpl]

'builtInsSearchScope' @ [55:79] ==> value-parameter builtInsSearchScope: GlobalSearchScope? = ... defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde.getDeclarationsStream[ValueParameterDescriptorImpl]

'filterNotNull' @ [57:11] ==> public fun <T : Any> Sequence<PsiElement?>.filterNotNull(): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> PsiElement

