'JvmOverloads' @ [22:38] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'component1' @ [34:14] ==> public final operator fun component1(): LanguageFeature defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [34:23] ==> public final operator fun component2(): LanguageVersionSettings defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'obj' @ [34:35] ==> value-parameter obj: Pair<LanguageFeature, LanguageVersionSettings> defined in org.jetbrains.kotlin.diagnostics.rendering.LanguageFeatureMessageRenderer.render[ValueParameterDescriptorImpl]

'feature' @ [35:21] ==> val feature: LanguageFeature defined in org.jetbrains.kotlin.diagnostics.rendering.LanguageFeatureMessageRenderer.render[LocalVariableDescriptor]

'sinceVersion' @ [35:29] ==> public final val sinceVersion: LanguageVersion? defined in org.jetbrains.kotlin.config.LanguageFeature[DeserializedPropertyDescriptor]

'StringBuilder' @ [37:18] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'sb' @ [38:9] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.diagnostics.rendering.LanguageFeatureMessageRenderer.render[LocalVariableDescriptor]

'append' @ [38:12] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [38:37] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'feature' @ [38:44] ==> val feature: LanguageFeature defined in org.jetbrains.kotlin.diagnostics.rendering.LanguageFeatureMessageRenderer.render[LocalVariableDescriptor]

'presentableName' @ [38:52] ==> public final val presentableName: String defined in org.jetbrains.kotlin.config.LanguageFeature[DeserializedPropertyDescriptor]

'append' @ [38:69] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'when (type) {
            Type.UNSUPPORTED ->
                when {
                    since == null ->
                        sb.append("experimental and should be enabled explicitly")
                    since > settings.languageVersion ->
                        sb.append("only available since language version ").append(since.versionString)
                    feature.sinceApiVersion > settings.apiVersion ->
                        sb.append("only available since API version ").append(feature.sinceApiVersion.versionString)
                    else ->
                        sb.append("disabled")
                }

            Type.WARNING -> sb.append("experimental")
            Type.ERROR -> sb.append("experimental and disabled")
        }' @ [40:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (StringBuilder..StringBuilder?), entry1: (StringBuilder..StringBuilder?), entry2: (StringBuilder..StringBuilder?)): (StringBuilder..StringBuilder?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (java.lang.StringBuilder..java.lang.StringBuilder?)

'type' @ [40:15] ==> private final val type: LanguageFeatureMessageRenderer.Type defined in org.jetbrains.kotlin.diagnostics.rendering.LanguageFeatureMessageRenderer[PropertyDescriptorImpl]

'UNSUPPORTED' @ [41:18] ==> enum entry UNSUPPORTED defined in org.jetbrains.kotlin.diagnostics.rendering.LanguageFeatureMessageRenderer.Type[FakeCallableDescriptorForObject]

'when {
                    since == null ->
                        sb.append("experimental and should be enabled explicitly")
                    since > settings.languageVersion ->
                        sb.append("only available since language version ").append(since.versionString)
                    feature.sinceApiVersion > settings.apiVersion ->
                        sb.append("only available since API version ").append(feature.sinceApiVersion.versionString)
                    else ->
                        sb.append("disabled")
                }' @ [42:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (StringBuilder..StringBuilder?), entry1: (StringBuilder..StringBuilder?), entry2: (StringBuilder..StringBuilder?), entry3: (StringBuilder..StringBuilder?)): (StringBuilder..StringBuilder?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (java.lang.StringBuilder..java.lang.StringBuilder?)

'since' @ [43:21] ==> val since: LanguageVersion? defined in org.jetbrains.kotlin.diagnostics.rendering.LanguageFeatureMessageRenderer.render[LocalVariableDescriptor]

'sb' @ [44:25] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.diagnostics.rendering.LanguageFeatureMessageRenderer.render[LocalVariableDescriptor]

'append' @ [44:28] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'since' @ [45:21] ==> val since: LanguageVersion? defined in org.jetbrains.kotlin.diagnostics.rendering.LanguageFeatureMessageRenderer.render[LocalVariableDescriptor]

'settings' @ [45:29] ==> val settings: LanguageVersionSettings defined in org.jetbrains.kotlin.diagnostics.rendering.LanguageFeatureMessageRenderer.render[LocalVariableDescriptor]

'languageVersion' @ [45:38] ==> public abstract val languageVersion: LanguageVersion defined in org.jetbrains.kotlin.config.LanguageVersionSettings[DeserializedPropertyDescriptor]

'sb' @ [46:25] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.diagnostics.rendering.LanguageFeatureMessageRenderer.render[LocalVariableDescriptor]

'append' @ [46:28] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [46:77] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'since' @ [46:84] ==> val since: LanguageVersion? defined in org.jetbrains.kotlin.diagnostics.rendering.LanguageFeatureMessageRenderer.render[LocalVariableDescriptor]

'versionString' @ [46:90] ==> public final val versionString: String defined in org.jetbrains.kotlin.config.LanguageVersion[DeserializedPropertyDescriptor]

'feature' @ [47:21] ==> val feature: LanguageFeature defined in org.jetbrains.kotlin.diagnostics.rendering.LanguageFeatureMessageRenderer.render[LocalVariableDescriptor]

'sinceApiVersion' @ [47:29] ==> public final val sinceApiVersion: ApiVersion defined in org.jetbrains.kotlin.config.LanguageFeature[DeserializedPropertyDescriptor]

'settings' @ [47:47] ==> val settings: LanguageVersionSettings defined in org.jetbrains.kotlin.diagnostics.rendering.LanguageFeatureMessageRenderer.render[LocalVariableDescriptor]

'apiVersion' @ [47:56] ==> public abstract val apiVersion: ApiVersion defined in org.jetbrains.kotlin.config.LanguageVersionSettings[DeserializedPropertyDescriptor]

'sb' @ [48:25] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.diagnostics.rendering.LanguageFeatureMessageRenderer.render[LocalVariableDescriptor]

'append' @ [48:28] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [48:72] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'feature' @ [48:79] ==> val feature: LanguageFeature defined in org.jetbrains.kotlin.diagnostics.rendering.LanguageFeatureMessageRenderer.render[LocalVariableDescriptor]

'sinceApiVersion' @ [48:87] ==> public final val sinceApiVersion: ApiVersion defined in org.jetbrains.kotlin.config.LanguageFeature[DeserializedPropertyDescriptor]

'versionString' @ [48:103] ==> public final val versionString: String defined in org.jetbrains.kotlin.config.ApiVersion[DeserializedPropertyDescriptor]

'sb' @ [50:25] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.diagnostics.rendering.LanguageFeatureMessageRenderer.render[LocalVariableDescriptor]

'append' @ [50:28] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'WARNING' @ [53:18] ==> enum entry WARNING defined in org.jetbrains.kotlin.diagnostics.rendering.LanguageFeatureMessageRenderer.Type[FakeCallableDescriptorForObject]

'sb' @ [53:29] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.diagnostics.rendering.LanguageFeatureMessageRenderer.render[LocalVariableDescriptor]

'append' @ [53:32] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'ERROR' @ [54:18] ==> enum entry ERROR defined in org.jetbrains.kotlin.diagnostics.rendering.LanguageFeatureMessageRenderer.Type[FakeCallableDescriptorForObject]

'sb' @ [54:27] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.diagnostics.rendering.LanguageFeatureMessageRenderer.render[LocalVariableDescriptor]

'append' @ [54:30] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'feature' @ [57:23] ==> val feature: LanguageFeature defined in org.jetbrains.kotlin.diagnostics.rendering.LanguageFeatureMessageRenderer.render[LocalVariableDescriptor]

'hintUrl' @ [57:31] ==> public final val hintUrl: String? defined in org.jetbrains.kotlin.config.LanguageFeature[DeserializedPropertyDescriptor]

'hintUrl' @ [58:13] ==> val hintUrl: String? defined in org.jetbrains.kotlin.diagnostics.rendering.LanguageFeatureMessageRenderer.render[LocalVariableDescriptor]

'if (useHtml) {
                sb.append(" (").append("see more <a href=\"").append(hintUrl).append("\">here</a>)")
            }
            else {
                sb.append(" (see: ").append(hintUrl).append(")")
            }' @ [59:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (StringBuilder..StringBuilder?), elseBranch: (StringBuilder..StringBuilder?)): (StringBuilder..StringBuilder?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (java.lang.StringBuilder..java.lang.StringBuilder?)

'useHtml' @ [59:17] ==> private final val useHtml: Boolean defined in org.jetbrains.kotlin.diagnostics.rendering.LanguageFeatureMessageRenderer[PropertyDescriptorImpl]

'sb' @ [60:17] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.diagnostics.rendering.LanguageFeatureMessageRenderer.render[LocalVariableDescriptor]

'append' @ [60:20] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [60:33] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [60:63] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'hintUrl' @ [60:70] ==> val hintUrl: String? defined in org.jetbrains.kotlin.diagnostics.rendering.LanguageFeatureMessageRenderer.render[LocalVariableDescriptor]

'append' @ [60:79] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'sb' @ [63:17] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.diagnostics.rendering.LanguageFeatureMessageRenderer.render[LocalVariableDescriptor]

'append' @ [63:20] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [63:38] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'hintUrl' @ [63:45] ==> val hintUrl: String? defined in org.jetbrains.kotlin.diagnostics.rendering.LanguageFeatureMessageRenderer.render[LocalVariableDescriptor]

'append' @ [63:54] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'sb' @ [67:16] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.diagnostics.rendering.LanguageFeatureMessageRenderer.render[LocalVariableDescriptor]

'toString' @ [67:19] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

