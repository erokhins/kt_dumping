'e' @ [31:13] ==> value-parameter e: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.isCallHierarchyElement[ValueParameterDescriptorImpl]

'e' @ [31:37] ==> value-parameter e: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.isCallHierarchyElement[ValueParameterDescriptorImpl]

'name' @ [31:39] ==> public final val KtNamedFunction.name: String?[MyPropertyDescriptor]

'e' @ [32:12] ==> value-parameter e: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.isCallHierarchyElement[ValueParameterDescriptorImpl]

'e' @ [33:13] ==> value-parameter e: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.isCallHierarchyElement[ValueParameterDescriptorImpl]

'!' @ [33:32] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'e' @ [33:33] ==> value-parameter e: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.isCallHierarchyElement[ValueParameterDescriptorImpl]

'isLocal' @ [33:35] ==> public final val KtProperty.isLocal: Boolean[MyPropertyDescriptor]

'e' @ [34:12] ==> value-parameter e: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.isCallHierarchyElement[ValueParameterDescriptorImpl]

'e' @ [35:13] ==> value-parameter e: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.isCallHierarchyElement[ValueParameterDescriptorImpl]

'!' @ [35:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'e' @ [35:30] ==> value-parameter e: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.isCallHierarchyElement[ValueParameterDescriptorImpl]

'isInterface' @ [35:32] ==> public final fun isInterface(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'e' @ [36:12] ==> value-parameter e: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.isCallHierarchyElement[ValueParameterDescriptorImpl]

'element' @ [39:52] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.getCallHierarchyElement[ValueParameterDescriptorImpl]

'parentsWithSelf' @ [39:60] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'firstOrNull' @ [39:76] ==> public inline fun <T> Sequence<PsiElement>.firstOrNull(predicate: (PsiElement) -> Boolean): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'when (this) {
        is KotlinCallHierarchyNodeDescriptor -> incrementUsageCount()
        is CallHierarchyNodeDescriptor -> incrementUsageCount()
    }' @ [42:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'this' @ [42:11] ==> <this> defined in org.jetbrains.kotlin.idea.hierarchy.calls.incrementUsageCount[ReceiverParameterDescriptorImpl]

'incrementUsageCount' @ [43:49] ==> public final fun incrementUsageCount(): Unit defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallHierarchyNodeDescriptor[JavaMethodDescriptor]

'incrementUsageCount' @ [44:43] ==> public final fun incrementUsageCount(): Unit defined in com.intellij.ide.hierarchy.call.CallHierarchyNodeDescriptor[JavaMethodDescriptor]

'when (this) {
        is KotlinCallHierarchyNodeDescriptor -> addReference(reference)
        is CallHierarchyNodeDescriptor -> addReference(reference)
    }' @ [49:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'this' @ [49:11] ==> <this> defined in org.jetbrains.kotlin.idea.hierarchy.calls.addReference[ReceiverParameterDescriptorImpl]

'addReference' @ [50:49] ==> public final fun addReference(reference: (PsiReference..PsiReference?)): Unit defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallHierarchyNodeDescriptor[JavaMethodDescriptor]

'reference' @ [50:62] ==> value-parameter reference: PsiReference defined in org.jetbrains.kotlin.idea.hierarchy.calls.addReference[ValueParameterDescriptorImpl]

'addReference' @ [51:43] ==> public open fun addReference(p0: (PsiReference..PsiReference?)): Unit defined in com.intellij.ide.hierarchy.call.CallHierarchyNodeDescriptor[JavaMethodDescriptor]

'reference' @ [51:56] ==> value-parameter reference: PsiReference defined in org.jetbrains.kotlin.idea.hierarchy.calls.addReference[ValueParameterDescriptorImpl]

'?:' @ [63:19] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiElement?, right: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiElement

'if (isJavaMap && originalElement is KtElement) originalElement.toLightElements().firstOrNull() else originalElement' @ [63:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement?, elseBranch: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement?

'isJavaMap' @ [63:24] ==> value-parameter isJavaMap: Boolean defined in org.jetbrains.kotlin.idea.hierarchy.calls.getOrCreateNodeDescriptor[ValueParameterDescriptorImpl]

'originalElement' @ [63:37] ==> value-parameter originalElement: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.getOrCreateNodeDescriptor[ValueParameterDescriptorImpl]

'originalElement' @ [63:67] ==> value-parameter originalElement: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.getOrCreateNodeDescriptor[ValueParameterDescriptorImpl]

'toLightElements' @ [63:83] ==> public fun KtElement.toLightElements(): List<PsiNamedElement> defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'firstOrNull' @ [63:101] ==> public fun <T> List<PsiNamedElement>.firstOrNull(): PsiNamedElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiNamedElement

'originalElement' @ [63:120] ==> value-parameter originalElement: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.getOrCreateNodeDescriptor[ValueParameterDescriptorImpl]

'elementToDescriptorMap' @ [66:30] ==> value-parameter elementToDescriptorMap: MutableMap<PsiElement, NodeDescriptor<*>> defined in org.jetbrains.kotlin.idea.hierarchy.calls.getOrCreateNodeDescriptor[ValueParameterDescriptorImpl]

'element' @ [66:53] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.getOrCreateNodeDescriptor[LocalVariableDescriptor]

'if (existingDescriptor != null) {
        existingDescriptor.incrementUsageCount()
        existingDescriptor
    }
    else {
        val newDescriptor: HierarchyNodeDescriptor = when (element) {
            is KtElement -> KotlinCallHierarchyNodeDescriptor(parent, element, false, navigateToReference)
            is PsiMember -> CallHierarchyNodeDescriptor(element.project, parent, element, false, navigateToReference)
            else -> return null
        }
        elementToDescriptorMap[element] = newDescriptor
        newDescriptor
    }' @ [67:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: HierarchyNodeDescriptor, elseBranch: HierarchyNodeDescriptor): HierarchyNodeDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> HierarchyNodeDescriptor

'existingDescriptor' @ [67:22] ==> val existingDescriptor: HierarchyNodeDescriptor? defined in org.jetbrains.kotlin.idea.hierarchy.calls.getOrCreateNodeDescriptor[LocalVariableDescriptor]

'existingDescriptor' @ [68:9] ==> val existingDescriptor: HierarchyNodeDescriptor? defined in org.jetbrains.kotlin.idea.hierarchy.calls.getOrCreateNodeDescriptor[LocalVariableDescriptor]

'incrementUsageCount' @ [68:28] ==> private fun NodeDescriptor<*>.incrementUsageCount(): Unit defined in org.jetbrains.kotlin.idea.hierarchy.calls in file callHierarchyUtils.kt[SimpleFunctionDescriptorImpl]

'existingDescriptor' @ [69:9] ==> val existingDescriptor: HierarchyNodeDescriptor? defined in org.jetbrains.kotlin.idea.hierarchy.calls.getOrCreateNodeDescriptor[LocalVariableDescriptor]

'when (element) {
            is KtElement -> KotlinCallHierarchyNodeDescriptor(parent, element, false, navigateToReference)
            is PsiMember -> CallHierarchyNodeDescriptor(element.project, parent, element, false, navigateToReference)
            else -> return null
        }' @ [72:54] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: HierarchyNodeDescriptor, entry1: HierarchyNodeDescriptor, entry2: HierarchyNodeDescriptor): HierarchyNodeDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> HierarchyNodeDescriptor

'element' @ [72:60] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.getOrCreateNodeDescriptor[LocalVariableDescriptor]

'KotlinCallHierarchyNodeDescriptor' @ [73:29] ==> public constructor KotlinCallHierarchyNodeDescriptor(@Nullable parentDescriptor: HierarchyNodeDescriptor?, @NotNull element: KtElement, isBase: Boolean, navigateToReference: Boolean) defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallHierarchyNodeDescriptor[JavaClassConstructorDescriptor]

'parent' @ [73:63] ==> value-parameter parent: HierarchyNodeDescriptor defined in org.jetbrains.kotlin.idea.hierarchy.calls.getOrCreateNodeDescriptor[ValueParameterDescriptorImpl]

'element' @ [73:71] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.getOrCreateNodeDescriptor[LocalVariableDescriptor]

'navigateToReference' @ [73:87] ==> value-parameter navigateToReference: Boolean defined in org.jetbrains.kotlin.idea.hierarchy.calls.getOrCreateNodeDescriptor[ValueParameterDescriptorImpl]

'CallHierarchyNodeDescriptor' @ [74:29] ==> public constructor CallHierarchyNodeDescriptor(@NotNull p0: Project, p1: (HierarchyNodeDescriptor..HierarchyNodeDescriptor?), @NotNull p2: PsiElement, p3: Boolean, p4: Boolean) defined in com.intellij.ide.hierarchy.call.CallHierarchyNodeDescriptor[JavaClassConstructorDescriptor]

'element' @ [74:57] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.getOrCreateNodeDescriptor[LocalVariableDescriptor]

'project' @ [74:65] ==> public final val PsiMember.project: Project[MyPropertyDescriptor]

'parent' @ [74:74] ==> value-parameter parent: HierarchyNodeDescriptor defined in org.jetbrains.kotlin.idea.hierarchy.calls.getOrCreateNodeDescriptor[ValueParameterDescriptorImpl]

'element' @ [74:82] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.getOrCreateNodeDescriptor[LocalVariableDescriptor]

'navigateToReference' @ [74:98] ==> value-parameter navigateToReference: Boolean defined in org.jetbrains.kotlin.idea.hierarchy.calls.getOrCreateNodeDescriptor[ValueParameterDescriptorImpl]

'elementToDescriptorMap' @ [77:9] ==> value-parameter elementToDescriptorMap: MutableMap<PsiElement, NodeDescriptor<*>> defined in org.jetbrains.kotlin.idea.hierarchy.calls.getOrCreateNodeDescriptor[ValueParameterDescriptorImpl]

'element' @ [77:32] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.calls.getOrCreateNodeDescriptor[LocalVariableDescriptor]

'newDescriptor' @ [77:43] ==> val newDescriptor: HierarchyNodeDescriptor defined in org.jetbrains.kotlin.idea.hierarchy.calls.getOrCreateNodeDescriptor[LocalVariableDescriptor]

'newDescriptor' @ [78:9] ==> val newDescriptor: HierarchyNodeDescriptor defined in org.jetbrains.kotlin.idea.hierarchy.calls.getOrCreateNodeDescriptor[LocalVariableDescriptor]

'reference' @ [81:9] ==> value-parameter reference: PsiReference? defined in org.jetbrains.kotlin.idea.hierarchy.calls.getOrCreateNodeDescriptor[ValueParameterDescriptorImpl]

'result' @ [82:9] ==> val result: HierarchyNodeDescriptor defined in org.jetbrains.kotlin.idea.hierarchy.calls.getOrCreateNodeDescriptor[LocalVariableDescriptor]

'addReference' @ [82:16] ==> private fun NodeDescriptor<*>.addReference(reference: PsiReference): Unit defined in org.jetbrains.kotlin.idea.hierarchy.calls in file callHierarchyUtils.kt[SimpleFunctionDescriptorImpl]

'reference' @ [82:29] ==> value-parameter reference: PsiReference? defined in org.jetbrains.kotlin.idea.hierarchy.calls.getOrCreateNodeDescriptor[ValueParameterDescriptorImpl]

'result' @ [85:12] ==> val result: HierarchyNodeDescriptor defined in org.jetbrains.kotlin.idea.hierarchy.calls.getOrCreateNodeDescriptor[LocalVariableDescriptor]

