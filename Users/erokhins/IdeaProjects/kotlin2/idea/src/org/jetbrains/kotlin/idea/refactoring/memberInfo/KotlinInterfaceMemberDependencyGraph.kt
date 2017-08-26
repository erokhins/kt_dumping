'InterfaceMemberDependencyGraph' @ [32:33] ==> public constructor InterfaceMemberDependencyGraph<T : (PsiMember..PsiMember?), M : (MemberInfoBase<(PsiMember..PsiMember?)>..MemberInfoBase<(PsiMember..PsiMember?)>?)>(p0: (PsiClass..PsiClass?)) defined in com.intellij.refactoring.util.classMembers.InterfaceMemberDependencyGraph[JavaClassConstructorDescriptor]
Inferred types:
    <T : (PsiMember..PsiMember?)> -> PsiMember
    <M : (MemberInfoBase<(T..T?)>..MemberInfoBase<(T..T?)>?)> -> MemberInfoBase<PsiMember>

'klass' @ [32:102] ==> value-parameter klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinInterfaceMemberDependencyGraph.<init>[ValueParameterDescriptorImpl]

'toLightClass' @ [32:108] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'delegateGraph' @ [35:9] ==> private final val delegateGraph: InterfaceMemberDependencyGraph<PsiMember, MemberInfoBase<PsiMember>> defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinInterfaceMemberDependencyGraph[PropertyDescriptorImpl]

'memberChanged' @ [35:23] ==> public open fun memberChanged(p0: (MemberInfoBase<PsiMember>..MemberInfoBase<PsiMember>?)): Unit defined in com.intellij.refactoring.util.classMembers.InterfaceMemberDependencyGraph[JavaMethodDescriptor]

'memberInfo' @ [35:37] ==> value-parameter memberInfo: M defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinInterfaceMemberDependencyGraph.memberChanged[ValueParameterDescriptorImpl]

'toJavaMemberInfo' @ [35:48] ==> public fun MemberInfoBase<out KtNamedDeclaration>.toJavaMemberInfo(): MemberInfo? defined in org.jetbrains.kotlin.idea.refactoring.memberInfo in file KotlinMemberInfo.kt[SimpleFunctionDescriptorImpl]

'Suppress' @ [38:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'delegateGraph' @ [39:35] ==> private final val delegateGraph: InterfaceMemberDependencyGraph<PsiMember, MemberInfoBase<PsiMember>> defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinInterfaceMemberDependencyGraph[PropertyDescriptorImpl]

'dependent' @ [39:49] ==> public final val <T : (PsiMember..PsiMember?), M : (MemberInfoBase<(PsiMember..PsiMember?)>..MemberInfoBase<(PsiMember..PsiMember?)>?)> InterfaceMemberDependencyGraph<PsiMember, MemberInfoBase<PsiMember>>.dependent: (MutableSet<out (PsiMember..PsiMember?)>..Set<(PsiMember..PsiMember?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (PsiMember..PsiMember?)> -> PsiMember
    <M : (MemberInfoBase<(T..T?)>..MemberInfoBase<(T..T?)>?)> -> MemberInfoBase<PsiMember>

'mapNotNull' @ [40:14] ==> public inline fun <T, R : Any> Iterable<(PsiMember..PsiMember?)>.mapNotNull(transform: ((PsiMember..PsiMember?)) -> PsiElement?): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMember..com.intellij.psi.PsiMember?)
    <R : Any> -> PsiElement

'it' @ [40:27] ==> value-parameter it: (PsiMember..PsiMember?) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinInterfaceMemberDependencyGraph.getDependent.<anonymous>[ValueParameterDescriptorImpl]

'unwrapped' @ [40:30] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'filterIsInstanceTo' @ [41:14] ==> public inline fun <reified R, C : MutableCollection<in KtNamedDeclaration>> Iterable<*>.filterIsInstanceTo(destination: LinkedHashSet<KtNamedDeclaration>): LinkedHashSet<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtNamedDeclaration
    <C : MutableCollection<in R>> -> LinkedHashSet<KtNamedDeclaration>

'LinkedHashSet' @ [41:33] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtNamedDeclaration

'Suppress' @ [43:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'lightElementForMemberInfo' @ [45:25] ==> public fun lightElementForMemberInfo(declaration: KtNamedDeclaration?): PsiMember? defined in org.jetbrains.kotlin.idea.refactoring.memberInfo in file KotlinMemberInfo.kt[SimpleFunctionDescriptorImpl]

'member' @ [45:51] ==> value-parameter member: T defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinInterfaceMemberDependencyGraph.getDependenciesOf[ValueParameterDescriptorImpl]

'emptySet' @ [45:69] ==> public fun <T> emptySet(): Set<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'delegateGraph' @ [46:37] ==> private final val delegateGraph: InterfaceMemberDependencyGraph<PsiMember, MemberInfoBase<PsiMember>> defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinInterfaceMemberDependencyGraph[PropertyDescriptorImpl]

'getDependenciesOf' @ [46:51] ==> public abstract fun getDependenciesOf(p0: (PsiMember..PsiMember?)): (MutableSet<out (PsiMember..PsiMember?)>..Set<(PsiMember..PsiMember?)>?) defined in com.intellij.refactoring.util.classMembers.InterfaceMemberDependencyGraph[JavaMethodDescriptor]

'psiMember' @ [46:69] ==> val psiMember: PsiMember defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinInterfaceMemberDependencyGraph.getDependenciesOf[LocalVariableDescriptor]

'emptySet' @ [46:90] ==> public fun <T> emptySet(): Set<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'psiMemberDependencies' @ [47:16] ==> val psiMemberDependencies: (MutableSet<out (PsiMember..PsiMember?)>..Set<(PsiMember..PsiMember?)>) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinInterfaceMemberDependencyGraph.getDependenciesOf[LocalVariableDescriptor]

'mapNotNull' @ [48:18] ==> public inline fun <T, R : Any> Iterable<(PsiMember..PsiMember?)>.mapNotNull(transform: ((PsiMember..PsiMember?)) -> PsiElement?): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMember..com.intellij.psi.PsiMember?)
    <R : Any> -> PsiElement

'it' @ [48:31] ==> value-parameter it: (PsiMember..PsiMember?) defined in org.jetbrains.kotlin.idea.refactoring.memberInfo.KotlinInterfaceMemberDependencyGraph.getDependenciesOf.<anonymous>[ValueParameterDescriptorImpl]

'unwrapped' @ [48:34] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'filterIsInstanceTo' @ [49:18] ==> public inline fun <reified R, C : MutableCollection<in KtNamedDeclaration>> Iterable<*>.filterIsInstanceTo(destination: LinkedHashSet<KtNamedDeclaration>): LinkedHashSet<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtNamedDeclaration
    <C : MutableCollection<in R>> -> LinkedHashSet<KtNamedDeclaration>

'LinkedHashSet' @ [49:37] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtNamedDeclaration

