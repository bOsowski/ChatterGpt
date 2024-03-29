package net.bosowski.chattergpt.data.models.authentication

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import org.springframework.security.core.GrantedAuthority
import java.util.*
import javax.persistence.*
import javax.validation.constraints.NotNull

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
class OauthAuthority(
    @NotNull
    @Column(name = "oauthAuthority", nullable = false)
    private var oauthAuthority: String
) : GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    var id: Long? = null

    override fun getAuthority(): String {
        return oauthAuthority
    }

    @NotNull
    var date = Date()

}