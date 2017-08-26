'withDefinedIn' @ [36:5] ==> public abstract var withDefinedIn: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'classWithPrimaryConstructor' @ [37:5] ==> public abstract var classWithPrimaryConstructor: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'secondaryConstructorsAsPrimary' @ [38:5] ==> public abstract var secondaryConstructorsAsPrimary: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'modifiers' @ [39:5] ==> public abstract var modifiers: Set<DescriptorRendererModifier> defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'DescriptorRendererModifier' @ [39:17] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRendererModifier[FakeCallableDescriptorForObject]

'ALL' @ [39:44] ==> @field:JvmField public final val ALL: Set<DescriptorRendererModifier> defined in org.jetbrains.kotlin.renderer.DescriptorRendererModifier.Companion[DeserializedPropertyDescriptor]

'excludedTypeAnnotationClasses' @ [40:5] ==> public abstract var excludedTypeAnnotationClasses: Set<FqName> defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'emptySet' @ [40:37] ==> public fun <T> emptySet(): Set<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'alwaysRenderModifiers' @ [41:5] ==> public abstract var alwaysRenderModifiers: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'parameterNamesInFunctionalTypes' @ [42:5] ==> public abstract var parameterNamesInFunctionalTypes: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'listOf' @ [49:58] ==> public fun <T> listOf(element: ByDescriptorIndexer): List<ByDescriptorIndexer> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ByDescriptorIndexer

'ByDescriptorIndexer' @ [49:65] ==> public object ByDescriptorIndexer : DecompiledTextIndexer<String> defined in org.jetbrains.kotlin.idea.decompiler.navigation in file findDecompiledDeclaration.kt[FakeCallableDescriptorForObject]

'StringBuilder' @ [51:19] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'builder' @ [54:9] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText[LocalVariableDescriptor]

'append' @ [54:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'+' @ [54:24] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'builder' @ [55:9] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText[LocalVariableDescriptor]

'append' @ [55:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'!' @ [56:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'packageFqName' @ [56:14] ==> value-parameter packageFqName: FqName defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText[ValueParameterDescriptorImpl]

'isRoot' @ [56:28] ==> public final val FqName.isRoot: Boolean[MyPropertyDescriptor]

'builder' @ [57:13] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText[LocalVariableDescriptor]

'append' @ [57:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [57:40] ==> public open fun append(p0: (Any..Any?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'packageFqName' @ [57:47] ==> value-parameter packageFqName: FqName defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText[ValueParameterDescriptorImpl]

'append' @ [57:62] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'DecompiledTextIndex' @ [61:21] ==> public constructor DecompiledTextIndex(indexers: Collection<DecompiledTextIndexer<*>>) defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.DecompiledTextIndex[ClassConstructorDescriptorImpl]

'indexers' @ [61:41] ==> value-parameter indexers: Collection<DecompiledTextIndexer<*>> = ... defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText[ValueParameterDescriptorImpl]

'textIndex' @ [64:9] ==> val textIndex: DecompiledTextIndex defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText[LocalVariableDescriptor]

'addToIndex' @ [64:19] ==> public final fun addToIndex(descriptor: DeclarationDescriptor, textRange: TextRange): Unit defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.DecompiledTextIndex[SimpleFunctionDescriptorImpl]

'descriptor' @ [64:30] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.indexDescriptor[ValueParameterDescriptorImpl]

'TextRange' @ [64:42] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'startOffset' @ [64:52] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.indexDescriptor[ValueParameterDescriptorImpl]

'endOffset' @ [64:65] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.indexDescriptor[ValueParameterDescriptorImpl]

'builder' @ [68:27] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText[LocalVariableDescriptor]

'length' @ [68:35] ==> public open val length: Int defined in java.lang.StringBuilder[JavaPropertyDescriptor]

'if (isEnumEntry(descriptor)) {
            for (annotation in descriptor.annotations) {
                builder.append(descriptorRenderer.renderAnnotation(annotation))
                builder.append(" ")
            }
            builder.append(descriptor.name.asString())
            builder.append(if (lastEnumEntry!!) ";" else ",")
        }
        else {
            builder.append(descriptorRenderer.render(descriptor).replace("= ...", DECOMPILED_COMMENT_FOR_PARAMETER))
        }' @ [69:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (StringBuilder..StringBuilder?), elseBranch: (StringBuilder..StringBuilder?)): (StringBuilder..StringBuilder?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (java.lang.StringBuilder..java.lang.StringBuilder?)

'isEnumEntry' @ [69:13] ==> public open fun isEnumEntry(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [69:25] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[ValueParameterDescriptorImpl]

'descriptor' @ [70:32] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[ValueParameterDescriptorImpl]

'annotations' @ [70:43] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.DeclarationDescriptor[DeserializedPropertyDescriptor]

'builder' @ [71:17] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText[LocalVariableDescriptor]

'append' @ [71:25] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'descriptorRenderer' @ [71:32] ==> value-parameter descriptorRenderer: DescriptorRenderer defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText[ValueParameterDescriptorImpl]

'renderAnnotation' @ [71:51] ==> public abstract fun renderAnnotation(annotation: AnnotationDescriptor, target: AnnotationUseSiteTarget? = ...): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'annotation' @ [71:68] ==> val annotation: AnnotationDescriptor defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[LocalVariableDescriptor]

'builder' @ [72:17] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText[LocalVariableDescriptor]

'append' @ [72:25] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'builder' @ [74:13] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText[LocalVariableDescriptor]

'append' @ [74:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'descriptor' @ [74:28] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[ValueParameterDescriptorImpl]

'name' @ [74:39] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [74:44] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'builder' @ [75:13] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText[LocalVariableDescriptor]

'append' @ [75:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'if (lastEnumEntry!!) ";" else ","' @ [75:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'lastEnumEntry' @ [75:32] ==> value-parameter lastEnumEntry: Boolean? = ... defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[ValueParameterDescriptorImpl]

'builder' @ [78:13] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText[LocalVariableDescriptor]

'append' @ [78:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'descriptorRenderer' @ [78:28] ==> value-parameter descriptorRenderer: DescriptorRenderer defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText[ValueParameterDescriptorImpl]

'render' @ [78:47] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [78:54] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[ValueParameterDescriptorImpl]

'replace' @ [78:66] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'DECOMPILED_COMMENT_FOR_PARAMETER' @ [78:83] ==> private val DECOMPILED_COMMENT_FOR_PARAMETER: String defined in org.jetbrains.kotlin.idea.decompiler.textBuilder in file buildDecompiledText.kt[PropertyDescriptorImpl]

'builder' @ [80:25] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText[LocalVariableDescriptor]

'length' @ [80:33] ==> public open val length: Int defined in java.lang.StringBuilder[JavaPropertyDescriptor]

'descriptor' @ [82:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[ValueParameterDescriptorImpl]

'descriptor' @ [84:17] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[ValueParameterDescriptorImpl]

'returnType' @ [84:28] ==> public final val CallableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'isFlexible' @ [84:41] ==> public fun KotlinType.isFlexible(): Boolean defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'builder' @ [85:17] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText[LocalVariableDescriptor]

'append' @ [85:25] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [85:37] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'FLEXIBLE_TYPE_COMMENT' @ [85:44] ==> private val FLEXIBLE_TYPE_COMMENT: String defined in org.jetbrains.kotlin.idea.decompiler.textBuilder in file buildDecompiledText.kt[PropertyDescriptorImpl]

'if (descriptor is FunctionDescriptor || descriptor is PropertyDescriptor) {
            if ((descriptor as MemberDescriptor).modality != Modality.ABSTRACT) {
                if (descriptor is FunctionDescriptor) {
                    builder.append(" { ").append(DECOMPILED_CODE_COMMENT).append(" }")
                }
                else {
                    // descriptor instanceof PropertyDescriptor
                    builder.append(" ").append(DECOMPILED_CODE_COMMENT)
                }
                endOffset = builder.length
            }
        }
        else if (descriptor is ClassDescriptor && !isEnumEntry(descriptor)) {
            builder.append(" {\n")

            val subindent = indent + "    "

            var firstPassed = false
            fun newlineExceptFirst() {
                if (firstPassed) {
                    builder.append("\n")
                }
                else {
                    firstPassed = true
                }
            }

            val allDescriptors = descriptor.secondaryConstructors + descriptor.defaultType.memberScope.getContributedDescriptors()
            val (enumEntries, members) = allDescriptors.partition(::isEnumEntry)

            for ((index, enumEntry) in enumEntries.withIndex()) {
                newlineExceptFirst()
                builder.append(subindent)
                appendDescriptor(enumEntry, subindent, index == enumEntries.lastIndex)
            }

            val companionObject = descriptor.companionObjectDescriptor
            if (companionObject != null) {
                newlineExceptFirst()
                builder.append(subindent)
                appendDescriptor(companionObject, subindent)
            }

            for (member in members) {
                if (member.containingDeclaration != descriptor) {
                    continue
                }
                if (member == companionObject) {
                    continue
                }
                if (member is CallableMemberDescriptor
                    && member.kind != CallableMemberDescriptor.Kind.DECLARATION
                    //TODO: not synthesized and component like
                    && !DataClassDescriptorResolver.isComponentLike(member.name)) {
                    continue
                }
                newlineExceptFirst()
                builder.append(subindent)
                appendDescriptor(member, subindent)
            }

            builder.append(indent).append("}")
            endOffset = builder.length
        }' @ [89:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'descriptor' @ [89:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[ValueParameterDescriptorImpl]

'descriptor' @ [89:49] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[ValueParameterDescriptorImpl]

'!=' @ [90:17] ==> public final fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.descriptors.Modality[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [90:18] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[ValueParameterDescriptorImpl]

'modality' @ [90:50] ==> public final val MemberDescriptor.modality: Modality[MyPropertyDescriptor]

'Modality' @ [90:62] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT' @ [90:71] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'if (descriptor is FunctionDescriptor) {
                    builder.append(" { ").append(DECOMPILED_CODE_COMMENT).append(" }")
                }
                else {
                    // descriptor instanceof PropertyDescriptor
                    builder.append(" ").append(DECOMPILED_CODE_COMMENT)
                }' @ [91:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (StringBuilder..StringBuilder?), elseBranch: (StringBuilder..StringBuilder?)): (StringBuilder..StringBuilder?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (java.lang.StringBuilder..java.lang.StringBuilder?)

'descriptor' @ [91:21] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[ValueParameterDescriptorImpl]

'builder' @ [92:21] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText[LocalVariableDescriptor]

'append' @ [92:29] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [92:43] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'DECOMPILED_CODE_COMMENT' @ [92:50] ==> private val DECOMPILED_CODE_COMMENT: String defined in org.jetbrains.kotlin.idea.decompiler.textBuilder in file buildDecompiledText.kt[PropertyDescriptorImpl]

'append' @ [92:75] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'builder' @ [96:21] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText[LocalVariableDescriptor]

'append' @ [96:29] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [96:41] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'DECOMPILED_CODE_COMMENT' @ [96:48] ==> private val DECOMPILED_CODE_COMMENT: String defined in org.jetbrains.kotlin.idea.decompiler.textBuilder in file buildDecompiledText.kt[PropertyDescriptorImpl]

'endOffset' @ [98:17] ==> var endOffset: Int defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[LocalVariableDescriptor]

'builder' @ [98:29] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText[LocalVariableDescriptor]

'length' @ [98:37] ==> public open val length: Int defined in java.lang.StringBuilder[JavaPropertyDescriptor]

'descriptor' @ [101:18] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[ValueParameterDescriptorImpl]

'!' @ [101:51] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isEnumEntry' @ [101:52] ==> public open fun isEnumEntry(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [101:64] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[ValueParameterDescriptorImpl]

'builder' @ [102:13] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText[LocalVariableDescriptor]

'append' @ [102:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'indent' @ [104:29] ==> value-parameter indent: String defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[ValueParameterDescriptorImpl]

'if (firstPassed) {
                    builder.append("\n")
                }
                else {
                    firstPassed = true
                }' @ [108:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'firstPassed' @ [108:21] ==> var firstPassed: Boolean defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[LocalVariableDescriptor]

'builder' @ [109:21] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText[LocalVariableDescriptor]

'append' @ [109:29] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'firstPassed' @ [112:21] ==> var firstPassed: Boolean defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[LocalVariableDescriptor]

'descriptor' @ [116:34] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[ValueParameterDescriptorImpl]

'secondaryConstructors' @ [116:45] ==> public val ClassDescriptor.secondaryConstructors: List<ClassConstructorDescriptor> defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'descriptor' @ [116:69] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[ValueParameterDescriptorImpl]

'defaultType' @ [116:80] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'memberScope' @ [116:92] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'getContributedDescriptors' @ [116:104] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'component1' @ [117:18] ==> public final operator fun component1(): List<DeclarationDescriptor> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [117:31] ==> public final operator fun component2(): List<DeclarationDescriptor> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'allDescriptors' @ [117:42] ==> val allDescriptors: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[LocalVariableDescriptor]

'partition' @ [117:57] ==> public inline fun <T> Iterable<DeclarationDescriptor>.partition(predicate: (DeclarationDescriptor) -> Boolean): Pair<List<DeclarationDescriptor>, List<DeclarationDescriptor>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'component1' @ [119:19] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [119:26] ==> public final operator fun component2(): DeclarationDescriptor defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'enumEntries' @ [119:40] ==> val enumEntries: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[LocalVariableDescriptor]

'withIndex' @ [119:52] ==> public fun <T> Iterable<DeclarationDescriptor>.withIndex(): Iterable<IndexedValue<DeclarationDescriptor>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'newlineExceptFirst' @ [120:17] ==> local final fun newlineExceptFirst(): Unit defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[SimpleFunctionDescriptorImpl]

'builder' @ [121:17] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText[LocalVariableDescriptor]

'append' @ [121:25] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'subindent' @ [121:32] ==> val subindent: String defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[LocalVariableDescriptor]

'appendDescriptor' @ [122:17] ==> local final fun appendDescriptor(descriptor: DeclarationDescriptor, indent: String, lastEnumEntry: Boolean? = ...): Unit defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText[SimpleFunctionDescriptorImpl]

'enumEntry' @ [122:34] ==> val enumEntry: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[LocalVariableDescriptor]

'subindent' @ [122:45] ==> val subindent: String defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[LocalVariableDescriptor]

'index' @ [122:56] ==> val index: Int defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[LocalVariableDescriptor]

'enumEntries' @ [122:65] ==> val enumEntries: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[LocalVariableDescriptor]

'lastIndex' @ [122:77] ==> public val <T> List<DeclarationDescriptor>.lastIndex: Int defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'descriptor' @ [125:35] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[ValueParameterDescriptorImpl]

'companionObjectDescriptor' @ [125:46] ==> public final val ClassDescriptor.companionObjectDescriptor: ClassDescriptor?[MyPropertyDescriptor]

'companionObject' @ [126:17] ==> val companionObject: ClassDescriptor? defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[LocalVariableDescriptor]

'newlineExceptFirst' @ [127:17] ==> local final fun newlineExceptFirst(): Unit defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[SimpleFunctionDescriptorImpl]

'builder' @ [128:17] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText[LocalVariableDescriptor]

'append' @ [128:25] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'subindent' @ [128:32] ==> val subindent: String defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[LocalVariableDescriptor]

'appendDescriptor' @ [129:17] ==> local final fun appendDescriptor(descriptor: DeclarationDescriptor, indent: String, lastEnumEntry: Boolean? = ...): Unit defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText[SimpleFunctionDescriptorImpl]

'companionObject' @ [129:34] ==> val companionObject: ClassDescriptor? defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[LocalVariableDescriptor]

'subindent' @ [129:51] ==> val subindent: String defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[LocalVariableDescriptor]

'members' @ [132:28] ==> val members: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[LocalVariableDescriptor]

'member' @ [133:21] ==> val member: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[LocalVariableDescriptor]

'containingDeclaration' @ [133:28] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'descriptor' @ [133:53] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[ValueParameterDescriptorImpl]

'member' @ [136:21] ==> val member: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[LocalVariableDescriptor]

'companionObject' @ [136:31] ==> val companionObject: ClassDescriptor? defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[LocalVariableDescriptor]

'member' @ [139:21] ==> val member: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[LocalVariableDescriptor]

'member' @ [140:24] ==> val member: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[LocalVariableDescriptor]

'kind' @ [140:31] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'DECLARATION' @ [140:69] ==> enum entry DECLARATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'!' @ [142:24] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'DataClassDescriptorResolver' @ [142:25] ==> public object DataClassDescriptorResolver defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'isComponentLike' @ [142:53] ==> public final fun isComponentLike(name: Name): Boolean defined in org.jetbrains.kotlin.resolve.DataClassDescriptorResolver[DeserializedSimpleFunctionDescriptor]

'member' @ [142:69] ==> val member: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[LocalVariableDescriptor]

'name' @ [142:76] ==> public final val CallableMemberDescriptor.name: Name[MyPropertyDescriptor]

'newlineExceptFirst' @ [145:17] ==> local final fun newlineExceptFirst(): Unit defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[SimpleFunctionDescriptorImpl]

'builder' @ [146:17] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText[LocalVariableDescriptor]

'append' @ [146:25] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'subindent' @ [146:32] ==> val subindent: String defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[LocalVariableDescriptor]

'appendDescriptor' @ [147:17] ==> local final fun appendDescriptor(descriptor: DeclarationDescriptor, indent: String, lastEnumEntry: Boolean? = ...): Unit defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText[SimpleFunctionDescriptorImpl]

'member' @ [147:34] ==> val member: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[LocalVariableDescriptor]

'subindent' @ [147:42] ==> val subindent: String defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[LocalVariableDescriptor]

'builder' @ [150:13] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText[LocalVariableDescriptor]

'append' @ [150:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'indent' @ [150:28] ==> value-parameter indent: String defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[ValueParameterDescriptorImpl]

'append' @ [150:36] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'endOffset' @ [151:13] ==> var endOffset: Int defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[LocalVariableDescriptor]

'builder' @ [151:25] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText[LocalVariableDescriptor]

'length' @ [151:33] ==> public open val length: Int defined in java.lang.StringBuilder[JavaPropertyDescriptor]

'builder' @ [154:9] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText[LocalVariableDescriptor]

'append' @ [154:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'indexDescriptor' @ [155:9] ==> local final fun indexDescriptor(descriptor: DeclarationDescriptor, startOffset: Int, endOffset: Int): Unit defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText[SimpleFunctionDescriptorImpl]

'descriptor' @ [155:25] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[ValueParameterDescriptorImpl]

'startOffset' @ [155:37] ==> val startOffset: Int defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[LocalVariableDescriptor]

'endOffset' @ [155:50] ==> var endOffset: Int defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[LocalVariableDescriptor]

'descriptor' @ [157:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[ValueParameterDescriptorImpl]

'descriptor' @ [158:38] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[ValueParameterDescriptorImpl]

'unsubstitutedPrimaryConstructor' @ [158:49] ==> public final val ClassDescriptor.unsubstitutedPrimaryConstructor: ClassConstructorDescriptor?[MyPropertyDescriptor]

'primaryConstructor' @ [159:17] ==> val primaryConstructor: ClassConstructorDescriptor? defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[LocalVariableDescriptor]

'indexDescriptor' @ [160:17] ==> local final fun indexDescriptor(descriptor: DeclarationDescriptor, startOffset: Int, endOffset: Int): Unit defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText[SimpleFunctionDescriptorImpl]

'primaryConstructor' @ [160:33] ==> val primaryConstructor: ClassConstructorDescriptor? defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[LocalVariableDescriptor]

'startOffset' @ [160:53] ==> val startOffset: Int defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[LocalVariableDescriptor]

'endOffset' @ [160:66] ==> var endOffset: Int defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText.appendDescriptor[LocalVariableDescriptor]

'appendDecompiledTextAndPackageName' @ [165:5] ==> local final fun appendDecompiledTextAndPackageName(): Unit defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText[SimpleFunctionDescriptorImpl]

'descriptors' @ [166:20] ==> value-parameter descriptors: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText[ValueParameterDescriptorImpl]

'appendDescriptor' @ [167:9] ==> local final fun appendDescriptor(descriptor: DeclarationDescriptor, indent: String, lastEnumEntry: Boolean? = ...): Unit defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText[SimpleFunctionDescriptorImpl]

'member' @ [167:26] ==> val member: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText[LocalVariableDescriptor]

'builder' @ [168:9] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText[LocalVariableDescriptor]

'append' @ [168:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'DecompiledText' @ [171:12] ==> public constructor DecompiledText(text: String, index: DecompiledTextIndex) defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.DecompiledText[ClassConstructorDescriptorImpl]

'builder' @ [171:27] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText[LocalVariableDescriptor]

'toString' @ [171:35] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'textIndex' @ [171:47] ==> val textIndex: DecompiledTextIndex defined in org.jetbrains.kotlin.idea.decompiler.textBuilder.buildDecompiledText[LocalVariableDescriptor]

