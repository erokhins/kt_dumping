'this' @ [26:9] ==> <this> defined in org.jetbrains.kotlin.load.kotlin.getContainingKotlinJvmBinaryClass[ReceiverParameterDescriptorImpl]

'containingDeclaration' @ [28:21] ==> public final val DeserializedCallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'when (container) {
        is DeserializedClassDescriptor ->
            container.source.safeAs<KotlinJvmBinarySourceElement>()?.binaryClass
        is LazyJavaPackageFragment ->
            container.source.safeAs<KotlinJvmBinaryPackageSourceElement>()?.getRepresentativeBinaryClass()
        else -> null
    }' @ [30:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KotlinJvmBinaryClass?, entry1: KotlinJvmBinaryClass?, entry2: KotlinJvmBinaryClass?): KotlinJvmBinaryClass?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KotlinJvmBinaryClass?

'container' @ [30:18] ==> val container: DeclarationDescriptor defined in org.jetbrains.kotlin.load.kotlin.getContainingKotlinJvmBinaryClass[LocalVariableDescriptor]

'container' @ [32:13] ==> val container: DeclarationDescriptor defined in org.jetbrains.kotlin.load.kotlin.getContainingKotlinJvmBinaryClass[LocalVariableDescriptor]

'source' @ [32:23] ==> public final val DeserializedClassDescriptor.source: SourceElement[MyPropertyDescriptor]

'safeAs' @ [32:30] ==> public inline fun <reified T : Any> Any?.safeAs(): KotlinJvmBinarySourceElement? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> KotlinJvmBinarySourceElement

'binaryClass' @ [32:70] ==> public final val binaryClass: KotlinJvmBinaryClass defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinarySourceElement[DeserializedPropertyDescriptor]

'container' @ [34:13] ==> val container: DeclarationDescriptor defined in org.jetbrains.kotlin.load.kotlin.getContainingKotlinJvmBinaryClass[LocalVariableDescriptor]

'source' @ [34:23] ==> public final val LazyJavaPackageFragment.source: SourceElement[MyPropertyDescriptor]

'safeAs' @ [34:30] ==> public inline fun <reified T : Any> Any?.safeAs(): KotlinJvmBinaryPackageSourceElement? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> KotlinJvmBinaryPackageSourceElement

'getRepresentativeBinaryClass' @ [34:77] ==> public final fun getRepresentativeBinaryClass(): KotlinJvmBinaryClass defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinaryPackageSourceElement[DeserializedSimpleFunctionDescriptor]

