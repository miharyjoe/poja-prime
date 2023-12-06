package com.company.prime.repository.model;

import com.company.prime.PojaGenerated;
import java.math.BigInteger;
import java.time.Instant;
import javax.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

@PojaGenerated
@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PrimeNumber {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String id;

  private BigInteger primeNumber;

  @CreationTimestamp
  @Column(columnDefinition = "TIMESTAMP WITHOUT TIMEZONE")
  private Instant createdAt;
}
